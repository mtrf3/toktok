package com.bytedance.ies.xelement.input;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxBaseInputView$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        Integer valueOf;
        LynxBaseInputView lynxBaseInputView = (LynxBaseInputView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2063037069:
                if (str.equals("compat-number-type")) {
                    lynxBaseInputView.setCompatNumberType(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1988401764:
                if (str.equals("letter-spacing")) {
                    lynxBaseInputView.setLetterSpacing(vpa.LJ(str, 0.0f));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1730062511:
                if (str.equals("smart-scroll")) {
                    lynxBaseInputView.setSmartScroll(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1664091044:
                if (str.equals("placeholder-font-weight")) {
                    lynxBaseInputView.setPlaceholderTextWeight(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -1586082113:
                if (str.equals("font-size")) {
                    lynxBaseInputView.setFontTextSize(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -962590849:
                if (str.equals("direction")) {
                    lynxBaseInputView.setLynxDirection(vpa.LJFF(str, 3));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -866730430:
                if (str.equals("readonly")) {
                    lynxBaseInputView.setIsReadOnly(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -723781827:
                if (str.equals("android-selection-handle-color")) {
                    lynxBaseInputView.setSelectionHandleColor(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -525534091:
                if (str.equals("fullscreen-mode")) {
                    lynxBaseInputView.setKeyBoardFullscreenMode(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -445272125:
                if (str.equals("show-soft-input-onfocus")) {
                    lynxBaseInputView.setShowSoftInputOnFocus(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -140393755:
                if (str.equals("placeholder-font-size")) {
                    lynxBaseInputView.setPlaceholderTextSize(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 3575610:
                if (str.equals("type")) {
                    lynxBaseInputView.setInputType(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 94842723:
                if (str.equals("color")) {
                    lynxBaseInputView.setFontColor(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 97604824:
                if (str.equals("focus")) {
                    lynxBaseInputView.setFocus(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 103960492:
                if (str.equals("keyboard-hide-blur")) {
                    lynxBaseInputView.setBlurKeyboardHide(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 108532386:
                if (str.equals("font-family")) {
                    lynxBaseInputView.setFontFamily(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 111972721:
                if (str.equals("value")) {
                    lynxBaseInputView.setInputValue(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 124732746:
                if (str.equals("maxlength")) {
                    lynxBaseInputView.setMaxLength(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 270940796:
                if (str.equals("disabled")) {
                    lynxBaseInputView.setDisable(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 598246771:
                if (str.equals("placeholder")) {
                    lynxBaseInputView.setPlaceholder(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 598800822:
                if (str.equals("font-weight")) {
                    if (vpa.LJIIIZ(str)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(vpa.LJFF(str, 0));
                    }
                    lynxBaseInputView.setFontWeight(valueOf);
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 746232421:
                if (str.equals("text-align")) {
                    lynxBaseInputView.setTextAlign(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1101235489:
                if (str.equals("adjust-mode")) {
                    lynxBaseInputView.setAdjustMode(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1155760891:
                if (str.equals("bottom-inset")) {
                    lynxBaseInputView.setBottomInset(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1437560563:
                if (str.equals("auto-fit")) {
                    lynxBaseInputView.setAutoFit(vpa.LIZIZ(str, true));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1579804907:
                if (str.equals("android-selection-highlight-color")) {
                    lynxBaseInputView.setSelectionHighLightColor(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1614704353:
                if (str.equals("auto-fill")) {
                    lynxBaseInputView.setAutoFill(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1782197877:
                if (str.equals("enableAutoFill")) {
                    lynxBaseInputView.setIsAutoFillEnabled(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 1901673625:
                if (str.equals("caret-color")) {
                    lynxBaseInputView.setCursorColor(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2018420361:
                if (str.equals("placeholder-color")) {
                    lynxBaseInputView.setPlaceholderColor(vpa.LIZLLL(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2033358039:
                if (str.equals("placeholder-style")) {
                    lynxBaseInputView.setPlaceHolderStyle(vpa.LJI(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2051146279:
                if (str.equals("confirm-type")) {
                    lynxBaseInputView.setConfirmType(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2140607816:
                if (str.equals("placeholder-font-family")) {
                    lynxBaseInputView.setPlaceholderFontFamily(vpa.LJII(str));
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
