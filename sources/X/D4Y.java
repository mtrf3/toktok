package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D4Y extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D4Y() {
        C32856Cuy.p(this.LIZJ);
        C32856Cuy.LJJLIIIJJIZ(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-13.0f);
        p.LIZLLL();
        p.LJIIIIZZ(24.0f, 30.0f);
        C32856Cuy.Sm(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.kl(dij);
        dij.LJIILIIL(0.0f, -2.0f);
        dij.LJIIIZ(16.0f, 16.0f, true, false, 0.0f, -32.0f);
        dij.LJIIIZ(16.0f, 16.0f, false, false, 0.0f, 32.0f);
        dij.LIZLLL();
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
