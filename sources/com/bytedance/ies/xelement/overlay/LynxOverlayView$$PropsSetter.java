package com.bytedance.ies.xelement.overlay;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxOverlayView$$PropsSetter extends UIGroup$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        Boolean valueOf;
        LynxOverlayView lynxOverlayView = (LynxOverlayView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1987814405:
                if (str.equals("always-show")) {
                    lynxOverlayView.setAlwaysShow(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1952821320:
                if (str.equals("overlay-id")) {
                    lynxOverlayView.setOverlayId(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1389050563:
                if (str.equals("events-pass-through")) {
                    lynxOverlayView.setEventsPassThrough(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -939362323:
                if (str.equals("cut-out-mode")) {
                    lynxOverlayView.setCutOutMode(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -865043584:
                if (str.equals("android-set-soft-input-mode")) {
                    lynxOverlayView.setAndroidSetSoftInputMode(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -243354428:
                if (str.equals("status-bar-translucent")) {
                    lynxOverlayView.setStatusBarTranslucent(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 272778088:
                if (str.equals("status-bar-translucent-style")) {
                    lynxOverlayView.setStatusBarTranslucentStyle(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 466743410:
                if (str.equals("visible")) {
                    lynxOverlayView.setVisible(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1011660130:
                if (str.equals("compat-bounding-rect")) {
                    if (vpa.LJIIIZ(str)) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(vpa.LIZIZ(str, false));
                    }
                    lynxOverlayView.setShouldOffsetBoundingRect(valueOf);
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1330942754:
                if (str.equals("android-enable-accessibility")) {
                    lynxOverlayView.setEnableAccessibility(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1860950378:
                if (str.equals("full-screen")) {
                    lynxOverlayView.setFullScreen(vpa.LIZIZ(str, false));
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
