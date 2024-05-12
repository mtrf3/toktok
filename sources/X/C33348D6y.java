package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33348D6y extends AbstractC39455Fe7 {
    public C33348D6y() {
        this.LIZJ.LJIIIIZZ(19.17f, 11.66f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(0.38f);
        this.LIZJ.LJIIJJI(9.66f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-0.38f);
        this.LIZJ.LJIIJ(0.0f, -0.82f, -0.26f, -2.11f, -0.98f, -3.13f);
        this.LIZJ.LJIIJ(-0.66f, -0.93f, -1.78f, -1.76f, -3.85f, -1.76f);
        this.LIZJ.LJIIJ(-2.07f, 0.0f, -3.19f, 0.83f, -3.85f, 1.76f);
        this.LIZJ.LJIIIZ(5.75f, 5.75f, false, false, -0.98f, 3.13f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(13.38f, 0.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(0.38f);
        C32856Cuy.Fb(this.LIZJ);
        this.LIZJ.LJIIJ(1.18f, 0.0f, 2.16f, 0.9f, 2.3f, 2.07f);
        this.LIZJ.LJIIL(2.8f, 24.27f);
        this.LIZJ.LIZJ(5.92f, 5.92f, false, true, 35.11f, 45.0f);
        this.LIZJ.LJI(12.88f);
        this.LIZJ.LJIIIZ(5.92f, 5.92f, false, true, -5.84f, -6.62f);
        this.LIZJ.LJIIL(2.8f, -24.27f);
        this.LIZJ.LJIIIZ(2.32f, 2.32f, false, true, 2.29f, -2.07f);
        C32856Cuy.Fb(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-0.38f);
        this.LIZJ.LJIIJ(0.0f, -1.43f, 0.4f, -3.53f, 1.69f, -5.33f);
        this.LIZJ.LJ(18.49f, 4.43f, 20.72f, 3.0f, 24.0f, 3.0f);
        this.LIZJ.LJIIJ(3.28f, 0.0f, 5.51f, 1.43f, 6.86f, 3.33f);
        this.LIZJ.LJIIIZ(9.54f, 9.54f, false, true, 1.7f, 5.33f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-6.93f, 9.85f);
        this.LIZJ.LJIIIZ(1.83f, 1.83f, false, false, -3.24f, 0.02f);
        this.LIZJ.LJIIL(-1.46f, 2.78f);
        this.LIZJ.LJIIL(-3.15f, 0.65f);
        this.LIZJ.LJIIIZ(1.87f, 1.87f, false, false, -1.01f, 3.06f);
        this.LIZJ.LJIIL(2.2f, 2.55f);
        this.LIZJ.LJIIL(-0.46f, 3.4f);
        this.LIZJ.LJIIIZ(1.85f, 1.85f, false, false, 2.66f, 1.9f);
        this.LIZJ.LJII(24.0f, 34.4f);
        this.LIZJ.LJIIL(2.84f, 1.48f);
        this.LIZJ.LJIIIZ(1.85f, 1.85f, false, false, 2.66f, -1.92f);
        this.LIZJ.LJIIL(-0.46f, -3.39f);
        this.LIZJ.LJIIL(2.2f, -2.56f);
        this.LIZJ.LJIIIZ(1.87f, 1.87f, false, false, -1.0f, -3.05f);
        this.LIZJ.LJIIL(-3.1f, -0.65f);
        this.LIZJ.LJIIL(-1.52f, -2.8f);
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
