package com.lynx.tasm.ui.image;

import X.VPA;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode$$PropsSetter;

/* loaded from: classes15.dex */
public class FrescoInlineImageShadowNode$$PropsSetter extends AbsInlineImageShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        FrescoInlineImageShadowNode frescoInlineImageShadowNode = (FrescoInlineImageShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("skip-redirection")) {
            if (!str.equals("loop-count")) {
                super.LIZIZ(shadowNode, str, vpa);
                return;
            } else {
                frescoInlineImageShadowNode.setLoopCount(vpa.LJFF(str, 0));
                return;
            }
        }
        frescoInlineImageShadowNode.setSkipRedirection(vpa.LIZIZ(str, false));
    }
}
