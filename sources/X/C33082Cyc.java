package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33082Cyc extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33082Cyc() {
        this.LIZJ.LJIIIIZZ(16.34f, 32.0f);
        C32856Cuy.ie(this.LIZJ);
        this.LIZJ.LJIIIIZZ(32.38f, 32.0f);
        C32856Cuy.id(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(10.32f, 7.0f);
        C32856Cuy.LLILII(dij);
        dij.LJ(2.0f, 13.36f, 2.0f, 14.27f, 2.0f, 15.32f);
        dij.LJIILL(17.36f);
        C32856Cuy.Ih(dij);
        C32856Cuy.Ll(dij);
        dij.LIZLLL();
        dij.LJIIIIZZ(7.1f, 11.22f);
        dij.LJIIJ(0.1f, -0.05f, 0.3f, -0.13f, 0.85f, -0.17f);
        dij.LIZJ(34.0f, 34.0f, false, true, 10.4f, 11.0f);
        dij.LJIIJJI(27.2f);
        dij.LJIIIZ(34.0f, 34.0f, false, true, 2.46f, 0.05f);
        dij.LJIIJ(0.55f, 0.04f, 0.75f, 0.12f, 0.85f, 0.17f);
        dij.LJIIJ(0.37f, 0.19f, 0.68f, 0.5f, 0.87f, 0.87f);
        dij.LJIIJ(0.05f, 0.1f, 0.13f, 0.3f, 0.17f, 0.85f);
        dij.LIZJ(34.0f, 34.0f, false, true, 42.0f, 15.4f);
        dij.LJIILL(17.2f);
        C32856Cuy.Bf(dij);
        dij.LIZJ(34.0f, 34.0f, false, true, 6.0f, 32.6f);
        dij.LJIJ(15.4f);
        C32856Cuy.o8(dij);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
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
