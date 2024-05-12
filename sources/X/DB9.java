package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DB9 extends AbstractC39455Fe7 {
    public DB9() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(11.0f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p2.LJIILL(12.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p2.LJIIJJI(2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        C32856Cuy.m(this.LIZJ);
        C32856Cuy.T(this.LIZJ);
        this.LIZJ.LJIILIIL(0.0f, 18.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p3.LJIILL(12.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p3.LJIIJJI(2.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p3.LJIJ(27.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LJIIJJI(-2.0f);
        p3.LIZLLL();
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIIZZ(22.0f, 9.0f);
        C32856Cuy.b3(this.LIZJ);
        this.LIZJ.LJIIIIZZ(34.0f, 9.0f);
        C32856Cuy.b3(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
