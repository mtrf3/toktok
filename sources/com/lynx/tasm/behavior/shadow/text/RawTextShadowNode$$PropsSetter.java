package com.lynx.tasm.behavior.shadow.text;

import X.VPA;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;

/* loaded from: classes15.dex */
public class RawTextShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("pseudo")) {
            if (!str.equals("text")) {
                super.LIZIZ(shadowNode, str, vpa);
                return;
            } else {
                rawTextShadowNode.setText(vpa.LIZLLL(str));
                return;
            }
        }
        rawTextShadowNode.setPsuedo(vpa.LIZIZ(str, false));
    }
}
