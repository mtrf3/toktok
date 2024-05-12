package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DFI extends AbstractC39455Fe7 {
    public DFI() {
        C32856Cuy.Ph(this.LIZJ);
        this.LIZJ.LJIILIIL(-35.66f, -1.74f);
        this.LIZJ.LJIILL(3.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 0.6f, 0.5f, 1.1f, 1.1f, 1.1f);
        this.LIZJ.LJIIJJI(25.3f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.61f, 0.0f, 1.1f, -0.5f, 1.1f, -1.1f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-3.3f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, -0.61f, -0.49f, -1.1f, -1.1f, -1.1f);
        this.LIZJ.LJIIJJI(-25.3f);
        this.LIZJ.LJIIJ(-0.6f, 0.0f, -1.1f, 0.49f, -1.1f, 1.1f);
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
