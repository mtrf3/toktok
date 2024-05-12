package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32881CvN extends AbstractC39455Fe7 {
    public C32881CvN() {
        this.LIZJ.LJIIIIZZ(8.0f, 18.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p.LJI(15.0f);
        C32856Cuy.sj(this.LIZJ);
        C32856Cuy.LLZZLLIL(this.LIZJ);
        C32856Cuy.H3(this.LIZJ);
        C32856Cuy.m9(this.LIZJ);
        C32856Cuy.vm(this.LIZJ);
        C32856Cuy.LLLLLZL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(0.0f, 12.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        p3.LJI(15.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        p4.LJIILL(6.5f);
        C32856Cuy.Zn(this.LIZJ);
        C32856Cuy.G9(this.LIZJ);
        C32856Cuy.qj(this.LIZJ);
        C32856Cuy.LLLLLZL(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIIZZ(39.5f, 29.0f);
        C32856Cuy.Ve(this.LIZJ);
        C32856Cuy.ym(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(6.5f);
        C32856Cuy.Yb(this.LIZJ);
        C32856Cuy.G9(this.LIZJ);
        C32856Cuy.oj(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", 6.5f);
        this.LIZJ.LJIILIIL(0.0f, -12.0f);
        C32856Cuy.Ve(this.LIZJ);
        C32856Cuy.mj(this.LIZJ);
        C32856Cuy.A7(this.LIZJ);
        C32856Cuy.m9(this.LIZJ);
        C32856Cuy.LLZ(this.LIZJ);
        C40084FoG.LJ(this.LIZJ, "p", 6.5f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
