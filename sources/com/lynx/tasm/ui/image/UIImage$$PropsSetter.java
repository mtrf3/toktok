package com.lynx.tasm.ui.image;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.image.AbsUIImage$$PropsSetter;

/* loaded from: classes15.dex */
public class UIImage$$PropsSetter extends AbsUIImage$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        UIImage uIImage = (UIImage) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    uIImage.setCapInsetsScale(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1338903714:
                if (str.equals("skip-redirection")) {
                    uIImage.setSkipRedirection(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1138223116:
                if (str.equals("image-config")) {
                    uIImage.setImageConfig(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -602643660:
                if (str.equals("fresco-nine-patch")) {
                    uIImage.setFrescoNinePatch(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 512852970:
                if (str.equals("subsample")) {
                    uIImage.setSubSample(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 516005201:
                if (str.equals("cap-insets")) {
                    uIImage.setCapInsetsBackUp(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 902281110:
                if (str.equals("suspendable")) {
                    uIImage.setSuspendable(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1090746891:
                if (str.equals("fresco-visible")) {
                    uIImage.setFrescoVisible(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1245269388:
                if (str.equals("fresco-attach")) {
                    uIImage.setFrescoAttach(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1672916293:
                if (str.equals("fix-fresco-bug")) {
                    uIImage.fixFrescoWebPBug(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1739487650:
                if (str.equals("defer-src-invalidation")) {
                    uIImage.setDeferInvalidation(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1941332754:
                if (str.equals("visibility")) {
                    uIImage.setVisibility(vpa.LJFF(str, 0));
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
