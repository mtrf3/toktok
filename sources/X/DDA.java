package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DDA extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public DDA() {
        C32856Cuy.Wa(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(15.53f, 23.47f);
        C32856Cuy.ri(dij);
        dij.LJIIIIZZ(31.53f, 23.47f);
        C32856Cuy.ri(dij);
        dij.LJIIIIZZ(19.53f, 23.47f);
        C32856Cuy.ri(dij);
        dij.LJIIIIZZ(35.53f, 23.47f);
        C32856Cuy.ri(dij);
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
