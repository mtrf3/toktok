package com.bytedance.fresco.heif;

import X.C81794W8g;
import X.InterfaceC81825W9l;
import X.PO5;
import X.W58;
import X.WFR;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import com.bytedance.fresco.nativeheif.Heif;
import com.bytedance.fresco.nativeheif.HeifData;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes15.dex */
public class HeifBitmapFactoryImpl implements InterfaceC81825W9l {
    public static PO5 mBitmapCreator = null;
    public static boolean sHeifWppEnable = true;

    public void setBitmapCreator(PO5 po5) {
        mBitmapCreator = po5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:14|15|(1:17)|18|(5:19|20|(2:21|(1:23)(1:24))|25|(3:(1:28)(1:45)|(1:44)(1:32)|(5:(1:35)(1:43)|36|38|39|40)))|46|47|48) */
    @Override // X.InterfaceC81825W9l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap decodeStream(java.io.InputStream r17, android.graphics.Rect r18, android.graphics.BitmapFactory.Options r19) {
        /*
            r16 = this;
            r8 = r17
            r3 = r18
            r7 = 0
            boolean r0 = r8.markSupported()     // Catch: java.io.IOException -> Lbf
            if (r0 != 0) goto L18
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> Lbf
            r1.<init>(r8)     // Catch: java.io.IOException -> Lbf
            int r0 = r1.available()     // Catch: java.io.IOException -> Lbf
            r1.mark(r0)     // Catch: java.io.IOException -> Lbf
            r8 = r1
        L18:
            int[] r4 = X.C81794W8g.LIZJ(r8)     // Catch: java.io.IOException -> Lbf
            r2 = 1
            r6 = 0
            r0 = r19
            if (r0 == 0) goto L31
            boolean r1 = r0.inJustDecodeBounds     // Catch: java.io.IOException -> Lbf
            if (r1 == 0) goto L31
            if (r4 == 0) goto L30
            r1 = r4[r6]     // Catch: java.io.IOException -> Lbf
            r0.outWidth = r1     // Catch: java.io.IOException -> Lbf
            r1 = r4[r2]     // Catch: java.io.IOException -> Lbf
            r0.outHeight = r1     // Catch: java.io.IOException -> Lbf
        L30:
            return r7
        L31:
            r8.reset()     // Catch: java.io.IOException -> Lbf
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            if (r3 != 0) goto L40
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
        L40:
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r2]     // Catch: java.lang.Throwable -> L9c
        L44:
            int r4 = r8.read(r5)     // Catch: java.lang.Throwable -> L9c
            r2 = -1
            if (r4 == r2) goto L4f
            r1.write(r5, r6, r4)     // Catch: java.lang.Throwable -> L9c
            goto L44
        L4f:
            byte[] r8 = r1.toByteArray()     // Catch: java.lang.Throwable -> L9c
            int r2 = r8.length     // Catch: java.lang.Throwable -> L9c
            if (r2 <= 0) goto Lb6
            if (r0 == 0) goto L5b
            int r11 = r0.inSampleSize     // Catch: java.lang.Throwable -> L9c
            goto L5c
        L5b:
            r11 = 1
        L5c:
            if (r0 == 0) goto L78
            android.graphics.Bitmap$Config r4 = r0.inPreferredConfig     // Catch: java.lang.Throwable -> L9c
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> L9c
            if (r4 != r2) goto L78
            int r9 = r8.length     // Catch: java.lang.Throwable -> L9c
            boolean r10 = com.bytedance.fresco.heif.HeifBitmapFactoryImpl.sHeifWppEnable     // Catch: java.lang.Throwable -> L9c
            int r12 = r3.left     // Catch: java.lang.Throwable -> L9c
            int r13 = r3.top     // Catch: java.lang.Throwable -> L9c
            int r14 = r3.height()     // Catch: java.lang.Throwable -> L9c
            int r15 = r3.width()     // Catch: java.lang.Throwable -> L9c
            com.bytedance.fresco.nativeheif.HeifData r2 = com.bytedance.fresco.nativeheif.Heif.toRgb565(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L9c
            goto L8b
        L78:
            int r9 = r8.length     // Catch: java.lang.Throwable -> L9c
            boolean r10 = com.bytedance.fresco.heif.HeifBitmapFactoryImpl.sHeifWppEnable     // Catch: java.lang.Throwable -> L9c
            int r12 = r3.left     // Catch: java.lang.Throwable -> L9c
            int r13 = r3.top     // Catch: java.lang.Throwable -> L9c
            int r14 = r3.height()     // Catch: java.lang.Throwable -> L9c
            int r15 = r3.width()     // Catch: java.lang.Throwable -> L9c
            com.bytedance.fresco.nativeheif.HeifData r2 = com.bytedance.fresco.nativeheif.Heif.toRgba(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L9c
        L8b:
            if (r2 == 0) goto Lb6
            if (r0 != 0) goto L92
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L9c
            goto L94
        L92:
            android.graphics.Bitmap$Config r0 = r0.inPreferredConfig     // Catch: java.lang.Throwable -> L9c
        L94:
            android.graphics.Bitmap r0 = r2.newBitmap(r0)     // Catch: java.lang.Throwable -> L9c
            X.WFR.LIZ(r1)     // Catch: java.io.IOException -> L9b
        L9b:
            return r0
        L9c:
            r4 = move-exception
            java.lang.String r3 = "HeifBitmapFactoryImpl"
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r0 = "HeifFormatDecoder.decode exception:"
            r2.append(r0)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r0 = android.util.Log.getStackTraceString(r4)     // Catch: java.lang.Throwable -> Lba
            r2.append(r0)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r0 = X.X1D.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lba
            X.W58.LJI(r3, r0)     // Catch: java.lang.Throwable -> Lba
        Lb6:
            X.WFR.LIZ(r1)     // Catch: java.io.IOException -> Lb9
        Lb9:
            return r7
        Lba:
            r0 = move-exception
            X.WFR.LIZ(r1)     // Catch: java.io.IOException -> Lbe
        Lbe:
            throw r0
        Lbf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.fresco.heif.HeifBitmapFactoryImpl.decodeStream(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    @Override // X.InterfaceC81825W9l
    public Bitmap decodeThumb(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        HeifData thumbRgba;
        if (options != null && options.inJustDecodeBounds) {
            try {
                int[] LIZJ = C81794W8g.LIZJ(inputStream);
                if (LIZJ != null) {
                    options.outWidth = LIZJ[0];
                    options.outHeight = LIZJ[1];
                }
            } catch (IOException unused) {
            }
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray.length > 0 && (thumbRgba = Heif.toThumbRgba(byteArray, byteArray.length)) != null) {
                return thumbRgba.newBitmap(null);
            }
        } finally {
            try {
                WFR.LIZ(byteArrayOutputStream);
                return null;
            } finally {
                try {
                    WFR.LIZ(byteArrayOutputStream);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            WFR.LIZ(byteArrayOutputStream);
        } catch (IOException unused3) {
        }
        return null;
    }

    public Bitmap decodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        int i3;
        HeifData rgba;
        Bitmap.Config config;
        if (bArr.length > 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                int[] LIZJ = C81794W8g.LIZJ(byteArrayInputStream);
                if (options != null && options.inJustDecodeBounds) {
                    if (LIZJ != null) {
                        options.outWidth = LIZJ[0];
                        options.outHeight = LIZJ[1];
                    }
                    return null;
                }
                byteArrayInputStream.reset();
                if (options != null) {
                    try {
                        i3 = options.inSampleSize;
                    } catch (Throwable th) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("HeifFormatDecoder.decode exception:");
                        LIZ.append(Log.getStackTraceString(th));
                        W58.LJI("HeifBitmapFactoryImpl", X1D.LIZIZ(LIZ));
                    }
                } else {
                    i3 = 1;
                }
                if (options != null && options.inPreferredConfig == Bitmap.Config.RGB_565) {
                    rgba = Heif.toRgb565(bArr, bArr.length, sHeifWppEnable, i3, -1, -1, -1, -1);
                } else {
                    rgba = Heif.toRgba(bArr, bArr.length, sHeifWppEnable, i3, -1, -1, -1, -1);
                }
                if (rgba != null) {
                    if (options == null) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = options.inPreferredConfig;
                    }
                    return rgba.newBitmap(config);
                }
            } catch (IOException unused) {
            } finally {
                WFR.LIZIZ(byteArrayInputStream);
            }
        }
        return null;
    }
}
