package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFF extends AbstractC39455Fe7 {
    public DFF() {
        this.LIZJ.LJIILIIL(9.08f, 25.82f);
        this.LIZJ.LJIIL(8.87f, -23.1f);
        this.LIZJ.LJIIJ(0.17f, -0.44f, 0.58f, -0.72f, 1.04f, -0.72f);
        this.LIZJ.LJIIJJI(14.9f);
        this.LIZJ.LJIIJ(0.8f, 0.0f, 1.34f, 0.84f, 1.0f, 1.58f);
        this.LIZJ.LJIIL(-5.52f, 12.2f);
        this.LIZJ.LJIIJ(-0.33f, 0.74f, 0.2f, 1.58f, 1.02f, 1.58f);
        C32856Cuy.p0(this.LIZJ);
        this.LIZJ.LJIIJ(0.9f, 0.0f, 1.43f, 1.04f, 0.89f, 1.78f);
        this.LIZJ.LJIIL(-19.44f, 26.4f);
        this.LIZJ.LJIIJ(-0.7f, 0.96f, -2.2f, 0.3f, -1.99f, -0.87f);
        this.LIZJ.LJIIL(3.02f, -16.0f);
        this.LIZJ.LJIIJ(0.13f, -0.7f, -0.4f, -1.33f, -1.1f, -1.33f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-8.16f);
        this.LIZJ.LJIIJ(-0.78f, 0.0f, -1.32f, -0.79f, -1.03f, -1.52f);
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
