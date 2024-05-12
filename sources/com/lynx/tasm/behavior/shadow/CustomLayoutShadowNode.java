package com.lynx.tasm.behavior.shadow;

import X.VPD;

/* loaded from: classes15.dex */
public class CustomLayoutShadowNode extends ShadowNode {
    public boolean LJIJI;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJJI() {
        return true;
    }

    @VPD(name = "custom-layout")
    public void setCustomLayout(boolean z) {
        this.LJIJI = z;
    }
}
