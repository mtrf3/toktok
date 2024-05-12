package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DEB extends AbstractC39455Fe7 {
    public DEB() {
        C32856Cuy.s5(this.LIZJ);
        this.LIZJ.LJIILIIL(-2.01f, 2.25f);
        this.LIZJ.LJIIL(0.03f, 0.04f);
        this.LIZJ.LJIIL(0.92f, 0.91f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.5f, 1.5f, false, false, 2.12f, 0.0f);
        this.LIZJ.LJIIL(0.92f, -0.91f);
        this.LIZJ.LJIIL(0.03f, -0.04f);
        this.LIZJ.LJIIJ(3.25f, -3.78f, 8.11f, -3.78f, 11.17f, -0.75f);
        this.LIZJ.LJIIIZ(7.82f, 7.82f, false, true, 0.0f, 11.12f);
        this.LIZJ.LJII(24.0f, 37.89f);
        this.LIZJ.LJII(10.82f, 24.8f);
        this.LIZJ.LJIIIZ(7.82f, 7.82f, false, true, 0.0f, -11.12f);
        this.LIZJ.LJIIJ(3.06f, -3.03f, 7.92f, -3.03f, 11.17f, 0.75f);
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
