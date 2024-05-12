package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33428DAa extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33428DAa() {
        C32856Cuy.Oe(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 19.19f);
        dij.LJIILJJIL(-1.12f, -1.5f, -3.37f, -1.5f, false);
        dij.LJIIJ(-2.63f, 0.0f, -4.5f, 2.06f, -4.5f, 4.69f);
        dij.LJIIJ(0.0f, 3.0f, 2.48f, 5.67f, 4.68f, 7.68f);
        dij.LJIIJ(1.35f, 1.24f, 2.44f, 2.07f, 3.19f, 2.07f);
        dij.LJIILJJIL(1.8f, -0.82f, 3.19f, -2.07f, true);
        dij.LJIIJ(2.23f, -2.01f, 4.69f, -4.68f, 4.69f, -7.68f);
        dij.LJIIJ(0.0f, -2.63f, -1.88f, -4.7f, -4.5f, -4.7f);
        dij.LJIIJ(-2.25f, 0.0f, -3.38f, 1.5f, -3.38f, 1.5f);
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
