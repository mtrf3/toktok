package com.bytedance.ies.xelement.input;

import X.VPA;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;

/* loaded from: classes15.dex */
public class AutoHeightInputShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        AutoHeightInputShadowNode autoHeightInputShadowNode = (AutoHeightInputShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("font-size")) {
            super.LIZIZ(shadowNode, str, vpa);
        } else {
            autoHeightInputShadowNode.setFontTextSize(vpa.LIZLLL(str));
        }
    }
}
