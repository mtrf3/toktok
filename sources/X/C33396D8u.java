package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33396D8u extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33396D8u() {
        this.LIZJ.LJIILIIL(16.59f, 22.59f);
        this.LIZJ.LJIIL(9.29f, -9.3f);
        C32856Cuy.oo(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJII(20.83f, 24.0f);
        C32856Cuy.Oj(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Sg(dij);
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
