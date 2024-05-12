package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33325D6b extends AbstractC39455Fe7 {
    public final DIJ LJ;

    public C33325D6b() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIILIIL(-2.83f, -36.51f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, -0.62f, 0.5f, -1.12f, 1.12f, -1.12f);
        this.LIZJ.LJIIJJI(3.42f);
        C32856Cuy.Of(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(9.68f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(9.68f);
        C32856Cuy.Of(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(3.42f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(0.0f, 0.62f, -0.5f, 1.12f, -1.12f, 1.12f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-9.68f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(9.68f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJ(0.0f, 0.62f, -0.5f, 1.12f, -1.12f, 1.12f);
        this.LIZJ.LJIIJJI(-3.42f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJ(-0.62f, 0.0f, -1.12f, -0.5f, -1.12f, -1.12f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIILL(-9.68f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJI(11.5f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIIJ(-0.62f, 0.0f, -1.12f, -0.5f, -1.12f, -1.12f);
        DIJ p14 = this.LIZJ;
        o.LJIIIZ(p14, "p");
        p14.LJIILL(-3.42f);
        DIJ p15 = this.LIZJ;
        o.LJIIIZ(p15, "p");
        p15.LJIIJ(0.0f, -0.62f, 0.5f, -1.12f, 1.12f, -1.12f);
        DIJ p16 = this.LIZJ;
        o.LJIIIZ(p16, "p");
        p16.LJIIJJI(9.68f);
        DIJ p17 = this.LIZJ;
        o.LJIIIZ(p17, "p");
        p17.LJIJ(11.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
