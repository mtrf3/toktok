package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4K extends AbstractC39455Fe7 {
    public D4K() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.0f, 9.0f);
        C32856Cuy.rj(this.LIZJ);
        C32856Cuy.LJLJLLL(this.LIZJ);
        C32856Cuy.In(this.LIZJ);
        C32856Cuy.k9(this.LIZJ);
        C32856Cuy.qj(this.LIZJ);
        C32856Cuy.Y6(this.LIZJ);
        this.LIZJ.LJIILIIL(1.62f, 13.43f);
        this.LIZJ.LJIIL(5.72f, -5.72f);
        C32856Cuy.rk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(1.42f, 1.41f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, 1.42f);
        this.LIZJ.LJIIL(-4.38f, 4.37f);
        this.LIZJ.LJIIL(4.38f, 4.38f);
        C32856Cuy.wk(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-1.42f, 1.41f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        this.LIZJ.LJIIL(-5.72f, -5.72f);
        this.LIZJ.LJIIIZ(2.1f, 2.1f, false, true, 0.0f, -2.97f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(26.76f, 0.0f);
        this.LIZJ.LJIIIZ(2.1f, 2.1f, false, true, 0.0f, 2.97f);
        this.LIZJ.LJIIL(-5.72f, 5.72f);
        C32856Cuy.nk(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-1.42f, -1.41f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJIIL(4.38f, -4.38f);
        this.LIZJ.LJIIL(-4.38f, -4.37f);
        C32856Cuy.M8(this.LIZJ);
        C32856Cuy.rk(this.LIZJ);
        this.LIZJ.LJIIL(5.72f, 5.72f);
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
