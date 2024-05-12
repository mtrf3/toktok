package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationAssetTextureUIMore extends UIAnnotationUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationAssetTextureUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_getClassName(this.swigCPtr, this);
    }

    public int getMaxHeight() {
        return EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_getMaxHeight(this.swigCPtr, this);
    }

    public int getMaxWidth() {
        return EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_getMaxWidth(this.swigCPtr, this);
    }

    public EEStdStringList getSuffixes() {
        return new EEStdStringList(EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_getSuffixes(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_getUIType(this.swigCPtr, this));
    }

    public UIAnnotationAssetTextureUIMore() {
        this(EffectCreatorJniJNI.new_UIAnnotationAssetTextureUIMore(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationAssetTextureUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long UIAnnotationAssetTextureUIMore_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (UIAnnotationAssetTextureUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationAssetTextureUIMore(UIAnnotationAssetTextureUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationAssetTextureUIMore uIAnnotationAssetTextureUIMore) {
        if (uIAnnotationAssetTextureUIMore == null) {
            return 0L;
        }
        return uIAnnotationAssetTextureUIMore.swigCPtr;
    }

    public void setMaxHeight(int i) {
        EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_setMaxHeight(this.swigCPtr, this, i);
    }

    public void setMaxWidth(int i) {
        EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_setMaxWidth(this.swigCPtr, this, i);
    }

    public void setSuffixes(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_setSuffixes(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationAssetTextureUIMore(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationAssetTextureUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
