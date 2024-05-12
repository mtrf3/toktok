package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.VoV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80867VoV extends AbstractC80875Vod<C80602VkE> {
    public float LIZJ;
    public float LIZLLL;
    public float LJ;

    @Override // X.AbstractC80875Vod
    public final int LJ() {
        return -1;
    }

    @Override // X.AbstractC80875Vod
    public final int LIZLLL() {
        return this.LIZ.LIZ;
    }

    public C80867VoV(C80602VkE c80602VkE) {
        super(c80602VkE);
        this.LIZJ = 300.0f;
    }

    @Override // X.AbstractC80875Vod
    public final void LIZ(float f, Canvas canvas) {
        Rect clipBounds = canvas.getClipBounds();
        this.LIZJ = clipBounds.width();
        float f2 = this.LIZ.LIZ;
        canvas.translate(clipBounds.width() / 2.0f, Math.max(0.0f, (clipBounds.height() - this.LIZ.LIZ) / 2.0f) + (clipBounds.height() / 2.0f));
        if (((C80602VkE) this.LIZ).LJIIIIZZ) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.LIZIZ.LIZLLL() && this.LIZ.LJ == 1) || (this.LIZIZ.LIZJ() && this.LIZ.LJFF == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.LIZIZ.LIZLLL() || this.LIZIZ.LIZJ()) {
            canvas.translate(0.0f, ((f - 1.0f) * this.LIZ.LIZ) / 2.0f);
        }
        float f3 = this.LIZJ;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.LIZ;
        this.LIZLLL = s.LIZ * f;
        this.LJ = s.LIZIZ * f;
    }

    @Override // X.AbstractC80875Vod
    public final void LIZJ(Canvas canvas, Paint paint) {
        int LJIILJJIL = C78966Uyw.LJIILJJIL(this.LIZ.LIZLLL, this.LIZIZ.LJLL);
        float f = ((-this.LIZJ) / 2.0f) + this.LJ;
        float f2 = -f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(LJIILJJIL);
        float f3 = this.LIZLLL;
        canvas.drawRect(f, (-f3) / 2.0f, f2, f3 / 2.0f, paint);
        float f4 = this.LJ;
        RectF rectF = new RectF(-f4, -f4, f4, f4);
        LJFF(canvas, paint, this.LIZLLL, this.LJ, f, true, rectF);
        LJFF(canvas, paint, this.LIZLLL, this.LJ, f2, false, rectF);
    }

    @Override // X.AbstractC80875Vod
    public final void LIZIZ(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.LIZJ;
        float f4 = this.LJ;
        float f5 = ((-f3) / 2.0f) + f4;
        float f6 = f3 - (f4 * 2.0f);
        float f7 = (f * f6) + f5;
        float f8 = (f6 * f2) + f5;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f9 = this.LIZLLL;
        canvas.drawRect(f7, (-f9) / 2.0f, f8, f9 / 2.0f, paint);
        float f10 = this.LJ;
        float f11 = -f10;
        RectF rectF = new RectF(f11, f11, f10, f10);
        LJFF(canvas, paint, this.LIZLLL, this.LJ, f7, true, rectF);
        LJFF(canvas, paint, this.LIZLLL, this.LJ, f8, false, rectF);
    }

    public static void LJFF(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        canvas.save();
        canvas.translate(f3, 0.0f);
        if (!z) {
            canvas.rotate(180.0f);
        }
        float f4 = ((-f) / 2.0f) + f2;
        float f5 = (f / 2.0f) - f2;
        canvas.drawRect(-f2, f4, 0.0f, f5, paint);
        canvas.save();
        canvas.translate(0.0f, f4);
        canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
        canvas.restore();
        canvas.translate(0.0f, f5);
        canvas.drawArc(rectF, 180.0f, -90.0f, true, paint);
        canvas.restore();
    }
}
