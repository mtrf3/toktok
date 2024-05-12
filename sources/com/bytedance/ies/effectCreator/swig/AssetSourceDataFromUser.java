package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class AssetSourceDataFromUser extends IAssetSourceData {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_AssetSourceDataFromUser(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public String getClassName() {
        return EffectCreatorJniJNI.AssetSourceDataFromUser_getClassName(this.swigCPtr, this);
    }

    public String getCreateFrom() {
        return EffectCreatorJniJNI.AssetSourceDataFromUser_createFrom_get(this.swigCPtr, this);
    }

    public AssetSourceDataFromUser() {
        this(EffectCreatorJniJNI.new_AssetSourceDataFromUser(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.AssetSourceDataFromUser_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public void finalize() {
        delete();
    }

    public static AssetSourceDataFromUser dynamicCast(IAssetSourceData iAssetSourceData) {
        long AssetSourceDataFromUser_dynamicCast__SWIG_0 = EffectCreatorJniJNI.AssetSourceDataFromUser_dynamicCast__SWIG_0(IAssetSourceData.getCPtr(iAssetSourceData), iAssetSourceData);
        if (AssetSourceDataFromUser_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new AssetSourceDataFromUser(AssetSourceDataFromUser_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(AssetSourceDataFromUser assetSourceDataFromUser) {
        if (assetSourceDataFromUser == null) {
            return 0L;
        }
        return assetSourceDataFromUser.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public boolean isEqual(IAssetSourceData iAssetSourceData) {
        return EffectCreatorJniJNI.AssetSourceDataFromUser_isEqual(this.swigCPtr, this, IAssetSourceData.getCPtr(iAssetSourceData), iAssetSourceData);
    }

    public void setCreateFrom(String str) {
        EffectCreatorJniJNI.AssetSourceDataFromUser_createFrom_set(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.effectcreator.swig.IAssetSourceData
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public AssetSourceDataFromUser(long j, boolean z) {
        super(EffectCreatorJniJNI.AssetSourceDataFromUser_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
