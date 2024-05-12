package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DC2 extends AbstractC39455Fe7 {
    public DC2() {
        C32856Cuy.l5(this.LIZJ);
        C32856Cuy.LJIL(this.LIZJ);
        C32856Cuy.Bo(this.LIZJ);
        this.LIZJ.LJIILIIL(10.03f, 10.34f);
        this.LIZJ.LJIIJ(0.0f, -0.54f, 0.45f, -0.98f, 0.99f, -0.98f);
        this.LIZJ.LJIIJJI(1.96f);
        this.LIZJ.LJIIJ(0.54f, 0.0f, 1.0f, 0.44f, 1.0f, 0.98f);
        this.LIZJ.LJIILL(7.69f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(7.68f);
        this.LIZJ.LJIIJ(0.54f, 0.0f, 0.98f, 0.45f, 0.98f, 0.99f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(1.96f);
        this.LIZJ.LJIIJ(0.0f, 0.54f, -0.44f, 1.0f, -0.98f, 1.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-7.69f);
        this.LIZJ.LJIILL(7.68f);
        this.LIZJ.LJIIJ(0.0f, 0.54f, -0.45f, 0.98f, -0.99f, 0.98f);
        this.LIZJ.LJIIJJI(-1.96f);
        this.LIZJ.LJIIJ(-0.54f, 0.0f, -1.0f, -0.44f, -1.0f, -0.98f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-7.69f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-7.68f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, true, -0.98f, -0.99f);
        this.LIZJ.LJIILL(-1.96f);
        this.LIZJ.LJIIJ(0.0f, -0.54f, 0.44f, -1.0f, 0.98f, -1.0f);
        this.LIZJ.LJIIJJI(7.69f);
        this.LIZJ.LJIILL(-7.68f);
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
