package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33189D0v extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33189D0v() {
        this.LIZJ.LJIIIIZZ(29.32f, 21.64f);
        this.LIZJ.LJII(18.6f, 32.36f);
        C32856Cuy.nk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.41f, -1.41f);
        C32856Cuy.vk(this.LIZJ);
        this.LIZJ.LJII(26.49f, 18.8f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-8.31f);
        C32856Cuy.z4(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(13.14f);
        C32856Cuy.wm(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(13.14f);
        C32856Cuy.Ob(this.LIZJ);
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
