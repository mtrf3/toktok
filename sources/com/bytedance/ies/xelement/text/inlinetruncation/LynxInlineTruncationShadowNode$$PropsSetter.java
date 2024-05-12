package com.bytedance.ies.xelement.text.inlinetruncation;

import X.VPA;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;

/* loaded from: classes15.dex */
public class LynxInlineTruncationShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        LynxInlineTruncationShadowNode lynxInlineTruncationShadowNode = (LynxInlineTruncationShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("stick")) {
            super.LIZIZ(shadowNode, str, vpa);
        } else {
            lynxInlineTruncationShadowNode.setStick(vpa.LIZIZ(str, false));
        }
    }
}
