package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAP extends AbstractC39455Fe7 {
    public DAP() {
        C32856Cuy.LLJJL(this.LIZJ);
        this.LIZJ.LJII(7.0f, 18.53f);
        this.LIZJ.LJIILL(13.75f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(5.0f, 5.0f, false, false, 3.28f, 4.7f);
        this.LIZJ.LJIIL(12.26f, 4.49f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 2.9f, -0.06f);
        this.LIZJ.LJIIL(10.74f, -4.4f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, 3.1f, -4.63f);
        this.LIZJ.LJIJ(19.11f);
        this.LIZJ.LJIIL(1.24f, -0.55f);
        C32856Cuy.LLLL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(35.3f, 20.88f);
        C32856Cuy.LJJLIIIJ(this.LIZJ);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.62f, 0.92f);
        this.LIZJ.LJIIL(-10.72f, 4.4f);
        this.LIZJ.LJIIL(-12.3f, -4.45f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.65f, -0.94f);
        this.LIZJ.LJIJ(20.25f);
        this.LIZJ.LJIIL(11.43f, 4.93f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 3.2f, -0.02f);
        this.LIZJ.LJIIL(9.66f, -4.28f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 21.52f);
        this.LIZJ.LJII(10.04f, 15.4f);
        this.LIZJ.LJIIL(13.97f, -6.0f);
        this.LIZJ.LJIIL(13.6f, 6.0f);
        this.LIZJ.LJIIL(-13.6f, 6.13f);
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
