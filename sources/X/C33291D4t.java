package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33291D4t extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33291D4t() {
        this.LIZJ.LJIIIIZZ(46.0f, 23.0f);
        this.LIZJ.LJIIIZ(21.0f, 21.0f, false, true, -21.0f, 21.0f);
        C32856Cuy.LLLLLZIL(this.LIZJ);
        this.LIZJ.LJIIJ(-2.77f, 0.0f, -5.0f, -2.23f, -5.0f, -5.0f);
        C32856Cuy.v9(this.LIZJ);
        this.LIZJ.LJIIIZ(21.0f, 21.0f, true, true, 42.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(25.0f, 40.0f);
        this.LIZJ.LIZJ(17.0f, 17.0f, true, false, 8.0f, 23.0f);
        C32856Cuy.LJLJJL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.56f, 0.44f, 1.0f, 1.0f, 1.0f);
        C32856Cuy.h0(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(20.24f, 25.42f);
        dij.LJIIIZ(10.28f, 10.28f, false, true, -2.92f, -2.24f);
        dij.LJIIIZ(1.08f, 1.08f, false, false, -1.64f, 0.03f);
        dij.LJIIL(-0.98f, 1.2f);
        dij.LJIIJ(-0.31f, 0.38f, -0.32f, 0.95f, 0.02f, 1.34f);
        dij.LJIIJ(1.2f, 1.38f, 2.6f, 2.49f, 4.15f, 3.27f);
        dij.LJIIJ(1.67f, 0.84f, 3.46f, 1.28f, 5.28f, 1.28f);
        dij.LJIIJ(1.82f, 0.0f, 3.62f, -0.44f, 5.29f, -1.28f);
        dij.LJIIIZ(13.77f, 13.77f, false, false, 4.14f, -3.27f);
        dij.LJIIJ(0.34f, -0.39f, 0.33f, -0.96f, 0.02f, -1.35f);
        dij.LJIIL(-0.98f, -1.19f);
        dij.LJIIJ(-0.43f, -0.52f, -1.2f, -0.5f, -1.63f, -0.03f);
        dij.LJIIJ(-0.87f, 0.94f, -1.86f, 1.7f, -2.92f, 2.24f);
        dij.LJIIIZ(8.65f, 8.65f, false, true, -3.92f, 0.95f);
        dij.LJIIIZ(8.65f, 8.65f, false, true, -3.91f, -0.95f);
        dij.LIZLLL();
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
