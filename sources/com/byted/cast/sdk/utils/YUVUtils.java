package com.byted.cast.sdk.utils;

import android.graphics.Bitmap;
import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes29.dex */
public class YUVUtils {
    public static byte[] convertToNV21(Image image) {
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        Bitmap createBitmap = Bitmap.createBitmap((int) (width + ((planes[0].getRowStride() - (r3 * width)) / planes[0].getPixelStride())), height, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(buffer);
        byte[] nv21 = getNV21(width, height, createBitmap);
        createBitmap.recycle();
        image.close();
        return nv21;
    }

    public static byte[] getNV21(int i, int i2, Bitmap bitmap) {
        int i3 = i * i2;
        int[] iArr = new int[i3];
        bitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        byte[] bArr = new byte[i3 + (((int) Math.ceil(i2 / 2.0d)) * 2 * ((int) Math.ceil(i / 2.0d)))];
        encodeYUV420SP(bArr, iArr, i, i2);
        bitmap.recycle();
        return bArr;
    }

    public static void encodeYUV420SP(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = 0;
            while (i7 < i) {
                int i8 = iArr[i5];
                int i9 = (16711680 & i8) >> 16;
                int i10 = (65280 & i8) >> 8;
                int i11 = 255;
                int i12 = i8 & 255;
                int i13 = (((((i9 * 66) + (i10 * 129)) + (i12 * 25)) + 128) >> 8) + 16;
                int i14 = (((((i9 * (-38)) - (i10 * 74)) + (i12 * 112)) + 128) >> 8) + 128;
                int i15 = (((((i9 * 112) - (i10 * 94)) - (i12 * 18)) + 128) >> 8) + 128;
                int i16 = i4 + 1;
                if (i13 < 0) {
                    i13 = 0;
                } else if (i13 > 255) {
                    i13 = 255;
                }
                bArr[i4] = (byte) i13;
                if (i6 % 2 == 0 && i5 % 2 == 0) {
                    int i17 = i3 + 1;
                    if (i15 < 0) {
                        i15 = 0;
                    } else if (i15 > 255) {
                        i15 = 255;
                    }
                    bArr[i3] = (byte) i15;
                    i3 = i17 + 1;
                    if (i14 < 0) {
                        i11 = 0;
                    } else if (i14 <= 255) {
                        i11 = i14;
                    }
                    bArr[i17] = (byte) i11;
                }
                i5++;
                i7++;
                i4 = i16;
            }
        }
    }
}
