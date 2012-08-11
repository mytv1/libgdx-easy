/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btTriangleMeshShapeData {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btTriangleMeshShapeData (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btTriangleMeshShapeData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btTriangleMeshShapeData(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setM_collisionShapeData (btCollisionShapeData value) {
		gdxBulletJNI.btTriangleMeshShapeData_m_collisionShapeData_set(swigCPtr, this, btCollisionShapeData.getCPtr(value), value);
	}

	public btCollisionShapeData getM_collisionShapeData () {
		long cPtr = gdxBulletJNI.btTriangleMeshShapeData_m_collisionShapeData_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btCollisionShapeData(cPtr, false);
	}

	public void setM_meshInterface (btStridingMeshInterfaceData value) {
		gdxBulletJNI.btTriangleMeshShapeData_m_meshInterface_set(swigCPtr, this, btStridingMeshInterfaceData.getCPtr(value), value);
	}

	public btStridingMeshInterfaceData getM_meshInterface () {
		long cPtr = gdxBulletJNI.btTriangleMeshShapeData_m_meshInterface_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btStridingMeshInterfaceData(cPtr, false);
	}

	public void setM_quantizedFloatBvh (btQuantizedBvhFloatData value) {
		gdxBulletJNI.btTriangleMeshShapeData_m_quantizedFloatBvh_set(swigCPtr, this, btQuantizedBvhFloatData.getCPtr(value), value);
	}

	public btQuantizedBvhFloatData getM_quantizedFloatBvh () {
		long cPtr = gdxBulletJNI.btTriangleMeshShapeData_m_quantizedFloatBvh_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btQuantizedBvhFloatData(cPtr, false);
	}

	public void setM_quantizedDoubleBvh (btQuantizedBvhDoubleData value) {
		gdxBulletJNI.btTriangleMeshShapeData_m_quantizedDoubleBvh_set(swigCPtr, this, btQuantizedBvhDoubleData.getCPtr(value),
			value);
	}

	public btQuantizedBvhDoubleData getM_quantizedDoubleBvh () {
		long cPtr = gdxBulletJNI.btTriangleMeshShapeData_m_quantizedDoubleBvh_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btQuantizedBvhDoubleData(cPtr, false);
	}

	public void setM_triangleInfoMap (btTriangleInfoMapData value) {
		gdxBulletJNI.btTriangleMeshShapeData_m_triangleInfoMap_set(swigCPtr, this, btTriangleInfoMapData.getCPtr(value), value);
	}

	public btTriangleInfoMapData getM_triangleInfoMap () {
		long cPtr = gdxBulletJNI.btTriangleMeshShapeData_m_triangleInfoMap_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTriangleInfoMapData(cPtr, false);
	}

	public void setM_collisionMargin (float value) {
		gdxBulletJNI.btTriangleMeshShapeData_m_collisionMargin_set(swigCPtr, this, value);
	}

	public float getM_collisionMargin () {
		return gdxBulletJNI.btTriangleMeshShapeData_m_collisionMargin_get(swigCPtr, this);
	}

	public void setM_pad3 (String value) {
		gdxBulletJNI.btTriangleMeshShapeData_m_pad3_set(swigCPtr, this, value);
	}

	public String getM_pad3 () {
		return gdxBulletJNI.btTriangleMeshShapeData_m_pad3_get(swigCPtr, this);
	}

	public btTriangleMeshShapeData () {
		this(gdxBulletJNI.new_btTriangleMeshShapeData(), true);
	}

}
