package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationFacePoints extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationFacePoints(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationFacePoints_getClassName(this.swigCPtr, this);
    }

    public EEFloatList getCurrentValue() {
        return new EEFloatList(EffectCreatorJniJNI.UIAnnotationFacePoints_getCurrentValue(this.swigCPtr, this), false);
    }

    public EEPointList getFacePoints() {
        return new EEPointList(EffectCreatorJniJNI.UIAnnotationFacePoints_getFacePoints(this.swigCPtr, this), true);
    }

    public void reset() {
        EffectCreatorJniJNI.UIAnnotationFacePoints_reset(this.swigCPtr, this);
    }

    public void symmetrization() {
        EffectCreatorJniJNI.UIAnnotationFacePoints_symmetrization(this.swigCPtr, this);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationFacePoints_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public static UIAnnotationFacePoints dynamicCast(Element element) {
        long UIAnnotationFacePoints_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationFacePoints_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (UIAnnotationFacePoints_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationFacePoints(UIAnnotationFacePoints_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationFacePoints uIAnnotationFacePoints) {
        if (uIAnnotationFacePoints == null) {
            return 0L;
        }
        return uIAnnotationFacePoints.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.UIAnnotationFacePoints_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    public void setCurrentValue(EEFloatList eEFloatList) {
        EffectCreatorJniJNI.UIAnnotationFacePoints_setCurrentValue__SWIG_1(this.swigCPtr, this, EEFloatList.getCPtr(eEFloatList), eEFloatList);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public void updateValue(EEPointList eEPointList) {
        EffectCreatorJniJNI.UIAnnotationFacePoints_updateValue__SWIG_3(this.swigCPtr, this, EEPointList.getCPtr(eEPointList), eEPointList);
    }

    public UIAnnotationFacePoints(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationFacePoints_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.UIAnnotationFacePoints_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }

    public void setCurrentValue(EEFloatList eEFloatList, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationFacePoints_setCurrentValue__SWIG_0(this.swigCPtr, this, EEFloatList.getCPtr(eEFloatList), eEFloatList, changeFrom.swigValue());
    }

    public void updateValue(EEPointList eEPointList, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationFacePoints_updateValue__SWIG_2(this.swigCPtr, this, EEPointList.getCPtr(eEPointList), eEPointList, changeFrom.swigValue());
    }

    public void updateValue(int i, EEPoint eEPoint, boolean z) {
        EffectCreatorJniJNI.UIAnnotationFacePoints_updateValue__SWIG_1(this.swigCPtr, this, i, EEPoint.getCPtr(eEPoint), eEPoint, z);
    }

    public void updateValue(int i, EEPoint eEPoint, boolean z, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationFacePoints_updateValue__SWIG_0(this.swigCPtr, this, i, EEPoint.getCPtr(eEPoint), eEPoint, z, changeFrom.swigValue());
    }
}
