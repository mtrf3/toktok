package com.bytedance.ies.xelement.viewpager.foldview;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class LynxFoldViewNG$$PropsSetter extends BaseLynxFoldView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxFoldViewNG lynxFoldViewNG = (LynxFoldViewNG) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2081198901:
                if (str.equals("android-enable-touch-stop-fling")) {
                    lynxFoldViewNG.setEnableTouchStopFling(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1056707280:
                if (str.equals("toolbar-interaction-enable")) {
                    lynxFoldViewNG.setToolbarInteractionEnable(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -183516802:
                if (str.equals("header-scrollview-enable")) {
                    lynxFoldViewNG.setHeaderScrollViewEnable(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 898500533:
                if (str.equals("android-header-over-slot")) {
                    lynxFoldViewNG.setAndroidHeaderOverSlot(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1619605242:
                if (str.equals("tab-movable-enable")) {
                    lynxFoldViewNG.setTabMovableEnable(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2038700809:
                if (str.equals("android-nested-scroll-as-child")) {
                    lynxFoldViewNG.setNestedScrollAsChild(vpa.LIZIZ(str, false));
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
