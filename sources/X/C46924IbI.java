package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.lang.ref.WeakReference;

/* renamed from: X.IbI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46924IbI extends C46742IWc implements InterfaceC47692Ing {
    @Override // X.InterfaceC47692Ing
    public final void LIZ() {
    }

    @Override // X.InterfaceC47692Ing
    public final void LIZIZ() {
    }

    public C46924IbI(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    @Override // X.InterfaceC47692Ing
    public final void LIZJ(SurfaceWrapper surfaceWrapper) {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player != null && surfaceWrapper == player.LJJIJLIJ()) {
            player.LLILZIL(null);
        }
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIJJI(Surface surface) {
        C47282Ih4 q7 = this.LJLILLLLZI.q7();
        if (q7 != null && q7.LJJIJIIJIL && (surface instanceof SurfaceWrapper)) {
            ((SurfaceWrapper) surface).mListener = new WeakReference<>(this);
        }
    }
}
