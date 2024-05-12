package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33453DAz extends AbstractC39455Fe7 {
    public C33453DAz() {
        this.LIZJ.LJIIIIZZ(35.4f, 10.46f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, 0.39f, 0.4f);
        this.LIZJ.LJIIL(0.68f, 1.74f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, false, 1.3f, 0.0f);
        this.LIZJ.LJIIL(0.7f, -1.74f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, 0.39f, -0.4f);
        this.LIZJ.LJIIL(1.44f, -0.57f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, false, -0.07f, -1.33f);
        this.LIZJ.LJIIL(-1.3f, -0.36f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.48f, -0.44f);
        this.LIZJ.LJIIL(-0.67f, -1.9f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, false, -1.32f, 0.0f);
        this.LIZJ.LJIIL(-0.66f, 1.9f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, true, -0.48f, 0.44f);
        this.LIZJ.LJIIL(-1.3f, 0.36f);
        this.LIZJ.LJIIIZ(0.7f, 0.7f, false, false, -0.08f, 1.33f);
        this.LIZJ.LJIIL(1.45f, 0.57f);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 9.0f);
        C32856Cuy.Cj(this.LIZJ);
        this.LIZJ.LJIILIIL(12.44f, 34.0f);
        this.LIZJ.LJIIJ(1.8f, 0.0f, 3.22f, -1.6f, 2.57f, -3.29f);
        this.LIZJ.LJ(36.79f, 34.05f, 30.95f, 30.0f, 24.08f, 30.0f);
        this.LIZJ.LJIIJ(-6.86f, 0.0f, -12.7f, 4.05f, -14.92f, 9.71f);
        this.LIZJ.LJIIJ(-0.65f, 1.68f, 0.76f, 3.29f, 2.57f, 3.29f);
        this.LIZJ.LJIIJJI(24.71f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.18f, 29.42f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(3.0f, 3.0f, false, false, -1.69f, -1.7f);
        this.LIZJ.LJIIL(-1.71f, -0.67f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, 0.1f, -1.9f);
        this.LIZJ.LJIIL(1.32f, -0.36f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, 2.03f, -1.9f);
        this.LIZJ.LJII(8.0f, 20.68f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.89f, 0.0f);
        this.LIZJ.LJIIL(0.79f, 2.23f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, 2.02f, 1.89f);
        this.LIZJ.LJIIL(1.32f, 0.37f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, 0.1f, 1.89f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(-1.71f, 0.68f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -1.7f, 1.69f);
        this.LIZJ.LJIIL(-0.83f, 2.13f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.86f, 0.0f);
        this.LIZJ.LJIIL(-0.85f, -2.13f);
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
