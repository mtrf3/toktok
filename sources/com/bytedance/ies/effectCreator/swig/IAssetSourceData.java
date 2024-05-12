package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class IAssetSourceData {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_IAssetSourceData(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getClassName() {
        return EffectCreatorJniJNI.IAssetSourceData_getClassName(this.swigCPtr, this);
    }

    public static String className() {
        return EffectCreatorJniJNI.IAssetSourceData_className();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(IAssetSourceData iAssetSourceData) {
        if (iAssetSourceData == null) {
            return 0L;
        }
        return iAssetSourceData.swigCPtr;
    }

    public boolean isEqual(IAssetSourceData iAssetSourceData) {
        return EffectCreatorJniJNI.IAssetSourceData_isEqual(this.swigCPtr, this, getCPtr(iAssetSourceData), iAssetSourceData);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public IAssetSourceData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
