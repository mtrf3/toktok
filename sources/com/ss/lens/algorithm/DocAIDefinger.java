package com.ss.lens.algorithm;

import X.C16880lQ;
import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public class DocAIDefinger {
    public static boolean isLibLoaded;
    public static LibLoaderListener mLoaderListener;
    public static long mNativePtr;

    /* loaded from: classes12.dex */
    public interface LibLoaderListener {
        boolean onLoader(String str);
    }

    public static native Bitmap nativeDocAIDefinger(long j, Bitmap bitmap);

    public static native long nativeDocAIInitDefinger(String str, String str2);

    public static native void nativeDocAIReleaseDefinger(long j);

    public static void DocAIReleaseDefinger() {
        long j = mNativePtr;
        if (j == 0) {
            return;
        }
        nativeDocAIReleaseDefinger(j);
    }

    public static Bitmap DocAIDefinger(Bitmap bitmap) {
        long j = mNativePtr;
        if (j == 0) {
            return null;
        }
        return nativeDocAIDefinger(j, bitmap);
    }

    public static synchronized void setOutLoader(LibLoaderListener libLoaderListener) {
        synchronized (DocAIDefinger.class) {
            mLoaderListener = libLoaderListener;
        }
    }

    public static synchronized boolean DocAIInitDefinger(String str, String str2) {
        synchronized (DocAIDefinger.class) {
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
            long nativeDocAIInitDefinger = nativeDocAIInitDefinger(str, str2);
            mNativePtr = nativeDocAIInitDefinger;
            if (nativeDocAIInitDefinger != 0) {
                return true;
            }
            return false;
        }
    }
}
