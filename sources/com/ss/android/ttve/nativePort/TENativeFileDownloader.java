package com.ss.android.ttve.nativePort;

import X.AbstractC36569EWv;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class TENativeFileDownloader {
    public AbstractC36569EWv mTaskListener;

    public static native int nativeCheckTTNetAvailable();

    private native long nativeCreateFileDownload(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, boolean z, String[] strArr);

    private native void nativeDestroyFileDownload(long j);

    private native int nativeGetBufferTimeWithTimestamp(long j, int i);

    public void destroyFileDownload(long j) {
        nativeDestroyFileDownload(j);
    }

    public void onConnected(String str) {
        AbstractC36569EWv abstractC36569EWv = this.mTaskListener;
        if (abstractC36569EWv != null) {
            abstractC36569EWv.LJJJJI(str);
        }
    }

    public void onFinished(String str) {
        AbstractC36569EWv abstractC36569EWv = this.mTaskListener;
        if (abstractC36569EWv != null) {
            abstractC36569EWv.LJJJLIIL(str);
        }
    }

    public int getBufferTimeWithTimestamp(long j, int i) {
        return nativeGetBufferTimeWithTimestamp(j, i);
    }

    public void onOpenResult(String str, boolean z) {
        AbstractC36569EWv abstractC36569EWv = this.mTaskListener;
        if (abstractC36569EWv != null) {
            abstractC36569EWv.LJIIJ(str, z);
        }
    }

    public void onProgress(String str, float f) {
        AbstractC36569EWv abstractC36569EWv = this.mTaskListener;
        if (abstractC36569EWv != null) {
            abstractC36569EWv.LJJJJJ(str, f);
        }
    }

    public void onError(String str, int i, int i2, String str2) {
        AbstractC36569EWv abstractC36569EWv = this.mTaskListener;
        if (abstractC36569EWv != null) {
            abstractC36569EWv.LJJJ(str, i, i2, str2);
        }
    }

    public void onInfo(String str, int i, int i2, float f, String str2) {
        AbstractC36569EWv abstractC36569EWv = this.mTaskListener;
        if (abstractC36569EWv != null) {
            abstractC36569EWv.LIZ(str, i, i2, f, str2);
        }
    }

    public long createFileDownload(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, boolean z, HashMap<String, String> hashMap, AbstractC36569EWv abstractC36569EWv) {
        String[] strArr;
        this.mTaskListener = abstractC36569EWv;
        if (hashMap != null && !hashMap.isEmpty()) {
            strArr = new String[hashMap.size() * 2];
            int i4 = 0;
            for (String str4 : hashMap.keySet()) {
                int i5 = i4 + 1;
                strArr[i4] = str4;
                i4 = i5 + 1;
                strArr[i5] = hashMap.get(str4);
            }
        } else {
            strArr = null;
        }
        return nativeCreateFileDownload(str, str2, str3, j, j2, i, i2, i3, z, strArr);
    }
}
