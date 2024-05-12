package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationTransform2DData {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_UIAnnotationTransform2DData(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public EEPoint getCenter() {
        return new EEPoint(EffectCreatorJniJNI.UIAnnotationTransform2DData_getCenter(this.swigCPtr, this), true);
    }

    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationTransform2DData_getClassName(this.swigCPtr, this);
    }

    public double getRotationAngle() {
        return EffectCreatorJniJNI.UIAnnotationTransform2DData_getRotationAngle(this.swigCPtr, this);
    }

    public EESize getSize() {
        return new EESize(EffectCreatorJniJNI.UIAnnotationTransform2DData_getSize(this.swigCPtr, this), true);
    }

    public UIAnnotationTransform2DData() {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform2DData__SWIG_0(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationTransform2DData_className();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        if (uIAnnotationTransform2DData == null) {
            return 0L;
        }
        return uIAnnotationTransform2DData.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationTransform2DData(EEPoint eEPoint, UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform2DData__SWIG_2(EEPoint.getCPtr(eEPoint), eEPoint, getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData), true);
    }

    public UIAnnotationTransform2DData(EESize eESize, UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform2DData__SWIG_3(EESize.getCPtr(eESize), eESize, getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData), true);
    }

    public UIAnnotationTransform2DData(double d, UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform2DData__SWIG_4(d, getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData), true);
    }

    public UIAnnotationTransform2DData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public UIAnnotationTransform2DData(EEPoint eEPoint, EESize eESize, double d) {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform2DData__SWIG_1(EEPoint.getCPtr(eEPoint), eEPoint, EESize.getCPtr(eESize), eESize, d), true);
    }
}
