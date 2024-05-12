package com.lynx.component.svg;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* loaded from: classes11.dex */
public class UISvg$$PropsSetter extends LynxUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        UISvg uISvg = (UISvg) lynxBaseUI;
        str.getClass();
        if (!str.equals("src")) {
            if (!str.equals("content")) {
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            } else {
                uISvg.setContent(vpa.LJII(str));
                return;
            }
        }
        uISvg.setSource(vpa.LJII(str));
    }
}
