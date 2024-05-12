package Y;

import X.C81477VyL;
import X.InterfaceC65784Pro;
import X.VRE;
import X.VRF;
import X.VRG;
import android.view.ViewTreeObserver;
import com.bytedance.ies.xelement.overlay.LynxOverlayViewProxy;
import com.ss.android.elearning.lingo.lynx.component.overlay.LynxOverlayViewProxyNG;

/* loaded from: classes15.dex */
public class IDLListenerS64S0200000_14 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onGlobalLayout$2(IDLListenerS64S0200000_14 iDLListenerS64S0200000_14) {
        LynxOverlayViewProxyNG.createView$lambda$2$lambda$1((VRE) iDLListenerS64S0200000_14.l0, (LynxOverlayViewProxyNG) iDLListenerS64S0200000_14.l1);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS64S0200000_14 iDLListenerS64S0200000_14) {
        int[] iArr = new int[2];
        ((VRF) iDLListenerS64S0200000_14.l0).getLocationOnScreen(iArr);
        if (((VRF) iDLListenerS64S0200000_14.l0).getWidth() != 0 && ((VRF) iDLListenerS64S0200000_14.l0).getHeight() != 0) {
            if (iArr[0] >= ((com.bytedance.ies.xelement.overlay.ng.LynxOverlayViewProxyNG) iDLListenerS64S0200000_14.l1).getScreenWidth() || iArr[0] <= (-((VRF) iDLListenerS64S0200000_14.l0).getWidth()) || iArr[1] >= ((com.bytedance.ies.xelement.overlay.ng.LynxOverlayViewProxyNG) iDLListenerS64S0200000_14.l1).getScreenHeight() || iArr[1] <= 0 - ((VRF) iDLListenerS64S0200000_14.l0).getHeight()) {
                ((com.bytedance.ies.xelement.overlay.ng.LynxOverlayViewProxyNG) iDLListenerS64S0200000_14.l1).onDetach();
            }
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS64S0200000_14 iDLListenerS64S0200000_14) {
        int i;
        int[] iArr = new int[2];
        ((VRG) iDLListenerS64S0200000_14.l0).getLocationOnScreen(iArr);
        if (((VRG) iDLListenerS64S0200000_14.l0).getWidth() != 0 && ((VRG) iDLListenerS64S0200000_14.l0).getHeight() != 0) {
            int i2 = iArr[0];
            if (i2 >= ((LynxOverlayViewProxy) iDLListenerS64S0200000_14.l1).LJLJJI || i2 <= (-((VRG) iDLListenerS64S0200000_14.l0).getWidth()) || (i = iArr[1]) >= ((LynxOverlayViewProxy) iDLListenerS64S0200000_14.l1).LJLJI || i <= 0 - ((VRG) iDLListenerS64S0200000_14.l0).getHeight()) {
                ((LynxOverlayViewProxy) iDLListenerS64S0200000_14.l1).onDetach();
            }
        }
    }

    public static final void onGlobalLayout$3(IDLListenerS64S0200000_14 iDLListenerS64S0200000_14) {
        ((C81477VyL) iDLListenerS64S0200000_14.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS64S0200000_14);
        ((InterfaceC65784Pro) iDLListenerS64S0200000_14.l1).invoke();
    }

    public IDLListenerS64S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
