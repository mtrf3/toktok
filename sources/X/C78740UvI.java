package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.UvI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78740UvI implements VA3 {
    public final int LIZ;
    public final float LIZIZ;

    @Override // X.VA3
    public final String getName() {
        return "blurProcessor";
    }

    @Override // X.VA3
    public final W6U getPostprocessorCacheKey() {
        return new C245519kJ("blur_bitmap_processor");
    }

    public C78740UvI(int i, float f) {
        this.LIZ = i;
        this.LIZIZ = f;
    }

    @Override // X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 platformBitmapFactory) {
        float f;
        int i;
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(platformBitmapFactory, "platformBitmapFactory");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f = 0.6f;
        } else if (width < 200 || height < 200) {
            f = 0.3f;
        } else {
            f = 0.1f;
        }
        int LJJIIZ = O6R.LJJIIZ(width * f);
        int LJJIIZ2 = O6R.LJJIIZ(height * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, LJJIIZ, LJJIIZ2, false);
        if (this.LIZIZ != 0.0f) {
            float f2 = LJJIIZ;
            float f3 = LJJIIZ2;
            if (Math.abs((f2 / f3) - this.LIZ) > 0.2f) {
                float f4 = this.LIZIZ;
                int i2 = (int) (f2 / f4);
                if (i2 > LJJIIZ2) {
                    i = (int) (f3 * f4);
                    i2 = LJJIIZ2;
                } else {
                    i = LJJIIZ;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (LJJIIZ - i) >> 1, (LJJIIZ2 - i2) >> 1, i, i2);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                LJJIIZ = i;
                LJJIIZ2 = i2;
            }
        }
        C81392Vwy<Bitmap> LIZIZ = platformBitmapFactory.LIZIZ(LJJIIZ, LJJIIZ2);
        Bitmap blur = LIZIZ.LJI();
        Bitmap origin = createScaledBitmap;
        o.LJIIIIZZ(origin, "origin");
        o.LJIIIIZZ(blur, "blur");
        int i3 = this.LIZ;
        if (i3 >= 1) {
            int width2 = blur.getWidth();
            int height2 = blur.getHeight();
            int i4 = width2 * height2;
            int[] iArr = new int[i4];
            createScaledBitmap.getPixels(iArr, 0, width2, 0, 0, width2, height2);
            int i5 = width2 - 1;
            int i6 = height2 - 1;
            int i7 = i3 + i3 + 1;
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            int[] iArr4 = new int[i4];
            int[] iArr5 = new int[Math.max(width2, height2)];
            int i8 = (i7 + 1) >> 1;
            int i9 = i8 * i8;
            int i10 = i9 * 256;
            int[] iArr6 = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr6[i11] = i11 / i9;
            }
            int[][] iArr7 = new int[i7];
            for (int i12 = 0; i12 < i7; i12++) {
                iArr7[i12] = new int[3];
            }
            int i13 = i3 + 1;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < height2; i16++) {
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                for (int i26 = -i3; i26 <= i3; i26++) {
                    int i27 = iArr[Math.min(i5, Math.max(i26, 0)) + i14];
                    int[] iArr8 = iArr7[i26 + i3];
                    iArr8[0] = (i27 & 16711680) >> 16;
                    iArr8[1] = (i27 & 65280) >> 8;
                    iArr8[2] = i27 & 255;
                    int abs = i13 - Math.abs(i26);
                    int i28 = iArr8[0];
                    i17 = (i28 * abs) + i17;
                    int i29 = iArr8[1];
                    i18 = (i29 * abs) + i18;
                    int i30 = iArr8[2];
                    i19 = (abs * i30) + i19;
                    if (i26 > 0) {
                        i23 += i28;
                        i24 += i29;
                        i25 += i30;
                    } else {
                        i20 += i28;
                        i21 += i29;
                        i22 += i30;
                    }
                }
                int i31 = i3;
                for (int i32 = 0; i32 < width2; i32++) {
                    iArr2[i14] = iArr6[i17];
                    iArr3[i14] = iArr6[i18];
                    iArr4[i14] = iArr6[i19];
                    int i33 = i17 - i20;
                    int i34 = i18 - i21;
                    int i35 = i19 - i22;
                    int[] iArr9 = iArr7[((i31 - i3) + i7) % i7];
                    int i36 = i20 - iArr9[0];
                    int i37 = i21 - iArr9[1];
                    int i38 = i22 - iArr9[2];
                    if (i16 == 0) {
                        iArr5[i32] = Math.min(i32 + i3 + 1, i5);
                    }
                    int i39 = iArr[i15 + iArr5[i32]];
                    int i40 = (i39 & 16711680) >> 16;
                    iArr9[0] = i40;
                    int i41 = (i39 & 65280) >> 8;
                    iArr9[1] = i41;
                    int i42 = i39 & 255;
                    iArr9[2] = i42;
                    int i43 = i23 + i40;
                    int i44 = i24 + i41;
                    int i45 = i25 + i42;
                    i17 = i33 + i43;
                    i18 = i34 + i44;
                    i19 = i35 + i45;
                    i31 = (i31 + 1) % i7;
                    int[] iArr10 = iArr7[i31 % i7];
                    int i46 = iArr10[0];
                    i20 = i36 + i46;
                    int i47 = iArr10[1];
                    i21 = i37 + i47;
                    int i48 = iArr10[2];
                    i22 = i38 + i48;
                    i23 = i43 - i46;
                    i24 = i44 - i47;
                    i25 = i45 - i48;
                    i14++;
                }
                i15 += width2;
            }
            for (int i49 = 0; i49 < width2; i49++) {
                int i50 = -i3;
                int i51 = i50 * width2;
                int i52 = 0;
                int i53 = 0;
                int i54 = 0;
                int i55 = 0;
                int i56 = 0;
                int i57 = 0;
                int i58 = 0;
                int i59 = 0;
                int i60 = 0;
                while (i50 <= i3) {
                    int max = Math.max(0, i51) + i49;
                    int[] iArr11 = iArr7[i50 + i3];
                    iArr11[0] = iArr2[max];
                    iArr11[1] = iArr3[max];
                    iArr11[2] = iArr4[max];
                    int abs2 = i13 - Math.abs(i50);
                    i52 = (iArr2[max] * abs2) + i52;
                    i53 = (iArr3[max] * abs2) + i53;
                    i54 = (iArr4[max] * abs2) + i54;
                    if (i50 > 0) {
                        i58 += iArr11[0];
                        i59 += iArr11[1];
                        i60 += iArr11[2];
                    } else {
                        i55 += iArr11[0];
                        i56 += iArr11[1];
                        i57 += iArr11[2];
                    }
                    if (i50 < i6) {
                        i51 += width2;
                    }
                    i50++;
                }
                int i61 = i49;
                int i62 = i3;
                for (int i63 = 0; i63 < height2; i63++) {
                    iArr[i61] = (iArr[i61] & (-16777216)) | (iArr6[i52] << 16) | (iArr6[i53] << 8) | iArr6[i54];
                    int i64 = i52 - i55;
                    int i65 = i53 - i56;
                    int i66 = i54 - i57;
                    int[] iArr12 = iArr7[((i62 - i3) + i7) % i7];
                    int i67 = i55 - iArr12[0];
                    int i68 = i56 - iArr12[1];
                    int i69 = i57 - iArr12[2];
                    if (i49 == 0) {
                        iArr5[i63] = Math.min(i63 + i13, i6) * width2;
                    }
                    int i70 = iArr5[i63] + i49;
                    int i71 = iArr2[i70];
                    iArr12[0] = i71;
                    int i72 = iArr3[i70];
                    iArr12[1] = i72;
                    int i73 = iArr4[i70];
                    iArr12[2] = i73;
                    int i74 = i58 + i71;
                    int i75 = i59 + i72;
                    int i76 = i60 + i73;
                    i52 = i64 + i74;
                    i53 = i65 + i75;
                    i54 = i66 + i76;
                    i62 = (i62 + 1) % i7;
                    int[] iArr13 = iArr7[i62];
                    int i77 = iArr13[0];
                    i55 = i67 + i77;
                    int i78 = iArr13[1];
                    i56 = i68 + i78;
                    int i79 = iArr13[2];
                    i57 = i69 + i79;
                    i58 = i74 - i77;
                    i59 = i75 - i78;
                    i60 = i76 - i79;
                    i61 += width2;
                }
            }
            blur.setPixels(iArr, 0, width2, 0, 0, width2, height2);
        }
        createScaledBitmap.recycle();
        return LIZIZ;
    }
}
