package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32871CvD extends AbstractC39455Fe7 {
    public C32871CvD() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(5.0f, 8.0f);
        C32856Cuy.el(this.LIZJ);
        C32856Cuy.LJJIFFI(this.LIZJ);
        C32856Cuy.fl(this.LIZJ);
        C32856Cuy.C1(this.LIZJ);
        C32856Cuy.z0(this.LIZJ);
        C32856Cuy.fl(this.LIZJ);
        C32856Cuy.LJLLILLLL(this.LIZJ);
        C32856Cuy.dl(this.LIZJ);
        C32856Cuy.LLLLLZ(this.LIZJ);
        C32856Cuy.cl(this.LIZJ);
        C32856Cuy.S9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(4.0f, 8.0f);
        C32856Cuy.LJLL(this.LIZJ);
        C32856Cuy.LJJIII(this.LIZJ);
        C32856Cuy.LJJLL(this.LIZJ);
        C32856Cuy.wb(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(6.5f, 6.5f, true, true, 0.0f, -13.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(39.0f);
        p4.LJIILL(-5.0f);
        C32856Cuy.Y6(this.LIZJ);
        this.LIZJ.LJIILIIL(30.0f, 9.0f);
        C32856Cuy.wb(this.LIZJ);
        C32856Cuy.N4(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(39.0f);
        p5.LJIILL(-5.0f);
        this.LIZJ.LIZLLL();
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIIZZ(9.0f, 12.0f);
        C32856Cuy.LJJ(this.LIZJ);
        C32856Cuy.g(this.LIZJ);
        C32856Cuy.LLLLLZIL(this.LIZJ);
        C32856Cuy.LJZ(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
