package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33387D8l extends AbstractC39455Fe7 {
    public C33387D8l() {
        C32856Cuy.al(this.LIZJ);
        this.LIZJ.LJIIIIZZ(22.2f, 8.69f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, -0.38f, 0.32f, -0.69f, 0.7f, -0.69f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(2.18f);
        this.LIZJ.LJIIJ(0.38f, 0.0f, 0.68f, 0.3f, 0.68f, 0.69f);
        this.LIZJ.LJIILL(3.78f);
        this.LIZJ.LJIIJ(2.54f, 0.33f, 4.7f, 1.3f, 6.39f, 2.8f);
        this.LIZJ.LJIIJ(0.26f, 0.23f, 0.28f, 0.62f, 0.07f, 0.9f);
        this.LIZJ.LJIIL(-1.5f, 1.98f);
        this.LIZJ.LJIIIZ(0.74f, 0.74f, false, true, -1.06f, 0.1f);
        this.LIZJ.LJIIIZ(9.38f, 9.38f, false, false, -3.9f, -1.94f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(6.16f);
        this.LIZJ.LJIIJ(3.61f, 0.97f, 7.4f, 2.42f, 7.4f, 7.04f);
        this.LIZJ.LJIIJ(0.0f, 3.56f, -2.28f, 6.68f, -7.4f, 7.26f);
        this.LIZJ.LJIILL(2.54f);
        this.LIZJ.LJIIJ(0.0f, 0.38f, -0.3f, 0.69f, -0.68f, 0.69f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(22.9f);
        this.LIZJ.LJIIIZ(0.69f, 0.69f, false, true, -0.7f, -0.69f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-2.53f);
        this.LIZJ.LJIIIZ(12.6f, 12.6f, false, true, -7.47f, -3.27f);
        this.LIZJ.LJIIIZ(0.66f, 0.66f, false, true, -0.08f, -0.87f);
        this.LIZJ.LJIIL(1.52f, -2.1f);
        this.LIZJ.LJIIIZ(0.73f, 0.73f, false, true, 1.09f, -0.08f);
        this.LIZJ.LIZJ(10.23f, 10.23f, false, false, 22.2f, 33.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-6.93f);
        this.LIZJ.LJIIJ(-3.52f, -0.94f, -7.11f, -2.3f, -7.11f, -6.75f);
        this.LIZJ.LJIIJ(0.0f, -3.55f, 2.75f, -6.35f, 7.1f, -6.88f);
        this.LIZJ.LJIJ(8.69f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.84f, 10.3f);
        this.LIZJ.LJIIJ(0.0f, -1.45f, 1.09f, -2.53f, 2.85f, -2.86f);
        this.LIZJ.LJIILL(5.38f);
        this.LIZJ.LJIIJ(-1.67f, -0.54f, -2.85f, -1.22f, -2.85f, -2.52f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.4f, 14.04f);
        this.LIZJ.LJIILL(-6.01f);
        this.LIZJ.LJIIJ(1.82f, 0.58f, 3.13f, 1.35f, 3.13f, 2.88f);
        this.LIZJ.LJIIJ(0.0f, 1.32f, -0.9f, 2.7f, -3.13f, 3.13f);
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
