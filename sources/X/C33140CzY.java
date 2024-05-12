package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33140CzY extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33140CzY() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.0f, 12.0f);
        C32856Cuy.Gg(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(7.5f);
        p2.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, 3.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(12.0f);
        p3.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        p3.LJIJ(12.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.J3(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJI = LIZ2;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(9.0f, 28.5f);
        C32856Cuy.Gg(dij2);
        C32856Cuy.J9(dij2);
        dij2.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, 3.0f);
        dij2.LJI(12.0f);
        dij2.LJIIIZ(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        dij2.LJIILL(-7.5f);
        dij2.LIZLLL();
        dij2.LJIIIIZZ(28.5f, 9.0f);
        C32856Cuy.Zk(dij2);
        C32856Cuy.N6(dij2);
        dij2.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, -3.0f);
        dij2.LJIJ(12.0f);
        dij2.LJIIIZ(3.0f, 3.0f, false, false, -3.0f, -3.0f);
        dij2.LJIIJJI(-7.5f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
