/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.badlogic.gdx.tests;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType.Bitmap;
import com.badlogic.gdx.graphics.g2d.stbtt.StbTrueTypeFont;
import com.badlogic.gdx.tests.utils.GdxTest;

/**
 * Tests the low-level stb truetype API
 * @author mzechner
 *
 */
public class StbTrueTypeTest extends GdxTest {
	SpriteBatch batch;
	Texture texture;
	
	@Override
	public boolean needsGL20 () {
		return true;
	}

	@Override
	public void create () {
		batch = new SpriteBatch();
		StbTrueTypeFont font = new StbTrueTypeFont(Gdx.files.internal("data/DroidSerif-Regular.ttf"));
		float scale = font.scaleForPixelHeight(32);
		System.out.println(font.getCodePointBox('e'));
		Bitmap glyphBitmap = font.makeCodepointBitmap(scale, scale, 'e');
		glyphBitmap.dispose();
		int glyphIndex = font.findGlyphIndex('T');
		glyphBitmap = font.makeGlyphBitmap(scale, scale, 0, 0, glyphIndex);
		texture = new Texture(glyphBitmap.pixmap);
		texture.bind();
		glyphBitmap.dispose();
		font.dispose();		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.3f, 0.3f, 0.3f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		batch.setColor(0, 0, 0, 1);
		batch.setBlendFunction(GL10.GL_ONE, GL10.GL_ONE_MINUS_SRC_ALPHA);
		batch.draw(texture, 100, 100);
		batch.end();
	}	
}