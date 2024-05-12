package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33247D3b extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33247D3b() {
        this.LIZJ.LJIILIIL(4.8f, 13.08f);
        this.LIZJ.LJIIL(4.08f, 3.85f);
        this.LIZJ.LJIILL(21.79f);
        this.LIZJ.LJIIJ(0.0f, 0.14f, 0.08f, 0.4f, 0.26f, 0.4f);
        this.LIZJ.LJI(32.3f);
        this.LIZJ.LJIIL(4.3f, 4.08f);
        this.LIZJ.LJI(9.14f);
        this.LIZJ.LJIIJ(-2.4f, 0.0f, -4.34f, -2.0f, -4.34f, -4.48f);
        this.LIZJ.LJIJ(13.08f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(41.47f, 42.3f);
        dij.LJ(29.5f, 30.95f, 17.42f, 19.47f, 5.37f, 8.06f);
        dij.LJIIIZ(0.96f, 0.96f, false, true, -0.03f, -1.36f);
        dij.LJIIL(1.48f, -1.56f);
        dij.LJIIIZ(0.96f, 0.96f, false, true, 1.36f, -0.04f);
        dij.LJIIL(3.98f, 3.77f);
        dij.LJIIJJI(5.58f);
        dij.LJIIL(-2.38f, -2.9f);
        dij.LJIIJ(-0.44f, -0.5f, -0.4f, -1.25f, 0.1f, -1.69f);
        dij.LJIIL(1.8f, -1.58f);
        dij.LJIIJ(0.5f, -0.44f, 1.26f, -0.4f, 1.7f, 0.1f);
        dij.LJIIL(4.47f, 5.23f);
        dij.LJIIJ(0.1f, 0.1f, 0.26f, 0.1f, 0.35f, 0.0f);
        dij.LJIIL(4.46f, -5.23f);
        dij.LJIIJ(0.45f, -0.5f, 1.2f, -0.54f, 1.7f, -0.1f);
        dij.LJIIL(1.8f, 1.58f);
        dij.LJIIJ(0.5f, 0.44f, 0.55f, 1.2f, 0.1f, 1.69f);
        dij.LJIIL(-2.37f, 2.9f);
        dij.LJIIJJI(9.39f);
        dij.LJIIJ(2.4f, 0.0f, 4.34f, 2.01f, 4.34f, 4.49f);
        dij.LJIILL(24.92f);
        dij.LJIIL(1.91f, 1.81f);
        dij.LJIIJ(0.39f, 0.37f, 0.4f, 0.97f, 0.04f, 1.36f);
        dij.LJIIL(-1.48f, 1.57f);
        dij.LJIIIZ(0.96f, 0.96f, false, true, -1.36f, 0.03f);
        dij.LJIIJ(-0.1f, -0.08f, -0.78f, -0.8f, -0.84f, -0.75f);
        dij.LIZLLL();
        dij.LJIILIIL(-25.0f, -29.35f);
        dij.LJIIL(2.82f, 2.67f);
        dij.LJIIJ(0.17f, 0.06f, 0.34f, 0.13f, 0.51f, 0.23f);
        dij.LJIIL(12.6f, 7.27f);
        dij.LJIIIZ(2.4f, 2.4f, false, true, 0.0f, 4.16f);
        dij.LJIIL(-0.5f, 0.29f);
        dij.LJIIL(7.22f, 6.84f);
        dij.LJIJ(13.36f);
        dij.LJIIJ(0.0f, -0.15f, -0.08f, -0.4f, -0.26f, -0.4f);
        dij.LJI(16.47f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIILIIL(24.57f, 31.8f);
        dij2.LJIIL(-8.37f, -7.93f);
        dij2.LJIILL(8.6f);
        dij2.LJIIJ(0.0f, 1.85f, 2.0f, 3.0f, 3.6f, 2.08f);
        dij2.LJIIL(4.77f, -2.75f);
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
