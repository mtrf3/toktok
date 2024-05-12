package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33533DEb extends AbstractC39455Fe7 {
    public C33533DEb() {
        this.LIZJ.LJIIIIZZ(24.1f, 10.86f);
        this.LIZJ.LIZJ(10.68f, 10.68f, false, false, 13.36f, 21.5f);
        this.LIZJ.LJIIJ(0.0f, 6.06f, 5.64f, 11.51f, 10.74f, 14.9f);
        this.LIZJ.LJ(29.0f, 33.0f, 34.84f, 27.56f, 34.84f, 21.5f);
        this.LIZJ.LJIIJ(0.0f, -5.86f, -4.8f, -10.63f, -10.74f, -10.63f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.5f, 21.5f);
        this.LIZJ.LJ(10.5f, 14.03f, 16.6f, 8.0f, 24.1f, 8.0f);
        this.LIZJ.LJIILJJIL(13.6f, 6.03f, 13.6f, 13.49f, true);
        this.LIZJ.LJIIJ(0.0f, 7.13f, -6.81f, 14.26f, -12.6f, 17.7f);
        this.LIZJ.LJIIJ(-0.31f, 0.18f, -0.64f, 0.31f, -1.0f, 0.31f);
        this.LIZJ.LJIILJJIL(-0.69f, -0.13f, -0.99f, -0.31f, true);
        this.LIZJ.LJIIJ(-5.8f, -3.44f, -12.61f, -10.57f, -12.61f, -17.7f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(13.6f, -3.84f);
        this.LIZJ.LJIIIZ(3.11f, 3.11f, false, false, -3.13f, 3.09f);
        this.LIZJ.LJIIJ(0.0f, 1.69f, 1.39f, 3.09f, 3.13f, 3.09f);
        this.LIZJ.LJIILJJIL(3.13f, -1.4f, 3.13f, -3.1f, true);
        this.LIZJ.LJIIJ(0.0f, -1.69f, -1.39f, -3.08f, -3.13f, -3.08f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-6.0f, 3.09f);
        this.LIZJ.LJIIJ(0.0f, -3.3f, 2.7f, -5.96f, 6.0f, -5.96f);
        this.LIZJ.LJIILJJIL(6.0f, 2.66f, 6.0f, 5.96f, true);
        this.LIZJ.LJIILJJIL(-2.7f, 5.95f, -6.0f, 5.95f, true);
        this.LIZJ.LJIILJJIL(-6.0f, -2.65f, -6.0f, -5.95f, true);
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
