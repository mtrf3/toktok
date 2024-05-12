package com.lynx.tasm.behavior.shadow;

import X.VPA;

/* loaded from: classes15.dex */
public class NativeLayoutNodeRef$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        str.getClass();
        if (!str.equals("vertical-align")) {
            super.LIZIZ(shadowNode, str, vpa);
        } else {
            shadowNode.setVerticalAlign(vpa.LIZ(str));
        }
    }
}
