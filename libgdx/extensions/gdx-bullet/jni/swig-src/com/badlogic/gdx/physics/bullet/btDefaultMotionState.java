/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btDefaultMotionState extends btMotionState {
	private long swigCPtr;

	protected btDefaultMotionState (long cPtr, boolean cMemoryOwn) {
		super(gdxBulletJNI.btDefaultMotionState_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}

	public static long getCPtr (btDefaultMotionState obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btDefaultMotionState(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public void setM_graphicsWorldTrans (btTransform value) {
		gdxBulletJNI.btDefaultMotionState_m_graphicsWorldTrans_set(swigCPtr, this, btTransform.getCPtr(value), value);
	}

	public btTransform getM_graphicsWorldTrans () {
		long cPtr = gdxBulletJNI.btDefaultMotionState_m_graphicsWorldTrans_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTransform(cPtr, false);
	}

	public void setM_centerOfMassOffset (btTransform value) {
		gdxBulletJNI.btDefaultMotionState_m_centerOfMassOffset_set(swigCPtr, this, btTransform.getCPtr(value), value);
	}

	public btTransform getM_centerOfMassOffset () {
		long cPtr = gdxBulletJNI.btDefaultMotionState_m_centerOfMassOffset_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTransform(cPtr, false);
	}

	public void setM_startWorldTrans (btTransform value) {
		gdxBulletJNI.btDefaultMotionState_m_startWorldTrans_set(swigCPtr, this, btTransform.getCPtr(value), value);
	}

	public btTransform getM_startWorldTrans () {
		long cPtr = gdxBulletJNI.btDefaultMotionState_m_startWorldTrans_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTransform(cPtr, false);
	}

	public void setM_userPointer (SWIGTYPE_p_void value) {
		gdxBulletJNI.btDefaultMotionState_m_userPointer_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
	}

	public SWIGTYPE_p_void getM_userPointer () {
		long cPtr = gdxBulletJNI.btDefaultMotionState_m_userPointer_get(swigCPtr, this);
		return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
	}

	public btDefaultMotionState (btTransform startTrans, btTransform centerOfMassOffset) {
		this(gdxBulletJNI.new_btDefaultMotionState__SWIG_0(btTransform.getCPtr(startTrans), startTrans,
			btTransform.getCPtr(centerOfMassOffset), centerOfMassOffset), true);
	}

	public btDefaultMotionState (btTransform startTrans) {
		this(gdxBulletJNI.new_btDefaultMotionState__SWIG_1(btTransform.getCPtr(startTrans), startTrans), true);
	}

	public btDefaultMotionState () {
		this(gdxBulletJNI.new_btDefaultMotionState__SWIG_2(), true);
	}

	public void getGraphicsWorldTrans (btTransform out) {
		gdxBulletJNI.btDefaultMotionState_getGraphicsWorldTrans(swigCPtr, this, btTransform.getCPtr(out), out);
	}

	public void getCenterOfMassOffset (btTransform out) {
		gdxBulletJNI.btDefaultMotionState_getCenterOfMassOffset(swigCPtr, this, btTransform.getCPtr(out), out);
	}

	public void getStartWorldTrans (btTransform out) {
		gdxBulletJNI.btDefaultMotionState_getStartWorldTrans(swigCPtr, this, btTransform.getCPtr(out), out);
	}

}
