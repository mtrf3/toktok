package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33395D8t extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33395D8t() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(15.0f, 11.0f);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, true, true, 18.0f, 0.0f);
        C32856Cuy.LJLIL(this.LIZJ);
        this.LIZJ.LJIIIZ(9.0f, 9.0f, true, true, -18.0f, 0.0f);
        C32856Cuy.LLZLL(this.LIZJ);
        C32856Cuy.LJJIJLIJ(this.LIZJ);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, -10.0f, 0.0f);
        C32856Cuy.LJLIL(this.LIZJ);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, 10.0f, 0.0f);
        C32856Cuy.LLZLL(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.q6(dij);
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
