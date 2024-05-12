package com.lynx.tasm.behavior.shadow;

import X.VPA;
import com.lynx.tasm.behavior.utils.ShadowNodeSetter;

/* loaded from: classes15.dex */
public class ShadowNode$$PropsSetter implements ShadowNodeSetter<ShadowNode> {
    @Override // com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, VPA vpa) {
        str.getClass();
        switch (str.hashCode()) {
            case -1559879186:
                if (!str.equals("vertical-align")) {
                    return;
                }
                shadowNode.setVerticalAlign(vpa.LIZ(str));
                return;
            case -992853731:
                if (!str.equals("ignore-focus")) {
                    return;
                }
                shadowNode.setIgnoreFocus(vpa.LIZIZ(str, false));
                return;
            case 856740501:
                if (!str.equals("enable-touch-pseudo-propagation")) {
                    return;
                }
                shadowNode.setEventThroughPropagation(vpa.LIZLLL(str));
                return;
            case 2100930194:
                if (!str.equals("event-through")) {
                    return;
                }
                shadowNode.setEventThrough(vpa.LIZLLL(str));
                return;
            default:
                return;
        }
    }
}
