package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class AssetManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_AssetManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getClassName() {
        return EffectCreatorJniJNI.AssetManager_getClassName(this.swigCPtr, this);
    }

    public void updateAssetHashToPartIDMap() {
        EffectCreatorJniJNI.AssetManager_updateAssetHashToPartIDMap(this.swigCPtr, this);
    }

    public static String className() {
        return EffectCreatorJniJNI.AssetManager_className();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(AssetManager assetManager) {
        if (assetManager == null) {
            return 0L;
        }
        return assetManager.swigCPtr;
    }

    public Error checkAssetCompatibilityWithAssetPackage(String str) {
        return new Error(EffectCreatorJniJNI.AssetManager_checkAssetCompatibilityWithAssetPackage(this.swigCPtr, this, str), true);
    }

    public Error checkAssetCompatibilityWithType(AssetType assetType) {
        return new Error(EffectCreatorJniJNI.AssetManager_checkAssetCompatibilityWithType(this.swigCPtr, this, assetType.swigValue()), true);
    }

    public Asset createAssetFromPackage(String str) {
        long AssetManager_createAssetFromPackage = EffectCreatorJniJNI.AssetManager_createAssetFromPackage(this.swigCPtr, this, str);
        if (AssetManager_createAssetFromPackage == 0) {
            return null;
        }
        return new Asset(AssetManager_createAssetFromPackage, true);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public AssetManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public Asset createAsset(AssetType assetType, EEStdStringList eEStdStringList) {
        long AssetManager_createAsset__SWIG_1 = EffectCreatorJniJNI.AssetManager_createAsset__SWIG_1(this.swigCPtr, this, assetType.swigValue(), EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
        if (AssetManager_createAsset__SWIG_1 == 0) {
            return null;
        }
        return new Asset(AssetManager_createAsset__SWIG_1, true);
    }

    public Asset createAsset(AssetType assetType, String str) {
        long AssetManager_createAsset__SWIG_0 = EffectCreatorJniJNI.AssetManager_createAsset__SWIG_0(this.swigCPtr, this, assetType.swigValue(), str);
        if (AssetManager_createAsset__SWIG_0 == 0) {
            return null;
        }
        return new Asset(AssetManager_createAsset__SWIG_0, true);
    }
}
