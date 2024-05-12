package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33253D3h extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33253D3h() {
        this.LIZJ.LJIIIIZZ(44.0f, 13.2f);
        this.LIZJ.LJIIJ(0.0f, -3.1f, -0.03f, -4.7f, -0.65f, -5.92f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(6.0f, 6.0f, false, false, -2.63f, -2.63f);
        this.LIZJ.LJ(39.44f, 4.0f, 37.76f, 4.0f, 34.4f, 4.0f);
        this.LIZJ.LJI(18.07f);
        this.LIZJ.LJIIJ(-3.37f, 0.0f, -5.05f, 0.0f, -6.33f, 0.65f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -2.62f, 2.63f);
        this.LIZJ.LJIIJ(-0.65f, 1.28f, -0.65f, 2.96f, -0.65f, 6.32f);
        this.LIZJ.LJIILL(1.44f);
        this.LIZJ.LJIIJ(1.8f, -1.75f, 3.46f, -3.33f, 4.37f, -4.12f);
        this.LIZJ.LJIIIZ(6.82f, 6.82f, false, true, 8.98f, -0.01f);
        this.LIZJ.LJIIJ(2.27f, 1.98f, 9.16f, 8.77f, 11.3f, 10.88f);
        this.LIZJ.LJIIIZ(6.8f, 6.8f, false, true, 2.02f, 4.84f);
        this.LIZJ.LJIILL(15.01f);
        this.LIZJ.LJIIIZ(6.8f, 6.8f, false, true, -0.42f, 2.36f);
        this.LIZJ.LJIIJ(3.15f, 0.0f, 4.76f, -0.02f, 6.0f, -0.65f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(6.0f, 6.0f, false, false, 2.63f, -2.63f);
        this.LIZJ.LJIIJ(0.62f, -1.23f, 0.65f, -2.82f, 0.65f, -5.91f);
        this.LIZJ.LJIJ(13.19f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(18.9f, 14.27f);
        dij.LJIIIZ(2.37f, 2.37f, false, false, -3.13f, 0.0f);
        dij.LJIIL(-10.7f, 9.38f);
        dij.LIZJ(3.16f, 3.16f, false, false, 4.0f, 26.04f);
        dij.LJIILL(15.6f);
        dij.LJIIIZ(2.37f, 2.37f, false, false, 2.37f, 2.37f);
        dij.LJIIJJI(21.95f);
        dij.LJIIIZ(2.37f, 2.37f, false, false, 2.37f, -2.37f);
        dij.LJIILL(-15.6f);
        dij.LJIIJ(0.0f, -0.88f, -0.43f, -1.6f, -1.21f, -2.4f);
        dij.LJII(18.9f, 14.28f);
        dij.LIZLLL();
        dij.LJIIIIZZ(15.09f, 33.1f);
        dij.LJIIJ(0.0f, -0.65f, 0.53f, -1.18f, 1.18f, -1.18f);
        dij.LJIIJJI(2.15f);
        dij.LJIIJ(0.65f, 0.0f, 1.19f, 0.53f, 1.19f, 1.18f);
        dij.LJIILL(6.2f);
        dij.LJIIJ(0.0f, 0.65f, -0.54f, 1.18f, -1.2f, 1.18f);
        dij.LJIIJJI(-2.14f);
        dij.LJIIJ(-0.65f, 0.0f, -1.18f, -0.53f, -1.18f, -1.18f);
        dij.LJIILL(-6.2f);
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
