package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6K extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6K() {
        C32856Cuy.Bi(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(31.67f, 35.5f);
        dij.LJIIL(-4.38f, -4.38f);
        C32856Cuy.We(dij);
        dij.LJIIL(4.38f, 4.38f);
        dij.LJIIL(4.38f, -4.38f);
        C32856Cuy.oo(dij);
        dij.LJIIL(-4.38f, 4.38f);
        dij.LJIIL(4.38f, 4.38f);
        C32856Cuy.De(dij);
        dij.LJIIL(-4.38f, -4.38f);
        dij.LJIIL(-4.38f, 4.38f);
        C32856Cuy.Ji(dij);
        dij.LJIIL(4.38f, -4.38f);
        dij.LIZLLL();
        C32856Cuy.Rh(dij);
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
