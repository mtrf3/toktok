package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class AssetGif extends AssetImageTexture {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.AssetImageTexture, com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_AssetGif(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.AssetImageTexture, com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.AssetGif_getClassName(this.swigCPtr, this);
    }

    public AssetGif() {
        this(EffectCreatorJniJNI.new_AssetGif__SWIG_0(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.AssetGif_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.AssetImageTexture, com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public AssetGif(Project project) {
        this(EffectCreatorJniJNI.new_AssetGif__SWIG_1(Project.getCPtr(project), project), true);
    }

    public static AssetGif dynamicCast(Element element) {
        long AssetGif_dynamicCast__SWIG_0 = EffectCreatorJniJNI.AssetGif_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (AssetGif_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new AssetGif(AssetGif_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(AssetGif assetGif) {
        if (assetGif == null) {
            return 0L;
        }
        return assetGif.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.AssetImageTexture, com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public AssetGif(long j, boolean z) {
        super(EffectCreatorJniJNI.AssetGif_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
