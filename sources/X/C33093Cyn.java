package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33093Cyn extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33093Cyn() {
        this.LIZJ.LJIIIIZZ(17.0f, 14.0f);
        C32856Cuy.aj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(17.0f, 22.0f);
        C32856Cuy.aj(this.LIZJ);
        this.LIZJ.LJIIIIZZ(16.0f, 31.0f);
        C32856Cuy.W4(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(6.0f, 10.0f);
        C32856Cuy.Hf(dij);
        C32856Cuy.LJIJJ(dij);
        C32856Cuy.If(dij);
        C32856Cuy.LJLLL(dij);
        dij.LJIIIZ(7.0f, 7.0f, false, true, -7.0f, 7.0f);
        C32856Cuy.o6(dij);
        dij.LJIIIZ(7.0f, 7.0f, false, true, -7.0f, -7.0f);
        C32856Cuy.LLZLI(dij);
        dij.LJIILIIL(7.0f, -3.0f);
        C32856Cuy.LJIJJ(dij);
        C32856Cuy.fl(dij);
        C32856Cuy.LJLLL(dij);
        C32856Cuy.cj(dij);
        C32856Cuy.h9(dij);
        dij.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
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
