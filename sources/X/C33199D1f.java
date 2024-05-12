package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33199D1f extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33199D1f() {
        this.LIZJ.LJIIIIZZ(27.0f, 19.5f);
        C32856Cuy.Ml(this.LIZJ);
        C32856Cuy.D1(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.5f, 1.5f, false, true, -3.0f, 0.0f);
        C32856Cuy.g1(this.LIZJ);
        this.LIZJ.LJIIIIZZ(35.5f, 18.0f);
        C32856Cuy.Xj(this.LIZJ);
        C32856Cuy.D1(this.LIZJ);
        C32856Cuy.Ol(this.LIZJ);
        C32856Cuy.LJJLL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        p2.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 12.62f);
        dij.LJIIIZ(13.5f, 13.5f, false, false, -7.32f, -2.17f);
        dij.LJIIJ(-7.61f, 0.0f, -13.7f, 6.33f, -13.7f, 14.05f);
        dij.LJIIJ(0.0f, 7.72f, 6.09f, 14.05f, 13.7f, 14.05f);
        dij.LJIIJ(2.7f, 0.0f, 5.2f, -0.8f, 7.32f, -2.17f);
        dij.LJIIIZ(13.4f, 13.4f, false, false, 7.32f, 2.17f);
        dij.LJIIJ(7.61f, 0.0f, 13.7f, -6.33f, 13.7f, -14.05f);
        dij.LJIIJ(0.0f, -7.72f, -6.09f, -14.05f, -13.7f, -14.05f);
        dij.LJIIJ(-2.7f, 0.0f, -5.2f, 0.8f, -7.32f, 2.17f);
        dij.LIZLLL();
        dij.LJIILIIL(-7.32f, 0.83f);
        dij.LJIIJ(1.77f, 0.0f, 3.43f, 0.45f, 4.86f, 1.2f);
        dij.LJIIIZ(14.2f, 14.2f, false, false, -3.92f, 9.85f);
        dij.LJIIJ(0.0f, 3.83f, 1.5f, 7.3f, 3.93f, 9.85f);
        dij.LJIIJ(-1.47f, 0.77f, -3.12f, 1.2f, -4.87f, 1.2f);
        dij.LJIIJ(-5.88f, 0.0f, -10.7f, -4.9f, -10.7f, -11.05f);
        dij.LJIILJJIL(4.82f, -11.05f, 10.7f, -11.05f, true);
        dij.LIZLLL();
        dij.LJIILIIL(14.64f, 0.0f);
        dij.LJIIJ(5.88f, 0.0f, 10.7f, 4.9f, 10.7f, 11.05f);
        dij.LJIILJJIL(-4.82f, 11.05f, -10.7f, 11.05f, true);
        dij.LJIIJ(-2.4f, 0.0f, -4.61f, -0.81f, -6.4f, -2.2f);
        dij.LJIIIZ(11.16f, 11.16f, false, true, -4.3f, -8.85f);
        dij.LJIIJ(0.0f, -3.63f, 1.7f, -6.84f, 4.3f, -8.86f);
        dij.LJIIJ(1.79f, -1.38f, 4.0f, -2.2f, 6.4f, -2.2f);
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
