package X;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* renamed from: X.TlS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC75582TlS implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C76120Tu8 LJLIL;

    public ViewTreeObserverOnGlobalLayoutListenerC75582TlS(C76120Tu8 c76120Tu8) {
        this.LJLIL = c76120Tu8;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C76696U8e r1;
        String layoutId;
        InterfaceC75579TlP interfaceC75579TlP;
        C76120Tu8 c76120Tu8 = this.LJLIL;
        FrameLayout frameLayout = c76120Tu8.LJLJLJ;
        if (frameLayout != null) {
            if (frameLayout.getWidth() != c76120Tu8.LLD || frameLayout.getHeight() != c76120Tu8.LLF) {
                c76120Tu8.LLD = frameLayout.getWidth();
                c76120Tu8.LLF = frameLayout.getHeight();
                InterfaceC75579TlP interfaceC75579TlP2 = c76120Tu8.LJLJL;
                if (interfaceC75579TlP2 != null && (r1 = interfaceC75579TlP2.r1()) != null && (layoutId = r1.getLayoutId()) != null && (interfaceC75579TlP = c76120Tu8.LJLJL) != null) {
                    interfaceC75579TlP.A1(layoutId, true);
                }
            }
        }
    }
}
