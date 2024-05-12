package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33329D6f extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33329D6f() {
        C32856Cuy.O3(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(47.15f, 33.3f);
        C32856Cuy.wk(dij);
        dij.LJIIL(-7.91f, 7.92f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.83f, 0.0f);
        dij.LJIIL(-4.92f, -4.92f);
        C32856Cuy.We(dij);
        dij.LJIIL(3.5f, 3.5f);
        dij.LJIIL(6.5f, -6.5f);
        C32856Cuy.Vj(dij);
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
