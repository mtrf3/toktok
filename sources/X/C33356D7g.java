package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33356D7g extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33356D7g() {
        this.LIZJ.LJIIIIZZ(40.36f, 22.38f);
        C32856Cuy.s0(this.LIZJ);
        this.LIZJ.LJII(34.0f, 24.5f);
        this.LIZJ.LJII(22.62f, 13.12f);
        C32856Cuy.Z5(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -15686971);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(27.36f, 22.38f);
        C32856Cuy.s0(dij);
        dij.LJII(21.0f, 24.5f);
        dij.LJII(9.62f, 13.12f);
        C32856Cuy.Z5(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-14625300);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
