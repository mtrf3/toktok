package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBS extends AbstractC39455Fe7 {
    public DBS() {
        this.LIZJ.LJIILIIL(5.92f, 32.75f);
        this.LIZJ.LJIIL(13.32f, -16.0f);
        this.LIZJ.LJIIIZ(13.5f, 13.5f, true, true, 12.28f, 12.2f);
        this.LIZJ.LJIIL(0.1f, 0.1f);
        this.LIZJ.LJIIL(-16.04f, 13.36f);
        this.LIZJ.LJIIIZ(6.86f, 6.86f, false, true, -9.66f, -9.66f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(7.1f, 6.58f);
        this.LIZJ.LJIIL(13.94f, -11.6f);
        this.LIZJ.LJIIIZ(13.56f, 13.56f, false, true, -6.4f, -6.3f);
        this.LIZJ.LJII(9.0f, 35.31f);
        this.LIZJ.LJIIIZ(2.86f, 2.86f, false, false, 4.02f, 4.02f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(23.19f, 15.5f);
        this.LIZJ.LJIIIZ(9.5f, 9.5f, false, false, 12.46f, 9.03f);
        this.LIZJ.LJIIIZ(18.5f, 18.5f, false, true, -7.4f, -4.18f);
        this.LIZJ.LJIIIZ(18.6f, 18.6f, false, true, -4.87f, -6.75f);
        this.LIZJ.LJIIIZ(9.55f, 9.55f, false, false, -0.2f, 1.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.78f, -7.59f);
        this.LIZJ.LJIIJ(-0.45f, 0.67f, -0.66f, 1.83f, -0.1f, 3.57f);
        this.LIZJ.LJIIJ(0.58f, 1.86f, 1.96f, 4.0f, 4.06f, 5.9f);
        this.LIZJ.LJIIIZ(14.04f, 14.04f, false, false, 6.3f, 3.41f);
        this.LIZJ.LJIIJ(1.96f, 0.4f, 3.15f, -0.03f, 3.7f, -0.66f);
        this.LIZJ.LJIIL(0.04f, 0.03f);
        this.LIZJ.LJIIIZ(9.5f, 9.5f, false, false, -14.0f, -12.25f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.1f, 2.1f);
        this.LIZJ.LJIIJ(0.36f, -0.05f, 0.7f, 0.24f, 0.7f, 0.61f);
        this.LIZJ.LJIILL(3.45f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.42f, 0.49f);
        this.LIZJ.LJIIL(-5.33f, 0.61f);
        this.LIZJ.LJIIIZ(0.3f, 0.3f, false, false, -0.27f, 0.3f);
        this.LIZJ.LJIILL(10.06f);
        this.LIZJ.LJIIIZ(4.38f, 4.38f, true, true, -4.39f, -4.38f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(1.93f);
        this.LIZJ.LJIJ(3.61f);
        this.LIZJ.LJIIJ(0.0f, -0.3f, 0.22f, -0.56f, 0.52f, -0.6f);
        this.LIZJ.LJIIL(7.25f, -0.9f);
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
