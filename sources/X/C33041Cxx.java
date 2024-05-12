package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33041Cxx extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33041Cxx() {
        this.LIZJ.LJIILIIL(14.45f, 19.4f);
        this.LIZJ.LJIIL(-5.3f, 5.3f);
        this.LIZJ.LIZJ(10.0f, 10.0f, true, false, 23.3f, 38.86f);
        C32856Cuy.ai(this.LIZJ);
        C32856Cuy.LLLFFI(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-5.3f, 5.3f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, true, true, -9.9f, -9.9f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(5.3f, -5.3f);
        C32856Cuy.y5(this.LIZJ);
        C32856Cuy.LLLFFI(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.55f, 28.6f);
        C32856Cuy.LLJJJIL(this.LIZJ);
        C32856Cuy.gf(this.LIZJ);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, true, false, -9.9f, -9.9f);
        C32856Cuy.Ng(this.LIZJ);
        C32856Cuy.gf(this.LIZJ);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, true, true, 14.15f, 14.13f);
        Q7L.LIZLLL(this.LIZJ, "p", -5.3f, 5.3f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(17.64f, 28.24f);
        C32856Cuy.LLJJIII(dij);
        dij.LJIIL(1.41f, 1.41f);
        C32856Cuy.LLIIZ(dij);
        dij.LJIIL(10.61f, -10.6f);
        C32856Cuy.Bd(dij);
        dij.LJIIL(-10.61f, 10.6f);
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
