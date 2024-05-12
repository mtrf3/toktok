package X;

import android.content.Context;
import android.view.View;
import com.ss.android.elearning.lingo.lynx.component.overlay.LynxOverlayViewProxyNG;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VRE extends VRK {
    public final /* synthetic */ LynxOverlayViewProxyNG LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VRE(Context context, LynxOverlayViewProxyNG lynxOverlayViewProxyNG) {
        super(context);
        this.LJLIL = lynxOverlayViewProxyNG;
        new LinkedHashMap();
        new LinkedHashMap();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
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
