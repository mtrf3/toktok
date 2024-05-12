package com.ss.lens.algorithm;

import X.C16880lQ;
import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public class DocAIDeblur {
    public static boolean isLibLoaded;
    public static LibLoaderListener mLoaderListener;
    public static long mNativePtr;

    /* loaded from: classes12.dex */
    public interface LibLoaderListener {
        boolean onLoader(String str);
    }

    public static native Bitmap nativeDocAIDeblur(long j, Bitmap bitmap);

    public static native long nativeDocAIInitDeblur(String str, String str2);

    public static native void nativeDocAIReleaseDeblur(long j);

    public static void DocAIReleaseDeblur() {
        long j = mNativePtr;
        if (j == 0) {
            return;
        }
        nativeDocAIReleaseDeblur(j);
    }

    public static Bitmap DocAIDeblur(Bitmap bitmap) {
        long j = mNativePtr;
        if (j == 0) {
            return null;
        }
        return nativeDocAIDeblur(j, bitmap);
    }

    public static synchronized void setOutLoader(LibLoaderListener libLoaderListener) {
        synchronized (DocAIDeblur.class) {
            mLoaderListener = libLoaderListener;
        }
    }

    public static synchronized boolean DocAIInitDeblur(String str, String str2) {
        synchronized (DocAIDeblur.class) {
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
            long nativeDocAIInitDeblur = nativeDocAIInitDeblur(str, str2);
            mNativePtr = nativeDocAIInitDeblur;
            if (nativeDocAIInitDeblur != 0) {
                return true;
            }
            return false;
        }
    }
}
