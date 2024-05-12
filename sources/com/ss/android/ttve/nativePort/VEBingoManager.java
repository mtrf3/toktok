package com.ss.android.ttve.nativePort;

import X.C16880lQ;
import X.C25620zW;
import X.P4Q;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class VEBingoManager {
    public static int Bingo_TransBlack;
    public static int Bingo_TransDissolve;
    public static int Bingo_TransNull;
    public static int Bingo_TransWhite;
    public static int Bingo_TransZoomIn;
    public static int Bingo_TransZoomOut;
    public Handler imageHandler;
    public HandlerThread imageHandlerThread;
    public Map<Integer, HandlerThread> workThreadMap = new HashMap();
    public Map<Integer, Handler> workThreadHandlerMap = new HashMap();
    public volatile long mNative = 0;

    private native int[] addVideoClipsByNative(long j, String[] strArr, int i);

    private native VETransitionResult[] getBingoTransitionResultsByNative(long j);

    private native long init(int i);

    private native int processBingoImageFrameByNative(long j, Bitmap bitmap, float f, String str);

    private native int processBingoVideoFrameByNative(long j, ByteBuffer byteBuffer, int i, int i2, float f, String str);

    public native int destroy(long j);

    private void reset() {
        for (HandlerThread handlerThread : this.workThreadMap.values()) {
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
        this.workThreadMap.clear();
        this.workThreadHandlerMap.clear();
        HandlerThread handlerThread2 = this.imageHandlerThread;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        this.imageHandlerThread = null;
        this.imageHandler = null;
    }

    public VETransitionResult[] getBingoTransitionResults() {
        if (this.mNative <= 0) {
            return null;
        }
        return getBingoTransitionResultsByNative(this.mNative);
    }

    static {
        TENativeLibsLoader.loadLibrary();
        Bingo_TransNull = 0;
        Bingo_TransDissolve = 1;
        Bingo_TransBlack = 2;
        Bingo_TransWhite = 3;
        Bingo_TransZoomOut = 4;
        Bingo_TransZoomIn = 5;
    }

    public void destroy() {
        reset();
        if (this.mNative > 0) {
            destroy(this.mNative);
            this.mNative = 0L;
        }
    }

    public long initBingoWithTransition() {
        reset();
        if (this.mNative > 0) {
            return this.mNative;
        }
        this.mNative = init(1);
        return this.mNative;
    }

    public Bitmap decodeBitmap(String str) {
        int i;
        int i2;
        int i3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i4 = options.outWidth;
            if (i4 <= 0 || (i = options.outHeight) <= 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("inJustDecodeBounds true, invalid out size, outWidth: ");
                LIZ.append(options.outWidth);
                LIZ.append(", outHeight: ");
                LIZ.append(options.outHeight);
                P4Q.LIZJ("VEBingoManager", X1D.LIZIZ(LIZ));
                return null;
            }
            int i5 = 320;
            if (i4 > i) {
                float f = (i4 * 1.0f) / 320.0f;
                i2 = (int) f;
                int i6 = (int) (i / f);
                int i7 = i6 % 16;
                if (i7 >= 8) {
                    i6 += 16;
                }
                i3 = i6 - i7;
            } else {
                float f2 = (i * 1.0f) / 320.0f;
                i2 = (int) f2;
                int i8 = (int) (i4 / f2);
                int i9 = i8 % 16;
                if (i9 >= 8) {
                    i8 += 16;
                }
                i5 = i8 - i9;
                i3 = 320;
            }
            if (i5 > 0 && i3 > 0) {
                if (i2 > 1) {
                    options.inSampleSize = i2;
                }
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                if (decodeFile == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("BitmapFactory.decodeFile(inJustDecodeBounds false) failed: ");
                    LIZ2.append(str);
                    P4Q.LIZJ("VEBingoManager", X1D.LIZIZ(LIZ2));
                    return null;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("imagePath: ");
                LIZ3.append(str);
                LIZ3.append(", origin size: ");
                LIZ3.append(i4);
                LIZ3.append("*");
                LIZ3.append(i);
                LIZ3.append(", scale size: ");
                LIZ3.append(i5);
                LIZ3.append("*");
                LIZ3.append(i3);
                LIZ3.append(", inSampleSize: ");
                LIZ3.append(i2);
                LIZ3.append(", final size: ");
                LIZ3.append(decodeFile.getWidth());
                LIZ3.append("*");
                LIZ3.append(decodeFile.getHeight());
                LIZ3.append(", thread: ");
                LIZ3.append(C16880lQ.LLLLIIIILLL().getName());
                P4Q.LJFF("VEBingoManager", X1D.LIZIZ(LIZ3));
                if (decodeFile.getConfig() != Bitmap.Config.ARGB_8888 || decodeFile.getWidth() != i5 || decodeFile.getHeight() != i3) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("switch bitmap, config from ");
                    LIZ4.append(decodeFile.getConfig().name());
                    LIZ4.append(" to ");
                    LIZ4.append(Bitmap.Config.ARGB_8888.name());
                    LIZ4.append(", size from ");
                    LIZ4.append(decodeFile.getWidth());
                    LIZ4.append("*");
                    LIZ4.append(decodeFile.getHeight());
                    LIZ4.append(" to ");
                    LIZ4.append(i5);
                    LIZ4.append("*");
                    LIZ4.append(i3);
                    P4Q.LJFF("VEBingoManager", X1D.LIZIZ(LIZ4));
                    Bitmap createBitmap = Bitmap.createBitmap(i5, i3, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawBitmap(decodeFile, (Rect) null, new RectF(0.0f, 0.0f, i5, i3), (Paint) null);
                    decodeFile.recycle();
                    return createBitmap;
                }
                return decodeFile;
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("imagePath: ");
            LIZ5.append(str);
            LIZ5.append(" invalid scale size, scaleWidth: ");
            LIZ5.append(i5);
            LIZ5.append(", scaleHeight: ");
            LIZ5.append(i3);
            LIZ5.append(", bitmap origin width: ");
            LIZ5.append(i4);
            LIZ5.append(", height: ");
            LIZ5.append(i);
            P4Q.LIZJ("VEBingoManager", X1D.LIZIZ(LIZ5));
            return null;
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("decodeBitmap, imagePath: ", str, ", exception: ");
            LIZIZ.append(e.toString());
            P4Q.LIZJ("VEBingoManager", X1D.LIZIZ(LIZIZ));
            return null;
        }
    }

    private int[] addVideoClips(String[] strArr, int i) {
        if (this.mNative <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addVideoClips, invalid mNative: ");
            LIZ.append(this.mNative);
            P4Q.LIZJ("VEBingoManager", X1D.LIZIZ(LIZ));
            return null;
        }
        return addVideoClipsByNative(this.mNative, strArr, i);
    }

    private void saveBitmap(String str, Bitmap bitmap) {
        FileOutputStream fileOutputStream;
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception e) {
                        e = e;
                        C16880lQ.LLLLIIL(e);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    }
                } catch (Throwable th) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                    }
                }
            } catch (IOException e3) {
                C16880lQ.LLLLIIL(e3);
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int processBingoImageFrame(Bitmap bitmap, float f, String str) {
        if (this.mNative <= 0) {
            return -112;
        }
        return processBingoImageFrameByNative(this.mNative, bitmap, f, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139 A[LOOP:2: B:46:0x0132->B:48:0x0139, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void detectTransition(java.lang.String[] r28, int r29, int r30, X.P6A r31) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.VEBingoManager.detectTransition(java.lang.String[], int, int, X.P6A):void");
    }

    public int processBingoVideoFrame(ByteBuffer byteBuffer, int i, int i2, float f, String str) {
        if (this.mNative <= 0) {
            return -112;
        }
        return processBingoVideoFrameByNative(this.mNative, byteBuffer, i, i2, f, str);
    }
}
