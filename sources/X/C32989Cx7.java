package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cx7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32989Cx7 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32989Cx7() {
        this.LIZJ.LJIIIIZZ(25.0f, 29.5f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, true, false, -11.0f, 0.0f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, false, 11.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-3.3f, 0.0f);
        this.LIZJ.LJIIIZ(2.2f, 2.2f, true, true, -4.4f, 0.0f);
        this.LIZJ.LJIIIZ(2.2f, 2.2f, false, true, 4.4f, 0.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(8.15f, 12.0f);
        dij.LIZJ(2.85f, 2.85f, false, true, 11.0f, 9.15f);
        dij.LJIIJJI(33.0f);
        dij.LIZJ(2.85f, 2.85f, false, true, 46.85f, 12.0f);
        C32856Cuy.LJLJJLL(dij);
        dij.LIZJ(2.85f, 2.85f, false, true, 44.0f, 31.85f);
        C32856Cuy.LJII(dij);
        C32856Cuy.L9(dij);
        C32856Cuy.dl(dij);
        dij.LJI(4.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        C32856Cuy.t9(dij);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        dij.LJIIJJI(4.15f);
        C32856Cuy.h1(dij);
        dij.LJIILIIL(35.0f, 16.15f);
        dij.LJIILL(-15.3f);
        dij.LJIIJJI(-31.3f);
        C32856Cuy.p9(dij);
        C32856Cuy.M6(dij);
        C32856Cuy.fl(dij);
        dij.LJIILL(7.15f);
        dij.LJIIJJI(5.15f);
        dij.LIZLLL();
        dij.LJIIIIZZ(5.0f, 22.0f);
        C32856Cuy.LJLJJI(dij);
        dij.LJIIJJI(29.0f);
        C32856Cuy.u9(dij);
        C32856Cuy.U6(dij);
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
