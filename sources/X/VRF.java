package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.overlay.ng.LynxOverlayViewProxyNG;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VRF extends VRK {
    public final /* synthetic */ LynxOverlayViewProxyNG LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VRF(LynxOverlayViewProxyNG lynxOverlayViewProxyNG, Context context) {
        super(context);
        this.LJLIL = lynxOverlayViewProxyNG;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIJ(changedView, "changedView");
        if (i == 8) {
            this.LJLIL.onDetach();
        } else {
            LynxOverlayViewProxyNG lynxOverlayViewProxyNG = this.LJLIL;
            if (lynxOverlayViewProxyNG.mLastVisibleState == 8) {
                lynxOverlayViewProxyNG.onAttach();
            }
        }
        this.LJLIL.mLastVisibleState = i;
    }
}
