package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33193D0z extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33193D0z() {
        C32856Cuy.Ln(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(32.5f, 37.25f);
        C32856Cuy.J1(dij);
        C32856Cuy.LJIIJJI(dij);
        C32856Cuy.Hi(dij);
        C32856Cuy.K6(dij);
        C32856Cuy.LLJJJ(dij);
        C32856Cuy.LJJJJZI(dij);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
