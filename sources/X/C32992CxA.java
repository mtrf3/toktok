package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32992CxA extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32992CxA() {
        this.LIZJ.LJIIIIZZ(21.15f, 19.27f);
        this.LIZJ.LJII(25.88f, 24.0f);
        this.LIZJ.LJIIL(-4.73f, 4.73f);
        C32856Cuy.Z3(this.LIZJ);
        this.LIZJ.LJII(28.0f, 26.12f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(4.73f, 4.73f);
        C32856Cuy.pi(this.LIZJ);
        this.LIZJ.LJII(30.12f, 24.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(4.73f, -4.73f);
        C32856Cuy.Gk(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-0.7f, -0.7f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(28.0f, 21.88f);
        this.LIZJ.LJIIL(-4.73f, -4.73f);
        C32856Cuy.Af(this.LIZJ);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(19.58f, 7.5f);
        dij.LJIIIZ(5.5f, 5.5f, false, false, -3.76f, 1.49f);
        dij.LJII(3.31f, 20.72f);
        dij.LJIIIZ(4.5f, 4.5f, false, false, 0.0f, 6.56f);
        dij.LJIIL(12.51f, 11.73f);
        dij.LJIIIZ(5.5f, 5.5f, false, false, 3.76f, 1.49f);
        C32856Cuy.Q6(dij);
        C32856Cuy.L0(dij);
        C32856Cuy.k9(dij);
        dij.LIZJ(5.5f, 5.5f, false, false, 39.0f, 7.5f);
        dij.LJI(19.58f);
        dij.LIZLLL();
        dij.LJIILIIL(-1.7f, 3.68f);
        dij.LJIIIZ(2.5f, 2.5f, false, true, 1.7f, -0.68f);
        C32856Cuy.Q6(dij);
        C32856Cuy.gg(dij);
        C32856Cuy.LJLJLLL(dij);
        C32856Cuy.eg(dij);
        dij.LJI(19.58f);
        dij.LJIIIZ(2.5f, 2.5f, false, true, -1.7f, -0.68f);
        dij.LJII(5.35f, 25.1f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, 0.0f, -2.18f);
        dij.LJIIL(12.51f, -11.73f);
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
