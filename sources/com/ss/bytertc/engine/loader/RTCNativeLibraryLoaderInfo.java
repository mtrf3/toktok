package com.ss.bytertc.engine.loader;

import X.X1D;

/* loaded from: classes33.dex */
public class RTCNativeLibraryLoaderInfo {
    public String mSdkVersion = "";
    public Long mLoadTimeStampMs = 0L;
    public String mLoaderClassName = "";
    public int mLoadTimes = 0;
    public boolean mIsLoadSuccess = false;

    public long getLoadTimeStamp() {
        return this.mLoadTimeStampMs.longValue();
    }

    public void loadLibrary() {
        this.mLoadTimes++;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RTCNativeLibraryLoaderInfo{SdkVersion='");
        LIZ.append(this.mSdkVersion);
        LIZ.append('\'');
        LIZ.append(", LoadTimeStamp=");
        LIZ.append(this.mLoadTimeStampMs);
        LIZ.append(", LoaderClassName='");
        LIZ.append(this.mLoaderClassName);
        LIZ.append('\'');
        LIZ.append(", LoadTimes=");
        LIZ.append(this.mLoadTimes);
        LIZ.append(", IsLoadSuccess=");
        LIZ.append(this.mIsLoadSuccess);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getLoaderClassName() {
        return this.mLoaderClassName;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public boolean isLoadSuccess() {
        return this.mIsLoadSuccess;
    }

    public void setLoadResult(boolean z) {
        this.mIsLoadSuccess = z;
    }

    public void setLoadTimeStampMs(long j) {
        this.mLoadTimeStampMs = Long.valueOf(j);
    }

    public void setLoaderClassName(String str) {
        this.mLoaderClassName = str;
    }

    public void setSdkVersion(String str) {
        this.mSdkVersion = str;
    }
}
