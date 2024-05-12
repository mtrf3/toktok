package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDJ extends AbstractC39455Fe7 {
    public DDJ() {
        C32856Cuy.vf(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(30.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(8.0f);
        p2.LJIIIZ(6.0f, 6.0f, false, true, -6.0f, -6.0f);
        p2.LJIJ(14.0f);
        p2.LIZLLL();
        p2.LJIIIIZZ(46.0f, 14.0f);
        p2.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        p2.LJIIJJI(-9.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(9.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        p2.LJIILL(20.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p2.LJIIJJI(-9.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(9.0f);
        p2.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, -6.0f);
        p2.LJIJ(14.0f);
        p2.LIZLLL();
        p2.LJIIIIZZ(22.0f, 5.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p2.LJIIJJI(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p2.LJIILL(38.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p2.LJIIJJI(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p2.LJIJ(5.0f);
        p2.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
