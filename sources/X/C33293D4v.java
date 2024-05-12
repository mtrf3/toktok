package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33293D4v extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33293D4v() {
        C32856Cuy.Z6(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.q(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(36.17f, 36.4f);
        dij2.LJIIIZ(0.5f, 0.5f, false, true, -0.1f, 0.7f);
        dij2.LIZJ(20.22f, 20.22f, false, true, 24.0f, 41.0f);
        dij2.LJIIJ(-4.9f, 0.0f, -8.92f, -1.62f, -12.07f, -3.9f);
        dij2.LJIIIZ(0.5f, 0.5f, false, true, -0.1f, -0.7f);
        dij2.LJIIL(0.6f, -0.8f);
        dij2.LJIIIZ(0.51f, 0.51f, false, true, 0.71f, -0.1f);
        dij2.LIZJ(18.22f, 18.22f, false, false, 24.0f, 39.0f);
        dij2.LJIIJ(4.41f, 0.0f, 8.01f, -1.45f, 10.86f, -3.5f);
        dij2.LJIIIZ(0.51f, 0.51f, false, true, 0.7f, 0.1f);
        dij2.LJIIL(0.61f, 0.8f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
