/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btBoxBoxDetector extends btDiscreteCollisionDetectorInterface {
	private long swigCPtr;
	
	protected btBoxBoxDetector(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btBoxBoxDetector_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btBoxBoxDetector, normally you should not need this constructor it's intended for low-level usage. */
	public btBoxBoxDetector(long cPtr, boolean cMemoryOwn) {
		this("btBoxBoxDetector", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btBoxBoxDetector_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btBoxBoxDetector obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btBoxBoxDetector(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setBox1(btBoxShape value) {
    CollisionJNI.btBoxBoxDetector_box1_set(swigCPtr, this, btBoxShape.getCPtr(value), value);
  }

  public btBoxShape getBox1() {
    long cPtr = CollisionJNI.btBoxBoxDetector_box1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBoxShape(cPtr, false);
  }

  public void setBox2(btBoxShape value) {
    CollisionJNI.btBoxBoxDetector_box2_set(swigCPtr, this, btBoxShape.getCPtr(value), value);
  }

  public btBoxShape getBox2() {
    long cPtr = CollisionJNI.btBoxBoxDetector_box2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBoxShape(cPtr, false);
  }

  public btBoxBoxDetector(btBoxShape box1, btBoxShape box2) {
    this(CollisionJNI.new_btBoxBoxDetector(btBoxShape.getCPtr(box1), box1, btBoxShape.getCPtr(box2), box2), true);
  }

  public void getClosestPoints(btDiscreteCollisionDetectorInterface.ClosestPointInput input, btDiscreteCollisionDetectorInterface.Result output, btIDebugDraw debugDraw, boolean swapResults) {
    CollisionJNI.btBoxBoxDetector_getClosestPoints__SWIG_0(swigCPtr, this, btDiscreteCollisionDetectorInterface.ClosestPointInput.getCPtr(input), input, btDiscreteCollisionDetectorInterface.Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw, swapResults);
  }

  public void getClosestPoints(btDiscreteCollisionDetectorInterface.ClosestPointInput input, btDiscreteCollisionDetectorInterface.Result output, btIDebugDraw debugDraw) {
    CollisionJNI.btBoxBoxDetector_getClosestPoints__SWIG_1(swigCPtr, this, btDiscreteCollisionDetectorInterface.ClosestPointInput.getCPtr(input), input, btDiscreteCollisionDetectorInterface.Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw);
  }

}