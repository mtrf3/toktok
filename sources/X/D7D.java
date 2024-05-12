package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7D extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D7D() {
        C32856Cuy.Gc(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(25.0f, 33.5f);
        C32856Cuy.a1(dij);
        C32856Cuy.H3(dij);
        C32856Cuy.LJLILLLLZI(dij);
        C32856Cuy.Zn(dij);
        dij.LIZLLL();
        dij.LJIIIIZZ(26.0f, 16.0f);
        C32856Cuy.LLLZI(dij);
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
