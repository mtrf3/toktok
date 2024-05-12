package X;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* renamed from: X.UvJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78741UvJ implements VA3 {
    public final int LIZ;
    public final float LIZIZ;
    public final AnonymousClass870 LIZJ;

    @Override // X.VA3
    public final String getName() {
        return "blurProcessor";
    }

    @Override // X.VA3
    public final W6U getPostprocessorCacheKey() {
        return new C245519kJ("blur_bitmap_processor");
    }

    @Override // X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7) {
        float f;
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f = 0.6f;
        } else if (width < 200 || height < 200) {
            f = 0.3f;
        } else {
            f = 0.1f;
        }
        int round = Math.round(width * f);
        int round2 = Math.round(height * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        if (this.LIZIZ != 0.0f) {
            float f2 = round;
            float f3 = round2;
            if (Math.abs((f2 / f3) - this.LIZ) > 0.2f) {
                float f4 = this.LIZIZ;
                int i2 = (int) (f2 / f4);
                if (i2 > round2) {
                    i = (int) (f3 * f4);
                    i2 = round2;
                } else {
                    i = round;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (round - i) >> 1, (round2 - i2) >> 1, i, i2);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                round = i;
                round2 = i2;
            }
        }
        C81392Vwy<Bitmap> LIZIZ = abstractC78853Ux7.LIZIZ(round, round2);
        Bitmap LJI = LIZIZ.LJI();
        int i3 = this.LIZ;
        if (i3 >= 1) {
            int width2 = LJI.getWidth();
            int height2 = LJI.getHeight();
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
            int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i7, 3);
            int i12 = i3 + 1;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < height2; i15++) {
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                for (int i25 = -i3; i25 <= i3; i25++) {
                    int i26 = iArr[Math.min(i5, Math.max(i25, 0)) + i13];
                    int[] iArr8 = iArr7[i25 + i3];
                    iArr8[0] = (i26 & 16711680) >> 16;
                    iArr8[1] = (i26 & 65280) >> 8;
                    iArr8[2] = i26 & 255;
                    int abs = i12 - Math.abs(i25);
                    int i27 = iArr8[0];
                    i16 = (i27 * abs) + i16;
                    int i28 = iArr8[1];
                    i17 = (i28 * abs) + i17;
                    int i29 = iArr8[2];
                    i18 = (abs * i29) + i18;
                    if (i25 > 0) {
                        i22 += i27;
                        i23 += i28;
                        i24 += i29;
                    } else {
                        i19 += i27;
                        i20 += i28;
                        i21 += i29;
                    }
                }
                int i30 = i3;
                for (int i31 = 0; i31 < width2; i31++) {
                    iArr2[i13] = iArr6[i16];
                    iArr3[i13] = iArr6[i17];
                    iArr4[i13] = iArr6[i18];
                    int i32 = i16 - i19;
                    int i33 = i17 - i20;
                    int i34 = i18 - i21;
                    int[] iArr9 = iArr7[((i30 - i3) + i7) % i7];
                    int i35 = i19 - iArr9[0];
                    int i36 = i20 - iArr9[1];
                    int i37 = i21 - iArr9[2];
                    if (i15 == 0) {
                        iArr5[i31] = Math.min(i31 + i3 + 1, i5);
                    }
                    int i38 = iArr[i14 + iArr5[i31]];
                    int i39 = (i38 & 16711680) >> 16;
                    iArr9[0] = i39;
                    int i40 = (i38 & 65280) >> 8;
                    iArr9[1] = i40;
                    int i41 = i38 & 255;
                    iArr9[2] = i41;
                    int i42 = i22 + i39;
                    int i43 = i23 + i40;
                    int i44 = i24 + i41;
                    i16 = i32 + i42;
                    i17 = i33 + i43;
                    i18 = i34 + i44;
                    i30 = (i30 + 1) % i7;
                    int[] iArr10 = iArr7[i30 % i7];
                    int i45 = iArr10[0];
                    i19 = i35 + i45;
                    int i46 = iArr10[1];
                    i20 = i36 + i46;
                    int i47 = iArr10[2];
                    i21 = i37 + i47;
                    i22 = i42 - i45;
                    i23 = i43 - i46;
                    i24 = i44 - i47;
                    i13++;
                }
                i14 += width2;
            }
            for (int i48 = 0; i48 < width2; i48++) {
                int i49 = -i3;
                int i50 = i49 * width2;
                int i51 = 0;
                int i52 = 0;
                int i53 = 0;
                int i54 = 0;
                int i55 = 0;
                int i56 = 0;
                int i57 = 0;
                int i58 = 0;
                int i59 = 0;
                while (i49 <= i3) {
                    int max = Math.max(0, i50) + i48;
                    int[] iArr11 = iArr7[i49 + i3];
                    iArr11[0] = iArr2[max];
                    iArr11[1] = iArr3[max];
                    iArr11[2] = iArr4[max];
                    int abs2 = i12 - Math.abs(i49);
                    i51 = (iArr2[max] * abs2) + i51;
                    i52 = (iArr3[max] * abs2) + i52;
                    i53 = (iArr4[max] * abs2) + i53;
                    if (i49 > 0) {
                        i57 += iArr11[0];
                        i58 += iArr11[1];
                        i59 += iArr11[2];
                    } else {
                        i54 += iArr11[0];
                        i55 += iArr11[1];
                        i56 += iArr11[2];
                    }
                    if (i49 < i6) {
                        i50 += width2;
                    }
                    i49++;
                }
                int i60 = i48;
                int i61 = i3;
                for (int i62 = 0; i62 < height2; i62++) {
                    iArr[i60] = (iArr[i60] & (-16777216)) | (iArr6[i51] << 16) | (iArr6[i52] << 8) | iArr6[i53];
                    int i63 = i51 - i54;
                    int i64 = i52 - i55;
                    int i65 = i53 - i56;
                    int[] iArr12 = iArr7[((i61 - i3) + i7) % i7];
                    int i66 = i54 - iArr12[0];
                    int i67 = i55 - iArr12[1];
                    int i68 = i56 - iArr12[2];
                    if (i48 == 0) {
                        iArr5[i62] = Math.min(i62 + i12, i6) * width2;
                    }
                    int i69 = iArr5[i62] + i48;
                    int i70 = iArr2[i69];
                    iArr12[0] = i70;
                    int i71 = iArr3[i69];
                    iArr12[1] = i71;
                    int i72 = iArr4[i69];
                    iArr12[2] = i72;
                    int i73 = i57 + i70;
                    int i74 = i58 + i71;
                    int i75 = i59 + i72;
                    i51 = i63 + i73;
                    i52 = i64 + i74;
                    i53 = i65 + i75;
                    i61 = (i61 + 1) % i7;
                    int[] iArr13 = iArr7[i61];
                    int i76 = iArr13[0];
                    i54 = i66 + i76;
                    int i77 = iArr13[1];
                    i55 = i67 + i77;
                    int i78 = iArr13[2];
                    i56 = i68 + i78;
                    i57 = i73 - i76;
                    i58 = i74 - i77;
                    i59 = i75 - i78;
                    i60 += width2;
                }
            }
            LJI.setPixels(iArr, 0, width2, 0, 0, width2, height2);
        }
        createScaledBitmap.recycle();
        AnonymousClass870 anonymousClass870 = this.LIZJ;
        if (anonymousClass870 != null) {
            anonymousClass870.processorFinish(LJI);
        }
        return LIZIZ;
    }

    public C78741UvJ(int i, float f, AnonymousClass870 anonymousClass870) {
        this.LIZIZ = f;
        this.LIZ = i;
        this.LIZJ = anonymousClass870;
    }
}
