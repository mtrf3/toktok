package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33198D1e extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33198D1e() {
        C32856Cuy.Tj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(8.36f);
        C32856Cuy.sf(this.LIZJ);
        C32856Cuy.LJJLIIIIJ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        p2.LJIIJJI(-1.0f);
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        p2.LJIJ(10.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        p2.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(29.0f, 23.0f);
        C32856Cuy.rj(dij);
        C32856Cuy.LJLIIL(dij);
        dij.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        dij.LJIIJJI(7.0f);
        C32856Cuy.LLLLZI(dij);
        C32856Cuy.X(dij);
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
