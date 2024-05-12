package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33423D9v extends AbstractC39455Fe7 {
    public C33423D9v() {
        this.LIZJ.LJIILIIL(14.6f, 9.46f);
        this.LIZJ.LJIIL(21.0f, -3.2f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 38.0f, 8.22f);
        C32856Cuy.G9(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, 3.5f, -3.5f, 6.0f, -7.1f, 5.78f);
        this.LIZJ.LIZJ(4.15f, 4.15f, false, true, 27.0f, 34.5f);
        C32856Cuy.Td(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(13.66f);
        this.LIZJ.LJII(17.0f, 16.4f);
        C32856Cuy.J9(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.0f, 3.5f, -3.5f, 6.0f, -7.1f, 5.78f);
        this.LIZJ.LIZJ(4.15f, 4.15f, false, true, 6.0f, 37.5f);
        C32856Cuy.Td(this.LIZJ);
        this.LIZJ.LJIJ(11.42f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.6f, -1.96f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
