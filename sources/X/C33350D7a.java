package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33350D7a extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33350D7a() {
        this.LIZJ.LJIIIIZZ(30.0f, 24.7f);
        C32856Cuy.Im(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(18.63f, 3.7f);
        dij.LJIIJ(-2.04f, 0.21f, -3.6f, 1.87f, -4.21f, 3.83f);
        dij.LJIIJ(-0.19f, 0.59f, -0.72f, 1.0f, -1.34f, 1.06f);
        dij.LJIIJ(-1.25f, 0.12f, -2.52f, 0.26f, -3.84f, 0.42f);
        dij.LJIIIZ(7.93f, 7.93f, false, false, -6.95f, 7.2f);
        dij.LJIIIZ(99.95f, 99.95f, false, false, 0.04f, 18.04f);
        dij.LJIIJ(0.3f, 3.6f, 3.0f, 6.55f, 6.57f, 7.14f);
        dij.LJIIJ(10.94f, 1.82f, 19.0f, 1.85f, 30.17f, -0.02f);
        dij.LJIIIZ(7.87f, 7.87f, false, false, 6.53f, -7.0f);
        dij.LJIIJ(0.64f, -6.55f, 0.67f, -11.77f, 0.05f, -18.28f);
        dij.LJIIIZ(7.89f, 7.89f, false, false, -6.93f, -7.05f);
        dij.LJIIJ(-1.26f, -0.15f, -2.47f, -0.29f, -3.65f, -0.4f);
        dij.LJIIIZ(1.72f, 1.72f, false, true, -1.48f, -1.18f);
        dij.LJIIJ(-0.62f, -1.93f, -2.17f, -3.54f, -4.18f, -3.75f);
        dij.LJIIJ(-4.0f, -0.42f, -7.05f, -0.4f, -10.78f, -0.01f);
        dij.LIZLLL();
        dij.LJIILIIL(22.94f, 12.14f);
        dij.LJIIIZ(2.8f, 2.8f, true, true, -5.6f, 0.0f);
        dij.LJIIIZ(2.8f, 2.8f, false, true, 5.6f, 0.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(35.0f, 24.7f);
        C32856Cuy.Qc(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
