package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33187D0t extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33187D0t() {
        this.LIZJ.LJIIIIZZ(32.48f, 22.35f);
        C32856Cuy.y5(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-2.13f, -2.12f);
        C32856Cuy.A5(this.LIZJ);
        this.LIZJ.LJII(22.0f, 27.17f);
        this.LIZJ.LJIIL(-3.65f, -3.64f);
        C32856Cuy.A5(this.LIZJ);
        C32856Cuy.Ja(this.LIZJ);
        C32856Cuy.x5(this.LIZJ);
        this.LIZJ.LJIIL(6.12f, 6.12f);
        C32856Cuy.a4(this.LIZJ);
        this.LIZJ.LJIIL(10.13f, -10.12f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Vf(dij);
        dij.LJIILIIL(12.0f, 11.0f);
        C32856Cuy.W7(dij);
        C32856Cuy.a8(dij);
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
