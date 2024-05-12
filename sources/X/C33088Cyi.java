package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33088Cyi extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33088Cyi() {
        this.LIZJ.LJIIIIZZ(17.85f, 20.76f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, false, 15.5f, 22.0f);
        C32856Cuy.LJLIIL(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.5f, 1.5f, false, false, 2.35f, 1.24f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(8.0f, -5.5f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 0.0f, -2.48f);
        Q7L.LIZLLL(this.LIZJ, "p", -8.0f, -5.5f);
        this.LIZJ.LJIILIIL(4.5f, 6.74f);
        this.LIZJ.LJIIL(-3.85f, 2.65f);
        C32856Cuy.LJJLI(this.LIZJ);
        this.LIZJ.LJIIL(3.85f, 2.65f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(16.5f, 6.0f);
        dij.LJIIIZ(3.18f, 3.18f, false, false, -3.17f, 3.18f);
        dij.LJIILL(4.15f);
        dij.LJI(9.18f);
        dij.LIZJ(3.18f, 3.18f, false, false, 6.0f, 16.51f);
        dij.LJIILL(22.31f);
        dij.LIZJ(3.18f, 3.18f, false, false, 9.18f, 42.0f);
        dij.LJIIJJI(22.31f);
        dij.LJIIIZ(3.18f, 3.18f, false, false, 3.18f, -3.18f);
        dij.LJIILL(-4.31f);
        dij.LJIIJJI(4.15f);
        dij.LIZJ(3.18f, 3.18f, false, false, 42.0f, 31.33f);
        dij.LJIJ(9.18f);
        dij.LIZJ(3.18f, 3.18f, false, false, 38.82f, 6.0f);
        dij.LJI(16.51f);
        dij.LIZLLL();
        dij.LJIILIIL(15.0f, 7.33f);
        dij.LJI(16.32f);
        dij.LJIJ(9.18f);
        C32856Cuy.LJJIJL(dij);
        dij.LJIILL(22.15f);
        dij.LJIIJ(0.0f, 0.1f, -0.08f, 0.18f, -0.18f, 0.18f);
        dij.LJIIJJI(-4.15f);
        dij.LJIILL(-15.0f);
        dij.LJIIIZ(3.18f, 3.18f, false, false, -3.18f, -3.18f);
        dij.LIZLLL();
        dij.LJIIIIZZ(9.0f, 16.51f);
        C32856Cuy.LJJIJL(dij);
        dij.LJIILL(22.31f);
        dij.LJIIJ(0.0f, 0.1f, -0.08f, 0.18f, -0.18f, 0.18f);
        dij.LJI(9.18f);
        dij.LJIIIZ(0.18f, 0.18f, false, true, -0.18f, -0.18f);
        dij.LJIJ(16.51f);
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
