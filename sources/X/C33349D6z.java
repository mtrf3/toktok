package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33349D6z extends AbstractC39455Fe7 {
    public C33349D6z() {
        this.LIZJ.LJIIIIZZ(39.75f, 8.0f);
        this.LIZJ.LJ(42.1f, 8.0f, 44.0f, 9.9f, 44.0f, 12.25f);
        this.LIZJ.LJIILL(23.63f);
        this.LIZJ.LJIIJ(0.0f, 2.34f, -1.9f, 4.24f, -4.25f, 4.24f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(14.7f);
        this.LIZJ.LJIIL(-7.29f, 7.3f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 4.0f, 46.0f);
        this.LIZJ.LJIJ(12.25f);
        this.LIZJ.LJ(4.0f, 9.9f, 5.9f, 8.0f, 8.25f, 8.0f);
        this.LIZJ.LJIIJJI(31.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-8.93f, 16.52f);
        this.LIZJ.LJIIIZ(0.75f, 0.75f, false, false, -0.96f, 0.38f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, -0.07f, 0.13f);
        this.LIZJ.LJ(28.6f, 27.4f, 26.74f, 28.5f, 24.0f, 28.5f);
        this.LIZJ.LJIIJ(-2.73f, 0.0f, -4.58f, -1.09f, -5.78f, -3.46f);
        this.LIZJ.LJIIIZ(6.1f, 6.1f, false, true, -0.08f, -0.15f);
        this.LIZJ.LJIIIZ(0.75f, 0.75f, false, false, -0.96f, -0.37f);
        this.LIZJ.LJIIL(-2.34f, 0.95f);
        this.LIZJ.LJIIL(-0.04f, 0.02f);
        this.LIZJ.LJIIIZ(0.73f, 0.73f, false, false, -0.35f, 0.97f);
        this.LIZJ.LJIIL(0.15f, 0.3f);
        this.LIZJ.LJIIJ(1.88f, 3.76f, 5.1f, 5.74f, 9.4f, 5.74f);
        this.LIZJ.LJIIJ(4.4f, 0.0f, 7.68f, -2.08f, 9.54f, -6.03f);
        C32856Cuy.LJJJJLI(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(0.02f, -0.02f);
        this.LIZJ.LJIIIZ(0.74f, 0.74f, false, false, -0.41f, -0.97f);
        this.LIZJ.LJIIL(-2.33f, -0.94f);
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
