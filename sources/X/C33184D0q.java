package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33184D0q extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33184D0q() {
        this.LIZJ.LJIIIIZZ(25.0f, 10.0f);
        C32856Cuy.An(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(2.47f);
        this.LIZJ.LJIIJ(2.04f, 0.3f, 3.8f, 1.09f, 5.25f, 2.25f);
        this.LIZJ.LJIIJ(0.39f, 0.32f, 0.43f, 0.9f, 0.12f, 1.3f);
        this.LIZJ.LJIIL(-0.88f, 1.16f);
        this.LIZJ.LJIIJ(-0.36f, 0.49f, -1.07f, 0.53f, -1.56f, 0.17f);
        this.LIZJ.LJIIIZ(8.58f, 8.58f, false, false, -2.93f, -1.4f);
        this.LIZJ.LJIILL(5.55f);
        this.LIZJ.LJIIJ(3.17f, 0.86f, 6.42f, 2.2f, 6.42f, 6.26f);
        this.LIZJ.LJIIJ(0.0f, 3.14f, -1.98f, 5.93f, -6.42f, 6.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(37.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        C32856Cuy.LLIIII(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-1.78f);
        this.LIZJ.LJIIIZ(11.22f, 11.22f, false, true, -5.93f, -2.65f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, true, -0.11f, -1.26f);
        this.LIZJ.LJIIL(0.9f, -1.23f);
        this.LIZJ.LJIIJ(0.37f, -0.52f, 1.12f, -0.55f, 1.6f, -0.15f);
        this.LIZJ.LIZJ(9.19f, 9.19f, false, false, 22.0f, 31.77f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(25.5f);
        this.LIZJ.LJIIJ(-2.99f, -0.84f, -5.83f, -2.16f, -5.83f, -5.93f);
        this.LIZJ.LJIIJ(0.0f, -3.02f, 2.24f, -5.46f, 5.83f, -6.1f);
        C32856Cuy.Sc(this.LIZJ);
        C32856Cuy.LJJIJ(this.LIZJ);
        C32856Cuy.gn(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Sg(dij);
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
