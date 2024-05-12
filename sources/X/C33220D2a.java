package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33220D2a extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33220D2a() {
        C32856Cuy.D3(this.LIZJ);
        this.LIZJ.LJIIJJI(15.51f);
        this.LIZJ.LJIIL(-3.75f, -3.76f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 0.0f, -8.48f);
        this.LIZJ.LJIIL(4.15f, -4.15f);
        this.LIZJ.LJ(24.66f, 27.6f, 22.0f, 27.0f, 19.0f, 27.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(35.7f, 42.88f);
        dij.LJII(31.84f, 39.0f);
        C32856Cuy.Eh(dij);
        dij.LJI(31.83f);
        C32856Cuy.U2(dij);
        C32856Cuy.Wi(dij);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.41f, 0.0f);
        dij.LJIIL(1.42f, -1.42f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
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
