package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33231D2l extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33231D2l() {
        this.LIZJ.LJIIIIZZ(31.3f, 22.3f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(26.0f, 26.16f);
        C32856Cuy.Gi(this.LIZJ);
        this.LIZJ.LJIILL(8.17f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-3.88f, -3.88f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.41f, 0.0f);
        p.LJIIL(-1.42f, 1.42f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, 1.41f);
        p.LJIIL(7.3f, 7.3f);
        p.LJIIIZ(2.0f, 2.0f, false, false, 2.82f, 0.0f);
        p.LJIIL(7.3f, -7.3f);
        p.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        p.LJIIL(-1.42f, -1.42f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.l8(dij);
        dij.LJI(12.48f);
        C32856Cuy.Wb(dij);
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
