package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D85 extends AbstractC39455Fe7 {
    public D85() {
        this.LIZJ.LJIIIIZZ(13.0f, 12.4f);
        this.LIZJ.LJIILL(15.24f);
        this.LIZJ.LJIIJ(0.87f, -0.32f, 2.08f, -0.7f, 3.48f, -0.96f);
        this.LIZJ.LJIIJ(2.8f, -0.52f, 6.5f, -0.56f, 9.6f, 1.65f);
        this.LIZJ.LJIIJ(2.46f, 1.75f, 5.5f, 1.79f, 8.07f, 1.31f);
        this.LIZJ.LIZJ(19.27f, 19.27f, false, false, 38.0f, 28.5f);
        this.LIZJ.LJIJ(13.26f);
        this.LIZJ.LJIIJ(-0.87f, 0.32f, -2.08f, 0.7f, -3.48f, 0.96f);
        this.LIZJ.LJIIJ(-2.8f, 0.52f, -6.5f, 0.56f, -9.6f, -1.65f);
        this.LIZJ.LJIIJ(-2.46f, -1.75f, -5.5f, -1.79f, -8.07f, -1.31f);
        this.LIZJ.LIZJ(19.27f, 19.27f, false, false, 13.0f, 12.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(25.55f, -1.54f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.45f, 0.9f);
        this.LIZJ.LJIILL(17.38f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.55f, 0.9f);
        this.LIZJ.LJIIL(-0.45f, -0.9f);
        this.LIZJ.LJIIL(0.45f, 0.9f);
        C32856Cuy.ob(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.02f, 0.02f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, -0.36f, 0.16f);
        this.LIZJ.LJIIJ(-0.24f, 0.1f, -0.6f, 0.26f, -1.03f, 0.42f);
        this.LIZJ.LJIIJ(-0.87f, 0.32f, -2.1f, 0.71f, -3.5f, 0.97f);
        this.LIZJ.LJIIJ(-2.8f, 0.51f, -6.5f, 0.55f, -9.6f, -1.65f);
        this.LIZJ.LJIIJ(-2.46f, -1.75f, -5.5f, -1.79f, -8.07f, -1.31f);
        this.LIZJ.LIZJ(19.3f, 19.3f, false, false, 13.0f, 29.79f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(40.5f);
        C32856Cuy.Yb(this.LIZJ);
        this.LIZJ.LJIJ(11.76f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.55f, -0.9f);
        this.LIZJ.LJIIL(0.45f, 0.9f);
        this.LIZJ.LJIIL(-0.45f, -0.9f);
        C32856Cuy.a0(this.LIZJ);
        this.LIZJ.LJIIL(0.02f, -0.01f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 0.36f, -0.17f);
        this.LIZJ.LJIIL(1.03f, -0.42f);
        this.LIZJ.LJIIJ(0.87f, -0.32f, 2.1f, -0.7f, 3.5f, -0.97f);
        this.LIZJ.LJIIJ(2.8f, -0.51f, 6.5f, -0.55f, 9.6f, 1.65f);
        this.LIZJ.LJIIJ(2.46f, 1.75f, 5.5f, 1.79f, 8.07f, 1.31f);
        this.LIZJ.LJIIIZ(19.28f, 19.28f, false, false, 4.4f, -1.38f);
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
