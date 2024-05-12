package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33149Czh extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33149Czh() {
        this.LIZJ.LJIIIIZZ(20.53f, 26.35f);
        C32856Cuy.df(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(6.65f, 5.28f);
        dij.LJ(6.0f, 6.56f, 6.0f, 8.24f, 6.0f, 11.6f);
        dij.LJIILL(24.8f);
        C32856Cuy.g7(dij);
        C32856Cuy.Bb(dij);
        C32856Cuy.Fa(dij);
        dij.LJIJ(11.6f);
        C32856Cuy.d4(dij);
        dij.LJ(37.44f, 2.0f, 35.76f, 2.0f, 32.4f, 2.0f);
        dij.LJI(15.6f);
        dij.LJIIJ(-3.36f, 0.0f, -5.04f, 0.0f, -6.32f, 0.65f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -2.63f, 2.63f);
        dij.LIZLLL();
        dij.LJIILIIL(19.96f, 6.75f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.95f, 0.7f);
        C32856Cuy.bf(dij);
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
