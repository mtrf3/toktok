package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DEx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33555DEx extends AbstractC39455Fe7 {
    public C33555DEx() {
        this.LIZJ.LJIIIIZZ(30.93f, 7.71f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.83f, 0.15f);
        this.LIZJ.LJII(8.0f, 30.2f);
        this.LIZJ.LJIIIZ(6.38f, 6.38f, true, false, 9.48f, 8.54f);
        this.LIZJ.LJII(37.58f, 16.4f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -0.15f, -2.83f);
        this.LIZJ.LJIIL(-6.5f, -5.86f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.2f, 4.31f);
        this.LIZJ.LJIIL(3.54f, 3.19f);
        this.LIZJ.LJIIL(-5.8f, 6.45f);
        this.LIZJ.LJIIL(-3.54f, -3.19f);
        this.LIZJ.LJIIL(5.8f, -6.45f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.1f, 12.88f);
        this.LIZJ.LJIIL(-1.58f, -0.62f);
        this.LIZJ.LJIIIZ(0.25f, 0.25f, false, true, 0.0f, -0.46f);
        this.LIZJ.LJIIL(1.58f, -0.63f);
        this.LIZJ.LJIIL(0.62f, -1.58f);
        this.LIZJ.LJIIIZ(0.25f, 0.25f, false, true, 0.47f, 0.0f);
        this.LIZJ.LJIIL(0.62f, 1.58f);
        this.LIZJ.LJIIL(1.58f, 0.63f);
        this.LIZJ.LJIIJ(0.2f, 0.08f, 0.2f, 0.38f, 0.0f, 0.46f);
        this.LIZJ.LJIIL(-1.58f, 0.62f);
        this.LIZJ.LJIIL(-0.62f, 1.58f);
        this.LIZJ.LJIIIZ(0.25f, 0.25f, false, true, -0.47f, 0.0f);
        this.LIZJ.LJIIL(-0.62f, -1.58f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.63f, 25.97f);
        this.LIZJ.LJIIL(2.07f, 0.82f);
        this.LIZJ.LJIIL(0.82f, 2.07f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, false, 0.93f, 0.0f);
        this.LIZJ.LJIIL(0.82f, -2.07f);
        this.LIZJ.LJIIL(2.07f, -0.82f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, false, 0.0f, -0.93f);
        this.LIZJ.LJIIL(-2.07f, -0.82f);
        this.LIZJ.LJIIL(-0.82f, -2.07f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, false, -0.93f, 0.0f);
        this.LIZJ.LJIIL(-0.82f, 2.07f);
        this.LIZJ.LJIIL(-2.07f, 0.82f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(0.5f, 0.5f, false, false, 0.0f, 0.93f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.12f, 33.43f);
        this.LIZJ.LJIIL(1.58f, 0.62f);
        this.LIZJ.LJIIL(0.62f, 1.58f);
        this.LIZJ.LJIIJ(0.09f, 0.2f, 0.39f, 0.2f, 0.47f, 0.0f);
        this.LIZJ.LJIIL(0.62f, -1.58f);
        this.LIZJ.LJIIL(1.58f, -0.62f);
        this.LIZJ.LJIIIZ(0.25f, 0.25f, false, false, 0.0f, -0.47f);
        this.LIZJ.LJIIL(-1.58f, -0.62f);
        this.LIZJ.LJIIL(-0.62f, -1.58f);
        this.LIZJ.LJIIIZ(0.25f, 0.25f, false, false, -0.47f, 0.0f);
        this.LIZJ.LJIIL(-0.62f, 1.58f);
        this.LIZJ.LJIIL(-1.58f, 0.62f);
        this.LIZJ.LJIIIZ(0.25f, 0.25f, false, false, 0.0f, 0.47f);
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
