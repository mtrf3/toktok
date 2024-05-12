package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationFacePointsUIMore extends UIAnnotationUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationFacePointsUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationFacePointsUIMore_getClassName(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectCreatorJniJNI.UIAnnotationFacePointsUIMore_getUIType(this.swigCPtr, this));
    }

    public UIAnnotationFacePointsUIMore() {
        this(EffectCreatorJniJNI.new_UIAnnotationFacePointsUIMore(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationFacePointsUIMore_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationFacePointsUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long UIAnnotationFacePointsUIMore_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationFacePointsUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (UIAnnotationFacePointsUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationFacePointsUIMore(UIAnnotationFacePointsUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationFacePointsUIMore uIAnnotationFacePointsUIMore) {
        if (uIAnnotationFacePointsUIMore == null) {
            return 0L;
        }
        return uIAnnotationFacePointsUIMore.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationFacePointsUIMore(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationFacePointsUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
