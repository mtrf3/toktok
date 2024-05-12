package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5Q extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5Q() {
        this.LIZJ.LJIIIIZZ(14.0f, 16.25f);
        this.LIZJ.LJIIIZ(4.25f, 4.25f, true, false, 0.0f, 8.5f);
        this.LIZJ.LJIIIZ(4.25f, 4.25f, false, false, 0.0f, -8.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(14.0f, 25.75f);
        this.LIZJ.LJIIIZ(6.85f, 6.85f, false, false, -6.5f, 4.69f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.94f, 1.33f);
        this.LIZJ.LJIIJJI(11.12f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.93f, -1.33f);
        this.LIZJ.LIZJ(6.85f, 6.85f, false, false, 14.0f, 25.75f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(25.5f, 18.0f);
        C32856Cuy.LLJLILLLLZIIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(25.0f, 23.5f);
        C32856Cuy.b5(this.LIZJ);
        C32856Cuy.pm(this.LIZJ);
        this.LIZJ.LIZLLL();
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(25.5f, 28.0f);
        C32856Cuy.LLJLILLLLZIIL(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.a(dij);
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
