package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33034Cxq extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33034Cxq() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(16.0f, 15.0f);
        C32856Cuy.N0(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(16.0f, 23.0f);
        C32856Cuy.N0(this.LIZJ);
        this.LIZJ.LJIIIIZZ(17.0f, 30.0f);
        C32856Cuy.La(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(19.0f, 2.8f);
        C32856Cuy.LLLIIIIL(dij);
        C32856Cuy.LJI(dij);
        C32856Cuy.rj(dij);
        C32856Cuy.LJLLLLLL(dij);
        C32856Cuy.tj(dij);
        C32856Cuy.LJJII(dij);
        C32856Cuy.Jn(dij);
        C32856Cuy.LJI(dij);
        dij.LJIJ(2.8f);
        C32856Cuy.LLLIIIIL(dij);
        C32856Cuy.v6(dij);
        dij.LJIJ(2.8f);
        dij.LIZLLL();
        dij.LJIIIIZZ(29.0f, 8.0f);
        C32856Cuy.V1(dij);
        C32856Cuy.D0(dij);
        C32856Cuy.LJLLLLLL(dij);
        C32856Cuy.l6(dij);
        dij.LJIJ(8.0f);
        dij.LJIIJJI(5.0f);
        C32856Cuy.V1(dij);
        dij.LJIIJJI(10.0f);
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
