/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btConeShapeZ extends btConeShape {
	private long swigCPtr;

	protected btConeShapeZ (long cPtr, boolean cMemoryOwn) {
		super(gdxBulletJNI.btConeShapeZ_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}

	public static long getCPtr (btConeShapeZ obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btConeShapeZ(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public btConeShapeZ (float radius, float height) {
		this(gdxBulletJNI.new_btConeShapeZ(radius, height), true);
	}

}
