package com.bytedance.ies.xelement;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxImpressionView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxImpressionView lynxImpressionView = (LynxImpressionView) lynxBaseUI;
        str.getClass();
        if (!str.equals("impression-percent")) {
            super.LIZ(lynxBaseUI, str, vpa);
        } else {
            lynxImpressionView.impressionPercent(vpa.LJFF(str, 0));
        }
    }
}
