package com.ss.lens.algorithm;

import X.C16880lQ;
import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public class DocAIDewarp {
    public static boolean isLibLoaded;
    public static LibLoaderListener mLoaderListener;
    public static long mNativePtr;

    /* loaded from: classes12.dex */
    public interface LibLoaderListener {
        boolean onLoader(String str);
    }

    public static native Bitmap nativeDocAIDewarp(long j, Bitmap bitmap);

    public static native long nativeDocAIInitDewarp(String str, String str2);

    public static native void nativeDocAIReleaseDewarp(long j);

    public static void DocAIReleaseDewarp() {
        long j = mNativePtr;
        if (j == 0) {
            return;
        }
        nativeDocAIReleaseDewarp(j);
    }

    public static Bitmap DocAIDewarp(Bitmap bitmap) {
        long j = mNativePtr;
        if (j == 0) {
            return null;
        }
        return nativeDocAIDewarp(j, bitmap);
    }

    public static synchronized void setOutLoader(LibLoaderListener libLoaderListener) {
        synchronized (DocAIDewarp.class) {
            mLoaderListener = libLoaderListener;
        }
    }

    public static synchronized boolean DocAIInitDewarp(String str, String str2) {
        synchronized (DocAIDewarp.class) {
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
            long nativeDocAIInitDewarp = nativeDocAIInitDewarp(str, str2);
            mNativePtr = nativeDocAIInitDewarp;
            if (nativeDocAIInitDewarp != 0) {
                return true;
            }
            return false;
        }
    }
}
