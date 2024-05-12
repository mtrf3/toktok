package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33384D8i extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33384D8i() {
        C32856Cuy.M(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(16.9f, 12.94f);
        dij.LJIIL(8.8f, 15.22f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.86f, -0.5f);
        dij.LJIIL(-2.29f, -3.96f);
        dij.LJIIIZ(2.0f, 2.0f, true, true, 3.47f, -2.0f);
        dij.LJIIL(2.78f, 4.82f);
        dij.LJIIIZ(0.5f, 0.5f, true, false, 0.87f, -0.5f);
        dij.LJII(30.1f, 23.8f);
        dij.LJIIIZ(2.0f, 2.0f, true, true, 3.47f, -2.0f);
        dij.LJIIL(1.78f, 3.09f);
        dij.LJIIIZ(0.5f, 0.5f, false, false, 0.87f, -0.5f);
        dij.LJIIL(-0.52f, -0.9f);
        dij.LJIIIZ(0.95f, 0.95f, false, true, 0.77f, -1.42f);
        dij.LJIIJ(1.8f, -0.1f, 3.5f, 0.8f, 4.4f, 2.37f);
        dij.LJIIL(3.28f, 5.68f);
        dij.LJIIIZ(10.0f, 10.0f, false, true, -3.66f, 13.66f);
        dij.LJIIL(-2.73f, 1.58f);
        dij.LJIIIZ(10.0f, 10.0f, false, true, -9.43f, 0.3f);
        dij.LJIIL(-16.24f, -8.87f);
        dij.LJIIIZ(2.37f, 2.37f, false, true, 1.66f, -4.42f);
        dij.LJIIL(8.1f, 3.05f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 1.03f, 0.88f);
        dij.LJIIL(0.77f, 1.32f);
        dij.LJIIIZ(0.75f, 0.75f, true, false, 1.3f, -0.75f);
        dij.LJIIL(-1.53f, -2.66f);
        dij.LJIIL(-0.02f, -0.01f);
        dij.LJIIL(-10.82f, -18.76f);
        dij.LJIIIZ(2.5f, 2.5f, true, true, 4.33f, -2.5f);
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
