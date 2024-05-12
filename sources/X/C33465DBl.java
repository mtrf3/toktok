package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33465DBl extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33465DBl() {
        this.LIZJ.LJIIIIZZ(23.47f, 7.15f);
        this.LIZJ.LJII(6.34f, 17.97f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 1.7f);
        this.LIZJ.LJIIL(17.13f, 10.81f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.06f, 0.0f);
        this.LIZJ.LJIIL(17.13f, -10.82f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.69f);
        this.LIZJ.LJII(24.53f, 7.15f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.06f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(5.48f, 28.67f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.33f, 1.38f);
        dij.LJIIL(17.67f, 10.8f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.04f, 0.0f);
        dij.LJIIL(17.67f, -10.8f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.33f, -1.38f);
        dij.LJIIL(-1.04f, -1.7f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.38f, -0.34f);
        dij.LJIIL(-15.58f, 9.52f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.04f, 0.0f);
        dij.LJII(7.9f, 26.63f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.38f, 0.33f);
        dij.LJIIL(-1.04f, 1.71f);
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
