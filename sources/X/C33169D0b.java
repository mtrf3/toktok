package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33169D0b extends AbstractC39455Fe7 {
    public C33169D0b() {
        this.LIZJ.LJIIIIZZ(20.0f, 8.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        p.LJI(12.0f);
        C32856Cuy.rj(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(7.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p3.LJIIJJI(1.0f);
        p3.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        p3.LJIJ(12.0f);
        C32856Cuy.x(this.LIZJ);
        C32856Cuy.hd(this.LIZJ);
        this.LIZJ.LJIILIIL(0.0f, 30.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        p4.LJI(12.0f);
        C32856Cuy.um(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-7.5f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        p6.LJIIJJI(-1.0f);
        p6.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        p6.LJIJ(36.0f);
        C32856Cuy.tj(this.LIZJ);
        C32856Cuy.hd(this.LIZJ);
        this.LIZJ.LJIILIIL(8.5f, 1.5f);
        C32856Cuy.pn(this.LIZJ);
        C32856Cuy.zm(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(-7.5f);
        p7.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(1.0f);
        p9.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        p9.LJIJ(36.0f);
        C32856Cuy.nj(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", -7.5f);
        this.LIZJ.LJIILIIL(0.0f, -30.0f);
        C32856Cuy.pn(this.LIZJ);
        C32856Cuy.pj(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(7.5f);
        p10.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(-1.0f);
        p11.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        p11.LJIJ(12.0f);
        p11.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        C40084FoG.LJ(this.LIZJ, "p", -7.5f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
