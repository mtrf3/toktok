package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBM extends AbstractC39455Fe7 {
    public DBM() {
        C32856Cuy.Vf(this.LIZJ);
        this.LIZJ.LJIIIIZZ(10.0f, 12.0f);
        C32856Cuy.a8(this.LIZJ);
        C32856Cuy.W7(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(13.12f, 11.02f);
        this.LIZJ.LJIIL(0.9f, -1.77f);
        this.LIZJ.LJIIL(0.95f, 1.79f);
        this.LIZJ.LJIIJ(0.27f, 0.51f, 0.76f, 0.88f, 1.33f, 1.0f);
        this.LIZJ.LJIIL(2.16f, 0.48f);
        this.LIZJ.LJIIL(-1.63f, 1.95f);
        this.LIZJ.LJIIJ(-0.36f, 0.42f, -0.52f, 0.98f, -0.45f, 1.53f);
        this.LIZJ.LJIIL(0.3f, 2.3f);
        this.LIZJ.LJIIL(-1.74f, -0.94f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, false, -1.87f, 0.0f);
        this.LIZJ.LJIIL(-1.76f, 0.94f);
        this.LIZJ.LJIIL(0.31f, -2.3f);
        this.LIZJ.LJIIJ(0.07f, -0.55f, -0.09f, -1.1f, -0.45f, -1.53f);
        this.LIZJ.LJIIL(-1.62f, -1.94f);
        this.LIZJ.LJIIL(2.22f, -0.48f);
        this.LIZJ.LJIIJ(0.58f, -0.13f, 1.08f, -0.5f, 1.35f, -1.03f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(2.64f, -4.9f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, false, -3.51f, 0.02f);
        this.LIZJ.LJIIL(-1.58f, 3.08f);
        this.LIZJ.LJIIL(-3.4f, 0.73f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, false, -1.1f, 3.2f);
        this.LIZJ.LJIIL(2.42f, 2.9f);
        this.LIZJ.LJIIL(-0.51f, 3.82f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, false, 2.9f, 2.01f);
        this.LIZJ.LJII(24.0f, 32.26f);
        this.LIZJ.LJIIL(3.03f, 1.62f);
        this.LIZJ.LJIIJ(1.42f, 0.76f, 3.1f, -0.4f, 2.9f, -2.0f);
        this.LIZJ.LJIIL(-0.52f, -3.83f);
        this.LIZJ.LJIIL(2.43f, -2.9f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, false, -1.1f, -3.2f);
        this.LIZJ.LJIIL(-3.34f, -0.73f);
        this.LIZJ.LJIIL(-1.64f, -3.1f);
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
