package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationScriptTransform2D extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationScriptTransform2D(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationScriptTransform2D_getClassName(this.swigCPtr, this);
    }

    public UIAnnotationTransform2DData getCurrentValue() {
        long UIAnnotationScriptTransform2D_getCurrentValue = EffectCreatorJniJNI.UIAnnotationScriptTransform2D_getCurrentValue(this.swigCPtr, this);
        if (UIAnnotationScriptTransform2D_getCurrentValue == 0) {
            return null;
        }
        return new UIAnnotationTransform2DData(UIAnnotationScriptTransform2D_getCurrentValue, true);
    }

    public UIAnnotationTransform2DData getNormalizationTransform2DUIDataPtr() {
        long UIAnnotationScriptTransform2D_getNormalizationTransform2DUIDataPtr = EffectCreatorJniJNI.UIAnnotationScriptTransform2D_getNormalizationTransform2DUIDataPtr(this.swigCPtr, this);
        if (UIAnnotationScriptTransform2D_getNormalizationTransform2DUIDataPtr == 0) {
            return null;
        }
        return new UIAnnotationTransform2DData(UIAnnotationScriptTransform2D_getNormalizationTransform2DUIDataPtr, true);
    }

    public EEScale getScale() {
        return new EEScale(EffectCreatorJniJNI.UIAnnotationScriptTransform2D_getScale(this.swigCPtr, this), true);
    }

    public void onCanvasInputRTChanged() {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_onCanvasInputRTChanged(this.swigCPtr, this);
    }

    public Error updateValueFromAMG() {
        return new Error(EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateValueFromAMG(this.swigCPtr, this), true);
    }

    public UIAnnotationScriptTransform2D() {
        this(EffectCreatorJniJNI.new_UIAnnotationScriptTransform2D(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationScriptTransform2D_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public static UIAnnotationScriptTransform2D dynamicCast(Element element) {
        long UIAnnotationScriptTransform2D_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationScriptTransform2D_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (UIAnnotationScriptTransform2D_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationScriptTransform2D(UIAnnotationScriptTransform2D_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D) {
        if (uIAnnotationScriptTransform2D == null) {
            return 0L;
        }
        return uIAnnotationScriptTransform2D.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    public boolean isContainPoint(EEPoint eEPoint) {
        return EffectCreatorJniJNI.UIAnnotationScriptTransform2D_isContainPoint(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void setCurrentValue(UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_setCurrentValue__SWIG_1(this.swigCPtr, this, UIAnnotationTransform2DData.getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public void updateDeltaValue(EEPoint eEPoint) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_1(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void updateOffsetAfterClone(EEPoint eEPoint) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateOffsetAfterClone(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void updateValue(EEPoint eEPoint) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateValue__SWIG_1(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void updateDeltaValue(EEScale eEScale) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_3(this.swigCPtr, this, EEScale.getCPtr(eEScale), eEScale);
    }

    public void updateValue(EESize eESize) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateValue__SWIG_3(this.swigCPtr, this, EESize.getCPtr(eESize), eESize);
    }

    public void updateDeltaValue(double d) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_5(this.swigCPtr, this, d);
    }

    public void updateValue(double d) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateValue__SWIG_5(this.swigCPtr, this, d);
    }

    public UIAnnotationScriptTransform2D(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationScriptTransform2D_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }

    public void setCurrentValue(UIAnnotationTransform2DData uIAnnotationTransform2DData, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_setCurrentValue__SWIG_0(this.swigCPtr, this, UIAnnotationTransform2DData.getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData, changeFrom.swigValue());
    }

    public void updateDeltaValue(EEPoint eEPoint, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_0(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint, changeFrom.swigValue());
    }

    public void updateValue(EEPoint eEPoint, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateValue__SWIG_0(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint, changeFrom.swigValue());
    }

    public void updateDeltaValue(EEScale eEScale, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_2(this.swigCPtr, this, EEScale.getCPtr(eEScale), eEScale, changeFrom.swigValue());
    }

    public void updateValue(EESize eESize, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateValue__SWIG_2(this.swigCPtr, this, EESize.getCPtr(eESize), eESize, changeFrom.swigValue());
    }

    public void updateDeltaValue(double d, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_4(this.swigCPtr, this, d, changeFrom.swigValue());
    }

    public void updateValue(double d, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateValue__SWIG_4(this.swigCPtr, this, d, changeFrom.swigValue());
    }

    public void updateValue(EEPoint eEPoint, EESize eESize, double d) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateValue__SWIG_7(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint, EESize.getCPtr(eESize), eESize, d);
    }

    public void updateValue(EEPoint eEPoint, EESize eESize, double d, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationScriptTransform2D_updateValue__SWIG_6(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint, EESize.getCPtr(eESize), eESize, d, changeFrom.swigValue());
    }
}
