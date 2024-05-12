package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DCJ extends AbstractC39455Fe7 {
    public DCJ() {
        C32856Cuy.Ci(this.LIZJ);
        this.LIZJ.LJIILIIL(-2.12f, -32.7f);
        this.LIZJ.LJIIL(-9.3f, 9.29f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, 2.82f);
        p.LJIIL(9.3f, 9.3f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.41f, 0.0f);
        p.LJIIL(1.42f, -1.42f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        this.LIZJ.LJII(18.83f, 26.0f);
        C32856Cuy.M6(this.LIZJ);
        C32856Cuy.xa(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(18.83f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(5.88f, -5.88f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        p3.LJIIL(-1.42f, -1.42f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, 0.0f);
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
