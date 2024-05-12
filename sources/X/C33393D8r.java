package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33393D8r extends AbstractC39455Fe7 {
    public C33393D8r() {
        C32856Cuy.D4(this.LIZJ);
        this.LIZJ.LJIIJ(-0.64f, -1.25f, -0.8f, -2.8f, -0.85f, -5.3f);
        this.LIZJ.LJ(4.0f, 33.43f, 4.0f, 32.39f, 4.0f, 31.2f);
        DIK.LIZIZ(this.LIZJ, "p", 16.8f);
        this.LIZJ.LJIILIIL(5.25f, 13.35f);
        this.LIZJ.LJIIIZ(5.14f, 5.14f, false, false, -0.73f, 1.62f);
        this.LIZJ.LJIIIZ(9.7f, 9.7f, false, false, -0.11f, 2.58f);
        this.LIZJ.LJIIJ(0.01f, 0.58f, 0.04f, 1.17f, 0.08f, 1.75f);
        this.LIZJ.LJIIJ(0.1f, 1.06f, 0.24f, 1.4f, 0.3f, 1.53f);
        this.LIZJ.LJIIJ(0.35f, 0.68f, 0.9f, 1.23f, 1.58f, 1.58f);
        this.LIZJ.LJIIJ(0.13f, 0.06f, 0.47f, 0.2f, 1.53f, 0.3f);
        this.LIZJ.LJIIJ(1.12f, 0.09f, 2.59f, 0.09f, 4.9f, 0.09f);
        C32856Cuy.Ab(this.LIZJ);
        this.LIZJ.LJIIJ(0.59f, 0.0f, 0.88f, 0.0f, 1.26f, -0.16f);
        this.LIZJ.LJIIIZ(2.11f, 2.11f, false, false, 1.0f, -2.74f);
        this.LIZJ.LJIIJ(-0.19f, -0.37f, -0.43f, -0.57f, -0.92f, -0.99f);
        this.LIZJ.LJIIL(-12.5f, -10.54f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, -5.16f, 0.0f);
        this.LIZJ.LJIIL(-3.64f, 3.07f);
        this.LIZJ.LJIIJ(-1.07f, 0.9f, -1.6f, 1.35f, -1.99f, 1.9f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.5f, 9.75f);
        this.LIZJ.LJ(33.22f, 8.77f, 33.0f, 8.0f, 32.5f, 8.0f);
        this.LIZJ.LJIILJJIL(-0.72f, 0.77f, -1.0f, 1.75f, true);
        this.LIZJ.LJIIJ(-0.3f, 1.06f, -0.68f, 2.36f, -1.54f, 3.21f);
        this.LIZJ.LJIIJ(-0.85f, 0.86f, -2.15f, 1.24f, -3.2f, 1.54f);
        this.LIZJ.LJIIJ(-0.99f, 0.28f, -1.76f, 0.5f, -1.76f, 1.0f);
        this.LIZJ.LJIILJJIL(0.77f, 0.72f, 1.75f, 1.0f, true);
        this.LIZJ.LJIIJ(1.06f, 0.3f, 2.36f, 0.68f, 3.21f, 1.54f);
        this.LIZJ.LJIIJ(0.86f, 0.85f, 1.24f, 2.15f, 1.54f, 3.2f);
        this.LIZJ.LJIIJ(0.28f, 0.99f, 0.5f, 1.76f, 1.0f, 1.76f);
        this.LIZJ.LJIILJJIL(0.72f, -0.77f, 1.0f, -1.75f, true);
        this.LIZJ.LJIIJ(0.3f, -1.06f, 0.68f, -2.36f, 1.54f, -3.21f);
        this.LIZJ.LJIIJ(0.85f, -0.86f, 2.15f, -1.24f, 3.2f, -1.54f);
        this.LIZJ.LJIIJ(0.99f, -0.28f, 1.76f, -0.5f, 1.76f, -1.0f);
        this.LIZJ.LJIILJJIL(-0.77f, -0.72f, -1.75f, -1.0f, true);
        this.LIZJ.LJIIJ(-1.06f, -0.3f, -2.36f, -0.68f, -3.21f, -1.54f);
        this.LIZJ.LJIIJ(-0.86f, -0.85f, -1.24f, -2.15f, -1.54f, -3.2f);
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
