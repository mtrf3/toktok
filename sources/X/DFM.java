package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFM extends AbstractC39455Fe7 {
    public DFM() {
        this.LIZJ.LJIIIIZZ(14.4f, 14.43f);
        this.LIZJ.LJIIJ(0.34f, 0.34f, 0.89f, 0.33f, 1.25f, 0.02f);
        this.LIZJ.LIZJ(12.69f, 12.69f, false, true, 36.7f, 24.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-2.7f);
        this.LIZJ.LJIIIZ(0.87f, 0.87f, false, false, -0.62f, 1.5f);
        this.LIZJ.LJIIL(4.89f, 4.88f);
        this.LIZJ.LJIIJ(0.34f, 0.34f, 0.9f, 0.34f, 1.23f, 0.0f);
        this.LIZJ.LJIIL(4.9f, -4.89f);
        this.LIZJ.LJIIIZ(0.87f, 0.87f, false, false, -0.63f, -1.49f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-2.7f);
        this.LIZJ.LJIIIZ(17.06f, 17.06f, false, false, -28.51f, -12.65f);
        this.LIZJ.LJIIIZ(0.84f, 0.84f, false, false, -0.02f, 1.22f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(1.86f, 1.86f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 36.69f);
        this.LIZJ.LJIIJ(3.2f, 0.0f, 6.12f, -1.18f, 8.35f, -3.14f);
        this.LIZJ.LJIIIZ(0.92f, 0.92f, false, true, 1.26f, 0.02f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(1.86f, 1.86f);
        this.LIZJ.LJIIJ(0.34f, 0.34f, 0.34f, 0.9f, -0.02f, 1.22f);
        this.LIZJ.LIZJ(17.06f, 17.06f, false, true, 6.93f, 24.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-2.7f);
        this.LIZJ.LJIIIZ(0.87f, 0.87f, false, true, -0.61f, -1.5f);
        this.LIZJ.LJIIL(4.89f, -4.88f);
        this.LIZJ.LJIIIZ(0.88f, 0.88f, false, true, 1.23f, 0.0f);
        this.LIZJ.LJIIL(4.9f, 4.89f);
        this.LIZJ.LIZJ(0.87f, 0.87f, false, true, 14.0f, 24.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-2.7f);
        this.LIZJ.LJIIJ(0.0f, 7.0f, 5.68f, 12.69f, 12.69f, 12.69f);
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
