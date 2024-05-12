package com.lynx.tasm.behavior.shadow.text;

import X.VPA;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* loaded from: classes15.dex */
public class TextShadowNode$$PropsSetter extends BaseTextShadowNode$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        TextShadowNode textShadowNode = (TextShadowNode) shadowNode;
        str.getClass();
        switch (str.hashCode()) {
            case -1801128308:
                if (str.equals("tail-color-convert")) {
                    textShadowNode.setEnableTailColorConvert(vpa.LIZIZ(str, false));
                    return;
                }
                super.LIZIZ(shadowNode, str, vpa);
                return;
            case -1215680224:
                if (str.equals("line-height")) {
                    textShadowNode.setLineHeight(vpa.LJ(str, 1.0E21f));
                    return;
                }
                super.LIZIZ(shadowNode, str, vpa);
                return;
            case 679001436:
                if (str.equals("enable-full-justify")) {
                    textShadowNode.setEnableFullJustify(vpa.LIZIZ(str, false));
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
