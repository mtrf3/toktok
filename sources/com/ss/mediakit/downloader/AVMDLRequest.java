package com.ss.mediakit.downloader;

import X.C64598PWw;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class AVMDLRequest {
    public HashMap<String, String> headers;
    public int mCurlUrlIndex;
    public int mMaxTryCout;
    public int mOpenTimeOut;
    public int mRWTimeOut;
    public int[] mUrlErrCount;
    public int[] mUrlState;
    public long reqOff;
    public C64598PWw response;
    public long size;
    public String[] urls;

    public AVMDLRequest() {
        this.headers = new HashMap<>();
        this.reqOff = -1L;
        this.size = 0L;
        this.response = null;
        this.mCurlUrlIndex = 0;
        this.mMaxTryCout = 0;
        this.mOpenTimeOut = 10;
        this.mRWTimeOut = 10;
    }

    public AVMDLRequest(long j, long j2, String[] strArr, HashMap<String, String> hashMap) {
        this.urls = strArr;
        this.headers = hashMap;
        this.reqOff = j;
        this.size = j2;
        this.mOpenTimeOut = 10;
        this.mRWTimeOut = 10;
        if (strArr != null && strArr.length > 0) {
            this.mUrlState = new int[strArr.length];
            int i = 0;
            while (true) {
                int[] iArr = this.mUrlState;
                if (i < iArr.length) {
                    iArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public AVMDLRequest(long j, long j2, String[] strArr, Object obj, int i, int i2, int i3) {
        this.urls = strArr;
        this.headers = (HashMap) obj;
        this.reqOff = j;
        this.size = j2;
        this.mMaxTryCout = i;
        this.mOpenTimeOut = i2;
        this.mRWTimeOut = i3;
        if (strArr != null && strArr.length > 0) {
            this.mUrlState = new int[strArr.length];
            int i4 = 0;
            while (true) {
                int[] iArr = this.mUrlState;
                if (i4 >= iArr.length) {
                    break;
                }
                iArr[i4] = 0;
                i4++;
            }
            this.mUrlErrCount = new int[this.urls.length];
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.mUrlErrCount;
                if (i5 < iArr2.length) {
                    iArr2[i5] = 0;
                    i5++;
                } else {
                    return;
                }
            }
        }
    }
}
