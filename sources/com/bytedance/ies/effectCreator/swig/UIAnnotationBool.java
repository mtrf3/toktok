package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationBool extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationBool(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationBool_getClassName(this.swigCPtr, this);
    }

    public boolean getCurrentValue() {
        return EffectCreatorJniJNI.UIAnnotationBool_getCurrentValue(this.swigCPtr, this);
    }

    public boolean getCurrentValueSync() {
        return EffectCreatorJniJNI.UIAnnotationBool_getCurrentValueSync(this.swigCPtr, this);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationBool_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public static UIAnnotationBool dynamicCast(Element element) {
        long UIAnnotationBool_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationBool_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (UIAnnotationBool_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationBool(UIAnnotationBool_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationBool uIAnnotationBool) {
        if (uIAnnotationBool == null) {
            return 0L;
        }
        return uIAnnotationBool.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.UIAnnotationBool_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    public void setCurrentValue(boolean z) {
        EffectCreatorJniJNI.UIAnnotationBool_setCurrentValue__SWIG_1(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public void updateValue(boolean z) {
        EffectCreatorJniJNI.UIAnnotationBool_updateValue__SWIG_1(this.swigCPtr, this, z);
    }

    public UIAnnotationBool(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationBool_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.UIAnnotationBool_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }

    public void setCurrentValue(boolean z, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBool_setCurrentValue__SWIG_0(this.swigCPtr, this, z, changeFrom.swigValue());
    }

    public void updateValue(boolean z, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBool_updateValue__SWIG_0(this.swigCPtr, this, z, changeFrom.swigValue());
    }
}
