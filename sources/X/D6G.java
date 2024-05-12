package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6G extends AbstractC39455Fe7 {
    public D6G() {
        this.LIZJ.LJIIIIZZ(8.8f, 42.0f);
        C32856Cuy.w7(this.LIZJ);
        this.LIZJ.LJIIIIZZ(12.0f, 14.0f);
        C32856Cuy.T3(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(12.0f);
        p.LIZLLL();
        p.LJIILIIL(-1.0f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(1.6f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.LLLZ(this.LIZJ);
        C32856Cuy.u9(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p3.LJIIJJI(-9.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p3.LIZLLL();
        this.LIZJ.LJIILIIL(27.08f, 5.07f);
        C32856Cuy.sm(this.LIZJ);
        this.LIZJ.LJII(25.0f, 28.76f);
        C32856Cuy.Lj(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
