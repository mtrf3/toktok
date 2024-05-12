package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DFe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33562DFe extends AbstractC39455Fe7 {
    public C33562DFe() {
        this.LIZJ.LJIILIIL(4.4f, 21.92f);
        this.LIZJ.LJIIL(23.22f, -9.55f);
        this.LIZJ.LJIIJ(2.3f, -1.0f, 10.07f, -4.19f, 10.07f, -4.19f);
        this.LIZJ.LJIILJJIL(3.6f, -1.39f, 3.3f, 2.0f, true);
        this.LIZJ.LJIIJ(-0.1f, 1.39f, -0.9f, 6.27f, -1.7f, 11.54f);
        this.LIZJ.LJIIL(-2.5f, 15.63f);
        this.LIZJ.LJIILJJIL(-0.2f, 2.3f, -1.89f, 2.7f, false);
        this.LIZJ.LJIIJ(-1.7f, 0.4f, -4.49f, -1.4f, -4.98f, -1.8f);
        this.LIZJ.LJIIJ(-0.4f, -0.3f, -7.48f, -4.78f, -10.07f, -6.97f);
        this.LIZJ.LJIIJ(-0.7f, -0.6f, -1.5f, -1.79f, 0.1f, -3.18f);
        this.LIZJ.LJIIIZ(380.7f, 380.7f, false, false, 10.46f, -9.96f);
        this.LIZJ.LJIIJ(1.2f, -1.2f, 2.4f, -3.98f, -2.59f, -0.6f);
        this.LIZJ.LJII(13.76f, 27.0f);
        this.LIZJ.LJIILJJIL(-1.6f, 1.0f, -4.58f, 0.1f, false);
        this.LIZJ.LJIIJ(-3.0f, -0.9f, -6.48f, -2.1f, -6.48f, -2.1f);
        this.LIZJ.LJIILJJIL(-2.4f, -1.48f, 1.7f, -3.08f, true);
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
