package com.lynx.tasm.behavior.shadow.text;

import X.C79758VRy;
import X.VPD;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class InlineTextShadowNode extends BaseTextShadowNode {
    public int LJJIJIIJIL;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJIIZILJ() {
        return true;
    }

    @VPD(defaultInt = 0, name = "background-color")
    public void setBackgroundColor(int i) {
        this.LJJIJIIJIL = i;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void setTextAlign(int i) {
        super.setTextAlign(i);
        if (this.LJJ) {
            LLog.LIZLLL(4, "InlineTextShadowNode", "inline-text will no longer support text-align in future, set on root text instead");
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    @VPD(name = "vertical-align")
    public void setVerticalAlign(ReadableArray readableArray) {
        LJJ(readableArray);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIJZLJL(int i, int i2, List<C79758VRy> list) {
        super.LJJIIJZLJL(i, i2, list);
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new C79758VRy(i, i2, new BackgroundColorSpan(this.LJJIJIIJIL)));
        if (LJIJ()) {
            arrayList.add(new C79758VRy(i, i2, LJJIFFI()));
        }
        if (this.LJJIJIIJIL != 0) {
            arrayList.add(new C79758VRy(i, i2, new BackgroundColorSpan(this.LJJIJIIJIL)));
        }
        if (this.LJIJI.LJIILIIL != 1.0E21f) {
            arrayList.add(new C79758VRy(i, i2, new AbsoluteSizeSpan(Math.round(this.LJIJI.LJIILIIL))));
        }
    }
}
