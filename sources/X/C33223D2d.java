package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33223D2d extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33223D2d() {
        this.LIZJ.LJIIIIZZ(28.0f, 18.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, true, true, 2.0f, 0.0f);
        C32856Cuy.B1(this.LIZJ);
        C32856Cuy.vn(this.LIZJ);
        C32856Cuy.e1(this.LIZJ);
        this.LIZJ.LJIIIIZZ(37.0f, 17.0f);
        C32856Cuy.E8(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, true, false, 2.0f, 0.0f);
        p2.LJIILL(-3.0f);
        C32856Cuy.Xl(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 10.87f);
        dij.LJIIIZ(14.0f, 14.0f, true, true, 0.0f, 24.25f);
        dij.LJIIIZ(14.0f, 14.0f, true, true, 0.0f, -24.25f);
        dij.LIZLLL();
        dij.LJIIIIZZ(17.0f, 11.0f);
        dij.LJIIIZ(12.0f, 12.0f, true, false, 5.15f, 22.84f);
        dij.LJIIIZ(13.97f, 13.97f, false, true, 0.0f, -21.68f);
        dij.LIZJ(11.95f, 11.95f, false, false, 17.0f, 11.0f);
        dij.LIZLLL();
        C32856Cuy.LJJIJLIJ(dij);
        dij.LJIIIZ(11.99f, 11.99f, true, false, -0.02f, 23.99f);
        dij.LIZJ(11.99f, 11.99f, false, false, 31.0f, 11.0f);
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
