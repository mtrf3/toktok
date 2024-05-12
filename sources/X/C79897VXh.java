package X;

import android.view.Surface;

/* renamed from: X.VXh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79897VXh implements VGX {
    public final /* synthetic */ C79898VXi LIZ;

    @Override // X.VGX
    public final int LIZ() {
        return this.LIZ.LJZ.getCurFrame();
    }

    public C79897VXh(C79898VXi c79898VXi) {
        this.LIZ = c79898VXi;
    }

    @Override // X.VGX
    public final void LIZIZ(Surface surface) {
        if (!surface.isValid()) {
            return;
        }
        Surface surface2 = this.LIZ.LJZI;
        if (surface2 != null) {
            surface2.release();
        }
        C79898VXi c79898VXi = this.LIZ;
        c79898VXi.LJZI = surface;
        c79898VXi.LJLLJ = true;
        try {
            C79898VXi c79898VXi2 = this.LIZ;
            c79898VXi2.LJZ.setSurface(c79898VXi2.LJZI);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LIZ.LJZ.resume();
    }
}
