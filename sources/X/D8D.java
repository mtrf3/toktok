package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8D extends AbstractC39455Fe7 {
    public D8D() {
        this.LIZJ.LJIIIIZZ(35.0f, 5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, 5.0f);
        p.LJIILL(28.0f);
        p.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        p.LJI(13.0f);
        p.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        p.LJIJ(10.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, -5.0f);
        p2.LJIIJJI(22.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.0f, 21.0f);
        C32856Cuy.n6(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(12.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(22.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.LLZZJLIL(this.LIZJ);
        C32856Cuy.K0(this.LIZJ);
        C32856Cuy.Uc(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p5.LJIILL(12.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(24.0f);
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
