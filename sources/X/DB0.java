package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DB0 extends AbstractC39455Fe7 {
    public DB0() {
        this.LIZJ.LJIIIIZZ(24.95f, 7.84f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -1.9f, 0.0f);
        this.LIZJ.LJIIL(-16.1f, 13.2f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 0.95f, 2.66f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(2.33f);
        this.LIZJ.LJIIL(1.2f, 13.03f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 13.9f, 39.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(7.59f);
        C32856Cuy.Dn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-9.68f);
        C32856Cuy.LLJJ(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(38.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(7.59f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 2.49f, -2.27f);
        this.LIZJ.LJIIL(1.19f, -13.03f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(2.33f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, 0.95f, -2.66f);
        this.LIZJ.LJIIL(-16.1f, -13.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
