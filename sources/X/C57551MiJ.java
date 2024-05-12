package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.MiJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57551MiJ implements InterfaceC47667InH {
    public final /* synthetic */ ViewOnClickListenerC57546MiE LJLIL;

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C57551MiJ(ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE) {
        this.LJLIL = viewOnClickListenerC57546MiE;
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE = this.LJLIL;
        if (viewOnClickListenerC57546MiE.LJZ) {
            viewOnClickListenerC57546MiE.LJZ = false;
            viewOnClickListenerC57546MiE.LJIILLIIL();
        }
    }
}
