package com.bytedance.ies.xelement.text.text;

import X.VPA;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxTextShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        LynxTextShadowNode lynxTextShadowNode = (LynxTextShadowNode) shadowNode;
        str.getClass();
        switch (str.hashCode()) {
            case -1550570986:
                if (str.equals("richtype")) {
                    lynxTextShadowNode.setRichType(vpa.LJII(str));
                    return;
                }
                super.LIZIZ(shadowNode, str, vpa);
                return;
            case 125841635:
                if (str.equals("ellipsize-mode")) {
                    lynxTextShadowNode.setEllipsizeMode(vpa.LJII(str));
                    return;
                }
                super.LIZIZ(shadowNode, str, vpa);
                return;
            case 1629007544:
                if (str.equals("text-maxline")) {
                    lynxTextShadowNode.setTextMaxLine(vpa.LJII(str));
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
