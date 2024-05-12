package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33340D6q extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33340D6q() {
        C32856Cuy.Bi(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(42.82f, 27.58f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.24f, 1.39f);
        dij.LJII(33.86f, 42.0f);
        dij.LJIIIZ(2.15f, 2.15f, false, true, -3.37f, 0.17f);
        dij.LJIIL(-5.34f, -6.1f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.1f, -1.41f);
        dij.LJIIL(1.5f, -1.32f);
        C32856Cuy.qk(dij);
        dij.LJIIL(3.79f, 4.33f);
        dij.LJIIL(7.84f, -11.1f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.4f, -0.25f);
        dij.LJIIL(1.63f, 1.16f);
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
