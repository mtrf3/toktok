package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationTransform3DData {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_UIAnnotationTransform3DData(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public EEBoxVertex getBoxVertex() {
        return new EEBoxVertex(EffectCreatorJniJNI.UIAnnotationTransform3DData_getBoxVertex(this.swigCPtr, this), true);
    }

    public EEPoint getCenter() {
        return new EEPoint(EffectCreatorJniJNI.UIAnnotationTransform3DData_getCenter(this.swigCPtr, this), true);
    }

    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationTransform3DData_getClassName(this.swigCPtr, this);
    }

    public double getRotationAngle() {
        return EffectCreatorJniJNI.UIAnnotationTransform3DData_getRotationAngle(this.swigCPtr, this);
    }

    public EESize getSize() {
        return new EESize(EffectCreatorJniJNI.UIAnnotationTransform3DData_getSize(this.swigCPtr, this), true);
    }

    public UIAnnotationTransform3DData() {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform3DData__SWIG_0(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationTransform3DData_className();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationTransform3DData uIAnnotationTransform3DData) {
        if (uIAnnotationTransform3DData == null) {
            return 0L;
        }
        return uIAnnotationTransform3DData.swigCPtr;
    }

    public void setBoxVertex(EEBoxVertex eEBoxVertex) {
        EffectCreatorJniJNI.UIAnnotationTransform3DData_setBoxVertex(this.swigCPtr, this, EEBoxVertex.getCPtr(eEBoxVertex), eEBoxVertex);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationTransform3DData(EEPoint eEPoint, UIAnnotationTransform3DData uIAnnotationTransform3DData) {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform3DData__SWIG_1(EEPoint.getCPtr(eEPoint), eEPoint, getCPtr(uIAnnotationTransform3DData), uIAnnotationTransform3DData), true);
    }

    public UIAnnotationTransform3DData(EESize eESize, UIAnnotationTransform3DData uIAnnotationTransform3DData) {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform3DData__SWIG_4(EESize.getCPtr(eESize), eESize, getCPtr(uIAnnotationTransform3DData), uIAnnotationTransform3DData), true);
    }

    public UIAnnotationTransform3DData(double d, UIAnnotationTransform3DData uIAnnotationTransform3DData) {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform3DData__SWIG_5(d, getCPtr(uIAnnotationTransform3DData), uIAnnotationTransform3DData), true);
    }

    public UIAnnotationTransform3DData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public UIAnnotationTransform3DData(EEPoint eEPoint, EESize eESize, double d) {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform3DData__SWIG_2(EEPoint.getCPtr(eEPoint), eEPoint, EESize.getCPtr(eESize), eESize, d), true);
    }

    public UIAnnotationTransform3DData(EEPoint eEPoint, EESize eESize, double d, EEBoxVertex eEBoxVertex) {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform3DData__SWIG_3(EEPoint.getCPtr(eEPoint), eEPoint, EESize.getCPtr(eESize), eESize, d, EEBoxVertex.getCPtr(eEBoxVertex), eEBoxVertex), true);
    }
}
