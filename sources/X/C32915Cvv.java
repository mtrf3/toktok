package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32915Cvv extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32915Cvv() {
        this.LIZJ.LJIIIIZZ(33.3f, 21.3f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(26.0f, 27.16f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(3.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p.LJIIJJI(-2.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(24.17f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-5.88f, -5.88f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, 0.0f);
        p3.LJIIL(-1.42f, 1.42f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 1.41f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(9.3f, 9.3f);
        p4.LJIIIZ(2.0f, 2.0f, false, false, 2.82f, 0.0f);
        C32856Cuy.G(this.LIZJ);
        C32856Cuy.x2(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(14.92f, 10.0f);
        C32856Cuy.Vk(dij);
        dij.LIZJ(44.6f, 44.6f, false, false, 5.0f, 19.92f);
        dij.LJIILL(15.16f);
        C32856Cuy.Jb(dij);
        dij.LJIIJJI(18.16f);
        C32856Cuy.G5(dij);
        dij.LJIJ(19.92f);
        C32856Cuy.Xf(dij);
        dij.LJ(35.53f, 10.0f, 34.4f, 10.0f, 33.08f, 10.0f);
        dij.LJIIIZ(0.58f, 0.58f, false, false, -0.58f, 0.58f);
        dij.LJIILL(2.92f);
        dij.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        dij.LJIIJ(1.43f, 0.0f, 2.39f, 0.0f, 3.12f, 0.06f);
        dij.LJIIIZ(3.3f, 3.3f, false, true, 1.24f, 0.27f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 1.31f, 1.3f);
        dij.LJIIJ(0.1f, 0.21f, 0.21f, 0.54f, 0.27f, 1.25f);
        dij.LJIIJ(0.06f, 0.73f, 0.06f, 1.69f, 0.06f, 3.12f);
        C32856Cuy.LJLJJI(dij);
        C32856Cuy.d7(dij);
        C32856Cuy.r6(dij);
        C32856Cuy.ng(dij);
        dij.LJ(9.0f, 37.4f, 9.0f, 36.43f, 9.0f, 35.0f);
        C32856Cuy.s9(dij);
        dij.LJIIJ(0.0f, -1.43f, 0.0f, -2.39f, 0.06f, -3.12f);
        dij.LJIIIZ(3.3f, 3.3f, false, true, 0.27f, -1.24f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 1.3f, -1.31f);
        dij.LJIIJ(0.21f, -0.1f, 0.54f, -0.21f, 1.25f, -0.27f);
        dij.LJ(12.6f, 14.0f, 13.57f, 14.0f, 15.0f, 14.0f);
        C32856Cuy.LLJJI(dij);
        dij.LJIILL(-2.92f);
        dij.LJIIIZ(0.58f, 0.58f, false, false, -0.58f, -0.58f);
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
