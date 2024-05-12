package com.lynx.tasm.behavior.shadow.text;

import X.VPD;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* loaded from: classes15.dex */
public class TextSelectionShadowNode extends ShadowNode {
    public int LJIJI;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJIIZILJ() {
        return true;
    }

    @VPD(defaultInt = 0, name = "background-color")
    public void setBackgroundColor(int i) {
        this.LJIJI = i;
    }
}
