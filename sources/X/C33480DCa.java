package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33480DCa extends AbstractC39455Fe7 {
    public C33480DCa() {
        this.LIZJ.LJIIIIZZ(22.62f, 2.34f);
        C32856Cuy.e7(this.LIZJ);
        C32856Cuy.LJJJJJ(this.LIZJ);
        this.LIZJ.LJIIJ(-0.88f, -0.76f, -1.7f, -1.4f, -2.42f, -1.86f);
        this.LIZJ.LJIIJ(-0.35f, -0.23f, -0.7f, -0.44f, -1.05f, -0.6f);
        this.LIZJ.LJIIJ(-0.29f, -0.13f, -0.8f, -0.34f, -1.38f, -0.34f);
        this.LIZJ.LJIIJ(-0.58f, 0.0f, -1.09f, 0.2f, -1.38f, 0.34f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(11.76f, 21.3f);
        this.LIZJ.LJIIJ(0.45f, 0.38f, 0.5f, 1.05f, 0.12f, 1.5f);
        this.LIZJ.LJIIL(-5.7f, 6.66f);
        this.LIZJ.LJIIIZ(2.13f, 2.13f, false, true, -3.07f, 0.18f);
        this.LIZJ.LJIIL(-4.83f, -4.43f);
        this.LIZJ.LJIIL(-4.24f, 4.59f);
        this.LIZJ.LJIIJ(-0.4f, 0.43f, -1.07f, 0.46f, -1.5f, 0.06f);
        this.LIZJ.LJIIL(-1.57f, -1.45f);
        this.LIZJ.LJIIIZ(1.07f, 1.07f, false, true, -0.06f, -1.5f);
        this.LIZJ.LJIIL(5.67f, -6.16f);
        this.LIZJ.LJIIJ(0.8f, -0.86f, 2.15f, -0.92f, 3.01f, -0.12f);
        this.LIZJ.LJII(27.0f, 27.34f);
        this.LIZJ.LJIIL(4.27f, -4.98f);
        this.LIZJ.LJIIJ(0.38f, -0.45f, 1.06f, -0.5f, 1.5f, -0.11f);
        this.LIZJ.LJIIL(1.62f, 1.38f);
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
