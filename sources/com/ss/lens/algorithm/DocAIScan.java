package com.ss.lens.algorithm;

import X.C16880lQ;
import X.V0N;
import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public class DocAIScan {
    public static boolean isLibLoaded;
    public static LibLoaderListener mLoaderListener;
    public static long mNativePtr;

    /* loaded from: classes12.dex */
    public interface LibLoaderListener {
        boolean onLoader(String str);
    }

    public static native long nativeDocAIInitScan(String str, String str2);

    public static native void nativeDocAIReleaseScan(long j);

    public static native int nativeDocAIScan(long j, Bitmap bitmap, float[] fArr, int i);

    public static void DocAIReleaseScan() {
        long j = mNativePtr;
        if (j == 0) {
            return;
        }
        nativeDocAIReleaseScan(j);
    }

    /* loaded from: classes2.dex */
    public enum DocumentType {
        IMAGE,
        VIDEO;

        public static DocumentType valueOf(String str) {
            return (DocumentType) V0N.LJJJ(DocumentType.class, str);
        }
    }

    /* loaded from: classes2.dex */
    public enum QuadStatus {
        QUAD_UPDATE,
        QUAD_KEEP,
        QUAD_NO;

        public static QuadStatus valueOf(String str) {
            return (QuadStatus) V0N.LJJJ(QuadStatus.class, str);
        }
    }

    public static synchronized void setOutLoader(LibLoaderListener libLoaderListener) {
        synchronized (DocAIScan.class) {
            mLoaderListener = libLoaderListener;
        }
    }

    public static synchronized boolean DocAIInitScan(String str, String str2) {
        synchronized (DocAIScan.class) {
            if (!isLibLoaded) {
                try {
                    LibLoaderListener libLoaderListener = mLoaderListener;
                    if (libLoaderListener != null) {
                        libLoaderListener.onLoader("c++_shared");
                        mLoaderListener.onLoader("bytenn");
                    } else {
                        C16880lQ.LLJJJIL("c++_shared");
                        C16880lQ.LLJJJIL("bytenn");
                    }
                } catch (UnsatisfiedLinkError e) {
                    e.printStackTrace();
                }
                try {
                    LibLoaderListener libLoaderListener2 = mLoaderListener;
                    if (libLoaderListener2 != null) {
                        if (!libLoaderListener2.onLoader("lens")) {
                            return false;
                        }
                    } else {
                        C16880lQ.LLJJJIL("lens");
                    }
                    isLibLoaded = true;
                } catch (UnsatisfiedLinkError e2) {
                    e2.printStackTrace();
                    return false;
                }
            }
            long nativeDocAIInitScan = nativeDocAIInitScan(str, str2);
            mNativePtr = nativeDocAIInitScan;
            if (nativeDocAIInitScan != 0) {
                return true;
            }
            return false;
        }
    }

    public static int DocAIScan(Bitmap bitmap, float[] fArr, int i) {
        long j = mNativePtr;
        if (j == 0) {
            return -1;
        }
        return nativeDocAIScan(j, bitmap, fArr, i);
    }
}
