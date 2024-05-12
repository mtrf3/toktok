package com.lynx.tasm.behavior.ui;

import X.VPA;

/* loaded from: classes15.dex */
public class LynxFlattenUI$$PropsSetter extends LynxBaseUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxFlattenUI lynxFlattenUI = (LynxFlattenUI) lynxBaseUI;
        str.getClass();
        if (!str.equals("opacity")) {
            if (!str.equals("transform")) {
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            } else {
                lynxFlattenUI.setTransform(vpa.LIZ(str));
                return;
            }
        }
        lynxFlattenUI.setAlpha(vpa.LJ(str, 1.0f));
    }
}
