package com.ss.android.elearning.lingo.lynx.component.overlay;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxOverlayViewNG$$PropsSetter extends UIGroup$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxOverlayViewNG lynxOverlayViewNG = (LynxOverlayViewNG) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1987814405:
                if (str.equals("always-show")) {
                    lynxOverlayViewNG.setAlwaysShow(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1389050563:
                if (str.equals("events-pass-through")) {
                    lynxOverlayViewNG.setEventsPassThrough(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -939362323:
                if (str.equals("cut-out-mode")) {
                    lynxOverlayViewNG.setCutOutMode(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -865043584:
                if (str.equals("android-set-soft-input-mode")) {
                    lynxOverlayViewNG.setAndroidSetSoftInputMode(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -243354428:
                if (str.equals("status-bar-translucent")) {
                    lynxOverlayViewNG.setStatusBarTranslucent(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 102865796:
                if (str.equals("level")) {
                    lynxOverlayViewNG.setLevel(vpa.LJFF(str, 1));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 272778088:
                if (str.equals("status-bar-translucent-style")) {
                    lynxOverlayViewNG.setStatusBarTranslucentStyle(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 466743410:
                if (str.equals("visible")) {
                    lynxOverlayViewNG.setVisible(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 509801442:
                if (str.equals("nest-scroll")) {
                    lynxOverlayViewNG.setNestScroll(vpa.LJII(str));
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
