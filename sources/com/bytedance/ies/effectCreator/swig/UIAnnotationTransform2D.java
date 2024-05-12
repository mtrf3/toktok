package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationTransform2D extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationTransform2D(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public UIAnnotationAnchorType getAnchorType() {
        return UIAnnotationAnchorType.swigToEnum(EffectCreatorJniJNI.UIAnnotationTransform2D_getAnchorType(this.swigCPtr, this));
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationTransform2D_getClassName(this.swigCPtr, this);
    }

    public UIAnnotationTransform2DData getCurrentValue() {
        long UIAnnotationTransform2D_getCurrentValue = EffectCreatorJniJNI.UIAnnotationTransform2D_getCurrentValue(this.swigCPtr, this);
        if (UIAnnotationTransform2D_getCurrentValue == 0) {
            return null;
        }
        return new UIAnnotationTransform2DData(UIAnnotationTransform2D_getCurrentValue, true);
    }

    public UIAnnotationTransform2DData getNormalizationTransform2DDataPtr() {
        long UIAnnotationTransform2D_getNormalizationTransform2DDataPtr = EffectCreatorJniJNI.UIAnnotationTransform2D_getNormalizationTransform2DDataPtr(this.swigCPtr, this);
        if (UIAnnotationTransform2D_getNormalizationTransform2DDataPtr == 0) {
            return null;
        }
        return new UIAnnotationTransform2DData(UIAnnotationTransform2D_getNormalizationTransform2DDataPtr, true);
    }

    public EEScale getScale() {
        return new EEScale(EffectCreatorJniJNI.UIAnnotationTransform2D_getScale(this.swigCPtr, this), true);
    }

    public boolean getVisible() {
        return EffectCreatorJniJNI.UIAnnotationTransform2D_getVisible(this.swigCPtr, this);
    }

    public void onCanvasInputRTChanged() {
        EffectCreatorJniJNI.UIAnnotationTransform2D_onCanvasInputRTChanged(this.swigCPtr, this);
    }

    public Error updateValueFromAMG() {
        return new Error(EffectCreatorJniJNI.UIAnnotationTransform2D_updateValueFromAMG(this.swigCPtr, this), true);
    }

    public UIAnnotationTransform2D() {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform2D(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationTransform2D_className();
    }

    public static void initClass() {
        EffectCreatorJniJNI.UIAnnotationTransform2D_initClass();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public static UIAnnotationTransform2D dynamicCast(Element element) {
        long UIAnnotationTransform2D_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationTransform2D_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (UIAnnotationTransform2D_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationTransform2D(UIAnnotationTransform2D_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationTransform2D uIAnnotationTransform2D) {
        if (uIAnnotationTransform2D == null) {
            return 0L;
        }
        return uIAnnotationTransform2D.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    public void setCurrentValue(UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_setCurrentValue__SWIG_1(this.swigCPtr, this, UIAnnotationTransform2DData.getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData);
    }

    public void setVisible(boolean z) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_setVisible__SWIG_1(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public void updateOffsetAfterClone(EEPoint eEPoint) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_updateOffsetAfterClone(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void updateValue(EEPoint eEPoint) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_updateValue__SWIG_1(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void updateValue(EESize eESize) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_updateValue__SWIG_3(this.swigCPtr, this, EESize.getCPtr(eESize), eESize);
    }

    public void updateValue(double d) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_updateValue__SWIG_5(this.swigCPtr, this, d);
    }

    public UIAnnotationTransform2D(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationTransform2D_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }

    public void setCurrentValue(UIAnnotationTransform2DData uIAnnotationTransform2DData, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_setCurrentValue__SWIG_0(this.swigCPtr, this, UIAnnotationTransform2DData.getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData, changeFrom.swigValue());
    }

    public void setVisible(boolean z, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_setVisible__SWIG_0(this.swigCPtr, this, z, changeFrom.swigValue());
    }

    public void updateValue(EEPoint eEPoint, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_updateValue__SWIG_0(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint, changeFrom.swigValue());
    }

    public void updateValue(EESize eESize, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_updateValue__SWIG_2(this.swigCPtr, this, EESize.getCPtr(eESize), eESize, changeFrom.swigValue());
    }

    public void updateValue(double d, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_updateValue__SWIG_4(this.swigCPtr, this, d, changeFrom.swigValue());
    }

    public void updateValue(EEPoint eEPoint, EESize eESize, double d) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_updateValue__SWIG_7(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint, EESize.getCPtr(eESize), eESize, d);
    }

    public void updateValue(EEPoint eEPoint, EESize eESize, double d, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform2D_updateValue__SWIG_6(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint, EESize.getCPtr(eESize), eESize, d, changeFrom.swigValue());
    }
}
