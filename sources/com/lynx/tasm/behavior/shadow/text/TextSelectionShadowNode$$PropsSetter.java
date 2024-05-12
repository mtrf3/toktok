package com.lynx.tasm.behavior.shadow.text;

import X.VPA;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;

/* loaded from: classes15.dex */
public class TextSelectionShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        TextSelectionShadowNode textSelectionShadowNode = (TextSelectionShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("background-color")) {
            super.LIZIZ(shadowNode, str, vpa);
        } else {
            textSelectionShadowNode.setBackgroundColor(vpa.LJFF(str, 0));
        }
    }
}
