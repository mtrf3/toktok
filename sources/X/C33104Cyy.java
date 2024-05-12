package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33104Cyy extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33104Cyy() {
        this.LIZJ.LJIIIIZZ(31.0f, 13.0f);
        C32856Cuy.Id(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Da(dij);
        dij.LJIIIIZZ(31.2f, 8.0f);
        dij.LJIIJ(2.3f, 0.0f, 3.8f, 0.0f, 4.93f, 0.1f);
        dij.LJIIJ(1.09f, 0.08f, 1.49f, 0.24f, 1.69f, 0.34f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 1.74f, 1.74f);
        dij.LJIIJ(0.1f, 0.2f, 0.26f, 0.6f, 0.34f, 1.7f);
        dij.LJIIJ(0.1f, 1.12f, 0.1f, 2.61f, 0.1f, 4.92f);
        dij.LJIILL(14.4f);
        dij.LJIIJ(0.0f, 2.3f, 0.0f, 3.8f, -0.1f, 4.93f);
        dij.LJIIIZ(4.56f, 4.56f, false, true, -0.34f, 1.69f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -1.74f, 1.74f);
        dij.LJIIJ(-0.2f, 0.1f, -0.6f, 0.26f, -1.7f, 0.34f);
        dij.LJIIJ(-0.45f, 0.04f, -0.96f, 0.06f, -1.56f, 0.08f);
        dij.LJII(21.75f, 26.57f);
        dij.LJIIJ(-0.74f, -0.78f, -1.38f, -1.45f, -1.95f, -1.95f);
        dij.LJIIIZ(6.12f, 6.12f, false, false, -2.07f, -1.3f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -3.75f, -0.04f);
        dij.LJIIJ(-0.83f, 0.25f, -1.5f, 0.71f, -2.11f, 1.23f);
        dij.LJIIJ(-0.58f, 0.5f, -1.24f, 1.14f, -2.0f, 1.9f);
        dij.LJII(8.0f, 28.26f);
        dij.LJIJ(16.8f);
        dij.LJIIJ(0.0f, -2.3f, 0.0f, -3.8f, 0.1f, -4.93f);
        dij.LJIIJ(0.08f, -1.09f, 0.24f, -1.49f, 0.34f, -1.69f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 1.74f, -1.74f);
        dij.LJIIJ(0.2f, -0.1f, 0.6f, -0.26f, 1.7f, -0.34f);
        dij.LJ(13.0f, 8.0f, 14.48f, 8.0f, 16.8f, 8.0f);
        C32856Cuy.Ab(dij);
        dij.LIZLLL();
        dij.LJIILIIL(-2.15f, 32.0f);
        dij.LJI(16.8f);
        dij.LJIIJ(-2.3f, 0.0f, -3.8f, 0.0f, -4.93f, -0.1f);
        dij.LJIIIZ(4.56f, 4.56f, false, true, -1.69f, -0.34f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -1.74f, -1.74f);
        dij.LJIIJ(-0.1f, -0.2f, -0.26f, -0.6f, -0.34f, -1.7f);
        dij.LIZJ(33.3f, 33.3f, false, true, 8.0f, 33.89f);
        dij.LJIIL(4.62f, -4.58f);
        C32856Cuy.dc(dij);
        dij.LJII(29.05f, 40.0f);
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
