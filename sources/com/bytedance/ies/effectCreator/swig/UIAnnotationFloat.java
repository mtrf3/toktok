package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationFloat extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationFloat(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationFloat_getClassName(this.swigCPtr, this);
    }

    public float getCurrentValue() {
        return EffectCreatorJniJNI.UIAnnotationFloat_getCurrentValue(this.swigCPtr, this);
    }

    public float getCurrentValueSync() {
        return EffectCreatorJniJNI.UIAnnotationFloat_getCurrentValueSync(this.swigCPtr, this);
    }

    public float getMaxValue() {
        return EffectCreatorJniJNI.UIAnnotationFloat_getMaxValue(this.swigCPtr, this);
    }

    public float getMinValue() {
        return EffectCreatorJniJNI.UIAnnotationFloat_getMinValue(this.swigCPtr, this);
    }

    public UIAnnotationNumberDisplayMode getNumberDisplayMode() {
        return UIAnnotationNumberDisplayMode.swigToEnum(EffectCreatorJniJNI.UIAnnotationFloat_getNumberDisplayMode(this.swigCPtr, this));
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationFloat_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public static UIAnnotationFloat dynamicCast(Element element) {
        long UIAnnotationFloat_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationFloat_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (UIAnnotationFloat_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationFloat(UIAnnotationFloat_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationFloat uIAnnotationFloat) {
        if (uIAnnotationFloat == null) {
            return 0L;
        }
        return uIAnnotationFloat.swigCPtr;
    }

    public void setCurrentValue(float f) {
        EffectCreatorJniJNI.UIAnnotationFloat_setCurrentValue__SWIG_1(this.swigCPtr, this, f);
    }

    public void setMaxValue(float f) {
        EffectCreatorJniJNI.UIAnnotationFloat_setMaxValue__SWIG_1(this.swigCPtr, this, f);
    }

    public void setMinValue(float f) {
        EffectCreatorJniJNI.UIAnnotationFloat_setMinValue__SWIG_1(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public void updateValue(float f) {
        EffectCreatorJniJNI.UIAnnotationFloat_updateValue__SWIG_1(this.swigCPtr, this, f);
    }

    public UIAnnotationFloat(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationFloat_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void setCurrentValue(float f, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationFloat_setCurrentValue__SWIG_0(this.swigCPtr, this, f, changeFrom.swigValue());
    }

    public void setMaxValue(float f, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationFloat_setMaxValue__SWIG_0(this.swigCPtr, this, f, changeFrom.swigValue());
    }

    public void setMinValue(float f, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationFloat_setMinValue__SWIG_0(this.swigCPtr, this, f, changeFrom.swigValue());
    }

    public void updateValue(float f, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationFloat_updateValue__SWIG_0(this.swigCPtr, this, f, changeFrom.swigValue());
    }
}
