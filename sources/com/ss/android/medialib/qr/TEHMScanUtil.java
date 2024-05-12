package com.ss.android.medialib.qr;

import android.content.Context;

/* loaded from: classes15.dex */
public class TEHMScanUtil {
    public static volatile TEHMScanUtil sInstance;

    public void attachContext(Context context) {
    }

    public String[] decode(byte[] bArr, int i, int i2, long j) {
        return null;
    }

    public static TEHMScanUtil getInstance() {
        if (sInstance == null) {
            synchronized (TEHMScanUtil.class) {
                if (sInstance == null) {
                    sInstance = new TEHMScanUtil();
                }
            }
        }
        return sInstance;
    }
}
