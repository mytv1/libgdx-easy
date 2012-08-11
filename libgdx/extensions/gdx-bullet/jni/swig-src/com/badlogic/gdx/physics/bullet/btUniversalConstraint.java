/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;

public class btUniversalConstraint extends btGeneric6DofConstraint {
	private long swigCPtr;

	protected btUniversalConstraint (long cPtr, boolean cMemoryOwn) {
		super(gdxBulletJNI.btUniversalConstraint_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}

	public static long getCPtr (btUniversalConstraint obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btUniversalConstraint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public btUniversalConstraint (btRigidBody rbA, btRigidBody rbB, Vector3 anchor, Vector3 axis1, Vector3 axis2) {
		this(gdxBulletJNI.new_btUniversalConstraint(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, anchor, axis1,
			axis2), true);
	}

	public Vector3 getAnchor () {
		return gdxBulletJNI.btUniversalConstraint_getAnchor(swigCPtr, this);
	}

	public Vector3 getAnchor2 () {
		return gdxBulletJNI.btUniversalConstraint_getAnchor2(swigCPtr, this);
	}

	public Vector3 getAxis1 () {
		return gdxBulletJNI.btUniversalConstraint_getAxis1(swigCPtr, this);
	}

	public Vector3 getAxis2 () {
		return gdxBulletJNI.btUniversalConstraint_getAxis2(swigCPtr, this);
	}

	public float getAngle1 () {
		return gdxBulletJNI.btUniversalConstraint_getAngle1(swigCPtr, this);
	}

	public float getAngle2 () {
		return gdxBulletJNI.btUniversalConstraint_getAngle2(swigCPtr, this);
	}

	public void setUpperLimit (float ang1max, float ang2max) {
		gdxBulletJNI.btUniversalConstraint_setUpperLimit(swigCPtr, this, ang1max, ang2max);
	}

	public void setLowerLimit (float ang1min, float ang2min) {
		gdxBulletJNI.btUniversalConstraint_setLowerLimit(swigCPtr, this, ang1min, ang2min);
	}

	public void setAxis (Vector3 axis1, Vector3 axis2) {
		gdxBulletJNI.btUniversalConstraint_setAxis(swigCPtr, this, axis1, axis2);
	}

}
