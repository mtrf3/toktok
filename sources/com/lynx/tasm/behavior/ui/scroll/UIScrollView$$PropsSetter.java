package com.lynx.tasm.behavior.ui.scroll;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class UIScrollView$$PropsSetter extends AbsLynxUIScroll$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        UIScrollView uIScrollView = (UIScrollView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1305579111:
                if (str.equals("enable-nested-scroll")) {
                    uIScrollView.setEnableNestedScroll(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 293962082:
                if (str.equals("fading-edge-length")) {
                    uIScrollView.setFadingEdgeLength(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 616977828:
                if (str.equals("android-preference-consume-gesture")) {
                    uIScrollView.setPreferenceConsumeGesture(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1013897100:
                if (str.equals("force-can-scroll")) {
                    uIScrollView.setForceCanScroll(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1868120577:
                if (str.equals("android-enable-new-bounce")) {
                    uIScrollView.setEnableNewBounce(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            default:
                super.LIZ(lynxBaseUI, str, vpa);
                return;
        }
    }
}
