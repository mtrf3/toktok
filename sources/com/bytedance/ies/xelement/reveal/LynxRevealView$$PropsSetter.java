package com.bytedance.ies.xelement.reveal;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxRevealView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxRevealView lynxRevealView = (LynxRevealView) lynxBaseUI;
        str.getClass();
        if (!str.equals("mode")) {
            super.LIZ(lynxBaseUI, str, vpa);
        } else {
            lynxRevealView.setRevealLayoutMode(vpa.LJII(str));
        }
    }
}
