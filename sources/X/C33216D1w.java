package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33216D1w extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33216D1w() {
        C32856Cuy.LLL(this.LIZJ);
        C32856Cuy.C4(this.LIZJ);
        C32856Cuy.uj(this.LIZJ);
        C32856Cuy.ke(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p.LJIJ(7.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(30.0f, 22.0f);
        dij.LJIIJJI(9.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, 5.0f, 5.0f);
        C32856Cuy.LJLJI(dij);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        dij.LJIIJJI(-9.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        C32856Cuy.z9(dij);
        C32856Cuy.dd(dij);
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
