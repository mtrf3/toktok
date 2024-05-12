package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cw1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32921Cw1 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32921Cw1() {
        this.LIZJ.LJIIIIZZ(27.12f, 27.66f);
        this.LIZJ.LJIIJ(0.0f, 1.18f, -0.64f, 2.2f, -1.6f, 2.75f);
        C32856Cuy.H9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.86f, -0.7f, 1.5f, -1.56f, 1.5f);
        this.LIZJ.LJIIJ(-0.86f, 0.0f, -1.56f, -0.64f, -1.56f, -1.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-3.6f);
        this.LIZJ.LJIIIZ(3.16f, 3.16f, true, true, 4.72f, -2.74f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(15.5f, 18.0f);
        C32856Cuy.m6(dij);
        C32856Cuy.hl(dij);
        C32856Cuy.LJLJL(dij);
        C32856Cuy.jl(dij);
        C32856Cuy.LJJI(dij);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, -3.0f);
        dij.LJIJ(21.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, -3.0f);
        C32856Cuy.ub(dij);
        C32856Cuy.LJJL(dij);
        dij.LJIIIZ(8.5f, 8.5f, false, false, -17.0f, 0.0f);
        C32856Cuy.LLZZ(dij);
        dij.LJIILIIL(3.0f, -3.5f);
        dij.LJIIIZ(5.5f, 5.5f, true, true, 11.0f, 0.0f);
        C32856Cuy.p9(dij);
        C32856Cuy.S(dij);
        dij.LJIILL(-3.5f);
        dij.LIZLLL();
        dij.LJIIIIZZ(36.0f, 21.0f);
        C32856Cuy.T5(dij);
        C32856Cuy.K4(dij);
        C32856Cuy.u9(dij);
        C32856Cuy.zn(dij);
        dij.LJIIJJI(24.0f);
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
