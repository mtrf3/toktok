package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32902Cvi extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32902Cvi() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(13.0f, 4.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(3.5f, 3.5f, false, false, -3.5f, 3.5f);
        C32856Cuy.r1(this.LIZJ);
        C32856Cuy.v2(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(7.5f);
        p3.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        C32856Cuy.un(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.0f, 29.92f);
        C32856Cuy.LLJJI(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-11.2f);
        C32856Cuy.Uh(this.LIZJ);
        this.LIZJ.LJIILL(11.2f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p5.LJIIJJI(2.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.5f, 40.5f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-6.1f);
        C32856Cuy.Uh(this.LIZJ);
        C32856Cuy.r1(this.LIZJ);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, false, 13.0f, 44.0f);
        C32856Cuy.un(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        p7.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.45f, 6.5f);
        C32856Cuy.U5(this.LIZJ);
        C32856Cuy.Gm(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(33.0f);
        C32856Cuy.C5(this.LIZJ);
        C32856Cuy.Jm(this.LIZJ);
        C32856Cuy.U5(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(3.5f, 3.5f, false, false, 3.5f, -3.5f);
        this.LIZJ.LJIILL(-33.0f);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, false, 35.9f, 4.0f);
        C32856Cuy.Jm(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(21.21f, 23.44f);
        C32856Cuy.LLJJJ(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIILL(-7.97f);
        C32856Cuy.K1(this.LIZJ);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIJJI(2.0f);
        p12.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIILL(7.97f);
        C32856Cuy.k8(this.LIZJ);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(29.06f, 14.47f);
        C32856Cuy.z5(dij);
        dij.LJIILL(7.97f);
        C32856Cuy.v2(dij);
        dij.LJIILL(-7.97f);
        C32856Cuy.va(dij);
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
