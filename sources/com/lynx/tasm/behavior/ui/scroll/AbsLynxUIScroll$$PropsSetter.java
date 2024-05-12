package com.lynx.tasm.behavior.ui.scroll;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class AbsLynxUIScroll$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        AbsLynxUIScroll absLynxUIScroll = (AbsLynxUIScroll) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2039913758:
                if (str.equals("block-descendant-focusability")) {
                    absLynxUIScroll.setBlockDescendantFocusability(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -2032847360:
                if (str.equals("scroll-to-index")) {
                    absLynxUIScroll.scrollToIndex(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1571036001:
                if (str.equals("lower-threshold")) {
                    absLynxUIScroll.setLowerThreshole(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -445000626:
                if (str.equals("enable-new-nested")) {
                    absLynxUIScroll.setEnableNewNested(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -402166408:
                if (str.equals("scroll-x")) {
                    absLynxUIScroll.setScrollX(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -402166407:
                if (str.equals("scroll-y")) {
                    absLynxUIScroll.setScrollY(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -169901481:
                if (str.equals("enable-scroll")) {
                    absLynxUIScroll.setEnableScroll(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 65137827:
                if (str.equals("scroll-tap")) {
                    absLynxUIScroll.setScrollTap(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 65138261:
                if (str.equals("scroll-top")) {
                    absLynxUIScroll.setScrollTop(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 257565167:
                if (str.equals("forbid-fling-focus-change")) {
                    absLynxUIScroll.setForbidFlingFocusChange(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 660290816:
                if (str.equals("upper-threshold")) {
                    absLynxUIScroll.setUpperThreshole(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1751260029:
                if (str.equals("scroll-bar-enable")) {
                    absLynxUIScroll.setScrollBarEnable(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2019037959:
                if (str.equals("scroll-left")) {
                    absLynxUIScroll.setScrollLeft(vpa.LJFF(str, 0));
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
