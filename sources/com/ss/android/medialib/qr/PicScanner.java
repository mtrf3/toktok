package com.ss.android.medialib.qr;

import X.InterfaceC84048Wyi;
import X.P4Q;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.utils.BitmapLoader;

/* loaded from: classes15.dex */
public class PicScanner {
    public long handle = nativeCreate();
    public InterfaceC84048Wyi listener;
    public boolean success;

    private native long nativeCreate();

    private native EnigmaResult nativeGetEnigmaResult(long j);

    private native void nativeRelease(long j);

    private native int nativeStart(long j, Bitmap bitmap, ScanSettings scanSettings);

    private native void nativeStop(long j);

    public void onResult(boolean z) {
    }

    public synchronized void release() {
        P4Q.LJFF("PicScanner", "release");
        long j = this.handle;
        if (j == 0) {
            P4Q.LJII("PicScanner", "release skip");
        } else {
            nativeRelease(j);
            this.handle = 0L;
        }
    }

    public void setListener(InterfaceC84048Wyi interfaceC84048Wyi) {
    }

    public EnigmaResult getEnigmaResult() {
        long j = this.handle;
        if (j == 0) {
            return null;
        }
        EnigmaResult nativeGetEnigmaResult = nativeGetEnigmaResult(j);
        if (nativeGetEnigmaResult != null && nativeGetEnigmaResult.getResult() != null) {
            this.success = true;
        }
        return nativeGetEnigmaResult;
    }

    public boolean isValid() {
        if (this.handle != 0) {
            return true;
        }
        return false;
    }

    public void stop() {
        long j = this.handle;
        if (j == 0) {
            return;
        }
        nativeStop(j);
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public boolean isSuccess() {
        return this.success;
    }

    public int start(String str, ScanSettings scanSettings) {
        if (this.handle == 0) {
            return -1;
        }
        Bitmap bitmap = null;
        try {
            Bitmap loadBitmap = BitmapLoader.loadBitmap(str, scanSettings.width, scanSettings.height);
            if (loadBitmap != null) {
                try {
                    int width = loadBitmap.getWidth();
                    int height = loadBitmap.getHeight();
                    if (width * height > 4000000) {
                        float sqrt = (float) (1.0d / Math.sqrt((width * height) / 4000000.0f));
                        Matrix matrix = new Matrix();
                        matrix.postScale(sqrt, sqrt);
                        bitmap = Bitmap.createBitmap(loadBitmap, 0, 0, width, height, matrix, true);
                    } else {
                        bitmap = loadBitmap.copy(Bitmap.Config.ARGB_8888, true);
                    }
                    if (!loadBitmap.isRecycled()) {
                        loadBitmap.recycle();
                    } else if (loadBitmap != null && !loadBitmap.isRecycled()) {
                        loadBitmap.recycle();
                    }
                } catch (Exception unused) {
                    bitmap = loadBitmap;
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                        return -2;
                    }
                    return -2;
                } catch (OutOfMemoryError unused2) {
                    bitmap = loadBitmap;
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                        return -3;
                    }
                    return -3;
                } catch (Throwable th) {
                    if (!loadBitmap.isRecycled()) {
                        loadBitmap.recycle();
                        throw th;
                    }
                    throw th;
                }
            }
            return start(bitmap, scanSettings);
        } catch (Exception unused3) {
            if (0 == 0) {
                return -2;
            }
        } catch (OutOfMemoryError unused4) {
            if (0 == 0) {
                return -3;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int start(Bitmap bitmap, ScanSettings scanSettings) {
        if (bitmap == null) {
            return -1;
        }
        this.success = false;
        nativeStart(this.handle, bitmap, scanSettings);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return 0;
    }
}
