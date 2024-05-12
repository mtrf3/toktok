package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cx0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32982Cx0 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32982Cx0() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(18.5f, 14.0f);
        C32856Cuy.Lg(this.LIZJ);
        this.LIZJ.LJIIIIZZ(22.5f, 17.5f);
        C32856Cuy.om(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(8.0f, 6.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        dij.LJIIJJI(17.0f);
        C32856Cuy.fl(dij);
        C32856Cuy.E0(dij);
        C32856Cuy.fl(dij);
        dij.LJIILL(33.0f);
        C32856Cuy.hi(dij);
        C32856Cuy.E9(dij);
        C32856Cuy.i7(dij);
        dij.LJIILIIL(7.0f, 25.0f);
        C32856Cuy.LJLIIIL(dij);
        dij.LJIIJJI(21.0f);
        C32856Cuy.h9(dij);
        C32856Cuy.LJI(dij);
        C32856Cuy.LJLJL(dij);
        dij.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, 3.0f);
        dij.LJI(15.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(12.0f, 7.0f);
        dij.LJIILL(20.0f);
        dij.LJIIJJI(15.0f);
        dij.LJIJ(7.0f);
        C32856Cuy.LLLLIILL(dij);
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
