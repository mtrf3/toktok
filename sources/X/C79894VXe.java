package X;

import android.view.Surface;

/* renamed from: X.VXe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79894VXe implements VGX {
    public final /* synthetic */ C79895VXf LIZ;

    @Override // X.VGX
    public final int LIZ() {
        return this.LIZ.LJLJJLL.getCurFrame();
    }

    public C79894VXe(C79895VXf c79895VXf) {
        this.LIZ = c79895VXf;
    }

    @Override // X.VGX
    public final void LIZIZ(Surface surface) {
        if (!surface.isValid()) {
            return;
        }
        Surface surface2 = this.LIZ.LJLJL;
        if (surface2 != null) {
            surface2.release();
        }
        C79895VXf c79895VXf = this.LIZ;
        c79895VXf.LJLJL = surface;
        c79895VXf.LJLIL = true;
        try {
            C79895VXf c79895VXf2 = this.LIZ;
            c79895VXf2.LJLJJLL.setSurface(c79895VXf2.LJLJL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LIZ.LJLJJLL.resume();
    }
}
