package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8K extends AbstractC39455Fe7 {
    public D8K() {
        this.LIZJ.LJIIIIZZ(28.0f, 2.0f);
        C32856Cuy.Ck(this.LIZJ);
        C32856Cuy.Am(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(16.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p.LJIILL(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.I6(this.LIZJ);
        C32856Cuy.Qe(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(19.0f, 27.0f);
        C32856Cuy.LLLII(this.LIZJ);
        C32856Cuy.LJIILJJIL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(14.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p3.LJIIJJI(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(29.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
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
