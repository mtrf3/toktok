package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CyC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33056CyC extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33056CyC() {
        this.LIZJ.LJIIIIZZ(6.0f, 8.0f);
        C32856Cuy.ff(this.LIZJ);
        C32856Cuy.LJLLLLLL(this.LIZJ);
        C32856Cuy.c4(this.LIZJ);
        C32856Cuy.S9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILIIL(32.0f, 0.0f);
        C32856Cuy.l6(this.LIZJ);
        C32856Cuy.LJLLLLLL(this.LIZJ);
        C32856Cuy.LJJII(this.LIZJ);
        C32856Cuy.S9(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(12.88f, 15.2f);
        C32856Cuy.G8(dij);
        dij.LJIIL(1.41f, -1.42f);
        C32856Cuy.pk(dij);
        dij.LJIIJ(2.2f, 2.2f, 5.15f, 3.12f, 8.29f, 3.12f);
        dij.LJIIJ(3.14f, 0.0f, 6.1f, -0.92f, 8.3f, -3.12f);
        C32856Cuy.G6(dij);
        C32856Cuy.wk(dij);
        dij.LJ(32.25f, 18.08f, 28.21f, 19.5f, 24.0f, 19.5f);
        dij.LJIIJ(-4.21f, 0.0f, -8.13f, -1.3f, -11.12f, -4.3f);
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
