package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDU extends AbstractC39455Fe7 {
    public DDU() {
        this.LIZJ.LJIILIIL(21.17f, 24.0f);
        this.LIZJ.LJIIL(-7.88f, -7.88f);
        C32856Cuy.We(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJII(24.0f, 21.17f);
        C32856Cuy.LJJJJ(this.LIZJ);
        C32856Cuy.xk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJII(26.83f, 24.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(7.88f, 7.88f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, 1.41f);
        p3.LJIIL(-1.42f, 1.42f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        this.LIZJ.LJII(24.0f, 26.83f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-7.88f, 7.88f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        p4.LJIIL(-1.42f, -1.42f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -1.41f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJII(21.17f, 24.0f);
        p5.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
