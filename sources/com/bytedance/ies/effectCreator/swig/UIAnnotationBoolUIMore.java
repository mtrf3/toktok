package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationBoolUIMore extends UIAnnotationUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationBoolUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationBoolUIMore_getClassName(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectCreatorJniJNI.UIAnnotationBoolUIMore_getUIType(this.swigCPtr, this));
    }

    public UIAnnotationBoolUIMore() {
        this(EffectCreatorJniJNI.new_UIAnnotationBoolUIMore(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationBoolUIMore_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationBoolUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long UIAnnotationBoolUIMore_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationBoolUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (UIAnnotationBoolUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationBoolUIMore(UIAnnotationBoolUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationBoolUIMore uIAnnotationBoolUIMore) {
        if (uIAnnotationBoolUIMore == null) {
            return 0L;
        }
        return uIAnnotationBoolUIMore.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationBoolUIMore(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationBoolUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
