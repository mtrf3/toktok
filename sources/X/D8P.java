package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8P extends AbstractC39455Fe7 {
    public D8P() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(41.0f, 5.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p2.LJI(8.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(32.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIJ(5.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(22.0f, 18.83f);
        C32856Cuy.th(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(18.83f);
        C32856Cuy.dm(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        p5.LJIIL(-13.3f, -13.3f);
        C32856Cuy.wc(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJII(22.0f, 18.83f);
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
