package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33251D3f extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33251D3f() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(6.0f, 24.0f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, 35.97f, -1.0f);
        this.LIZJ.LJIIJ(0.03f, 0.55f, 0.48f, 1.0f, 1.03f, 1.0f);
        C32856Cuy.z0(this.LIZJ);
        this.LIZJ.LJIIJ(0.55f, 0.0f, 1.0f, -0.45f, 0.98f, -1.0f);
        this.LIZJ.LIZJ(22.0f, 22.0f, true, false, 23.0f, 45.98f);
        this.LIZJ.LJIIJ(0.55f, 0.02f, 1.0f, -0.43f, 1.0f, -0.98f);
        C32856Cuy.LJJLIL(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.03f);
        this.LIZJ.LIZJ(18.0f, 18.0f, false, true, 6.0f, 24.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(40.0f, 36.0f);
        C32856Cuy.LLIZLLLIL(dij);
        dij.LJIIIIZZ(17.7f, 22.2f);
        dij.LJIIJ(1.5f, 0.0f, 2.7f, -1.61f, 2.7f, -3.6f);
        dij.LJIILLIIL(19.2f, 15.0f, 17.7f, 15.0f, true);
        C32856Cuy.Em(dij);
        dij.LJIIIIZZ(30.3f, 22.2f);
        dij.LJIIJ(1.5f, 0.0f, 2.7f, -1.61f, 2.7f, -3.6f);
        dij.LJIILLIIL(31.8f, 15.0f, 30.3f, 15.0f, true);
        C32856Cuy.Em(dij);
        dij.LJIIIIZZ(16.8f, 27.0f);
        dij.LJIIJ(0.0f, 2.82f, 3.22f, 6.9f, 7.2f, 6.9f);
        dij.LJIILJJIL(7.2f, -4.08f, 7.2f, -6.9f, true);
        dij.LJIIJ(0.0f, -2.8f, -14.4f, -2.8f, -14.4f, 0.0f);
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
