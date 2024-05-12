package com.bytedance.ies.xelement.text.inlinetext;

import X.C79234V7u;
import X.C79743VRj;
import X.VNU;
import X.VPD;
import X.VQC;
import X.VS6;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxInlineTextShadowNode extends InlineTextShadowNode {
    public boolean LJJIJIL;
    public String LJJIJL = LiveGiftNewGifterBadgeSetting.DEFAULT;

    @VPD(defaultBoolean = true, name = "no-trim")
    public final void setNoTrim(boolean z) {
        this.LJJIJIL = z;
        LJIIIIZZ();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIJ(SpannableStringBuilder spannableStringBuilder, RawTextShadowNode node) {
        int i;
        o.LJIIJ(node, "node");
        String str = node.LJIJI;
        if (!this.LJJIJIL) {
            if (str != null) {
                str = C79234V7u.LJI(LynxTextShadowNode.LJJJJLI.replace(str, ""), false);
            } else {
                str = null;
            }
        }
        if (g0.LJJJ()) {
            if (o.LJ(this.LJJIJL, "bracket")) {
                VNU LJIILL = LJIILL();
                C79743VRj c79743VRj = this.LJIJI;
                o.LJFF(c79743VRj, "this.textAttributes");
                if (VQC.LIZ(c79743VRj.LJIIJ)) {
                    i = 40;
                } else {
                    C79743VRj c79743VRj2 = this.LJIJI;
                    o.LJFF(c79743VRj2, "this.textAttributes");
                    i = (int) c79743VRj2.LJIIJ;
                }
                spannableStringBuilder.append(VS6.LIZ(LJIILL, str, i));
                return;
            }
            spannableStringBuilder.append((CharSequence) str);
            return;
        }
        spannableStringBuilder.append((CharSequence) str);
    }
}
