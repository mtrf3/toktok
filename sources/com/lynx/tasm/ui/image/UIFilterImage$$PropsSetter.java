package com.lynx.tasm.ui.image;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class UIFilterImage$$PropsSetter extends UIImage$$PropsSetter {
    @Override // com.lynx.tasm.ui.image.UIImage$$PropsSetter, com.lynx.tasm.behavior.ui.image.AbsUIImage$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        UIFilterImage uIFilterImage = (UIFilterImage) lynxBaseUI;
        str.getClass();
        if (!str.equals("drop-shadow")) {
            super.LIZ(lynxBaseUI, str, vpa);
        } else {
            uIFilterImage.setDropShadow(vpa.LJII(str));
        }
    }
}
