package com.ss.android.elearning.lingo.lynx.component.select;

import X.VPA;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;

/* loaded from: classes15.dex */
public class CustomSelectShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        CustomSelectShadowNode customSelectShadowNode = (CustomSelectShadowNode) shadowNode;
        str.getClass();
        switch (str.hashCode()) {
            case 365601008:
                if (str.equals("fontSize")) {
                    customSelectShadowNode.setFontSize(vpa.LJFF(str, 0));
                    return;
                }
                super.LIZIZ(shadowNode, str, vpa);
                return;
            case 1892080416:
                if (str.equals("enable-rtl")) {
                    customSelectShadowNode.enableRTL(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZIZ(shadowNode, str, vpa);
                return;
            case 2004538122:
                if (str.equals("text-models")) {
                    customSelectShadowNode.setTextModels(vpa.LIZ(str));
                    return;
                }
                super.LIZIZ(shadowNode, str, vpa);
                return;
            default:
                super.LIZIZ(shadowNode, str, vpa);
                return;
        }
    }
}
