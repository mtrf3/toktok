package com.bytedance.ies.xelement.text.inlinetruncation;

import X.C79758VRy;
import X.VPD;
import android.text.SpannableStringBuilder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class LynxInlineTruncationShadowNode extends TextShadowNode {
    public boolean LJJJJIZL;

    @VPD(name = "stick")
    public final void setStick(boolean z) {
        this.LJJJJIZL = z;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIZI(SpannableStringBuilder spannableStringBuilder, List<C79758VRy> list) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        super.LJJIIZI(spannableStringBuilder2, arrayList);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((C79758VRy) ListProtector.get(arrayList, size)).LIZ(spannableStringBuilder2);
            }
        }
        if (LJIJ()) {
            spannableStringBuilder2.setSpan(LJJIFFI(), 0, spannableStringBuilder2.length(), 18);
        }
        this.LJJIJIL = spannableStringBuilder2;
    }
}
