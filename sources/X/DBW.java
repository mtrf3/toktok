package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBW extends AbstractC39455Fe7 {
    public DBW() {
        this.LIZJ.LJIILIIL(36.2f, 48.79f);
        this.LIZJ.LJIIL(24.9f, 18.36f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(7.67f);
        this.LIZJ.LJIIJ(0.0f, -1.31f, -0.4f, -2.16f, -0.89f, -2.65f);
        this.LIZJ.LJIIJ(-0.46f, -0.48f, -1.25f, -0.9f, -2.56f, -0.9f);
        this.LIZJ.LJI(14.76f);
        this.LIZJ.LJIIJ(-1.31f, 0.0f, -2.1f, 0.42f, -2.56f, 0.9f);
        this.LIZJ.LJIIJ(-0.48f, 0.5f, -0.89f, 1.34f, -0.89f, 2.65f);
        this.LIZJ.LJIILL(59.48f);
        this.LIZJ.LJIIL(24.9f, -18.36f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(0.0f, 3.83f);
        this.LIZJ.LJIIL(-24.26f, 17.9f);
        this.LIZJ.LJIIIZ(2.33f, 2.33f, false, true, -3.71f, -1.88f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(7.67f);
        this.LIZJ.LJIIJ(0.0f, -3.93f, 2.48f, -6.64f, 6.53f, -6.64f);
        this.LIZJ.LJIIJJI(42.89f);
        this.LIZJ.LJIIJ(4.05f, 0.0f, 6.53f, 2.71f, 6.53f, 6.64f);
        this.LIZJ.LJIILL(60.97f);
        this.LIZJ.LJIIIZ(2.33f, 2.33f, false, true, -3.71f, 1.88f);
        this.LIZJ.LJII(36.2f, 52.62f);
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
