package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input;

import X.C105044Ai;
import X.C105074Al;
import X.C118234kV;
import X.C43I;
import X.C78842Uww;
import X.C93073l1;
import X.C93163lA;
import X.EnumC105154At;
import X.ORY;
import android.text.Editable;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Range;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public final class ChatRoomInputVM extends AssemViewModel<C105044Ai> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C105044Ai defaultState() {
        return new C105044Ai(new C43I(new C105074Al(EnumC105154At.NONE, null)), null, new C43I(null), false, false);
    }

    public final void tr(EnumC105154At panelType) {
        o.LJIIIZ(panelType, "panelType");
        setState(new AqS167S0100000_1(panelType, 126));
    }

    public static C93163lA gv0(int i, Editable editable) {
        C93073l1 c93073l1;
        C118234kV it = C78842Uww.LJJ(0, i).iterator();
        Object obj = null;
        while (it.LJLJI) {
            Object next = it.next();
            if (editable.charAt(((Number) next).intValue()) == '@') {
                obj = next;
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return new C93163lA(null, true);
        }
        Object[] spans = editable.getSpans(num.intValue(), i, C93073l1.class);
        if (spans != null) {
            c93073l1 = (C93073l1) ORY.LJJJLZIJ(spans);
        } else {
            c93073l1 = null;
        }
        String str = "";
        if (c93073l1 == null) {
            String hv0 = hv0(i, num.intValue(), editable);
            if (hv0 != null) {
                str = hv0;
            }
            return new C93163lA(str, false);
        }
        Range range = c93073l1.LIZLLL;
        if (range != null && range.getTo() < i) {
            String hv02 = hv0(i, num.intValue(), editable);
            if (hv02 != null) {
                str = hv02;
            }
            return new C93163lA(str, true);
        }
        return new C93163lA(null, false);
    }

    public static String hv0(int i, int i2, Editable editable) {
        String charSequence = editable.subSequence(i2 + 1, i).toString();
        if (s.LJJJLZIJ(charSequence, "  ", false) || s.LJJJZ(charSequence, '\n')) {
            return null;
        }
        return charSequence;
    }
}
