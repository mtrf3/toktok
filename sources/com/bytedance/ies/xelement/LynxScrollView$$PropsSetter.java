package com.bytedance.ies.xelement;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxScrollView$$PropsSetter extends AbsLynxUIScroll$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxScrollView lynxScrollView = (LynxScrollView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1826701651:
                if (str.equals("scroll-to-id")) {
                    lynxScrollView.scrollToId(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1383205240:
                if (str.equals("bounce")) {
                    lynxScrollView.setBounces(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1138034670:
                if (str.equals("enable-load-more")) {
                    lynxScrollView.enableLoadMore(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 363559068:
                if (str.equals("layout-direction")) {
                    lynxScrollView.setLayoutDirection(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 561570840:
                if (str.equals("overflow-text")) {
                    lynxScrollView.overflowText(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1292219859:
                if (str.equals("enable-custom-hittest")) {
                    lynxScrollView.setEnableCustomHittest(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1448017537:
                if (str.equals("page-enable")) {
                    lynxScrollView.setPageEnable(vpa.LIZIZ(str, false));
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
