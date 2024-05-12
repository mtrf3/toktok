package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationPulse extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationPulse(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationPulse_getClassName(this.swigCPtr, this);
    }

    public String getCurrentValue() {
        return EffectCreatorJniJNI.UIAnnotationPulse_getCurrentValue(this.swigCPtr, this);
    }

    public String getCurrentValueSync() {
        return EffectCreatorJniJNI.UIAnnotationPulse_getCurrentValueSync(this.swigCPtr, this);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationPulse_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public static UIAnnotationPulse dynamicCast(Element element) {
        long UIAnnotationPulse_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationPulse_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (UIAnnotationPulse_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationPulse(UIAnnotationPulse_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationPulse uIAnnotationPulse) {
        if (uIAnnotationPulse == null) {
            return 0L;
        }
        return uIAnnotationPulse.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.UIAnnotationPulse_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    public void setCurrentValue(String str) {
        EffectCreatorJniJNI.UIAnnotationPulse_setCurrentValue__SWIG_1(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public void updateValue(String str) {
        EffectCreatorJniJNI.UIAnnotationPulse_updateValue__SWIG_1(this.swigCPtr, this, str);
    }

    public UIAnnotationPulse(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationPulse_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.UIAnnotationPulse_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }

    public void setCurrentValue(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationPulse_setCurrentValue__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void updateValue(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationPulse_updateValue__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }
}
