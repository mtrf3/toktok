package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0X extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0X() {
        this.LIZJ.LJIIIIZZ(29.5f, 22.0f);
        C32856Cuy.P2(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(11.0f, 6.0f);
        C32856Cuy.Um(dij);
        C32856Cuy.LJJI(dij);
        C32856Cuy.ni(dij);
        C32856Cuy.i9(dij);
        dij.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        dij.LJI(11.0f);
        dij.LIZLLL();
        dij.LJIILIIL(26.0f, 4.0f);
        C32856Cuy.An(dij);
        dij.LJIILL(25.8f);
        dij.LJII(19.83f, 23.09f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -5.23f, 0.35f);
        dij.LJII(10.0f, 28.01f);
        C32856Cuy.Sc(dij);
        C32856Cuy.LJJI(dij);
        dij.LIZLLL();
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
