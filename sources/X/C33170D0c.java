package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33170D0c extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33170D0c() {
        this.LIZJ.LJIIIIZZ(19.77f, 17.7f);
        C32856Cuy.md(this.LIZJ);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, true, 19.0f, 30.0f);
        C32856Cuy.q9(this.LIZJ);
        C32856Cuy.q8(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Tn(dij);
        dij.LJIILIIL(5.0f, -2.0f);
        C32856Cuy.Q9(dij);
        dij.LJIILL(24.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        dij.LJI(12.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        dij.LJIJ(12.0f);
        dij.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
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
