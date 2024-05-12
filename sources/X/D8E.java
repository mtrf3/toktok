package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8E extends AbstractC39455Fe7 {
    public D8E() {
        C32856Cuy.hm(this.LIZJ);
        this.LIZJ.LJIIIIZZ(12.75f, 13.62f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.92f, -0.62f);
        C32856Cuy.t6(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(20.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        this.LIZJ.LJI(5.49f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.93f, -1.38f);
        this.LIZJ.LJIIL(8.19f, -20.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.33f, 13.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.92f, 0.62f);
        this.LIZJ.LJIIL(8.19f, 20.0f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, true, 42.5f, 35.0f);
        C32856Cuy.I6(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p2.LJIJ(14.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        this.LIZJ.LJIIJJI(3.33f);
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
