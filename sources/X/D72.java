package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D72 extends AbstractC39455Fe7 {
    public D72() {
        C32856Cuy.S0(this.LIZJ);
        this.LIZJ.LJIIJ(2.96f, 0.0f, 5.6f, 0.58f, 7.87f, 1.65f);
        this.LIZJ.LJIIL(-3.07f, 3.06f);
        this.LIZJ.LJIIIZ(15.38f, 15.38f, false, false, -4.8f, -0.71f);
        C32856Cuy.Aj(this.LIZJ);
        this.LIZJ.LJIIIIZZ(35.7f, 42.88f);
        this.LIZJ.LJII(31.82f, 39.0f);
        C32856Cuy.Eh(this.LIZJ);
        this.LIZJ.LJI(31.82f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(3.88f, -3.88f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-1.41f, -1.42f);
        C32856Cuy.yk(this.LIZJ);
        C32856Cuy.Wi(this.LIZJ);
        C32856Cuy.Dk(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(1.41f, -1.42f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        p4.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
