package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6X extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6X() {
        C32856Cuy.Xe(this.LIZJ);
        this.LIZJ.LJIIIIZZ(16.95f, 20.03f);
        C32856Cuy.LJJIZ(this.LIZJ);
        this.LIZJ.LJIIIIZZ(22.8f, 28.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-5.04f, 3.28f);
        p.LJIILL(-6.56f);
        this.LIZJ.LJII(22.79f, 28.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Nf(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
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
