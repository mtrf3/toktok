package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0J extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D0J() {
        C32856Cuy.e8(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(6.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.ol(this.LIZJ);
        C32856Cuy.LJJZ(this.LIZJ);
        C32856Cuy.V0(this.LIZJ);
        C32856Cuy.Dm(this.LIZJ);
        C32856Cuy.Rg(this.LIZJ);
        C32856Cuy.LJI(this.LIZJ);
        C32856Cuy.Oc(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(25.0f, 26.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, -5.0f);
        dij.LJIIJJI(9.0f);
        C32856Cuy.c2(dij);
        dij.LJIIJJI(-9.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        C32856Cuy.LLZZJLIL(dij);
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
