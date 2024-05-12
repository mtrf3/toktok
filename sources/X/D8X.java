package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8X extends AbstractC39455Fe7 {
    public D8X() {
        this.LIZJ.LJIIIIZZ(16.33f, 7.55f);
        C32856Cuy.zn(this.LIZJ);
        this.LIZJ.LJIIJJI(21.63f);
        C32856Cuy.gg(this.LIZJ);
        this.LIZJ.LJIILL(21.63f);
        C32856Cuy.oh(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-15.6f);
        this.LIZJ.LJII(11.03f, 40.53f);
        C32856Cuy.nk(this.LIZJ);
        this.LIZJ.LJII(7.5f, 38.4f);
        C32856Cuy.uk(this.LIZJ);
        this.LIZJ.LJIIL(25.43f, -25.43f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-15.6f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p3.LJIILL(-3.0f);
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
