/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btSimulationIslandManager {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btSimulationIslandManager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSimulationIslandManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSimulationIslandManager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btSimulationIslandManager() {
    this(gdxBulletJNI.new_btSimulationIslandManager(), true);
  }

  public void initUnionFind(int n) {
    gdxBulletJNI.btSimulationIslandManager_initUnionFind(swigCPtr, this, n);
  }

  public btUnionFind getUnionFind() {
    return new btUnionFind(gdxBulletJNI.btSimulationIslandManager_getUnionFind(swigCPtr, this), false);
  }

  public void updateActivationState(btCollisionWorld colWorld, btDispatcher dispatcher) {
    gdxBulletJNI.btSimulationIslandManager_updateActivationState(swigCPtr, this, btCollisionWorld.getCPtr(colWorld), colWorld, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void storeIslandActivationState(btCollisionWorld world) {
    gdxBulletJNI.btSimulationIslandManager_storeIslandActivationState(swigCPtr, this, btCollisionWorld.getCPtr(world), world);
  }

  public void findUnions(btDispatcher dispatcher, btCollisionWorld colWorld) {
    gdxBulletJNI.btSimulationIslandManager_findUnions(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher, btCollisionWorld.getCPtr(colWorld), colWorld);
  }

  public void buildAndProcessIslands(btDispatcher dispatcher, btCollisionWorld collisionWorld, SWIGTYPE_p_btSimulationIslandManager__IslandCallback callback) {
    gdxBulletJNI.btSimulationIslandManager_buildAndProcessIslands(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher, btCollisionWorld.getCPtr(collisionWorld), collisionWorld, SWIGTYPE_p_btSimulationIslandManager__IslandCallback.getCPtr(callback));
  }

  public void buildIslands(btDispatcher dispatcher, btCollisionWorld colWorld) {
    gdxBulletJNI.btSimulationIslandManager_buildIslands(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher, btCollisionWorld.getCPtr(colWorld), colWorld);
  }

  public boolean getSplitIslands() {
    return gdxBulletJNI.btSimulationIslandManager_getSplitIslands(swigCPtr, this);
  }

  public void setSplitIslands(boolean doSplitIslands) {
    gdxBulletJNI.btSimulationIslandManager_setSplitIslands(swigCPtr, this, doSplitIslands);
  }

}