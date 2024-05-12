package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33308D5k extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33308D5k() {
        C32856Cuy.LLJJL(this.LIZJ);
        this.LIZJ.LJIIL(18.2f, 7.85f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 3.21f, -0.02f);
        this.LIZJ.LJIIL(14.89f, -6.6f);
        C32856Cuy.LLLL(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(7.0f, 22.52f);
        dij.LJIILL(9.76f);
        dij.LJIIIZ(5.0f, 5.0f, false, false, 3.28f, 4.7f);
        dij.LJIIL(12.15f, 4.45f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 3.08f, -0.14f);
        dij.LJIIL(8.9f, -4.2f);
        dij.LJIIIZ(5.0f, 5.0f, false, false, 2.88f, -4.52f);
        C32856Cuy.w9(dij);
        dij.LJIIL(-11.66f, 5.16f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -3.2f, 0.02f);
        dij.LJII(7.0f, 22.52f);
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
