package com.lynx.tasm.ui.image;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter;

/* loaded from: classes15.dex */
public class FlattenUIImage$$PropsSetter extends LynxFlattenUI$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        FlattenUIImage flattenUIImage = (FlattenUIImage) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    flattenUIImage.setCapInsetsScale(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1338903714:
                if (str.equals("skip-redirection")) {
                    flattenUIImage.setSkipRedirection(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1138223116:
                if (str.equals("image-config")) {
                    flattenUIImage.setImageConfig(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -934531685:
                if (str.equals("repeat")) {
                    flattenUIImage.setRepeat(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -629825370:
                if (str.equals("loop-count")) {
                    flattenUIImage.setLoopCount(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -602643660:
                if (str.equals("fresco-nine-patch")) {
                    flattenUIImage.setFrescoNinePatch(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -320982203:
                if (str.equals("disable-default-resize")) {
                    flattenUIImage.setDisableDefaultResize(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -256430480:
                if (str.equals("prefetch-width")) {
                    flattenUIImage.setPreFetchWidth(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 114148:
                if (str.equals("src")) {
                    flattenUIImage.setSource(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3357091:
                if (str.equals("mode")) {
                    flattenUIImage.setObjectFit(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 207594941:
                if (str.equals("prefetch-height")) {
                    flattenUIImage.setPreFetchHeight(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 516005201:
                if (str.equals("cap-insets")) {
                    flattenUIImage.setCapInsetsBackUp(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 598246771:
                if (str.equals("placeholder")) {
                    flattenUIImage.setPlaceholder(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 681292984:
                if (str.equals("blur-radius")) {
                    flattenUIImage.setBlurRadius(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 902281110:
                if (str.equals("suspendable")) {
                    flattenUIImage.setSuspendable(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1515751784:
                if (str.equals("capInsets")) {
                    flattenUIImage.setCapInsets(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1615092063:
                if (str.equals("auto-size")) {
                    flattenUIImage.setAutoSize(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1739487650:
                if (str.equals("defer-src-invalidation")) {
                    flattenUIImage.setDeferInvalidation(vpa.LIZIZ(str, false));
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
