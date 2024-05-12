package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDM extends AbstractC39455Fe7 {
    public DDM() {
        C32856Cuy.ka(this.LIZJ);
        this.LIZJ.LJIILIIL(8.35f, 7.43f);
        this.LIZJ.LJIIL(-8.21f, 8.67f);
        this.LIZJ.LJIIJ(-0.6f, 0.64f, -0.6f, 1.65f, 0.03f, 2.27f);
        this.LIZJ.LJIIL(8.2f, 8.13f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, false, 1.37f, -0.58f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-4.42f);
        this.LIZJ.LJIILJJIL(6.02f, -0.81f, 9.12f, 2.3f, false);
        this.LIZJ.LJIIJ(0.32f, 0.33f, 1.33f, 0.33f, 1.33f, -1.28f);
        this.LIZJ.LJIIJ(0.0f, -5.41f, -4.98f, -10.34f, -10.45f, -10.22f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-4.31f);
        this.LIZJ.LJIIIZ(0.8f, 0.8f, false, false, -1.39f, -0.56f);
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
