package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class Canvas {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_Canvas(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public EEStdFeatureList getAllTransform2DFeaturePtrInCanvas() {
        return new EEStdFeatureList(EffectCreatorJniJNI.Canvas_getAllTransform2DFeaturePtrInCanvas(this.swigCPtr, this), true);
    }

    public EESize getCanvasSize() {
        return new EESize(EffectCreatorJniJNI.Canvas_getCanvasSize(this.swigCPtr, this), false);
    }

    public String getClassName() {
        return EffectCreatorJniJNI.Canvas_getClassName(this.swigCPtr, this);
    }

    public boolean isCurrentCanvasHasHumanFace() {
        return EffectCreatorJniJNI.Canvas_isCurrentCanvasHasHumanFace(this.swigCPtr, this);
    }

    public void onInputRTChanged() {
        EffectCreatorJniJNI.Canvas_onInputRTChanged(this.swigCPtr, this);
    }

    public void stopAnimation() {
        EffectCreatorJniJNI.Canvas_stopAnimation(this.swigCPtr, this);
    }

    public void stopAnimationSync() {
        EffectCreatorJniJNI.Canvas_stopAnimationSync(this.swigCPtr, this);
    }

    public static String className() {
        return EffectCreatorJniJNI.Canvas_className();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(Canvas canvas) {
        if (canvas == null) {
            return 0L;
        }
        return canvas.swigCPtr;
    }

    public FeatureAndTransform getFeatureAndTransformPtrViaPoint(EEPoint eEPoint) {
        return new FeatureAndTransform(EffectCreatorJniJNI.Canvas_getFeatureAndTransformPtrViaPoint(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint), true);
    }

    public Feature getFeaturePtrViaPoint(EEPoint eEPoint) {
        long Canvas_getFeaturePtrViaPoint = EffectCreatorJniJNI.Canvas_getFeaturePtrViaPoint(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
        if (Canvas_getFeaturePtrViaPoint == 0) {
            return null;
        }
        return new Feature(Canvas_getFeaturePtrViaPoint, true);
    }

    public boolean isAnimatableWithFeatureID(ElementId elementId) {
        return EffectCreatorJniJNI.Canvas_isAnimatableWithFeatureID(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public boolean isCompatibleWithFeatureID(ElementId elementId) {
        return EffectCreatorJniJNI.Canvas_isCompatibleWithFeatureID(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void setAnimationListenerPtr(CanvasAnimationListener canvasAnimationListener) {
        EffectCreatorJniJNI.Canvas_setAnimationListenerPtr(this.swigCPtr, this, CanvasAnimationListener.getCPtr(canvasAnimationListener), canvasAnimationListener);
    }

    public void setCanvasSize(EESize eESize) {
        EffectCreatorJniJNI.Canvas_setCanvasSize(this.swigCPtr, this, EESize.getCPtr(eESize), eESize);
    }

    public void setFaceStretchFacePointsInfo(String str) {
        EffectCreatorJniJNI.Canvas_setFaceStretchFacePointsInfo(this.swigCPtr, this, str);
    }

    public void setScaleFactor(String str) {
        EffectCreatorJniJNI.Canvas_setScaleFactor(this.swigCPtr, this, str);
    }

    public void startAnimationWithFeatureID(ElementId elementId) {
        EffectCreatorJniJNI.Canvas_startAnimationWithFeatureID__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void stopAnimationWithFeatureID(ElementId elementId) {
        EffectCreatorJniJNI.Canvas_stopAnimationWithFeatureID__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public Canvas(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void startAnimationWithFeatureID(ElementId elementId, boolean z) {
        EffectCreatorJniJNI.Canvas_startAnimationWithFeatureID__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, z);
    }

    public void stopAnimationWithFeatureID(ElementId elementId, boolean z) {
        EffectCreatorJniJNI.Canvas_stopAnimationWithFeatureID__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, z);
    }
}
