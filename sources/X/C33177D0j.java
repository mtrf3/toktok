package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33177D0j extends AbstractC39455Fe7 {
    public C33177D0j() {
        this.LIZJ.LJIIIIZZ(25.0f, 4.2f);
        this.LIZJ.LJIIJ(0.0f, -1.22f, 0.9f, -2.2f, 2.0f, -2.2f);
        this.LIZJ.LJIILJJIL(2.0f, 0.98f, 2.0f, 2.2f, true);
        this.LIZJ.LJIILL(39.6f);
        this.LIZJ.LJIIJ(0.0f, 1.22f, -0.9f, 2.2f, -2.0f, 2.2f);
        this.LIZJ.LJIILJJIL(-2.0f, -0.98f, -2.0f, -2.2f, true);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(4.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.0f, 9.0f);
        C32856Cuy.LJLILLLLZI(this.LIZJ);
        C32856Cuy.A0(this.LIZJ);
        C32856Cuy.LLJLIL(this.LIZJ);
        C32856Cuy.U(this.LIZJ);
        this.LIZJ.LJIIIIZZ(33.0f, 26.0f);
        C32856Cuy.LJLILLLLZI(this.LIZJ);
        C32856Cuy.LJIIL(this.LIZJ);
        C32856Cuy.LLJLIL(this.LIZJ);
        DIL.LIZ(this.LIZJ, "p", 33.0f);
        this.LIZJ.LJIIIIZZ(21.0f, 26.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(13.0f);
        p2.LJIIJJI(-9.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        p3.LJIILL(-7.0f);
        p3.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        C40084FoG.LJ(this.LIZJ, "p", 9.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIIZZ(21.0f, 9.0f);
        C32856Cuy.LJLILLLLZI(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(4.0f);
        p5.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-7.0f);
        p6.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        C32856Cuy.LJIIZILJ(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
