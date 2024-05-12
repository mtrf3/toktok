package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class AssetSourceDataFromInternalLibrary extends IAssetSourceData {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_AssetSourceDataFromInternalLibrary(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public String getClassName() {
        return EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_getClassName(this.swigCPtr, this);
    }

    public String getCreateFrom() {
        return EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_createFrom_get(this.swigCPtr, this);
    }

    public String getId() {
        return EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_id_get(this.swigCPtr, this);
    }

    public String getSource() {
        return EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_source_get(this.swigCPtr, this);
    }

    public AssetSourceDataFromInternalLibrary() {
        this(EffectCreatorJniJNI.new_AssetSourceDataFromInternalLibrary(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public void finalize() {
        delete();
    }

    public static AssetSourceDataFromInternalLibrary dynamicCast(IAssetSourceData iAssetSourceData) {
        long AssetSourceDataFromInternalLibrary_dynamicCast__SWIG_0 = EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_dynamicCast__SWIG_0(IAssetSourceData.getCPtr(iAssetSourceData), iAssetSourceData);
        if (AssetSourceDataFromInternalLibrary_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new AssetSourceDataFromInternalLibrary(AssetSourceDataFromInternalLibrary_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary) {
        if (assetSourceDataFromInternalLibrary == null) {
            return 0L;
        }
        return assetSourceDataFromInternalLibrary.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public boolean isEqual(IAssetSourceData iAssetSourceData) {
        return EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_isEqual(this.swigCPtr, this, IAssetSourceData.getCPtr(iAssetSourceData), iAssetSourceData);
    }

    public void setCreateFrom(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_createFrom_set(this.swigCPtr, this, str);
    }

    public void setId(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_id_set(this.swigCPtr, this, str);
    }

    public void setSource(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_source_set(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public AssetSourceDataFromInternalLibrary(long j, boolean z) {
        super(EffectCreatorJniJNI.AssetSourceDataFromInternalLibrary_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
