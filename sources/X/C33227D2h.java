package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33227D2h extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33227D2h() {
        this.LIZJ.LJIIIIZZ(36.85f, 69.73f);
        this.LIZJ.LJIIIZ(3.3f, 3.3f, false, false, 2.96f, 0.47f);
        this.LIZJ.LJIIJ(18.92f, -6.24f, 31.15f, -21.08f, 31.16f, -37.76f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-0.06f);
        this.LIZJ.LJ(70.97f, 15.66f, 55.28f, 2.06f, 36.0f, 2.06f);
        this.LIZJ.LJIILLIIL(1.03f, 15.66f, 1.03f, 32.38f, true);
        this.LIZJ.LJIIJ(0.0f, 16.56f, 15.4f, 30.07f, 34.42f, 30.32f);
        this.LIZJ.LJIJ(67.0f);
        this.LIZJ.LJIIJ(0.0f, 1.08f, 0.52f, 2.1f, 1.4f, 2.72f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.17f, -9.65f);
        this.LIZJ.LJIIIZ(1.52f, 1.52f, false, false, -1.05f, -0.43f);
        this.LIZJ.LJIIJJI(-0.32f);
        this.LIZJ.LJIIIZ(14.0f, 14.0f, false, true, -0.65f, 0.02f);
        this.LIZJ.LJIIJ(-17.61f, 0.0f, -31.94f, -12.24f, -31.94f, -27.29f);
        this.LIZJ.LJIIJ(0.0f, -15.05f, 14.33f, -27.3f, 31.94f, -27.3f);
        this.LIZJ.LJIIJ(17.6f, 0.0f, 31.93f, 12.24f, 31.94f, 27.29f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(0.04f);
        this.LIZJ.LJIIJ(0.0f, 15.38f, -11.42f, 29.1f, -29.08f, 34.92f);
        this.LIZJ.LJIIIZ(0.26f, 0.26f, false, true, -0.24f, -0.05f);
        this.LIZJ.LJIIIZ(0.32f, 0.32f, false, true, -0.14f, -0.27f);
        this.LIZJ.LJIILL(-5.84f);
        this.LIZJ.LJIIJ(0.0f, -0.41f, -0.16f, -0.8f, -0.46f, -1.09f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(36.0f, 30.49f);
        C32856Cuy.zf(dij);
        dij.LJIIIIZZ(19.8f, 30.65f);
        C32856Cuy.zf(dij);
        dij.LJIIIIZZ(52.08f, 30.49f);
        C32856Cuy.zf(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
