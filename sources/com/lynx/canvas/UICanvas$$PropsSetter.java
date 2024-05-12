package com.lynx.canvas;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* loaded from: classes11.dex */
public class UICanvas$$PropsSetter extends LynxUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        str.getClass();
        if (!str.equals("name")) {
            super.LIZ(lynxBaseUI, str, vpa);
        } else {
            lynxBaseUI.setName(vpa.LJII(str));
        }
    }
}
