package com.ss.lens.algorithm;

import X.C16880lQ;
import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public class DocAICrop {
    public static boolean isLibLoaded;
    public static LibLoaderListener mLoaderListener;
    public static long mNativePtr;

    /* loaded from: classes12.dex */
    public interface LibLoaderListener {
        boolean onLoader(String str);
    }

    public static native Bitmap nativeDocAICrop(long j, Bitmap bitmap, float[] fArr);

    public static native long nativeDocAIInitCrop();

    public static native void nativeDocAIReleaseCrop(long j);

    public static synchronized boolean DocAIInitCrop() {
        synchronized (DocAICrop.class) {
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
            long nativeDocAIInitCrop = nativeDocAIInitCrop();
            mNativePtr = nativeDocAIInitCrop;
            if (nativeDocAIInitCrop != 0) {
                return true;
            }
            return false;
        }
    }

    public static void DocAIReleaseCrop() {
        long j = mNativePtr;
        if (j == 0) {
            return;
        }
        nativeDocAIReleaseCrop(j);
    }

    public static synchronized void setOutLoader(LibLoaderListener libLoaderListener) {
        synchronized (DocAICrop.class) {
            mLoaderListener = libLoaderListener;
        }
    }

    public static Bitmap DocAICrop(Bitmap bitmap, float[] fArr) {
        long j = mNativePtr;
        if (j == 0) {
            return null;
        }
        return nativeDocAICrop(j, bitmap, fArr);
    }
}
