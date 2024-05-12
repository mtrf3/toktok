package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2Z extends AbstractC39455Fe7 {
    public D2Z() {
        this.LIZJ.LJIIIIZZ(17.3f, 7.5f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, -2.44f, 1.96f);
        this.LIZJ.LJII(14.3f, 12.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(8.5f);
        this.LIZJ.LIZJ(5.5f, 5.5f, false, false, 3.0f, 17.5f);
        C32856Cuy.LJLJL(this.LIZJ);
        this.LIZJ.LIZJ(5.5f, 5.5f, false, false, 8.5f, 41.0f);
        C32856Cuy.LJJIIJ(this.LIZJ);
        C32856Cuy.L0(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-18.0f);
        C32856Cuy.M0(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-5.8f);
        this.LIZJ.LJIIL(-0.56f, -2.54f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 30.7f, 7.5f);
        this.LIZJ.LJI(17.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-0.16f, 5.54f);
        this.LIZJ.LJIIL(0.56f, -2.54f);
        this.LIZJ.LJIIJJI(12.6f);
        this.LIZJ.LJIIL(0.56f, 2.54f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 33.3f, 15.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(6.2f);
        C32856Cuy.gg(this.LIZJ);
        C32856Cuy.LJLJL(this.LIZJ);
        C32856Cuy.eg(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-31.0f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 6.0f, 35.5f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-18.0f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 8.5f, 15.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(6.2f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 2.44f, -1.96f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.0f, 25.5f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, true, true, 12.0f, 0.0f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, -12.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.0f, -9.0f);
        C32856Cuy.Cj(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
