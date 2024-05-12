package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33203D1j extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33203D1j() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(21.0f, 4.0f);
        p.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(3.0f);
        p2.LJIIJJI(11.0f);
        this.LIZJ.LJIIJ(6.0f, 0.0f, 9.0f, 3.0f, 9.0f, 9.0f);
        C32856Cuy.LJLIIL(this.LIZJ);
        C32856Cuy.A0(this.LIZJ);
        C32856Cuy.ul(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(4.0f, 21.0f);
        C32856Cuy.aa(dij);
        dij.LJI(9.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        dij.LJIJ(21.0f);
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
