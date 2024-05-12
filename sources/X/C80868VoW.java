package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.VoW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80868VoW extends AbstractC80875Vod<C80601VkD> {
    public int LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;

    @Override // X.AbstractC80875Vod
    public final int LIZLLL() {
        C80601VkD c80601VkD = (C80601VkD) this.LIZ;
        return (c80601VkD.LJII * 2) + c80601VkD.LJI;
    }

    @Override // X.AbstractC80875Vod
    public final int LJ() {
        C80601VkD c80601VkD = (C80601VkD) this.LIZ;
        return (c80601VkD.LJII * 2) + c80601VkD.LJI;
    }

    public C80868VoW(C80601VkD c80601VkD) {
        super(c80601VkD);
        this.LIZJ = 1;
    }

    @Override // X.AbstractC80875Vod
    public final void LIZ(float f, Canvas canvas) {
        int i;
        S s = this.LIZ;
        float f2 = (((C80601VkD) s).LJI / 2.0f) + ((C80601VkD) s).LJII;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        if (((C80601VkD) this.LIZ).LJIIIIZZ == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.LIZJ = i;
        this.LIZLLL = r3.LIZ * f;
        this.LJ = r3.LIZIZ * f;
        this.LJFF = (((C80601VkD) r3).LJI - r3.LIZ) / 2.0f;
        if ((this.LIZIZ.LIZLLL() && this.LIZ.LJ == 2) || (this.LIZIZ.LIZJ() && this.LIZ.LJFF == 1)) {
            this.LJFF = C6D8.LIZ(1.0f - f, this.LIZ.LIZ, 2.0f, this.LJFF);
        } else {
            if ((!this.LIZIZ.LIZLLL() || this.LIZ.LJ != 1) && (!this.LIZIZ.LIZJ() || this.LIZ.LJFF != 2)) {
                return;
            }
            this.LJFF = C65232Piu.LIZIZ(1.0f - f, this.LIZ.LIZ, 2.0f, this.LJFF);
        }
    }

    @Override // X.AbstractC80875Vod
    public final void LIZJ(Canvas canvas, Paint paint) {
        int LJIILJJIL = C78966Uyw.LJIILJJIL(this.LIZ.LIZLLL, this.LIZIZ.LJLL);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(LJIILJJIL);
        paint.setStrokeWidth(this.LIZLLL);
        float f = this.LJFF;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // X.AbstractC80875Vod
    public final void LIZIZ(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3 = f2;
        if (f == f3) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.LIZLLL);
        float f4 = this.LIZJ;
        float f5 = f * 360.0f * f4;
        if (f3 < f) {
            f3 += 1.0f;
        }
        float f6 = (f3 - f) * 360.0f * f4;
        float f7 = this.LJFF;
        float f8 = -f7;
        canvas.drawArc(new RectF(f8, f8, f7, f7), f5, f6, false, paint);
        if (this.LJ > 0.0f && Math.abs(f6) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            float f9 = this.LJ;
            float f10 = -f9;
            RectF rectF = new RectF(f10, f10, f9, f9);
            LJFF(canvas, paint, this.LIZLLL, this.LJ, f5, true, rectF);
            LJFF(canvas, paint, this.LIZLLL, this.LJ, f5 + f6, false, rectF);
        }
    }

    public final void LJFF(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        float f4;
        if (z) {
            f4 = -1.0f;
        } else {
            f4 = 1.0f;
        }
        canvas.save();
        canvas.rotate(f3);
        float f5 = f / 2.0f;
        float f6 = f4 * f2;
        canvas.drawRect((this.LJFF - f5) + f2, Math.min(0.0f, this.LIZJ * f6), (this.LJFF + f5) - f2, Math.max(0.0f, f6 * this.LIZJ), paint);
        canvas.translate((this.LJFF - f5) + f2, 0.0f);
        canvas.drawArc(rectF, 180.0f, (-f4) * 90.0f * this.LIZJ, true, paint);
        canvas.translate(f - (f2 * 2.0f), 0.0f);
        canvas.drawArc(rectF, 0.0f, f4 * 90.0f * this.LIZJ, true, paint);
        canvas.restore();
    }
}
