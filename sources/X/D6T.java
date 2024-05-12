package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6T extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6T() {
        C32856Cuy.Vd(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(37.43f, 37.44f);
        this.LIZJ.LJIIIZ(1.04f, 1.04f, false, true, -0.02f, -1.44f);
        this.LIZJ.LJIIIZ(18.17f, 18.17f, false, false, 0.0f, -24.0f);
        this.LIZJ.LJIIIZ(1.04f, 1.04f, false, true, 0.02f, -1.43f);
        C32856Cuy.t(this.LIZJ);
        this.LIZJ.LJIIIZ(0.97f, 0.97f, false, true, 1.4f, 0.02f);
        this.LIZJ.LJIIIZ(22.2f, 22.2f, false, true, 0.0f, 29.66f);
        this.LIZJ.LJIIJ(-0.38f, 0.41f, -1.01f, 0.41f, -1.4f, 0.02f);
        Q7L.LIZLLL(this.LIZJ, "p", -1.42f, -1.41f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.xh(dij);
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
