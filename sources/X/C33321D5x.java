package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33321D5x extends AbstractC39455Fe7 {
    public C33321D5x() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(44.0f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p2.LJIIJJI(-2.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(20.97f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, -2.45f, 4.84f);
        this.LIZJ.LJIIL(-11.0f, 8.07f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, -7.1f, 0.0f);
        this.LIZJ.LJIIL(-11.0f, -8.07f);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, true, 7.0f, 29.97f);
        C32856Cuy.g(this.LIZJ);
        C32856Cuy.Pi(this.LIZJ);
        C32856Cuy.n2(this.LIZJ);
        this.LIZJ.LIZLLL();
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIIZZ(11.0f, 9.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(20.97f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.82f, 1.62f);
        this.LIZJ.LJIIL(11.0f, 8.06f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.36f, 0.0f);
        this.LIZJ.LJIIL(11.0f, -8.06f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 0.82f, -1.62f);
        C32856Cuy.g(this.LIZJ);
        C32856Cuy.LLLLIIL(this.LIZJ);
        this.LIZJ.LJIILIIL(11.25f, 5.08f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, true, 3.5f, -0.03f);
        this.LIZJ.LJIIL(1.65f, 3.1f);
        this.LIZJ.LJIIL(3.35f, 0.74f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, true, 1.1f, 3.2f);
        this.LIZJ.LJII(29.4f, 24.0f);
        this.LIZJ.LJIIL(0.51f, 3.82f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, true, -2.9f, 2.01f);
        this.LIZJ.LJII(24.0f, 28.2f);
        this.LIZJ.LJIIL(-3.02f, 1.62f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, true, -2.9f, -2.0f);
        this.LIZJ.LJIIL(0.5f, -3.83f);
        this.LIZJ.LJIIL(-2.42f, -2.9f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, true, 1.1f, -3.2f);
        this.LIZJ.LJIIL(3.41f, -0.73f);
        this.LIZJ.LJIIL(1.58f, -3.08f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.77f, 3.11f);
        this.LIZJ.LJIIL(-0.9f, 1.77f);
        this.LIZJ.LJIIJ(-0.27f, 0.52f, -0.77f, 0.9f, -1.35f, 1.03f);
        this.LIZJ.LJIIL(-2.22f, 0.48f);
        this.LIZJ.LJIIL(1.63f, 1.94f);
        this.LIZJ.LJIIJ(0.35f, 0.42f, 0.51f, 0.98f, 0.44f, 1.53f);
        this.LIZJ.LJIIL(-0.3f, 2.3f);
        this.LIZJ.LJIIL(1.75f, -0.94f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, true, 1.87f, 0.0f);
        this.LIZJ.LJIIL(1.75f, 0.94f);
        this.LIZJ.LJIIL(-0.3f, -2.3f);
        this.LIZJ.LJIIJ(-0.08f, -0.55f, 0.08f, -1.1f, 0.44f, -1.53f);
        this.LIZJ.LJIIL(1.63f, -1.95f);
        this.LIZJ.LJIIL(-2.16f, -0.47f);
        this.LIZJ.LJIIIZ(1.98f, 1.98f, false, true, -1.33f, -1.01f);
        this.LIZJ.LJIIL(-0.95f, -1.79f);
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
