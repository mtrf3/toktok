package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33369D7t extends AbstractC39455Fe7 {
    public C33369D7t() {
        this.LIZJ.LJIIIIZZ(7.5f, 24.0f);
        this.LIZJ.LJIIIZ(16.5f, 16.5f, true, true, 33.0f, 0.0f);
        this.LIZJ.LJIIIZ(16.5f, 16.5f, false, true, -33.0f, 0.0f);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 4.5f);
        this.LIZJ.LJIIIZ(19.5f, 19.5f, true, false, 0.0f, 39.0f);
        this.LIZJ.LJIIIZ(19.5f, 19.5f, false, false, 0.0f, -39.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.26f, 8.25f);
        this.LIZJ.LJIIJ(0.0f, -0.41f, 0.33f, -0.75f, 0.75f, -0.75f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(1.17f);
        C32856Cuy.Sa(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(2.6f);
        this.LIZJ.LJIIJ(1.82f, 0.24f, 3.38f, 0.92f, 4.63f, 1.97f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, 0.09f, 0.97f);
        this.LIZJ.LJIIL(-0.84f, 1.1f);
        this.LIZJ.LJIIJ(-0.28f, 0.37f, -0.8f, 0.4f, -1.17f, 0.12f);
        this.LIZJ.LJIIIZ(7.07f, 7.07f, false, false, -2.71f, -1.28f);
        this.LIZJ.LJIILL(4.62f);
        this.LIZJ.LJIIJ(2.7f, 0.73f, 5.54f, 1.82f, 5.54f, 5.28f);
        this.LIZJ.LJIIJ(0.0f, 2.67f, -1.7f, 5.02f, -5.54f, 5.45f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(1.67f);
        C32856Cuy.cn(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-1.17f);
        C32856Cuy.D7(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-1.66f);
        this.LIZJ.LJIIIZ(9.48f, 9.48f, false, true, -5.47f, -2.33f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.08f, -0.94f);
        this.LIZJ.LJIIL(0.85f, -1.18f);
        this.LIZJ.LJIIJ(0.28f, -0.38f, 0.84f, -0.41f, 1.2f, -0.1f);
        this.LIZJ.LJIIJ(0.9f, 0.77f, 2.09f, 1.42f, 3.5f, 1.7f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(-5.2f);
        this.LIZJ.LJIIJ(-2.64f, -0.7f, -5.33f, -1.73f, -5.33f, -5.06f);
        this.LIZJ.LJIIJ(0.0f, -2.66f, 2.06f, -4.76f, 5.33f, -5.16f);
        this.LIZJ.LJIILL(-2.57f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.13f, 7.49f);
        this.LIZJ.LJIIJ(0.0f, 0.97f, 0.88f, 1.49f, 2.13f, 1.9f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(18.1f);
        this.LIZJ.LJIIJ(-1.32f, 0.24f, -2.13f, 1.05f, -2.13f, 2.14f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(4.8f, 10.53f);
        this.LIZJ.LJIIJ(1.67f, -0.33f, 2.34f, -1.35f, 2.34f, -2.34f);
        this.LIZJ.LJIIJ(0.0f, -1.16f, -0.98f, -1.73f, -2.34f, -2.17f);
        this.LIZJ.LJIILL(4.51f);
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
