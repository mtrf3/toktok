package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationAssetTexture extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationAssetTexture(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getAssetPath() {
        return EffectCreatorJniJNI.UIAnnotationAssetTexture_getAssetPath(this.swigCPtr, this);
    }

    public AssetImageTexture getAssetTexture() {
        long UIAnnotationAssetTexture_getAssetTexture = EffectCreatorJniJNI.UIAnnotationAssetTexture_getAssetTexture(this.swigCPtr, this);
        if (UIAnnotationAssetTexture_getAssetTexture == 0) {
            return null;
        }
        return new AssetImageTexture(UIAnnotationAssetTexture_getAssetTexture, true);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationAssetTexture_getClassName(this.swigCPtr, this);
    }

    public ElementId getCurrentValueId() {
        return new ElementId(EffectCreatorJniJNI.UIAnnotationAssetTexture_getCurrentValueId(this.swigCPtr, this), true);
    }

    public UIAnnotationAssetTexture() {
        this(EffectCreatorJniJNI.new_UIAnnotationAssetTexture(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationAssetTexture_className();
    }

    public static void initClass() {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_initClass();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public static UIAnnotationAssetTexture dynamicCast(Element element) {
        long UIAnnotationAssetTexture_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationAssetTexture_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (UIAnnotationAssetTexture_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationAssetTexture(UIAnnotationAssetTexture_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationAssetTexture uIAnnotationAssetTexture) {
        if (uIAnnotationAssetTexture == null) {
            return 0L;
        }
        return uIAnnotationAssetTexture.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    public void setCurrentValueId(ElementId elementId) {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_setCurrentValueId__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public void updateValue(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_updateValue__SWIG_5(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public void updateValue(ElementId elementId) {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_updateValue__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void updateValue(String str) {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_updateValue__SWIG_3(this.swigCPtr, this, str);
    }

    public UIAnnotationAssetTexture(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationAssetTexture_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }

    public void setCurrentValueId(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_setCurrentValueId__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }

    public void updateValue(EEStdStringList eEStdStringList, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_updateValue__SWIG_4(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList, changeFrom.swigValue());
    }

    public void updateValue(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_updateValue__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }

    public void updateValue(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationAssetTexture_updateValue__SWIG_2(this.swigCPtr, this, str, changeFrom.swigValue());
    }
}
