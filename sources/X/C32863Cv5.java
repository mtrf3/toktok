package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cv5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32863Cv5 extends AbstractC39455Fe7 {
    public C32863Cv5() {
        this.LIZJ.LJIIIIZZ(3.5f, 9.0f);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, true, 7.0f, 5.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(34.0f);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, true, 44.5f, 9.0f);
        C32856Cuy.LJLLLL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(3.5f, 3.5f, false, true, -3.5f, 3.5f);
        C32856Cuy.LLLLLLZZ(this.LIZJ);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, true, 3.5f, 39.0f);
        C32856Cuy.T9(this.LIZJ);
        this.LIZJ.LJIIIIZZ(7.0f, 8.5f);
        C32856Cuy.z5(this.LIZJ);
        C32856Cuy.LJLLLL(this.LIZJ);
        C32856Cuy.Z4(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(34.0f);
        C32856Cuy.LLJJI(this.LIZJ);
        C32856Cuy.g(this.LIZJ);
        C32856Cuy.LLJJIJI(this.LIZJ);
        C32856Cuy.V6(this.LIZJ);
        this.LIZJ.LJIIIIZZ(10.0f, 28.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p4.LJIIJJI(17.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.bl(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(11.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p5.LJIILL(-1.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(11.0f, 5.0f);
        C32856Cuy.ec(this.LIZJ);
        C32856Cuy.LJIIZILJ(this.LIZJ);
        C32856Cuy.Q8(this.LIZJ);
        DIL.LIZ(this.LIZJ, "p", 21.0f);
        this.LIZJ.LJIILIIL(11.0f, -5.0f);
        C32856Cuy.h2(this.LIZJ);
        C32856Cuy.bl(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-5.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.c1(this.LIZJ);
        this.LIZJ.LJIILIIL(-21.0f, 5.0f);
        C32856Cuy.ec(this.LIZJ);
        C32856Cuy.Dm(this.LIZJ);
        C32856Cuy.Jj(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", -5.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
