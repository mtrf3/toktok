package com.lynx.tasm.behavior.shadow.text;

import X.VPA;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* loaded from: classes15.dex */
public class InlineTextShadowNode$$PropsSetter extends BaseTextShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        InlineTextShadowNode inlineTextShadowNode = (InlineTextShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("vertical-align")) {
            if (!str.equals("background-color")) {
                super.LIZIZ(shadowNode, str, vpa);
                return;
            } else {
                inlineTextShadowNode.setBackgroundColor(vpa.LJFF(str, 0));
                return;
            }
        }
        inlineTextShadowNode.setVerticalAlign(vpa.LIZ(str));
    }
}
