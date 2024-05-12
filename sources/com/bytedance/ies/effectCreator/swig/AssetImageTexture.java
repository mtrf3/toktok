package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class AssetImageTexture extends Asset {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_AssetImageTexture(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.AssetImageTexture_getClassName(this.swigCPtr, this);
    }

    public int getHeight() {
        return EffectCreatorJniJNI.AssetImageTexture_getHeight(this.swigCPtr, this);
    }

    public String getPNGTexMMetaPath() {
        return EffectCreatorJniJNI.AssetImageTexture_getPNGTexMMetaPath(this.swigCPtr, this);
    }

    public int getWidth() {
        return EffectCreatorJniJNI.AssetImageTexture_getWidth(this.swigCPtr, this);
    }

    public AssetImageTexture() {
        this(EffectCreatorJniJNI.new_AssetImageTexture__SWIG_0(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.AssetImageTexture_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public AssetImageTexture(Project project) {
        this(EffectCreatorJniJNI.new_AssetImageTexture__SWIG_1(Project.getCPtr(project), project), true);
    }

    public static AssetImageTexture dynamicCast(Element element) {
        long AssetImageTexture_dynamicCast__SWIG_0 = EffectCreatorJniJNI.AssetImageTexture_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (AssetImageTexture_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new AssetImageTexture(AssetImageTexture_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(AssetImageTexture assetImageTexture) {
        if (assetImageTexture == null) {
            return 0L;
        }
        return assetImageTexture.swigCPtr;
    }

    public void setHeight(int i) {
        EffectCreatorJniJNI.AssetImageTexture_setHeight__SWIG_1(this.swigCPtr, this, i);
    }

    public void setWidth(int i) {
        EffectCreatorJniJNI.AssetImageTexture_setWidth__SWIG_1(this.swigCPtr, this, i);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public AssetImageTexture(long j, boolean z) {
        super(EffectCreatorJniJNI.AssetImageTexture_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void setHeight(int i, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.AssetImageTexture_setHeight__SWIG_0(this.swigCPtr, this, i, changeFrom.swigValue());
    }

    public void setWidth(int i, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.AssetImageTexture_setWidth__SWIG_0(this.swigCPtr, this, i, changeFrom.swigValue());
    }

    public Error createFrom(String str, int i, int i2, String str2) {
        return new Error(EffectCreatorJniJNI.AssetImageTexture_createFrom(this.swigCPtr, this, str, i, i2, str2), true);
    }
}
