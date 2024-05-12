package X;

import android.view.View;

/* renamed from: X.W1z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81631W1z extends TMN {
    public final /* synthetic */ W20 LIZ;

    @Override // X.TMN
    public final void LIZ(View view) {
    }

    public C81631W1z(W20 w20) {
        this.LIZ = w20;
    }

    @Override // X.TMN
    public final void LIZIZ(int i, View view) {
        InterfaceC81630W1y interfaceC81630W1y;
        WMH wmh;
        if (i == 5) {
            W20 w20 = this.LIZ;
            WM7 wm7 = w20.mParentScene;
            if ((wm7 instanceof WMH) && (wmh = (WMH) wm7) != null) {
                wmh.hide(w20);
            }
            if (C1DG.LJIIIIZZ() && (interfaceC81630W1y = w20.LJLJJL) != null) {
                interfaceC81630W1y.SR(true);
            }
            InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(w20);
            if (LIZIZ != null) {
                LIZIZ.unRegisterActivityOnKeyDownListener(w20);
                LIZIZ.unRegisterActivityResultListener(w20);
            }
        }
    }
}
