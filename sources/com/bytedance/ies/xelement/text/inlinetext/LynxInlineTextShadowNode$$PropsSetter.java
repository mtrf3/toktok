package com.bytedance.ies.xelement.text.inlinetext;

import X.VPA;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxInlineTextShadowNode$$PropsSetter extends InlineTextShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        LynxInlineTextShadowNode lynxInlineTextShadowNode = (LynxInlineTextShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("no-trim")) {
            super.LIZIZ(shadowNode, str, vpa);
        } else {
            lynxInlineTextShadowNode.setNoTrim(vpa.LIZIZ(str, true));
        }
    }
}
