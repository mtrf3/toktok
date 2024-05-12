package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationFloatUIMore extends UIAnnotationUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationFloatUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationFloatUIMore_getClassName(this.swigCPtr, this);
    }

    public UIAnnotationNumberDisplayMode getNumberDisplayMode() {
        return UIAnnotationNumberDisplayMode.swigToEnum(EffectCreatorJniJNI.UIAnnotationFloatUIMore_getNumberDisplayMode(this.swigCPtr, this));
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectCreatorJniJNI.UIAnnotationFloatUIMore_getUIType(this.swigCPtr, this));
    }

    public UIAnnotationFloatUIMore() {
        this(EffectCreatorJniJNI.new_UIAnnotationFloatUIMore(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationFloatUIMore_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationFloatUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long UIAnnotationFloatUIMore_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationFloatUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (UIAnnotationFloatUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationFloatUIMore(UIAnnotationFloatUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationFloatUIMore uIAnnotationFloatUIMore) {
        if (uIAnnotationFloatUIMore == null) {
            return 0L;
        }
        return uIAnnotationFloatUIMore.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationFloatUIMore(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationFloatUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
