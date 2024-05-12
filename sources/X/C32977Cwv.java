package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32977Cwv extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32977Cwv() {
        C32856Cuy.J7(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16732377);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(16.5f, 11.5f);
        dij.LIZJ(2.5f, 2.5f, false, false, 14.0f, 14.0f);
        dij.LJIILL(3.13f);
        dij.LJIIJJI(-1.88f);
        dij.LJIIIZ(0.62f, 0.62f, false, false, -0.62f, 0.62f);
        dij.LJIILL(3.13f);
        dij.LJIIJ(0.0f, 0.34f, 0.28f, 0.62f, 0.63f, 0.62f);
        C32856Cuy.p6(dij);
        C32856Cuy.D1(dij);
        dij.LJIIJJI(-1.88f);
        dij.LJIIIZ(0.62f, 0.62f, false, false, -0.62f, 0.63f);
        dij.LJIILL(3.12f);
        dij.LJIIJ(0.0f, 0.35f, 0.28f, 0.63f, 0.63f, 0.63f);
        C32856Cuy.p6(dij);
        C32856Cuy.H9(dij);
        C32856Cuy.jg(dij);
        dij.LJIIJJI(16.88f);
        C32856Cuy.ig(dij);
        C32856Cuy.l9(dij);
        C32856Cuy.hg(dij);
        dij.LJI(16.5f);
        dij.LIZLLL();
        dij.LJIILIIL(15.62f, 15.92f);
        dij.LJIILL(2.07f);
        dij.LJIIIZ(1.38f, 1.38f, false, true, -1.5f, 1.38f);
        dij.LJIIIZ(13.7f, 13.7f, false, true, -5.97f, -2.12f);
        dij.LJIIIZ(13.47f, 13.47f, false, true, -4.15f, -4.14f);
        dij.LJIIIZ(13.64f, 13.64f, false, true, -2.12f, -5.98f);
        dij.LJIIIZ(1.38f, 1.38f, false, true, 1.38f, -1.5f);
        dij.LJIIJJI(2.07f);
        dij.LJIIJ(0.7f, -0.01f, 1.29f, 0.5f, 1.38f, 1.18f);
        dij.LJIIJ(0.1f, 0.66f, 0.25f, 1.31f, 0.49f, 1.94f);
        dij.LJIIJ(0.19f, 0.5f, 0.07f, 1.07f, -0.31f, 1.46f);
        dij.LJIIL(-0.88f, 0.87f);
        dij.LJIIIZ(11.05f, 11.05f, false, false, 4.15f, 4.14f);
        dij.LJIIL(0.87f, -0.87f);
        dij.LJIIJ(0.39f, -0.38f, 0.96f, -0.5f, 1.46f, -0.31f);
        dij.LJIIJ(0.63f, 0.23f, 1.28f, 0.4f, 1.95f, 0.48f);
        dij.LJIIJ(0.7f, 0.1f, 1.2f, 0.7f, 1.18f, 1.4f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
