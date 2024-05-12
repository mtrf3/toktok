package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33222D2c extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33222D2c() {
        this.LIZJ.LJIIIIZZ(17.9f, 24.5f);
        this.LIZJ.LJIIIZ(6.1f, 6.1f, true, false, 12.2f, 0.0f);
        this.LIZJ.LJIIIZ(6.1f, 6.1f, false, false, -12.2f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Ee(dij);
        dij.LJIIL(-1.53f, 0.16f);
        dij.LJIIJ(-0.97f, 0.1f, -1.79f, 0.18f, -2.45f, 0.3f);
        dij.LJIIJ(-0.7f, 0.12f, -1.34f, 0.3f, -1.94f, 0.67f);
        dij.LJIIIZ(5.5f, 5.5f, false, false, -2.14f, 2.36f);
        dij.LJIIJ(-0.3f, 0.64f, -0.42f, 1.3f, -0.48f, 2.0f);
        dij.LJIIJ(-0.05f, 0.67f, -0.05f, 1.49f, -0.05f, 2.46f);
        dij.LJIILL(15.93f);
        dij.LJIIJ(0.0f, 1.07f, 0.0f, 1.96f, 0.06f, 2.69f);
        dij.LJIIJ(0.06f, 0.76f, 0.2f, 1.47f, 0.54f, 2.15f);
        dij.LJIIIZ(5.5f, 5.5f, false, false, 2.4f, 2.4f);
        dij.LJIIJ(0.68f, 0.34f, 1.4f, 0.48f, 2.15f, 0.54f);
        dij.LJIIJ(0.73f, 0.06f, 1.62f, 0.06f, 2.69f, 0.06f);
        dij.LJIIJJI(27.32f);
        dij.LJIIJ(1.07f, 0.0f, 1.96f, 0.0f, 2.69f, -0.06f);
        dij.LJIIJ(0.76f, -0.06f, 1.47f, -0.2f, 2.15f, -0.54f);
        dij.LJIIIZ(5.5f, 5.5f, false, false, 2.4f, -2.4f);
        dij.LJIIJ(0.34f, -0.68f, 0.48f, -1.4f, 0.54f, -2.15f);
        dij.LJIIJ(0.06f, -0.73f, 0.06f, -1.62f, 0.06f, -2.69f);
        dij.LJIJ(17.73f);
        dij.LJIIJ(0.0f, -0.97f, 0.0f, -1.79f, -0.05f, -2.46f);
        dij.LJIIIZ(5.59f, 5.59f, false, false, -0.48f, -2.0f);
        dij.LJIIIZ(5.5f, 5.5f, false, false, -2.14f, -2.36f);
        dij.LJIIIZ(5.59f, 5.59f, false, false, -1.94f, -0.68f);
        dij.LJIIJ(-0.66f, -0.12f, -1.48f, -0.2f, -2.45f, -0.3f);
        dij.LJIIL(-1.54f, -0.15f);
        C32856Cuy.v7(dij);
        dij.LJIILIIL(19.85f, 12.0f);
        C32856Cuy.rh(dij);
        dij.LJIIIIZZ(24.0f, 13.6f);
        dij.LJIIIZ(10.9f, 10.9f, true, true, 0.0f, 21.8f);
        dij.LJIIIZ(10.9f, 10.9f, false, true, 0.0f, -21.8f);
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
