package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9R extends AbstractC39455Fe7 {
    public D9R() {
        this.LIZJ.LJIIIIZZ(25.0f, 14.0f);
        C32856Cuy.w4(this.LIZJ);
        C32856Cuy.LJJIJIL(this.LIZJ);
        C32856Cuy.v3(this.LIZJ);
        this.LIZJ.LJIIIIZZ(44.0f, 19.0f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, true, true, -16.0f, 0.0f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, true, 16.0f, 0.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.LJJIJIL(this.LIZJ);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, true, false, -8.0f, 0.0f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 8.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(6.24f, 35.0f);
        this.LIZJ.LJIIIZ(13.75f, 13.75f, false, false, -2.21f, 7.0f);
        this.LIZJ.LJIIJ(-0.03f, 0.55f, -0.48f, 1.0f, -1.03f, 1.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(1.0f);
        this.LIZJ.LJIIJ(-0.55f, 0.0f, -1.0f, -0.45f, -0.98f, -1.0f);
        this.LIZJ.LJIIJ(0.14f, -2.92f, 0.91f, -6.39f, 2.94f, -9.29f);
        this.LIZJ.LJ(5.3f, 29.37f, 9.18f, 27.0f, 15.0f, 27.0f);
        this.LIZJ.LJIIJ(5.82f, 0.0f, 9.7f, 2.37f, 12.04f, 5.71f);
        this.LIZJ.LJIIJ(2.03f, 2.9f, 2.8f, 6.37f, 2.94f, 9.3f);
        this.LIZJ.LJIIJ(0.02f, 0.54f, -0.43f, 0.99f, -0.98f, 0.99f);
        C32856Cuy.LIZLLL(this.LIZJ);
        this.LIZJ.LJIIJ(-0.55f, 0.0f, -1.0f, -0.45f, -1.03f, -1.0f);
        this.LIZJ.LJIIIZ(13.75f, 13.75f, false, false, -2.2f, -7.0f);
        this.LIZJ.LJIIJ(-1.57f, -2.22f, -4.2f, -4.0f, -8.77f, -4.0f);
        this.LIZJ.LJIIJ(-4.58f, 0.0f, -7.2f, 1.78f, -8.76f, 4.0f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(36.0f, 34.0f);
        this.LIZJ.LJIIJ(-1.4f, 0.0f, -2.55f, 0.23f, -3.48f, 0.62f);
        this.LIZJ.LJIIIZ(19.33f, 19.33f, false, false, -1.8f, -3.59f);
        this.LIZJ.LIZJ(12.9f, 12.9f, false, true, 36.0f, 30.0f);
        this.LIZJ.LJIIJ(4.64f, 0.0f, 7.77f, 1.94f, 9.65f, 4.69f);
        this.LIZJ.LIZJ(14.52f, 14.52f, false, true, 47.97f, 42.0f);
        this.LIZJ.LJIIJ(0.03f, 0.55f, -0.42f, 1.0f, -0.97f, 1.0f);
        C32856Cuy.LIZLLL(this.LIZJ);
        this.LIZJ.LJIIJ(-0.55f, 0.0f, -1.0f, -0.45f, -1.04f, -1.0f);
        this.LIZJ.LJIIJ(-0.13f, -1.74f, -0.61f, -3.59f, -1.61f, -5.05f);
        this.LIZJ.LJ(41.23f, 35.32f, 39.36f, 34.0f, 36.0f, 34.0f);
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
