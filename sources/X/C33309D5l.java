package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33309D5l extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33309D5l() {
        C32856Cuy.Oe(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(21.15f, 15.49f);
        dij.LJII(16.44f, 31.0f);
        dij.LJIIJJI(4.16f);
        dij.LJIIL(0.81f, -3.26f);
        dij.LJIIJJI(5.1f);
        dij.LJIIL(0.82f, 3.26f);
        dij.LJIIJJI(4.16f);
        dij.LJIIL(-4.71f, -15.51f);
        dij.LJIIJJI(-5.63f);
        dij.LIZLLL();
        dij.LJIILIIL(4.6f, 9.17f);
        dij.LJI(22.2f);
        dij.LJIIL(1.7f, -6.75f);
        C32856Cuy.c0(dij);
        dij.LJIIL(1.7f, 6.75f);
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
