package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32944CwO extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32944CwO() {
        this.LIZJ.LJIIIIZZ(13.5f, 7.5f);
        C32856Cuy.bh(this.LIZJ);
        C32856Cuy.LJLJLJ(this.LIZJ);
        C32856Cuy.dh(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(22.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.G9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(10.0f, 10.0f, false, true, 10.0f, -10.0f);
        C32856Cuy.p0(this.LIZJ);
        C32856Cuy.Dn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-8.5f);
        C32856Cuy.ah(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", -21.0f);
        this.LIZJ.LJIIIIZZ(20.0f, 17.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, 1.66f, -1.12f, 3.0f, -2.5f, 3.0f);
        this.LIZJ.LJIILLIIL(15.0f, 18.66f, 15.0f, 17.0f, true);
        C32856Cuy.hb(this.LIZJ);
        C32856Cuy.LLLZLZ(this.LIZJ);
        this.LIZJ.LJIILLIIL(28.0f, 18.66f, 28.0f, 17.0f, true);
        C32856Cuy.hb(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(39.25f, 27.85f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, -0.35f, -0.85f);
        C32856Cuy.K6(dij);
        C32856Cuy.bh(dij);
        dij.LJIILL(5.9f);
        dij.LJIIJ(0.0f, 0.44f, 0.54f, 0.67f, 0.85f, 0.35f);
        dij.LJIIL(11.4f, -11.4f);
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
