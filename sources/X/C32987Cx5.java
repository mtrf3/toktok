package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cx5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32987Cx5 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32987Cx5() {
        this.LIZJ.LJIIIIZZ(26.6f, 12.03f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.96f, 0.7f);
        C32856Cuy.bf(this.LIZJ);
        this.LIZJ.LJIILIIL(-6.07f, 14.32f);
        C32856Cuy.df(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(6.0f, 11.6f);
        dij.LJIIJ(0.0f, -3.36f, 0.0f, -5.04f, 0.65f, -6.32f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 2.63f, -2.63f);
        dij.LJ(10.56f, 2.0f, 12.24f, 2.0f, 15.6f, 2.0f);
        C32856Cuy.Bb(dij);
        C32856Cuy.I4(dij);
        dij.LJ(42.0f, 6.56f, 42.0f, 8.24f, 42.0f, 11.6f);
        dij.LJIILL(24.8f);
        C32856Cuy.u8(dij);
        dij.LJI(15.6f);
        dij.LJIIJ(-3.36f, 0.0f, -5.04f, 0.0f, -6.32f, -0.65f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, -2.63f, -2.63f);
        dij.LJ(6.0f, 41.44f, 6.0f, 39.76f, 6.0f, 36.4f);
        dij.LJIJ(11.6f);
        dij.LIZLLL();
        dij.LJIIIIZZ(15.6f, 6.0f);
        dij.LJIIJ(-1.75f, 0.0f, -2.82f, 0.0f, -3.62f, 0.07f);
        dij.LJIIIZ(5.12f, 5.12f, false, false, -0.86f, 0.14f);
        C32856Cuy.pb(dij);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -0.87f, 0.88f);
        dij.LJIIL(-0.01f, 0.03f);
        dij.LJIIIZ(5.11f, 5.11f, false, false, -0.14f, 0.86f);
        dij.LJ(10.0f, 8.78f, 10.0f, 9.85f, 10.0f, 11.6f);
        dij.LJIILL(24.8f);
        C32856Cuy.Si(dij);
        dij.LJIIIZ(5.11f, 5.11f, false, false, 0.14f, 0.86f);
        C32856Cuy.LLJLLL(dij);
        C32856Cuy.Bb(dij);
        C32856Cuy.f7(dij);
        C32856Cuy.j5(dij);
        dij.LJIJ(11.6f);
        dij.LJIIJ(0.0f, -1.75f, 0.0f, -2.82f, -0.07f, -3.62f);
        dij.LJIIIZ(5.11f, 5.11f, false, false, -0.14f, -0.86f);
        dij.LJIJ(7.1f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -0.88f, -0.87f);
        dij.LJIIL(-0.03f, -0.01f);
        dij.LJIIIZ(5.12f, 5.12f, false, false, -0.86f, -0.14f);
        dij.LJ(35.22f, 6.0f, 34.15f, 6.0f, 32.4f, 6.0f);
        dij.LJI(15.6f);
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
