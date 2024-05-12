package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.05Q, reason: invalid class name */
/* loaded from: classes.dex */
public class C05Q {
    public float[] LIZ;
    public final int[] LIZIZ;
    public final float[] LIZJ;
    public Path LIZLLL;
    public final Paint LJ;
    public final Paint LJFF;
    public final Paint LJI;
    public final Paint LJII;
    public final Paint LJIIIIZZ;
    public final float[] LJIIIZ;
    public int LJIIJ;
    public final Rect LJIIJJI = new Rect();
    public final int LJIIL = 1;
    public final /* synthetic */ C45601qe LJIILIIL;

    public C05Q(C45601qe c45601qe) {
        this.LJIILIIL = c45601qe;
        Paint paint = new Paint();
        this.LJ = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.LJFF = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.LJI = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.LJII = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(c45601qe.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.LJIIIZ = new float[8];
        Paint paint5 = new Paint();
        this.LJIIIIZZ = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.LIZJ = new float[100];
        this.LIZIZ = new int[50];
    }

    public final void LIZIZ(Canvas canvas) {
        float[] fArr = this.LIZ;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.LJI);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.LJI);
    }

    public final void LJFF(Paint paint, String str) {
        paint.getTextBounds(str, 0, str.length(), this.LJIIJJI);
    }

    public final void LIZJ(float f, float f2, Canvas canvas) {
        float[] fArr = this.LIZ;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float min = Math.min(f3, f5);
        float max = Math.max(f4, f6);
        float min2 = f - Math.min(f3, f5);
        float max2 = Math.max(f4, f6) - f2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJFF(this.LJII, LIZIZ);
        canvas.drawText(LIZIZ, ((min2 / 2.0f) - (this.LJIIJJI.width() / 2)) + min, f2 - 20.0f, this.LJII);
        canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.LJI);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LJFF(this.LJII, LIZIZ2);
        canvas.drawText(LIZIZ2, f + 5.0f, max - ((max2 / 2.0f) - (this.LJIIJJI.height() / 2)), this.LJII);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), this.LJI);
    }

    public final void LIZLLL(float f, float f2, Canvas canvas) {
        float[] fArr = this.LIZ;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (hypot * hypot);
        float f10 = f3 + (f7 * f9);
        float f11 = f4 + (f9 * f8);
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJFF(this.LJII, LIZIZ);
        canvas.drawTextOnPath(LIZIZ, path, (hypot2 / 2.0f) - (this.LJIIJJI.width() / 2), -20.0f, this.LJII);
        canvas.drawLine(f, f2, f10, f11, this.LJI);
    }

    public final void LIZ(Canvas canvas, int i, int i2, C267313d c267313d) {
        int i3;
        int i4;
        if (i == 4) {
            boolean z = false;
            boolean z2 = false;
            for (int i5 = 0; i5 < this.LJIIJ; i5++) {
                int i6 = this.LIZIZ[i5];
                if (i6 == 1) {
                    z = true;
                } else if (i6 == 2) {
                    z2 = true;
                }
            }
            if (z) {
                float[] fArr = this.LIZ;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.LJI);
            }
            if (z2) {
                LIZIZ(canvas);
            }
        } else if (i == 2) {
            float[] fArr2 = this.LIZ;
            canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.LJI);
        }
        if (i == 3) {
            LIZIZ(canvas);
        }
        canvas.drawLines(this.LIZ, this.LJ);
        View view = c267313d.LIZ;
        if (view != null) {
            i3 = view.getWidth();
            i4 = c267313d.LIZ.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        for (int i7 = 1; i7 < i2 - 1; i7++) {
            if (i != 4 || this.LIZIZ[i7 - 1] != 0) {
                float[] fArr3 = this.LIZJ;
                int i8 = i7 * 2;
                float f = fArr3[i8];
                float f2 = fArr3[i8 + 1];
                this.LIZLLL.reset();
                this.LIZLLL.moveTo(f, f2 + 10.0f);
                this.LIZLLL.lineTo(f + 10.0f, f2);
                this.LIZLLL.lineTo(f, f2 - 10.0f);
                this.LIZLLL.lineTo(f - 10.0f, f2);
                this.LIZLLL.close();
                int i9 = i7 - 1;
                ListProtector.get(c267313d.LJIJ, i9);
                if (i == 4) {
                    int i10 = this.LIZIZ[i9];
                    if (i10 == 1) {
                        LIZLLL(f - 0.0f, f2 - 0.0f, canvas);
                    } else if (i10 == 2) {
                        LIZJ(f - 0.0f, f2 - 0.0f, canvas);
                    } else if (i10 == 3) {
                        LJ(f - 0.0f, f2 - 0.0f, i3, i4, canvas);
                    }
                    canvas.drawPath(this.LIZLLL, this.LJIIIIZZ);
                } else if (i == 2) {
                    LIZLLL(f - 0.0f, f2 - 0.0f, canvas);
                } else if (i == 3) {
                    LIZJ(f - 0.0f, f2 - 0.0f, canvas);
                } else if (i == 6) {
                    LJ(f - 0.0f, f2 - 0.0f, i3, i4, canvas);
                }
                canvas.drawPath(this.LIZLLL, this.LJIIIIZZ);
            }
        }
        float[] fArr4 = this.LIZ;
        if (fArr4.length > 1) {
            canvas.drawCircle(fArr4[0], fArr4[1], 8.0f, this.LJFF);
            float[] fArr5 = this.LIZ;
            canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, this.LJFF);
        }
    }

    public final void LJ(float f, float f2, int i, int i2, Canvas canvas) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(((int) ((((f - (i / 2)) * 100.0f) / (this.LJIILIIL.getWidth() - i)) + 0.5d)) / 100.0f);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJFF(this.LJII, LIZIZ);
        canvas.drawText(LIZIZ, ((f / 2.0f) - (this.LJIIJJI.width() / 2)) + 0.0f, f2 - 20.0f, this.LJII);
        canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.LJI);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(((int) ((((f2 - (i2 / 2)) * 100.0f) / (this.LJIILIIL.getHeight() - i2)) + 0.5d)) / 100.0f);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LJFF(this.LJII, LIZIZ2);
        canvas.drawText(LIZIZ2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.LJIIJJI.height() / 2)), this.LJII);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.LJI);
    }
}
