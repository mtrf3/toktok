package com.bytedance.ies.xelement.input;

import X.VPA;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* loaded from: classes15.dex */
public class LynxTextAreaView$$PropsSetter extends LynxBaseInputView$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, VPA vpa) {
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1550570986:
                if (str.equals("richtype")) {
                    lynxTextAreaView.setRichType(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case -428786256:
                if (str.equals("max-height")) {
                    lynxTextAreaView.setMaxHeight(vpa.LJII(str));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 419784731:
                if (str.equals("maxlines")) {
                    lynxTextAreaView.setMaxLines(vpa.LJFF(str, Integer.MAX_VALUE));
                    return;
                }
                super.LIZ(lynxBaseUI, str, vpa);
                return;
            case 2043213058:
                if (str.equals("min-height")) {
                    lynxTextAreaView.setMinHeight(vpa.LJII(str));
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
