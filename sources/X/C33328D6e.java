package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33328D6e extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33328D6e() {
        C32856Cuy.D3(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(9.5f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, true, 1.81f, -5.48f);
        this.LIZJ.LJIIL(5.15f, -4.78f);
        this.LIZJ.LJIIIZ(11.5f, 11.5f, false, true, -0.14f, -5.94f);
        this.LIZJ.LIZJ(19.06f, 19.06f, false, false, 19.0f, 27.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(38.5f, 24.0f);
        dij.LJIIIZ(7.5f, 7.5f, false, false, -6.34f, 11.51f);
        dij.LJIIL(-8.07f, 8.08f);
        dij.LJIIL(2.82f, 2.82f);
        dij.LJIIL(2.84f, -2.83f);
        dij.LJIIL(2.84f, 2.83f);
        dij.LJIIL(2.82f, -2.82f);
        dij.LJIIL(-2.83f, -2.84f);
        dij.LJIIL(2.55f, -2.55f);
        dij.LIZJ(7.5f, 7.5f, true, false, 38.5f, 24.0f);
        dij.LIZLLL();
        dij.LJIIIIZZ(35.0f, 31.5f);
        dij.LJIIIZ(3.5f, 3.5f, true, true, 7.0f, 0.0f);
        dij.LJIIIZ(3.5f, 3.5f, false, true, -7.0f, 0.0f);
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
