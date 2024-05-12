package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7X extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D7X() {
        this.LIZJ.LJIIIIZZ(34.4f, 15.33f);
        this.LIZJ.LJII(32.26f, 14.0f);
        C32856Cuy.jk(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Ph(dij);
        C32856Cuy.LJJIJIL(dij);
        dij.LJIIIZ(18.0f, 18.0f, true, true, -36.0f, 0.0f);
        dij.LJIIIZ(18.0f, 18.0f, false, true, 36.0f, 0.0f);
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
