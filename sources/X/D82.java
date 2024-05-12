package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D82 extends AbstractC39455Fe7 {
    public D82() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 7.5f);
        this.LIZJ.LJIIIZ(16.5f, 16.5f, true, false, 0.0f, 33.0f);
        this.LIZJ.LJIIIZ(16.5f, 16.5f, false, false, 0.0f, -33.0f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(4.5f, 24.0f);
        this.LIZJ.LJIIIZ(19.5f, 19.5f, true, true, 39.0f, 0.0f);
        this.LIZJ.LJIIIZ(19.5f, 19.5f, false, true, -39.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(18.0f, -9.5f);
        C32856Cuy.R1(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(13.0f);
        p3.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-2.0f);
        p4.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-13.0f);
        p5.LIZLLL();
        p5.LJIIIIZZ(24.0f, 30.0f);
        C32856Cuy.Xj(this.LIZJ);
        C32856Cuy.z1(this.LIZJ);
        C32856Cuy.Ol(this.LIZJ);
        C32856Cuy.LJJLIIJ(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        p6.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
