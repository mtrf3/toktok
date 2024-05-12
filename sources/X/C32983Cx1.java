package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cx1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32983Cx1 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32983Cx1() {
        this.LIZJ.LJIIIIZZ(44.0f, 2.01f);
        this.LIZJ.LJI(33.69f);
        C32856Cuy.Zj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(5.48f);
        this.LIZJ.LJII(29.15f, 16.04f);
        C32856Cuy.Hl(this.LIZJ);
        this.LIZJ.LJII(42.0f, 8.84f);
        this.LIZJ.LJIILL(5.49f);
        C32856Cuy.Cg(this.LIZJ);
        C32856Cuy.sc(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(14.92f, 5.0f);
        dij.LJI(26.4f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LJIILL(2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        dij.LJI(15.0f);
        C32856Cuy.Ff(dij);
        dij.LJ(9.0f, 12.6f, 9.0f, 13.57f, 9.0f, 15.0f);
        C32856Cuy.LJLJL(dij);
        C32856Cuy.U8(dij);
        dij.LJIJ(21.6f);
        C32856Cuy.LLLLLLJ(dij);
        dij.LJIILL(11.48f);
        C32856Cuy.Zd(dij);
        dij.LIZJ(44.6f, 44.6f, false, true, 5.0f, 33.08f);
        dij.LJIJ(14.92f);
        C32856Cuy.Me(dij);
        dij.LJ(12.47f, 5.0f, 13.6f, 5.0f, 14.92f, 5.0f);
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
