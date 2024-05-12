package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.VQe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79712VQe {
    public RectF LIZ;
    public float[] LIZIZ;
    public Path LIZJ;
    public boolean LIZLLL;

    public final void LIZ(Canvas canvas, Paint paint) {
        if (this.LIZLLL) {
            RectF rectF = this.LIZ;
            float[] fArr = this.LIZIZ;
            canvas.drawRoundRect(rectF, fArr[0], fArr[1], paint);
            return;
        }
        canvas.drawPath(this.LIZJ, paint);
    }

    public static float[] LIZIZ(float[] fArr, RectF rectF, float f) {
        return new float[]{Math.max(fArr[0] - (rectF.left * f), 0.0f), Math.max(fArr[1] - (rectF.top * f), 0.0f), Math.max(fArr[2] - (rectF.right * f), 0.0f), Math.max(fArr[3] - (rectF.top * f), 0.0f), Math.max(fArr[4] - (rectF.right * f), 0.0f), Math.max(fArr[5] - (rectF.bottom * f), 0.0f), Math.max(fArr[6] - (rectF.left * f), 0.0f), Math.max(fArr[7] - (rectF.bottom * f), 0.0f)};
    }

    public final void LIZJ(Rect rect, float[] fArr, RectF rectF, float f, boolean z) {
        float[] LIZIZ;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        if (this.LIZ == null) {
            this.LIZ = new RectF();
        }
        RectF rectF2 = this.LIZ;
        rectF2.left = (rectF.left * f) + rect.left;
        rectF2.top = (rectF.top * f) + rect.top;
        rectF2.right = rect.right - (rectF.right * f);
        rectF2.bottom = rect.bottom - (rectF.bottom * f);
        int i = 2;
        boolean z2 = true;
        if (z) {
            LIZIZ = new float[8];
            float f9 = fArr[0];
            float f10 = rectF.left;
            float f11 = f9 - (f10 * f);
            float f12 = 0.0f;
            if (f10 > 0.0f) {
                f2 = f9 / f10;
            } else {
                f2 = 0.0f;
            }
            LIZIZ[0] = Math.max(f11, f2);
            float f13 = fArr[1];
            float f14 = rectF.top;
            float f15 = f13 - (f14 * f);
            if (f14 > 0.0f) {
                f3 = f13 / f14;
            } else {
                f3 = 0.0f;
            }
            LIZIZ[1] = Math.max(f15, f3);
            float f16 = fArr[2];
            float f17 = rectF.right;
            float f18 = f16 - (f17 * f);
            if (f17 > 0.0f) {
                f4 = f16 / f17;
            } else {
                f4 = 0.0f;
            }
            LIZIZ[2] = Math.max(f18, f4);
            float f19 = fArr[3];
            float f20 = rectF.top;
            float f21 = f19 - (f20 * f);
            if (f20 > 0.0f) {
                f5 = f19 / f20;
            } else {
                f5 = 0.0f;
            }
            LIZIZ[3] = Math.max(f21, f5);
            float f22 = fArr[4];
            float f23 = rectF.right;
            float f24 = f22 - (f23 * f);
            if (f23 > 0.0f) {
                f6 = f22 / f23;
            } else {
                f6 = 0.0f;
            }
            LIZIZ[4] = Math.max(f24, f6);
            float f25 = fArr[5];
            float f26 = rectF.bottom;
            float f27 = f25 - (f26 * f);
            if (f26 > 0.0f) {
                f7 = f25 / f26;
            } else {
                f7 = 0.0f;
            }
            LIZIZ[5] = Math.max(f27, f7);
            float f28 = fArr[6];
            float f29 = rectF.left;
            float f30 = f28 - (f29 * f);
            if (f29 > 0.0f) {
                f8 = f28 / f29;
            } else {
                f8 = 0.0f;
            }
            LIZIZ[6] = Math.max(f30, f8);
            float f31 = fArr[7];
            float f32 = rectF.bottom;
            float f33 = f31 - (f * f32);
            if (f32 > 0.0f) {
                f12 = f31 / f32;
            }
            LIZIZ[7] = Math.max(f33, f12);
        } else {
            LIZIZ = LIZIZ(fArr, rectF, f);
        }
        this.LIZIZ = LIZIZ;
        do {
            float f34 = LIZIZ[i] - LIZIZ[0];
            if (f34 <= 1.0E-4f && f34 >= -1.0E-4f) {
                float f35 = LIZIZ[i + 1] - LIZIZ[1];
                if (f35 <= 1.0E-4f && f35 >= -1.0E-4f) {
                    i += 2;
                }
            }
            z2 = false;
            break;
        } while (i <= 6);
        this.LIZLLL = z2;
        Path path = this.LIZJ;
        if (path == null) {
            this.LIZJ = new Path();
        } else {
            path.reset();
        }
        this.LIZJ.addRoundRect(this.LIZ, this.LIZIZ, Path.Direction.CW);
    }
}
