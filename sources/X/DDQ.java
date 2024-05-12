package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDQ extends AbstractC39455Fe7 {
    public DDQ() {
        this.LIZJ.LJIIIIZZ(3.0f, 12.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(24.0f);
        p.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, 5.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(32.0f);
        p2.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, -5.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(12.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(8.0f);
        p4.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(9.92f, 7.73f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.4f, -1.35f);
        this.LIZJ.LJIIL(0.96f, -1.76f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.36f, -0.4f);
        this.LIZJ.LJIIL(9.16f, 5.0f);
        this.LIZJ.LJIIL(9.16f, -5.0f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.36f, 0.4f);
        this.LIZJ.LJIIL(0.96f, 1.76f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.4f, 1.35f);
        this.LIZJ.LJIIL(-10.6f, 5.79f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.96f, 0.0f);
        this.LIZJ.LJIIL(-10.6f, -5.79f);
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
