package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class AssetSource {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_AssetSource(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IAssetSourceData getData() {
        long AssetSource_data_get = EffectCreatorJniJNI.AssetSource_data_get(this.swigCPtr, this);
        if (AssetSource_data_get == 0) {
            return null;
        }
        return new IAssetSourceData(AssetSource_data_get, true);
    }

    public AssetSourceType getType() {
        return AssetSourceType.swigToEnum(EffectCreatorJniJNI.AssetSource_type_get(this.swigCPtr, this));
    }

    public AssetSource() {
        this(EffectCreatorJniJNI.new_AssetSource(), true);
    }

    public void finalize() {
        delete();
    }

    public static AssetSource fromExternalLibrary(AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary) {
        return new AssetSource(EffectCreatorJniJNI.AssetSource_fromExternalLibrary(AssetSourceDataFromExternalLibrary.getCPtr(assetSourceDataFromExternalLibrary), assetSourceDataFromExternalLibrary), true);
    }

    public static AssetSource fromInternalLibrary(AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary) {
        return new AssetSource(EffectCreatorJniJNI.AssetSource_fromInternalLibrary(AssetSourceDataFromInternalLibrary.getCPtr(assetSourceDataFromInternalLibrary), assetSourceDataFromInternalLibrary), true);
    }

    public static AssetSource fromUser(AssetSourceDataFromUser assetSourceDataFromUser) {
        return new AssetSource(EffectCreatorJniJNI.AssetSource_fromUser(AssetSourceDataFromUser.getCPtr(assetSourceDataFromUser), assetSourceDataFromUser), true);
    }

    public static long getCPtr(AssetSource assetSource) {
        if (assetSource == null) {
            return 0L;
        }
        return assetSource.swigCPtr;
    }

    public void setData(IAssetSourceData iAssetSourceData) {
        EffectCreatorJniJNI.AssetSource_data_set(this.swigCPtr, this, IAssetSourceData.getCPtr(iAssetSourceData), iAssetSourceData);
    }

    public void setType(AssetSourceType assetSourceType) {
        EffectCreatorJniJNI.AssetSource_type_set(this.swigCPtr, this, assetSourceType.swigValue());
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public AssetSource(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
