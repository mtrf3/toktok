package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33182D0o extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33182D0o() {
        C32856Cuy.Xc(this.LIZJ);
        this.LIZJ.LJIIIIZZ(40.57f, 27.2f);
        C32856Cuy.S6(this.LIZJ);
        this.LIZJ.LJIIIZ(17.0f, 17.0f, true, false, -15.73f, 17.06f);
        this.LIZJ.LJIILL(-5.74f);
        this.LIZJ.LJIIL(-2.51f, 1.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.5f, 0.5f, false, true, -0.76f, -0.43f);
        this.LIZJ.LJIILL(-8.7f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.0f, -0.17f, 0.1f, -0.33f, 0.24f, -0.42f);
        this.LIZJ.LJIIL(5.23f, -3.2f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, true, 0.26f, -0.07f);
        this.LIZJ.LJIIJJI(12.84f);
        this.LIZJ.LIZLLL();
        C32856Cuy.sg(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(47.16f, 37.5f);
        dij.LJIIJ(0.0f, 4.82f, -2.47f, 7.65f, -6.42f, 7.64f);
        dij.LJIIJ(-3.97f, 0.0f, -6.44f, -2.85f, -6.42f, -7.64f);
        dij.LJIIJ(0.01f, -4.8f, 2.45f, -7.5f, 6.42f, -7.5f);
        dij.LJIIJ(3.95f, 0.0f, 6.43f, 2.71f, 6.42f, 7.5f);
        dij.LIZLLL();
        dij.LJIILIIL(-8.75f, 0.0f);
        dij.LJIIJ(-0.02f, 3.06f, 0.96f, 4.43f, 2.33f, 4.43f);
        dij.LJIIJ(1.36f, 0.0f, 2.33f, -1.37f, 2.33f, -4.43f);
        dij.LJIIJ(-0.01f, -2.99f, -0.97f, -4.32f, -2.33f, -4.32f);
        dij.LJIIJ(-1.37f, 0.0f, -2.32f, 1.33f, -2.33f, 4.32f);
        dij.LIZLLL();
        dij.LJIIIIZZ(31.72f, 30.2f);
        dij.LJIIJ(0.27f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        dij.LJIILL(13.54f);
        C32856Cuy.C5(dij);
        dij.LJIIJJI(-2.95f);
        C32856Cuy.LLJJJ(dij);
        dij.LJIILL(-10.4f);
        dij.LJIIJJI(-0.09f);
        dij.LJIIL(-2.42f, 1.45f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.76f, -0.43f);
        dij.LJIILL(-2.2f);
        dij.LJIIJ(0.0f, -0.17f, 0.1f, -0.33f, 0.24f, -0.42f);
        dij.LJIIL(3.22f, -1.97f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, 0.26f, -0.07f);
        dij.LJIIJJI(3.0f);
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
