package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33133CzR extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33133CzR() {
        this.LIZJ.LJIIIIZZ(22.99f, 13.4f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, false, -0.99f, 0.98f);
        C32856Cuy.u9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-7.62f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, false, -0.98f, 0.99f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(1.99f);
        this.LIZJ.LJIIJ(0.0f, 0.54f, 0.44f, 0.99f, 0.98f, 0.99f);
        C32856Cuy.y6(this.LIZJ);
        this.LIZJ.LJIILL(7.65f);
        this.LIZJ.LJIIJ(0.0f, 0.54f, 0.45f, 0.98f, 0.99f, 0.98f);
        C32856Cuy.B6(this.LIZJ);
        this.LIZJ.LJIIJ(0.54f, 0.0f, 0.99f, -0.44f, 0.99f, -0.98f);
        this.LIZJ.LJIILL(-7.65f);
        this.LIZJ.LJIIJJI(7.62f);
        this.LIZJ.LJIIJ(0.54f, 0.0f, 0.98f, -0.45f, 0.98f, -1.0f);
        C32856Cuy.v9(this.LIZJ);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, false, -0.98f, -0.99f);
        C32856Cuy.C6(this.LIZJ);
        this.LIZJ.LJIILL(-7.62f);
        this.LIZJ.LJIIIZ(0.99f, 0.99f, false, false, -0.99f, -0.98f);
        DIL.LIZ(this.LIZJ, "p", 23.0f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.D(dij);
        C32856Cuy.LLJJJJLIIL(dij);
        C32856Cuy.ac(dij);
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
