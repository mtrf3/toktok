package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32918Cvy extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32918Cvy() {
        C32856Cuy.ua(this.LIZJ);
        this.LIZJ.LJIILIIL(3.13f, 12.78f);
        C32856Cuy.p1(this.LIZJ);
        this.LIZJ.LJIIIIZZ(40.0f, 26.0f);
        C32856Cuy.F1(this.LIZJ);
        C32856Cuy.H6(this.LIZJ);
        C32856Cuy.LJJZZI(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", 10.0f);
        this.LIZJ.LJIILIIL(-10.0f, -2.0f);
        C32856Cuy.ym(this.LIZJ);
        C32856Cuy.F1(this.LIZJ);
        C32856Cuy.cf(this.LIZJ);
        C32856Cuy.LJJZZI(this.LIZJ);
        C32856Cuy.xm(this.LIZJ);
        DIL.LIZ(this.LIZJ, "p", 30.0f);
        this.LIZJ.LJIIIIZZ(28.0f, 36.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        p.LJIIJJI(13.0f);
        p.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(1.0f);
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-13.0f);
        p3.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        C32856Cuy.c1(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(31.0f, 29.5f);
        C32856Cuy.Wn(dij);
        dij.LJIILL(2.0f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        C32856Cuy.b2(dij);
        C32856Cuy.d1(dij);
        dij.LJIIIIZZ(34.0f, 30.5f);
        C32856Cuy.Wn(dij);
        dij.LJIILL(1.0f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        C32856Cuy.b2(dij);
        C32856Cuy.c1(dij);
        dij.LJIIIIZZ(37.0f, 27.5f);
        C32856Cuy.jc(dij);
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
