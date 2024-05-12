package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33318D5u extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33318D5u() {
        this.LIZJ.LJIIIIZZ(41.4f, 23.71f);
        this.LIZJ.LJIIIZ(0.9f, 0.9f, false, true, 0.0f, 0.58f);
        this.LIZJ.LJIIJ(-0.63f, 1.92f, -2.2f, 4.89f, -4.82f, 7.51f);
        this.LIZJ.LIZJ(17.35f, 17.35f, false, true, 24.0f, 37.11f);
        this.LIZJ.LJIIJ(-5.42f, 0.0f, -9.55f, -2.28f, -12.58f, -5.3f);
        this.LIZJ.LJIIIZ(20.44f, 20.44f, false, true, -4.82f, -7.52f);
        this.LIZJ.LJIIIZ(0.9f, 0.9f, false, true, 0.0f, -0.58f);
        this.LIZJ.LJIIJ(0.63f, -1.92f, 2.2f, -4.89f, 4.82f, -7.51f);
        this.LIZJ.LIZJ(17.35f, 17.35f, false, true, 24.0f, 10.89f);
        this.LIZJ.LJIIJ(5.42f, 0.0f, 9.55f, 2.28f, 12.58f, 5.3f);
        this.LIZJ.LJIIIZ(20.44f, 20.44f, false, true, 4.82f, 7.52f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 41.0f);
        this.LIZJ.LJIIJ(13.83f, 0.0f, 20.82f, -11.7f, 21.96f, -16.81f);
        this.LIZJ.LJIIIZ(0.85f, 0.85f, false, false, 0.0f, -0.38f);
        this.LIZJ.LJ(44.82f, 18.71f, 37.83f, 7.0f, 24.0f, 7.0f);
        this.LIZJ.LJIILLIIL(3.18f, 18.7f, 2.04f, 23.81f, true);
        this.LIZJ.LJIIIZ(0.85f, 0.85f, false, false, 0.0f, 0.38f);
        this.LIZJ.LJ(3.18f, 29.29f, 10.17f, 41.0f, 24.0f, 41.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 27.21f);
        dij.LJIIIZ(3.21f, 3.21f, true, true, 0.0f, -6.42f);
        dij.LJIIIZ(3.21f, 3.21f, false, true, 0.0f, 6.42f);
        dij.LIZLLL();
        dij.LJIILIIL(0.0f, 4.29f);
        C32856Cuy.G2(dij);
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
