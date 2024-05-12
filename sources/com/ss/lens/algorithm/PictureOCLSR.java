package com.ss.lens.algorithm;

import X.C16880lQ;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* loaded from: classes7.dex */
public class PictureOCLSR {
    public static boolean isLibLoaded;
    public long mNativePtr;
    public int maxHeight = 1080;
    public int minHeight = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    public int maxWidth = 600;
    public int minWidth = 360;

    private native long nativeInitPictureOclSr(String str, int i, int i2, int i3);

    private native int nativePictureOclSrProcess(long j, Bitmap bitmap, Bitmap bitmap2);

    private native void nativeReleasePictureOclSr(long j);

    public void ReleasePictureOclSr() {
        long j = this.mNativePtr;
        if (j == 0) {
            return;
        }
        nativeReleasePictureOclSr(j);
    }

    public synchronized boolean InitPictureOclSr(String str) {
        if (!isLibLoaded) {
            try {
                C16880lQ.LLJJJIL("c++_shared");
                C16880lQ.LLJJJIL("bytenn");
                C16880lQ.LLJJJIL("fastcv");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                C16880lQ.LLJJJIL("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                return false;
            }
        }
        if (str.isEmpty()) {
            return false;
        }
        long nativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, 4);
        this.mNativePtr = nativeInitPictureOclSr;
        if (nativeInitPictureOclSr != 0) {
            return true;
        }
        return false;
    }

    public boolean IsSrSupport(Bitmap bitmap) {
        if (bitmap.getConfig() != Bitmap.Config.RGB_565) {
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width % 2 != 0 || height % 2 != 0 || width < this.minWidth || width > this.maxWidth || height < this.minHeight || height > this.maxHeight) {
            return false;
        }
        return true;
    }

    public synchronized boolean InitPictureOclSr(String str, int i) {
        if (!isLibLoaded) {
            try {
                C16880lQ.LLJJJIL("c++_shared");
                C16880lQ.LLJJJIL("bytenn");
                C16880lQ.LLJJJIL("fastcv");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                C16880lQ.LLJJJIL("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                return false;
            }
        }
        if (str.isEmpty()) {
            return false;
        }
        long nativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, i);
        this.mNativePtr = nativeInitPictureOclSr;
        if (nativeInitPictureOclSr != 0) {
            return true;
        }
        return false;
    }

    public synchronized int PictureOclSrProcess(Bitmap bitmap, Bitmap bitmap2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width % 2 == 0 && height % 2 == 0) {
            if (width >= this.minWidth && width <= this.maxWidth && height >= this.minHeight && height <= this.maxHeight) {
                if (nativePictureOclSrProcess(this.mNativePtr, bitmap, bitmap2) != 0) {
                    return -1;
                }
                return 0;
            }
            return -1;
        }
        return -1;
    }

    public synchronized boolean InitPictureOclSr(String str, int i, int i2, int i3, int i4, int i5) {
        if (i2 > i3 || i4 > i5 || i2 <= 0 || i4 <= 0) {
            return false;
        }
        if (!isLibLoaded) {
            try {
                C16880lQ.LLJJJIL("c++_shared");
                C16880lQ.LLJJJIL("bytenn");
                C16880lQ.LLJJJIL("fastcv");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            try {
                C16880lQ.LLJJJIL("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
                return false;
            }
        }
        this.maxHeight = i5;
        this.minHeight = i4;
        this.maxWidth = i3;
        this.minWidth = i2;
        if (str.isEmpty()) {
            return false;
        }
        long nativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, i);
        this.mNativePtr = nativeInitPictureOclSr;
        if (nativeInitPictureOclSr == 0) {
            return false;
        }
        return true;
    }
}
