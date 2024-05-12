package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33212D1s extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33212D1s() {
        this.LIZJ.LJIIIIZZ(31.0f, 22.27f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, 3.46f);
        this.LIZJ.LJII(20.5f, 31.8f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, true, -3.0f, -1.73f);
        this.LIZJ.LJIJ(17.94f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 3.0f, -1.73f);
        this.LIZJ.LJII(31.0f, 22.27f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(34.0f, 7.0f);
        dij.LJI(14.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, 2.0f);
        C32856Cuy.LJLLLL(dij);
        C32856Cuy.Nd(dij);
        dij.LJIJ(9.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(14.0f, 3.0f);
        dij.LJIIJJI(20.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 6.0f, 6.0f);
        dij.LJIILL(30.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, -6.0f, 6.0f);
        dij.LJI(14.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, -6.0f, -6.0f);
        C32856Cuy.g(dij);
        C32856Cuy.Yg(dij);
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
