package com.bytedance.ies.xelement.viewpager.foldview;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class BaseLynxFoldView$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        BaseLynxFoldView baseLynxFoldView = (BaseLynxFoldView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1662739435:
                if (str.equals("compat-container-popup")) {
                    baseLynxFoldView.setCompatContainerPopup(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1221994365:
                if (str.equals("scroll-enable")) {
                    baseLynxFoldView.setScrollEnable(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1819831630:
                if (str.equals("granularity")) {
                    baseLynxFoldView.setGranularity(vpa.LJ(str, 0.01f));
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
