package com.lynx.tasm.behavior.shadow;

import X.VPA;

/* loaded from: classes15.dex */
public class CustomLayoutShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        CustomLayoutShadowNode customLayoutShadowNode = (CustomLayoutShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("custom-layout")) {
            super.LIZIZ(shadowNode, str, vpa);
        } else {
            customLayoutShadowNode.setCustomLayout(vpa.LIZIZ(str, false));
        }
    }
}
