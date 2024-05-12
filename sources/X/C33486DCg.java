package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33486DCg extends AbstractC39455Fe7 {
    public C33486DCg() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 7.0f);
        this.LIZJ.LJIIJ(-7.72f, 0.0f, -14.0f, 6.33f, -14.0f, 14.16f);
        this.LIZJ.LJIIJ(0.0f, 1.84f, 0.78f, 4.0f, 2.08f, 6.3f);
        this.LIZJ.LJIIIZ(41.96f, 41.96f, false, false, 4.82f, 6.6f);
        this.LIZJ.LJIIIZ(60.43f, 60.43f, false, false, 5.03f, 5.12f);
        this.LIZJ.LJIIIZ(28.35f, 28.35f, false, false, 2.07f, 1.7f);
        this.LIZJ.LJIIL(0.31f, -0.23f);
        this.LIZJ.LJIIJ(0.45f, -0.34f, 1.05f, -0.84f, 1.76f, -1.47f);
        this.LIZJ.LJIIIZ(60.43f, 60.43f, false, false, 5.03f, -5.12f);
        this.LIZJ.LJIIIZ(41.96f, 41.96f, false, false, 4.82f, -6.6f);
        this.LIZJ.LJIIJ(1.3f, -2.3f, 2.08f, -4.46f, 2.08f, -6.3f);
        this.LIZJ.LJ(38.0f, 13.33f, 31.72f, 7.0f, 24.0f, 7.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.0f, 21.16f);
        this.LIZJ.LJ(8.0f, 12.24f, 15.15f, 5.0f, 24.0f, 5.0f);
        this.LIZJ.LJIILJJIL(16.0f, 7.24f, 16.0f, 16.16f, true);
        this.LIZJ.LJIIJ(0.0f, 2.35f, -0.98f, 4.88f, -2.34f, 7.28f);
        this.LIZJ.LJIIIZ(43.95f, 43.95f, false, true, -5.05f, 6.94f);
        this.LIZJ.LJIIIZ(62.4f, 62.4f, false, true, -5.2f, 5.29f);
        this.LIZJ.LJIIJ(-0.74f, 0.66f, -1.39f, 1.2f, -1.9f, 1.58f);
        this.LIZJ.LJIIIZ(8.37f, 8.37f, false, true, -0.98f, 0.63f);
        this.LIZJ.LJIIJ(-0.08f, 0.03f, -0.28f, 0.12f, -0.53f, 0.12f);
        this.LIZJ.LJIILJJIL(-0.45f, -0.09f, -0.53f, -0.12f, true);
        this.LIZJ.LJIIJ(-0.1f, -0.05f, -0.21f, -0.1f, -0.31f, -0.17f);
        this.LIZJ.LJIIJ(-0.2f, -0.11f, -0.43f, -0.28f, -0.68f, -0.46f);
        this.LIZJ.LJIIJ(-0.5f, -0.38f, -1.15f, -0.92f, -1.89f, -1.58f);
        this.LIZJ.LJIIIZ(62.4f, 62.4f, false, true, -5.2f, -5.3f);
        this.LIZJ.LJIIIZ(43.95f, 43.95f, false, true, -5.05f, -6.93f);
        this.LIZJ.LJ(8.98f, 26.04f, 8.0f, 23.51f, 8.0f, 21.16f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(16.0f, -5.63f);
        this.LIZJ.LJIIIZ(4.65f, 4.65f, false, false, -4.63f, 4.68f);
        this.LIZJ.LJIIJ(0.0f, 2.6f, 2.09f, 4.68f, 4.63f, 4.68f);
        this.LIZJ.LJIIIZ(4.65f, 4.65f, false, false, 4.63f, -4.68f);
        this.LIZJ.LJIIJ(0.0f, -2.6f, -2.09f, -4.68f, -4.63f, -4.68f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-6.63f, 4.68f);
        this.LIZJ.LIZJ(6.65f, 6.65f, false, true, 24.0f, 13.53f);
        this.LIZJ.LJIIJ(3.67f, 0.0f, 6.63f, 3.0f, 6.63f, 6.68f);
        this.LIZJ.LIZJ(6.65f, 6.65f, false, true, 24.0f, 26.9f);
        this.LIZJ.LJIIJ(-3.67f, 0.0f, -6.63f, -3.0f, -6.63f, -6.68f);
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
