package X;

import android.graphics.SurfaceTexture;

/* loaded from: classes10.dex */
public final class M2S implements InterfaceC47667InH {
    public final /* synthetic */ M2Q LJLIL;

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public M2S(M2Q m2q) {
        this.LJLIL = m2q;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        M2Q m2q = this.LJLIL;
        if (m2q.LJZ) {
            m2q.LJZ = false;
            m2q.LJIILLIIL();
        }
    }
}
