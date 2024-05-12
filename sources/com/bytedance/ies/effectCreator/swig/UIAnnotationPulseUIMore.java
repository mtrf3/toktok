package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationPulseUIMore extends UIAnnotationUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationPulseUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationPulseUIMore_getClassName(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectCreatorJniJNI.UIAnnotationPulseUIMore_getUIType(this.swigCPtr, this));
    }

    public UIAnnotationPulseUIMore() {
        this(EffectCreatorJniJNI.new_UIAnnotationPulseUIMore(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationPulseUIMore_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationPulseUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long UIAnnotationPulseUIMore_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationPulseUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (UIAnnotationPulseUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationPulseUIMore(UIAnnotationPulseUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationPulseUIMore uIAnnotationPulseUIMore) {
        if (uIAnnotationPulseUIMore == null) {
            return 0L;
        }
        return uIAnnotationPulseUIMore.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationPulseUIMore(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationPulseUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
