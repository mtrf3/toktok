package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33252D3g extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33252D3g() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(29.0f, 30.0f);
        C32856Cuy.La(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.X5(dij);
        dij.LJIILIIL(0.0f, 4.0f);
        dij.LJIIJJI(36.0f);
        dij.LJIILL(4.5f);
        dij.LJI(6.0f);
        dij.LJIJ(11.0f);
        dij.LIZLLL();
        dij.LJIILIIL(0.0f, 8.5f);
        C32856Cuy.LJJIIZ(dij);
        C32856Cuy.K9(dij);
        dij.LJI(6.0f);
        dij.LJIJ(19.5f);
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
