package X;

import android.util.Pair;
import android.view.View;

/* loaded from: classes16.dex */
public final class YD4 {
    public final View LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public float LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public float LJII = Float.MAX_VALUE;
    public boolean LJIIJJI = true;

    public final float LIZ() {
        int i;
        float f;
        float f2;
        int i2 = this.LJFF;
        if (i2 == 0 || (i = this.LIZIZ) == 0) {
            return 0.0f;
        }
        float f3 = this.LJI / i2;
        float f4 = this.LIZJ / i;
        Pair<Integer, Integer> LIZIZ = LIZIZ();
        int intValue = ((Integer) LIZIZ.first).intValue();
        int intValue2 = ((Integer) LIZIZ.second).intValue();
        if (f4 > f3) {
            f = this.LJFF * 1.0f;
            f2 = intValue;
        } else {
            f = this.LJI * 1.0f;
            f2 = intValue2;
        }
        return f / f2;
    }

    public final Pair<Integer, Integer> LIZIZ() {
        int i;
        int i2 = this.LIZIZ;
        if (i2 <= 0 || (i = this.LIZJ) <= 0) {
            return new Pair<>(0, 0);
        }
        int i3 = this.LJI;
        int i4 = this.LJFF;
        int i5 = (int) (i * ((i4 * 1.0f) / i2));
        if (i5 > i3) {
            i4 = (int) (i2 * ((i3 * 1.0f) / i));
        } else {
            i3 = i5;
        }
        return new Pair<>(Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public final float LIZJ() {
        if (this.LJIIIZ != 2) {
            return 1.0f;
        }
        return LIZ();
    }

    public final float LIZLLL() {
        return this.LIZ.getTranslationX() + ((this.LIZ.getWidth() - (this.LIZ.getScaleX() * this.LIZ.getWidth())) / 2.0f) + this.LIZ.getLeft();
    }

    public final float LJ() {
        return this.LIZ.getTranslationY() + ((this.LIZ.getHeight() - (this.LIZ.getScaleY() * this.LIZ.getHeight())) / 2.0f) + this.LIZ.getTop();
    }

    public final void LJI(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Set TextureLayout. oldTextureLayout=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", newTextureLayout=");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        if (this.LJIIIZ != i) {
            this.LJIIIZ = i;
            this.LIZ.requestLayout();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Set TextureLayout over. parentSize:");
        LIZ2.append(this.LJFF);
        LIZ2.append("*");
        LIZ2.append(this.LJI);
        LIZ2.append(", videoSize:");
        LIZ2.append(this.LIZIZ);
        LIZ2.append("*");
        LIZ2.append(this.LIZJ);
        LIZ2.append(", newScaleFactor:");
        LIZ2.append(LIZJ());
        LIZ2.append(", newScaledSize:");
        LIZ2.append(LIZJ() * this.LIZLLL);
        LIZ2.append("*");
        LIZ2.append(LIZJ() * this.LJ);
        X1D.LIZIZ(LIZ2);
    }

    public YD4(View view, YDC ydc) {
        this.LIZ = view;
        C16880lQ.LJLLJ(view.getClass());
    }

    public final void LJII(int i, int i2) {
        if (this.LIZIZ != i || this.LIZJ != i2) {
            this.LIZIZ = i;
            this.LIZJ = i2;
            this.LIZLLL = 0;
            this.LJ = 0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setVideoSize videoWidth:");
            LIZ.append(i);
            LIZ.append(" videoHeight:");
            LIZ.append(i2);
            X1D.LIZIZ(LIZ);
            this.LIZ.requestLayout();
        }
    }

    public final Pair<Integer, Integer> LJFF(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Pair<Integer, Integer> pair;
        float max;
        float max2;
        float max3;
        float max4;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("widthMeasureSpec:");
        LIZ.append(View.MeasureSpec.toString(i));
        X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("heightMeasureSpec:");
        LIZ2.append(View.MeasureSpec.toString(i2));
        X1D.LIZIZ(LIZ2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            i3 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size);
        }
        if (mode2 == 1073741824) {
            i4 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            i4 = Math.min(i4, size2);
        }
        this.LJFF = i3;
        this.LJI = i4;
        this.LIZ.setTranslationX(0.0f);
        this.LIZ.setTranslationY(0.0f);
        float scaleX = this.LIZ.getScaleX();
        int i10 = this.LJIIIZ;
        if (i10 == 1 || (i8 = this.LIZIZ) <= 0 || (i9 = this.LIZJ) <= 0) {
            i5 = i3;
            i6 = i4;
        } else {
            i5 = 0;
            if (i10 == -1 || i10 == 0 || i10 == 2) {
                if (this.LJIIJJI) {
                    pair = LIZIZ();
                    float LIZJ = LIZJ();
                    if (Math.abs(scaleX - LIZJ) >= 1.0E-5f) {
                        if (Float.isNaN(LIZJ)) {
                            max3 = this.LJIIIIZZ;
                        } else {
                            max3 = Math.max(Math.min(LIZJ, this.LJII), this.LJIIIIZZ);
                        }
                        if (Float.isNaN(LIZJ)) {
                            max4 = this.LJIIIIZZ;
                        } else {
                            max4 = Math.max(Math.min(LIZJ, this.LJII), this.LJIIIIZZ);
                        }
                        this.LIZ.setScaleX(max3);
                        this.LIZ.setScaleY(max4);
                        scaleX = LIZJ;
                    }
                    if (this.LJIIIZ == 2) {
                        float[] fArr = {0.0f, 0.0f};
                        if (this.LJIIJ) {
                            fArr[1] = ((-(this.LIZ.getScaleX() - 1.0f)) / 2.0f) * this.LJI;
                        }
                        float f = this.LJI;
                        float f2 = (((-(scaleX - 1.0f)) / 2.0f) * f) + fArr[1];
                        float f3 = (f * scaleX) + f2;
                        if (f2 < 2.0f && f3 > r9 - 2) {
                            this.LIZ.setTranslationX(fArr[0]);
                            this.LIZ.setTranslationY(fArr[1]);
                        }
                    }
                } else {
                    if (i10 == 0) {
                        pair = LIZIZ();
                    } else {
                        int i11 = this.LJI;
                        float f4 = i11;
                        int i12 = this.LJFF;
                        float f5 = i12;
                        float f6 = i9;
                        float f7 = i8;
                        if (f6 / f7 > f4 / f5) {
                            i11 = (int) (((f5 * 1.0f) / f7) * f6);
                        } else {
                            i12 = (int) (((f4 * 1.0f) / f6) * f7);
                        }
                        pair = new Pair<>(Integer.valueOf(i12), Integer.valueOf(i11));
                    }
                    if (Float.isNaN(1.0f)) {
                        max = this.LJIIIIZZ;
                    } else {
                        max = Math.max(Math.min(1.0f, this.LJII), this.LJIIIIZZ);
                    }
                    if (Float.isNaN(1.0f)) {
                        max2 = this.LJIIIIZZ;
                    } else {
                        max2 = Math.max(Math.min(1.0f, this.LJII), this.LJIIIIZZ);
                    }
                    this.LIZ.setScaleX(max);
                    this.LIZ.setScaleY(max2);
                }
                i5 = ((Integer) pair.first).intValue();
                i6 = ((Integer) pair.second).intValue();
            } else {
                i6 = 0;
            }
        }
        int i13 = this.LIZLLL;
        if (i13 != i5 || (i7 = this.LJ) != i6) {
            this.LIZLLL = i5;
            this.LJ = i6;
            StringBuilder LIZJ2 = C06460Ne.LIZJ("sv_size_Measure:", i5, "*", i6, " Parent:");
            C15890jp.LIZIZ(LIZJ2, i3, "*", i4, " textureLayout:");
            LIZJ2.append(this.LJIIIZ);
            LIZJ2.append(" Video:");
            LIZJ2.append(this.LIZIZ);
            LIZJ2.append("*");
            LIZJ2.append(this.LIZJ);
            LIZJ2.append(" scaleFactor:");
            LIZJ2.append(scaleX);
            LIZJ2.append(" scaled_size:");
            LIZJ2.append(i5 * scaleX);
            LIZJ2.append("*");
            LIZJ2.append(i6 * scaleX);
            X1D.LIZIZ(LIZJ2);
        } else if (this.LIZ instanceof YD5) {
            int i14 = i13 + 1;
            int i15 = i7 + 1;
            this.LIZLLL = i14;
            this.LJ = i15;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("set dummy dimension:");
            LIZ3.append(i14);
            LIZ3.append("*");
            LIZ3.append(i15);
            X1D.LIZIZ(LIZ3);
            return new Pair<>(Integer.valueOf(i14), Integer.valueOf(i15));
        }
        return new Pair<>(Integer.valueOf(i5), Integer.valueOf(i6));
    }
}
