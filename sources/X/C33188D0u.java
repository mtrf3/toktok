package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33188D0u extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33188D0u() {
        this.LIZJ.LJIILIIL(18.5f, 21.64f);
        this.LIZJ.LJIIL(10.72f, 10.72f);
        C32856Cuy.yd(this.LIZJ);
        this.LIZJ.LJII(21.32f, 18.8f);
        this.LIZJ.LJIIJJI(8.32f);
        C32856Cuy.xa(this.LIZJ);
        this.LIZJ.LJI(16.49f);
        C32856Cuy.ym(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(13.14f);
        C32856Cuy.N8(this.LIZJ);
        C78269Unh.LIZJ(this.LIZJ, "p", -8.31f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.q5(dij);
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
