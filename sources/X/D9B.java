package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9B extends AbstractC39455Fe7 {
    public D9B() {
        this.LIZJ.LJIIIIZZ(26.3f, 8.0f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, 2.54f, 1.63f);
        this.LIZJ.LJIIL(4.4f, 11.87f);
        this.LIZJ.LJIIJJI(9.26f);
        C32856Cuy.E3(this.LIZJ);
        C32856Cuy.S(this.LIZJ);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -2.34f, -1.63f);
        this.LIZJ.LJIIL(-1.96f, -5.28f);
        this.LIZJ.LJIIL(-3.75f, 18.4f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -4.82f, 0.3f);
        this.LIZJ.LJII(14.7f, 26.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(5.5f);
        C32856Cuy.u5(this.LIZJ);
        C32856Cuy.LJIIL(this.LIZJ);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, 2.37f, 1.7f);
        this.LIZJ.LJIIL(1.55f, 4.64f);
        this.LIZJ.LJII(24.05f, 10.0f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, 2.26f, -2.0f);
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
