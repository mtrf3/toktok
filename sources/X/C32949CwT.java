package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32949CwT extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32949CwT() {
        this.LIZJ.LJIIIIZZ(9.0f, 33.08f);
        C32856Cuy.Jb(this.LIZJ);
        this.LIZJ.LJIIJJI(15.16f);
        C32856Cuy.Vg(this.LIZJ);
        this.LIZJ.LJ(36.53f, 5.0f, 35.4f, 5.0f, 34.08f, 5.0f);
        this.LIZJ.LJI(18.92f);
        C32856Cuy.Vk(this.LIZJ);
        this.LIZJ.LJ(9.0f, 12.47f, 9.0f, 13.6f, 9.0f, 14.92f);
        this.LIZJ.LJIIJ(0.0f, 0.32f, 0.26f, 0.58f, 0.58f, 0.58f);
        C32856Cuy.U0(this.LIZJ);
        this.LIZJ.LJ(16.6f, 9.0f, 17.57f, 9.0f, 19.0f, 9.0f);
        C32856Cuy.LJIILL(this.LIZJ);
        C32856Cuy.Bg(this.LIZJ);
        C32856Cuy.v6(this.LIZJ);
        C32856Cuy.ng(this.LIZJ);
        this.LIZJ.LJ(13.0f, 35.4f, 13.0f, 34.43f, 13.0f, 33.0f);
        C32856Cuy.LLJJIJI(this.LIZJ);
        this.LIZJ.LJI(9.58f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(0.58f, 0.58f, false, false, -0.58f, 0.58f);
        p.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(22.7f, 13.3f);
        C32856Cuy.lk(dij);
        dij.LJII(27.17f, 26.0f);
        C32856Cuy.af(dij);
        dij.LJIIJJI(24.17f);
        dij.LJIIL(-5.88f, -5.88f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -1.41f);
        dij.LJIIL(1.42f, -1.42f);
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
