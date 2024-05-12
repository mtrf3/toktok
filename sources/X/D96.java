package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D96 extends AbstractC39455Fe7 {
    public D96() {
        C32856Cuy.vj(this.LIZJ);
        this.LIZJ.LJIILIIL(5.22f, 12.22f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.39f, -0.27f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.66f, 1.1f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -0.28f, 1.4f);
        this.LIZJ.LJIIL(1.37f, 2.05f);
        C32856Cuy.s6(this.LIZJ);
        C32856Cuy.uo(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.66f, -3.1f);
        this.LIZJ.LJIIL(-3.44f, -5.18f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.0f, 25.5f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.66f, 3.1f);
        this.LIZJ.LJIIL(3.44f, 5.18f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.39f, 0.27f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(1.66f, -1.1f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.28f, -1.4f);
        this.LIZJ.LJIIL(-1.37f, -2.05f);
        C32856Cuy.J6(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIILL(-2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LJI(17.0f);
        p3.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
