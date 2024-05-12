package com.lynx.tasm.behavior.ui.image;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* loaded from: classes15.dex */
public class AbsUIImage$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        AbsUIImage absUIImage = (AbsUIImage) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    absUIImage.setCapInsetsScale(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1249491252:
                if (str.equals("cover-start")) {
                    absUIImage.setCoverStart(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -934531685:
                if (str.equals("repeat")) {
                    absUIImage.setRepeat(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -629825370:
                if (str.equals("loop-count")) {
                    absUIImage.setLoopCount(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -320982203:
                if (str.equals("disable-default-resize")) {
                    absUIImage.setDisableDefaultResize(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -256430480:
                if (str.equals("prefetch-width")) {
                    absUIImage.setPreFetchWidth(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 114148:
                if (str.equals("src")) {
                    absUIImage.setSource(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3357091:
                if (str.equals("mode")) {
                    absUIImage.setObjectFit(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 207594941:
                if (str.equals("prefetch-height")) {
                    absUIImage.setPreFetchHeight(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 516005201:
                if (str.equals("cap-insets")) {
                    absUIImage.setCapInsetsBackUp(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 598246771:
                if (str.equals("placeholder")) {
                    absUIImage.setPlaceholder(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 681292984:
                if (str.equals("blur-radius")) {
                    absUIImage.setBlurRadius(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1198809474:
                if (str.equals("disable-default-placeholder")) {
                    absUIImage.setDisableDefaultPlaceholder(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1515751784:
                if (str.equals("capInsets")) {
                    absUIImage.setCapInsets(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1615092063:
                if (str.equals("auto-size")) {
                    absUIImage.setAutoSize(vpa.LIZIZ(str, false));
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
