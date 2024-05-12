package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DA9 extends AbstractC39455Fe7 {
    public DA9() {
        C32856Cuy.ue(this.LIZJ);
        this.LIZJ.LJIILIIL(10.4f, 12.64f);
        this.LIZJ.LJIIJ(0.0f, 0.52f, -0.41f, 0.93f, -0.93f, 0.93f);
        C32856Cuy.Ea(this.LIZJ);
        C32856Cuy.w9(this.LIZJ);
        C32856Cuy.Vc(this.LIZJ);
        C32856Cuy.Y0(this.LIZJ);
        C32856Cuy.rn(this.LIZJ);
        this.LIZJ.LJIILJJIL(-3.64f, 0.6f, -3.64f, 2.24f, true);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(6.95f, 13.19f);
        this.LIZJ.LJIIJ(0.0f, 1.56f, -0.96f, 2.83f, -3.35f, 2.83f);
        this.LIZJ.LJIIJ(-2.4f, 0.0f, -3.36f, -1.27f, -3.36f, -2.83f);
        this.LIZJ.LJIILLIIL(21.6f, 27.0f, 24.0f, 27.0f, true);
        this.LIZJ.LJIILJJIL(3.35f, 1.27f, 3.35f, 2.83f, true);
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
