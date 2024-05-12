package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33261D3p extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33261D3p() {
        this.LIZJ.LJIIIIZZ(28.1f, 32.98f);
        C32856Cuy.LLILLJJLI(this.LIZJ);
        this.LIZJ.LJIIIIZZ(34.2f, 27.35f);
        this.LIZJ.LJIIIZ(2.66f, 2.66f, true, true, 3.78f, -3.77f);
        this.LIZJ.LJIIIZ(2.66f, 2.66f, false, true, -3.77f, 3.77f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(21.53f, 1.9f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, 4.94f, 0.0f);
        dij.LJIIL(15.7f, 8.91f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, 2.53f, 4.35f);
        dij.LJIILL(17.68f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -2.53f, 4.35f);
        dij.LJIIL(-15.7f, 8.9f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -4.94f, 0.0f);
        dij.LJIIL(-15.7f, -8.9f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -2.53f, -4.35f);
        dij.LJIJ(15.16f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, 2.53f, -4.35f);
        I9A.LIZIZ(dij, 15.7f, -8.9f, 2.96f, 3.48f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.98f, 0.0f);
        dij.LJII(9.56f, 13.3f);
        dij.LJII(24.0f, 21.64f);
        dij.LJIIL(14.44f, -8.34f);
        dij.LJII(24.5f, 5.38f);
        dij.LIZLLL();
        dij.LJIIIIZZ(7.3f, 16.62f);
        dij.LJIILL(16.22f);
        dij.LJIIJ(0.0f, 0.36f, 0.2f, 0.7f, 0.5f, 0.87f);
        dij.LJII(22.0f, 41.76f);
        dij.LJIJ(25.1f);
        dij.LJII(7.3f, 16.62f);
        dij.LIZLLL();
        dij.LJIIIIZZ(26.0f, 25.1f);
        dij.LJIILL(16.67f);
        dij.LJIIL(14.2f, -8.06f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.5f, -0.87f);
        dij.LJIJ(16.6f);
        dij.LJII(26.0f, 25.11f);
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
