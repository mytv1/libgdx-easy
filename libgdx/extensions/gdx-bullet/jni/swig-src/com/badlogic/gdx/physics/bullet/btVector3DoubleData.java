/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btVector3DoubleData {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btVector3DoubleData (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btVector3DoubleData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btVector3DoubleData(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setM_floats (double[] value) {
		gdxBulletJNI.btVector3DoubleData_m_floats_set(swigCPtr, this, value);
	}

	public double[] getM_floats () {
		return gdxBulletJNI.btVector3DoubleData_m_floats_get(swigCPtr, this);
	}

	public btVector3DoubleData () {
		this(gdxBulletJNI.new_btVector3DoubleData(), true);
	}

}
