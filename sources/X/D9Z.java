package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9Z extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D9Z() {
        this.LIZJ.LJIILIIL(25.41f, 30.41f);
        this.LIZJ.LJIIL(9.3f, -9.29f);
        C32856Cuy.mc(this.LIZJ);
        this.LIZJ.LJII(24.0f, 26.17f);
        C32856Cuy.hj(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Sg(dij);
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
