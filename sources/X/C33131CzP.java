package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33131CzP extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33131CzP() {
        this.LIZJ.LJIIIIZZ(25.0f, 33.0f);
        this.LIZJ.LJIIJ(0.0f, -2.8f, 0.0f, -4.2f, 0.55f, -5.27f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, 2.18f, -2.18f);
        this.LIZJ.LJ(28.8f, 25.0f, 30.2f, 25.0f, 33.0f, 25.0f);
        C32856Cuy.A0(this.LIZJ);
        C32856Cuy.C3(this.LIZJ);
        this.LIZJ.LJ(44.0f, 28.8f, 44.0f, 30.2f, 44.0f, 33.0f);
        C32856Cuy.B1(this.LIZJ);
        C32856Cuy.xf(this.LIZJ);
        this.LIZJ.LJ(40.2f, 44.0f, 38.8f, 44.0f, 36.0f, 44.0f);
        C32856Cuy.LJ(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(-2.8f, 0.0f, -4.2f, 0.0f, -5.27f, -0.55f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, -2.18f, -2.18f);
        this.LIZJ.LJ(25.0f, 40.2f, 25.0f, 38.8f, 25.0f, 36.0f);
        C32856Cuy.e1(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(4.87f, 8.37f);
        dij.LJ(4.0f, 10.07f, 4.0f, 12.32f, 4.0f, 16.8f);
        dij.LJIILL(12.4f);
        dij.LJIIJ(0.0f, 4.48f, 0.0f, 6.72f, 0.87f, 8.43f);
        dij.LJIIIZ(8.0f, 8.0f, false, false, 3.5f, 3.5f);
        dij.LJIIJ(1.7f, 0.87f, 3.95f, 0.87f, 8.43f, 0.87f);
        dij.LJI(20.0f);
        C32856Cuy.LJJZ(dij);
        dij.LJIIJ(0.0f, -5.6f, 0.0f, -8.4f, 1.09f, -10.54f);
        dij.LJIIIZ(10.0f, 10.0f, false, true, 4.37f, -4.37f);
        dij.LJ(27.6f, 20.0f, 30.4f, 20.0f, 36.0f, 20.0f);
        C32856Cuy.E0(dij);
        dij.LJIILL(-3.2f);
        dij.LJIIJ(0.0f, -4.48f, 0.0f, -6.72f, -0.87f, -8.43f);
        dij.LJIIIZ(8.0f, 8.0f, false, false, -3.5f, -3.5f);
        dij.LJ(35.93f, 4.0f, 33.68f, 4.0f, 29.2f, 4.0f);
        dij.LJI(16.8f);
        dij.LJIIJ(-4.48f, 0.0f, -6.72f, 0.0f, -8.43f, 0.87f);
        dij.LJIIIZ(8.0f, 8.0f, false, false, -3.5f, 3.5f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
