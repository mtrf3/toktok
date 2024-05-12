package com.bytedance.ies.xelement;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* loaded from: classes11.dex */
public class LynxSeekerManager$$PropsSetter extends LynxUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxSeekerManager lynxSeekerManager = (LynxSeekerManager) lynxBaseUI;
        str.getClass();
        if (!str.equals("duration")) {
            if (!str.equals("currentDuration")) {
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            } else {
                lynxSeekerManager.setProgress(vpa.LJFF(str, 0));
                return;
            }
        }
        lynxSeekerManager.setDuration(vpa.LJFF(str, 0));
    }
}
