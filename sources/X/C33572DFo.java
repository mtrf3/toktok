package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33572DFo extends AbstractC39455Fe7 {
    public C33572DFo() {
        this.LIZJ.LJIILIIL(13.0f, 2.5f);
        this.LIZJ.LJIIL(11.0f, 16.21f);
        this.LIZJ.LJII(35.0f, 2.5f);
        this.LIZJ.LJIIJ(1.17f, 0.83f, 3.0f, 3.3f, 1.0f, 6.5f);
        this.LIZJ.LJIIJ(0.0f, 0.0f, -6.04f, 9.69f, -8.84f, 14.37f);
        this.LIZJ.LJII(31.0f, 29.02f);
        this.LIZJ.LJIIJ(3.7f, -2.77f, 8.82f, -1.27f, 11.58f, 2.48f);
        this.LIZJ.LJIIJ(2.8f, 3.8f, 2.82f, 9.41f, -0.9f, 12.35f);
        this.LIZJ.LJIIJ(-3.73f, 2.94f, -8.94f, 1.45f, -11.75f, -2.35f);
        this.LIZJ.LJIIJ(-2.02f, -2.74f, -2.6f, -6.42f, -1.36f, -9.36f);
        this.LIZJ.LJII(24.0f, 25.5f);
        this.LIZJ.LJIIL(-4.56f, 6.64f);
        this.LIZJ.LJIIJ(1.23f, 2.94f, 0.66f, 6.61f, -1.37f, 9.35f);
        this.LIZJ.LJIIJ(-2.81f, 3.81f, -8.04f, 5.3f, -11.77f, 2.36f);
        this.LIZJ.LJIIJ(-3.74f, -2.94f, -3.72f, -8.54f, -0.9f, -12.34f);
        this.LIZJ.LJIIJ(2.76f, -3.75f, 7.88f, -5.26f, 11.6f, -2.49f);
        this.LIZJ.LJIIL(3.84f, -5.65f);
        this.LIZJ.LIZJ(1261.7f, 1261.7f, false, false, 12.0f, 9.0f);
        this.LIZJ.LJIIJ(-2.0f, -3.2f, -0.17f, -5.67f, 1.0f, -6.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(20.2f, 29.87f);
        this.LIZJ.LJIIJ(-1.52f, 1.2f, -2.0f, 4.1f, -0.13f, 6.65f);
        this.LIZJ.LJIIJ(1.87f, 2.54f, 4.7f, 2.82f, 6.23f, 1.61f);
        this.LIZJ.LJIIJ(1.53f, -1.2f, 2.02f, -4.1f, 0.14f, -6.65f);
        this.LIZJ.LJIIJ(-1.87f, -2.54f, -4.7f, -2.82f, -6.23f, -1.61f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-18.41f, 0.0f);
        this.LIZJ.LJIIJ(-1.54f, -1.22f, -4.38f, -0.93f, -6.26f, 1.61f);
        this.LIZJ.LJIIJ(-1.87f, 2.54f, -1.4f, 5.44f, 0.14f, 6.65f);
        this.LIZJ.LJIIJ(1.54f, 1.22f, 4.38f, 0.93f, 6.26f, -1.61f);
        this.LIZJ.LJIILJJIL(1.4f, -5.44f, -0.14f, -6.65f, true);
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
