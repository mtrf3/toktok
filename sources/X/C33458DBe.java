package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33458DBe extends AbstractC39455Fe7 {
    public C33458DBe() {
        this.LIZJ.LJIIIIZZ(31.07f, 18.79f);
        this.LIZJ.LJIIJ(3.0f, -3.17f, 7.22f, -5.14f, 11.88f, -5.14f);
        this.LIZJ.LJIIIZ(16.6f, 16.6f, false, true, 16.36f, 14.49f);
        this.LIZJ.LJIIL(0.1f, 0.73f);
        this.LIZJ.LJIIL(0.6f, 0.42f);
        this.LIZJ.LJIIJ(4.42f, 3.0f, 7.34f, 8.12f, 7.34f, 13.94f);
        this.LIZJ.LJIIJ(0.0f, 8.85f, -6.74f, 16.11f, -15.23f, 16.77f);
        this.LIZJ.LJI(18.49f);
        this.LIZJ.LJ(10.7f, 60.0f, 4.35f, 53.59f, 4.35f, 45.63f);
        this.LIZJ.LJIIJ(0.0f, -4.7f, 2.23f, -8.88f, 5.66f, -11.5f);
        this.LIZJ.LJIIL(0.65f, -0.5f);
        this.LIZJ.LJIILL(-0.81f);
        this.LIZJ.LJIIJ(0.0f, -9.58f, 9.72f, -16.69f, 18.67f, -13.61f);
        this.LIZJ.LJIIL(1.0f, 0.35f);
        this.LIZJ.LJIIL(0.74f, -0.77f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(11.88f, -8.44f);
        this.LIZJ.LJIIIZ(19.6f, 19.6f, false, false, -13.54f, 5.43f);
        this.LIZJ.LJ(18.79f, 12.84f, 7.9f, 21.01f, 7.38f, 32.01f);
        this.LIZJ.LJIIIZ(17.73f, 17.73f, false, false, -6.33f, 13.62f);
        this.LIZJ.LJIIJ(0.0f, 9.74f, 7.78f, 17.67f, 17.44f, 17.67f);
        this.LIZJ.LJI(52.3f);
        this.LIZJ.LJIIJ(10.29f, -0.76f, 18.35f, -9.5f, 18.35f, -20.07f);
        this.LIZJ.LJIIJ(0.0f, -6.68f, -3.23f, -12.6f, -8.18f, -16.25f);
        this.LIZJ.LJIIIZ(19.88f, 19.88f, false, false, -19.52f, -16.63f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-8.2f, 41.16f);
        this.LIZJ.LJIIJ(0.74f, 0.72f, 1.91f, 0.72f, 2.64f, 0.0f);
        this.LIZJ.LJIIL(9.43f, -9.33f);
        this.LIZJ.LJIIIZ(1.2f, 1.2f, false, false, 0.0f, -1.7f);
        this.LIZJ.LJIIL(-0.94f, -0.96f);
        this.LIZJ.LJIIIZ(1.2f, 1.2f, false, false, -1.7f, 0.0f);
        this.LIZJ.LJIIL(-6.23f, 6.16f);
        this.LIZJ.LJIJ(28.95f);
        this.LIZJ.LJIIJ(0.0f, -0.66f, -0.54f, -1.2f, -1.2f, -1.2f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(35.4f);
        this.LIZJ.LJIIJ(-0.66f, 0.0f, -1.2f, 0.54f, -1.2f, 1.2f);
        this.LIZJ.LJIILL(16.73f);
        this.LIZJ.LJIIL(-6.23f, -6.17f);
        this.LIZJ.LJIIIZ(1.2f, 1.2f, false, false, -1.7f, 0.01f);
        this.LIZJ.LJIIL(-0.94f, 0.96f);
        this.LIZJ.LJIIIZ(1.2f, 1.2f, false, false, 0.0f, 1.7f);
        this.LIZJ.LJIIL(9.43f, 9.33f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
