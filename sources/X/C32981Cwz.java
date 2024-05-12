package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32981Cwz extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C32981Cwz() {
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -16726295);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(20.3f, 20.7f);
        dij.LJIIL(10.65f, -10.65f);
        dij.LIZJ(1.2f, 1.2f, false, false, 30.1f, 8.0f);
        C32856Cuy.o6(dij);
        dij.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        dij.LJIILL(22.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, 5.0f);
        dij.LJIIJJI(22.0f);
        dij.LJIIIZ(5.0f, 5.0f, false, false, 5.0f, -5.0f);
        dij.LJIJ(17.9f);
        dij.LJIIIZ(1.2f, 1.2f, false, false, -2.05f, -0.85f);
        dij.LJII(27.3f, 27.7f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.7f, 0.29f);
        C32856Cuy.x6(dij);
        C32856Cuy.xn(dij);
        dij.LJIILL(-5.59f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.3f, -0.7f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIILIIL(36.5f, 9.0f);
        dij2.LJIIL(2.5f, 2.5f);
        dij2.LJII(25.5f, 25.0f);
        C32856Cuy.z6(dij2);
        C32856Cuy.LJJJLZIJ(dij2);
        dij2.LJII(36.5f, 9.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
