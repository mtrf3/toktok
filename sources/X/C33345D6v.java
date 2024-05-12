package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33345D6v extends AbstractC39455Fe7 {
    public C33345D6v() {
        this.LIZJ.LJIIIIZZ(45.0f, 6.15f);
        C32856Cuy.LJJJLL(this.LIZJ);
        this.LIZJ.LJ(45.0f, 3.47f, 44.53f, 3.0f, 43.95f, 3.0f);
        this.LIZJ.LJI(4.05f);
        this.LIZJ.LJ(3.47f, 3.0f, 3.0f, 3.47f, 3.0f, 4.05f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(2.1f);
        this.LIZJ.LJIIJ(0.0f, 0.58f, 0.47f, 1.05f, 1.05f, 1.05f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(2.1f);
        this.LIZJ.LJIILL(22.03f);
        this.LIZJ.LJIIJ(0.0f, 2.0f, 0.96f, 3.9f, 2.57f, 5.08f);
        this.LIZJ.LJIIL(11.55f, 8.47f);
        this.LIZJ.LJIIIZ(6.3f, 6.3f, false, false, 7.46f, 0.0f);
        this.LIZJ.LJIIL(11.55f, -8.47f);
        this.LIZJ.LJIIIZ(6.3f, 6.3f, false, false, 2.57f, -5.08f);
        this.LIZJ.LJIJ(7.2f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(2.1f);
        this.LIZJ.LJIIJ(0.58f, 0.0f, 1.05f, -0.47f, 1.05f, -1.05f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-22.73f, 8.41f);
        this.LIZJ.LJIIIZ(1.95f, 1.95f, false, true, 3.46f, -0.02f);
        this.LIZJ.LJIIL(1.62f, 3.06f);
        this.LIZJ.LJIIL(3.29f, 0.72f);
        this.LIZJ.LJIIIZ(1.95f, 1.95f, false, true, 1.08f, 3.15f);
        this.LIZJ.LJIIL(-2.4f, 2.86f);
        this.LIZJ.LJIIL(0.51f, 3.76f);
        this.LIZJ.LJIIIZ(1.95f, 1.95f, false, true, -2.85f, 1.98f);
        this.LIZJ.LJII(24.0f, 28.47f);
        this.LIZJ.LJIIL(-2.98f, 1.6f);
        this.LIZJ.LJIIJ(-1.4f, 0.75f, -3.07f, -0.4f, -2.86f, -1.98f);
        this.LIZJ.LJIIL(0.5f, -3.76f);
        this.LIZJ.LJIIL(-2.38f, -2.85f);
        this.LIZJ.LJIIIZ(1.95f, 1.95f, false, true, 1.08f, -3.16f);
        this.LIZJ.LJIIL(3.36f, -0.72f);
        this.LIZJ.LJIIL(1.55f, -3.04f);
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
