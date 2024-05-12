package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33164Czw extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33164Czw() {
        C32856Cuy.gj(this.LIZJ);
        this.LIZJ.LJIIJJI(14.3f);
        this.LIZJ.LJIIIZ(14.92f, 14.92f, false, true, -1.76f, -4.0f);
        C32856Cuy.z(this.LIZJ);
        this.LIZJ.LJIILL(9.85f);
        this.LIZJ.LJIIJ(1.45f, 0.52f, 2.8f, 1.24f, 4.0f, 2.15f);
        C32856Cuy.LLFII(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(21.0f, 35.0f);
        dij.LJIIJ(0.0f, -1.39f, 0.19f, -2.73f, 0.54f, -4.0f);
        C32856Cuy.J4(dij);
        dij.LJIILL(2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        dij.LJIIJJI(9.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(22.73f, 28.0f);
        dij.LJIIJ(0.8f, -1.5f, 1.84f, -2.85f, 3.07f, -4.0f);
        C32856Cuy.x6(dij);
        C32856Cuy.Zj(dij);
        dij.LJIIJJI(1.73f);
        dij.LIZLLL();
        dij.LJIIIIZZ(12.0f, 24.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        dij.LJIILL(2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        dij.LJIIJJI(4.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        dij.LJIILL(-2.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.V(dij);
        dij.LJIIIIZZ(25.0f, 35.0f);
        dij.LJIIIZ(11.0f, 11.0f, true, true, 21.99f, -0.01f);
        dij.LIZJ(11.0f, 11.0f, false, true, 25.0f, 35.0f);
        dij.LIZLLL();
        C32856Cuy.Ue(dij);
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
