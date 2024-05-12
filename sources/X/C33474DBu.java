package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33474DBu extends AbstractC39455Fe7 {
    public C33474DBu() {
        this.LIZJ.LJIIIIZZ(18.0f, 12.5f);
        this.LIZJ.LJIIJ(-2.41f, 0.0f, -4.42f, 2.0f, -4.42f, 4.53f);
        this.LIZJ.LJIIJ(0.0f, 2.54f, 2.01f, 4.54f, 4.42f, 4.54f);
        this.LIZJ.LJIILJJIL(4.42f, -2.0f, 4.42f, -4.54f, true);
        this.LIZJ.LJIIJ(0.0f, -2.53f, -2.01f, -4.53f, -4.42f, -4.53f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-7.42f, 4.53f);
        this.LIZJ.LJIIJ(0.0f, -4.13f, 3.3f, -7.53f, 7.42f, -7.53f);
        this.LIZJ.LJIILJJIL(7.42f, 3.4f, 7.42f, 7.53f, true);
        this.LIZJ.LJIIJ(0.0f, 4.14f, -3.3f, 7.54f, -7.42f, 7.54f);
        this.LIZJ.LJIIIZ(7.48f, 7.48f, false, true, -7.42f, -7.54f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.0f, 29.88f);
        this.LIZJ.LJIIIZ(8.68f, 8.68f, false, false, -8.3f, 6.39f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(-0.15f, 0.53f, -0.66f, 0.9f, -1.2f, 0.81f);
        this.LIZJ.LJIIL(-1.0f, -0.16f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, true, -0.78f, -1.14f);
        this.LIZJ.LJIIJ(1.29f, -5.1f, 5.83f, -8.9f, 11.28f, -8.9f);
        this.LIZJ.LJIIJ(5.45f, 0.0f, 10.0f, 3.8f, 11.28f, 8.9f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, true, -0.79f, 1.14f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-0.98f, 0.16f);
        this.LIZJ.LJIIJ(-0.55f, 0.1f, -1.06f, -0.28f, -1.2f, -0.81f);
        this.LIZJ.LJIIIZ(8.68f, 8.68f, false, false, -8.31f, -6.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.0f, 31.54f);
        this.LIZJ.LJIIJ(-0.76f, 0.0f, -1.48f, 0.13f, -2.16f, 0.37f);
        this.LIZJ.LJIIJ(-0.52f, 0.19f, -1.12f, 0.01f, -1.39f, -0.47f);
        this.LIZJ.LJIIL(-0.47f, -0.88f);
        this.LIZJ.LJIIJ(-0.27f, -0.48f, -0.09f, -1.1f, 0.42f, -1.3f);
        this.LIZJ.LJIIIZ(9.38f, 9.38f, false, true, 3.6f, -0.72f);
        this.LIZJ.LJIIJ(4.46f, 0.0f, 8.16f, 3.09f, 9.27f, 7.24f);
        this.LIZJ.LJIIJ(0.14f, 0.53f, -0.23f, 1.05f, -0.78f, 1.14f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-0.98f, 0.16f);
        this.LIZJ.LJIIJ(-0.55f, 0.09f, -1.06f, -0.28f, -1.22f, -0.81f);
        this.LIZJ.LIZJ(6.65f, 6.65f, false, false, 33.0f, 31.54f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.0f, 18.5f);
        C32856Cuy.g2(this.LIZJ);
        this.LIZJ.LJIIIIZZ(27.5f, 21.0f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, true, true, 11.0f, 0.0f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, true, -11.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
