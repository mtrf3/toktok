package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class AssetSourceDataFromExternalLibrary extends IAssetSourceData {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_AssetSourceDataFromExternalLibrary(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getAuthor() {
        return EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_author_get(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public String getClassName() {
        return EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_getClassName(this.swigCPtr, this);
    }

    public String getCreateFrom() {
        return EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_createFrom_get(this.swigCPtr, this);
    }

    public String getCreator() {
        return EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_creator_get(this.swigCPtr, this);
    }

    public String getGenerator() {
        return EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_generator_get(this.swigCPtr, this);
    }

    public String getLicense() {
        return EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_license_get(this.swigCPtr, this);
    }

    public String getSource() {
        return EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_source_get(this.swigCPtr, this);
    }

    public String getTitle() {
        return EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_title_get(this.swigCPtr, this);
    }

    public AssetSourceDataFromExternalLibrary() {
        this(EffectCreatorJniJNI.new_AssetSourceDataFromExternalLibrary(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public void finalize() {
        delete();
    }

    public static AssetSourceDataFromExternalLibrary dynamicCast(IAssetSourceData iAssetSourceData) {
        long AssetSourceDataFromExternalLibrary_dynamicCast__SWIG_0 = EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_dynamicCast__SWIG_0(IAssetSourceData.getCPtr(iAssetSourceData), iAssetSourceData);
        if (AssetSourceDataFromExternalLibrary_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new AssetSourceDataFromExternalLibrary(AssetSourceDataFromExternalLibrary_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary) {
        if (assetSourceDataFromExternalLibrary == null) {
            return 0L;
        }
        return assetSourceDataFromExternalLibrary.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public boolean isEqual(IAssetSourceData iAssetSourceData) {
        return EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_isEqual(this.swigCPtr, this, IAssetSourceData.getCPtr(iAssetSourceData), iAssetSourceData);
    }

    public void setAuthor(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_author_set(this.swigCPtr, this, str);
    }

    public void setCreateFrom(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_createFrom_set(this.swigCPtr, this, str);
    }

    public void setCreator(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_creator_set(this.swigCPtr, this, str);
    }

    public void setGenerator(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_generator_set(this.swigCPtr, this, str);
    }

    public void setLicense(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_license_set(this.swigCPtr, this, str);
    }

    public void setSource(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_source_set(this.swigCPtr, this, str);
    }

    public void setTitle(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_title_set(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public AssetSourceDataFromExternalLibrary(long j, boolean z) {
        super(EffectCreatorJniJNI.AssetSourceDataFromExternalLibrary_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
