package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DDv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33527DDv extends AbstractC39455Fe7 {
    public C33527DDv() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 3.0f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, 18.0f, 17.99f);
        this.LIZJ.LJIIJ(0.0f, 2.71f, -1.13f, 5.55f, -2.63f, 8.15f);
        this.LIZJ.LJIIIZ(47.46f, 47.46f, false, true, -5.52f, 7.5f);
        this.LIZJ.LJIIJ(-2.01f, 2.27f, -4.05f, 4.25f, -5.66f, 5.68f);
        this.LIZJ.LJIIJ(-0.8f, 0.71f, -1.52f, 1.3f, -2.08f, 1.72f);
        this.LIZJ.LJIIIZ(9.76f, 9.76f, false, true, -1.22f, 0.77f);
        this.LIZJ.LJIIJ(-0.1f, 0.04f, -0.45f, 0.19f, -0.89f, 0.19f);
        this.LIZJ.LJIILJJIL(-0.78f, -0.15f, -0.88f, -0.2f, true);
        this.LIZJ.LJIIJ(-0.17f, -0.06f, -0.31f, -0.15f, -0.43f, -0.22f);
        this.LIZJ.LJIIIZ(9.77f, 9.77f, false, true, -0.8f, -0.54f);
        this.LIZJ.LJIIIZ(33.24f, 33.24f, false, true, -2.08f, -1.72f);
        this.LIZJ.LJIIIZ(67.46f, 67.46f, false, true, -5.66f, -5.68f);
        this.LIZJ.LJIIJ(-2.0f, -2.27f, -4.0f, -4.86f, -5.52f, -7.5f);
        this.LIZJ.LJ(7.13f, 26.54f, 6.0f, 23.7f, 6.0f, 21.0f);
        this.LIZJ.LIZJ(18.0f, 18.0f, false, true, 24.0f, 3.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, 22.9f);
        this.LIZJ.LJIIJ(3.66f, 0.0f, 6.63f, -2.98f, 6.63f, -6.67f);
        this.LIZJ.LIZJ(6.66f, 6.66f, false, false, 24.0f, 12.55f);
        this.LIZJ.LJIIJ(-3.66f, 0.0f, -6.63f, 2.99f, -6.63f, 6.68f);
        this.LIZJ.LIZJ(6.66f, 6.66f, false, false, 24.0f, 25.9f);
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
