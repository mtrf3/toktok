package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DB5 extends AbstractC39455Fe7 {
    public DB5() {
        this.LIZJ.LJIILIIL(4.23f, 22.23f);
        this.LIZJ.LJIIL(15.3f, -15.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.4f, 0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(2.13f, 2.13f);
        C32856Cuy.xk(this.LIZJ);
        this.LIZJ.LJII(12.04f, 21.5f);
        C32856Cuy.Xn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(3.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p3.LJI(12.04f);
        this.LIZJ.LJIIL(11.02f, 11.03f);
        C32856Cuy.LLZIL(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-15.3f, -15.3f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(2.5f, 2.5f, false, true, 0.0f, -3.53f);
        p5.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
