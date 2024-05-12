package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8M extends AbstractC39455Fe7 {
    public D8M() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(3.0f, 19.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(11.17f);
        p2.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, 3.0f);
        p2.LJIIJJI(4.2f);
        p2.LJIIIZ(2.0f, 2.0f, false, true, 1.46f, 0.63f);
        p2.LJIIL(8.88f, 9.5f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 24.0f, 41.93f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(6.4f);
        p3.LJIIIZ(2.0f, 2.0f, false, false, -3.51f, -1.3f);
        this.LIZJ.LJII(11.67f, 15.3f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(2.0f, 2.0f, false, true, -1.52f, 0.7f);
        C32856Cuy.LLLLLLZ(this.LIZJ);
        C32856Cuy.hl(this.LIZJ);
        this.LIZJ.LIZLLL();
        C32856Cuy.a6(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
