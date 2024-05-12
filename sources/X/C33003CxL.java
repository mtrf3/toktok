package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33003CxL extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33003CxL() {
        this.LIZJ.LJIIIIZZ(22.0f, 33.0f);
        C32856Cuy.Hb(this.LIZJ);
        this.LIZJ.LJIIIIZZ(30.0f, 25.0f);
        C32856Cuy.Hb(this.LIZJ);
        this.LIZJ.LJIIIIZZ(13.0f, 16.0f);
        C32856Cuy.Hb(this.LIZJ);
        this.LIZJ.LJIIIIZZ(40.0f, 25.0f);
        C32856Cuy.Hb(this.LIZJ);
        this.LIZJ.LJIIIIZZ(22.0f, 42.86f);
        this.LIZJ.LJIIJ(0.0f, 0.56f, 0.47f, 1.0f, 1.06f, 1.0f);
        C32856Cuy.B2(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(-0.59f, 0.0f, -1.06f, 0.45f, -1.06f, 1.0f);
        p.LJIILL(2.0f);
        p.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(8.0f, 8.0f);
        C32856Cuy.LJLJI(dij);
        C32856Cuy.LJIILJJIL(dij);
        C32856Cuy.I8(dij);
        dij.LJIIIIZZ(6.0f, 4.0f);
        dij.LJIIJJI(18.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        C32856Cuy.j(dij);
        dij.LJI(6.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.Md(dij);
        dij.LJIIIIZZ(8.0f, 34.0f);
        dij.LJIILL(6.0f);
        dij.LJIIJJI(6.0f);
        dij.LJIILL(-6.0f);
        C32856Cuy.W6(dij);
        dij.LJIILIIL(-2.0f, -4.0f);
        dij.LJIIJJI(10.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        dij.LJIILL(10.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        dij.LJI(6.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.Ii(dij);
        dij.LJIIIIZZ(34.0f, 34.0f);
        dij.LJIILL(6.0f);
        dij.LJIIJJI(6.0f);
        dij.LJIILL(-6.0f);
        dij.LJIIJJI(-6.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-2.0f, -4.0f);
        dij.LJIIJJI(10.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        dij.LJIILL(10.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        dij.LJI(32.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.Ii(dij);
        dij.LJIIIIZZ(34.0f, 8.0f);
        dij.LJIILL(6.0f);
        dij.LJIIJJI(6.0f);
        C32856Cuy.f(dij);
        dij.LJIIJJI(-6.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-2.0f, -4.0f);
        dij.LJIIJJI(10.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        dij.LJIILL(10.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        dij.LJI(32.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        C32856Cuy.Md(dij);
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
