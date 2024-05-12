package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33327D6d extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33327D6d() {
        this.LIZJ.LJIIIIZZ(22.3f, 13.3f);
        C32856Cuy.m17do(this.LIZJ);
        this.LIZJ.LJII(17.83f, 26.0f);
        C32856Cuy.L6(this.LIZJ);
        C32856Cuy.xa(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(17.83f);
        C32856Cuy.pl(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Sg(dij);
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
