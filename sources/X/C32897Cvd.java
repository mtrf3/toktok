package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32897Cvd extends AbstractC39455Fe7 {
    public C32897Cvd() {
        this.LIZJ.LJIIIIZZ(10.89f, 11.5f);
        C32856Cuy.na(this.LIZJ);
        this.LIZJ.LJIILIIL(9.5f, -6.5f);
        C32856Cuy.Wd(this.LIZJ);
        this.LIZJ.LJIIIIZZ(20.47f, 27.0f);
        this.LIZJ.LIZJ(15.5f, 15.5f, false, false, 5.09f, 40.59f);
        this.LIZJ.LJIIJ(-0.07f, 0.55f, -0.54f, 0.97f, -1.1f, 0.94f);
        this.LIZJ.LJIIL(-1.0f, -0.06f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, true, -0.9f, -1.05f);
        this.LIZJ.LJIIIZ(18.5f, 18.5f, false, true, 23.96f, -15.56f);
        this.LIZJ.LJIIJ(0.53f, 0.16f, 0.79f, 0.74f, 0.6f, 1.26f);
        this.LIZJ.LJIIL(-0.36f, 0.94f);
        this.LIZJ.LJIIJ(-0.2f, 0.51f, -0.77f, 0.77f, -1.3f, 0.61f);
        this.LIZJ.LJIIIZ(15.5f, 15.5f, false, false, -4.52f, -0.67f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.0f, 26.5f);
        C32856Cuy.B9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-2.0f);
        p.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, 3.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(9.0f);
        C32856Cuy.jl(this.LIZJ);
        C32856Cuy.LJIILL(this.LIZJ);
        C32856Cuy.il(this.LIZJ);
        C32856Cuy.LJL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, -3.0f);
        p3.LJIIJJI(-2.0f);
        C32856Cuy.LJJJLZIJ(this.LIZJ);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, true, false, -11.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(8.0f, 2.5f);
        C32856Cuy.LJI(this.LIZJ);
        C32856Cuy.LJJJLZIJ(this.LIZJ);
        C32856Cuy.O4(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 29.0f);
        this.LIZJ.LJIILIIL(4.5f, 3.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        p4.LJIILL(8.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        p5.LJIIJJI(-14.0f);
        p5.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        C32856Cuy.LJJZZIII(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        p6.LJIIJJI(14.0f);
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
