package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33482DCc extends AbstractC39455Fe7 {
    public C33482DCc() {
        this.LIZJ.LJIIIIZZ(25.25f, 4.45f);
        this.LIZJ.LJIIJ(-0.72f, -0.6f, -1.78f, -0.6f, -2.5f, 0.0f);
        this.LIZJ.LJII(2.34f, 21.49f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, false, -0.13f, 1.33f);
        this.LIZJ.LJIIL(1.23f, 1.44f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, false, 1.43f, 0.07f);
        this.LIZJ.LJIIL(1.63f, -1.57f);
        this.LIZJ.LJIIL(1.72f, 18.61f);
        this.LIZJ.LIZJ(2.92f, 2.92f, false, false, 11.16f, 44.0f);
        this.LIZJ.LJIIJJI(24.78f);
        this.LIZJ.LJIIIZ(3.9f, 3.9f, false, false, 3.9f, -3.5f);
        this.LIZJ.LJIIL(1.65f, -17.74f);
        this.LIZJ.LJIIL(1.63f, 1.57f);
        this.LIZJ.LJIIJ(0.4f, 0.4f, 1.07f, 0.36f, 1.43f, -0.07f);
        this.LIZJ.LJIIL(1.23f, -1.44f);
        this.LIZJ.LJIIJ(0.34f, -0.4f, 0.28f, -1.0f, -0.12f, -1.33f);
        this.LIZJ.LJII(25.26f, 4.45f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.71f, 29.83f);
        this.LIZJ.LJIIJ(-1.95f, 1.1f, -4.38f, -0.27f, -4.38f, -2.47f);
        this.LIZJ.LJIILL(-9.9f);
        this.LIZJ.LJIIJ(0.0f, -2.2f, 2.43f, -3.58f, 4.38f, -2.48f);
        this.LIZJ.LJIIL(8.76f, 4.95f);
        this.LIZJ.LJIIIZ(2.83f, 2.83f, false, true, 0.0f, 4.95f);
        this.LIZJ.LJIIL(-8.76f, 4.95f);
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
