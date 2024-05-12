package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.overlay.LynxOverlayViewProxy;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VRG extends VRK {
    public final /* synthetic */ LynxOverlayViewProxy LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VRG(LynxOverlayViewProxy lynxOverlayViewProxy, Context context) {
        super(context);
        this.LJLIL = lynxOverlayViewProxy;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIJ(changedView, "changedView");
        if (i == 8) {
            this.LJLIL.onDetach();
        } else {
            LynxOverlayViewProxy lynxOverlayViewProxy = this.LJLIL;
            if (lynxOverlayViewProxy.LJLILLLLZI == 8) {
                lynxOverlayViewProxy.onAttach();
            }
        }
        this.LJLIL.LJLILLLLZI = i;
    }
}
