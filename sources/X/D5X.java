package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5X extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5X() {
        this.LIZJ.LJIILIIL(17.78f, 17.93f);
        this.LIZJ.LJIIL(-2.7f, 8.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(5.4f);
        p.LJIIL(-2.7f, -8.3f);
        p.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Da(dij);
        dij.LJIILIIL(14.64f, 6.13f);
        C32856Cuy.K8(dij);
        dij.LJIILIIL(9.44f, 18.4f);
        dij.LJIIL(-1.21f, -3.72f);
        dij.LJIIL(-3.66f, -11.23f);
        dij.LJIIL(-0.98f, -2.76f);
        C32856Cuy.wo(dij);
        dij.LJIILIIL(5.09f, -3.72f);
        dij.LJIIL(1.21f, 3.72f);
        C32856Cuy.Le(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
