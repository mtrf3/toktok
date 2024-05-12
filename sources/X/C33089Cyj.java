package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33089Cyj extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33089Cyj() {
        C32856Cuy.e8(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(5.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.ol(this.LIZJ);
        C32856Cuy.LJJLL(this.LIZJ);
        C32856Cuy.V0(this.LIZJ);
        C32856Cuy.ol(this.LIZJ);
        C32856Cuy.Rg(this.LIZJ);
        C32856Cuy.LJFF(this.LIZJ);
        C32856Cuy.Oc(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(38.0f, 27.0f);
        C32856Cuy.Rc(dij);
        dij.LJIIJJI(-6.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.z9(dij);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        dij.LJIIJJI(6.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-8.0f, -7.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, 6.0f);
        dij.LJIILL(14.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, 6.0f);
        dij.LJIIJJI(8.0f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, -6.0f);
        C32856Cuy.y9(dij);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        dij.LJIIJJI(-8.0f);
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
