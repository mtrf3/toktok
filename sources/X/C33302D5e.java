package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33302D5e extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33302D5e() {
        C32856Cuy.R3(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(29.75f, 31.16f);
        dij.LJIIL(4.64f, 4.64f);
        dij.LJIIL(-4.64f, 4.64f);
        C32856Cuy.e4(dij);
        dij.LJIIL(4.64f, -4.64f);
        dij.LJIIL(4.64f, 4.64f);
        C32856Cuy.t0(dij);
        dij.LJIIL(-4.64f, -4.64f);
        dij.LJIIL(4.64f, -4.64f);
        C32856Cuy.d2(dij);
        dij.LJIIL(-4.64f, 4.64f);
        dij.LJIIL(-4.64f, -4.64f);
        C32856Cuy.b4(dij);
        dij.LIZLLL();
        C32856Cuy.LLJILLL(dij);
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
