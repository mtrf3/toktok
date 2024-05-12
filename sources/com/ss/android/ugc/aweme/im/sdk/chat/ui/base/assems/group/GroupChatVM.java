package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group;

import X.AbstractC63505Ow9;
import X.C106884Hk;
import X.C17N;
import X.C38350F3i;
import X.C3Q9;
import X.C40B;
import X.C40C;
import X.C40I;
import X.C43I;
import X.C44L;
import X.C47704Ins;
import X.C4WC;
import X.C55749LuL;
import X.C5H3;
import X.C63120Opw;
import X.C73318Sq2;
import X.C73542Ste;
import X.C75782yE;
import X.C78999UzT;
import X.C81143Gk;
import X.C84283Sm;
import X.C90643h6;
import X.C98563ts;
import Y.IDcS364S0100000_1;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;

/* loaded from: classes2.dex */
public final class GroupChatVM extends AssemViewModel<C40B> {
    public final C44L LJLIL;
    public final C73318Sq2 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;

    public GroupChatVM() {
        C106884Hk c106884Hk = new C106884Hk();
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLIL = c106884Hk;
        this.LJLILLLLZI = c73318Sq2;
        this.LJLJI = new C55749LuL(C47704Ins.LJFF(this, C40I.class, null), true);
        this.LJLJJI = C17N.LJJIJL(new AqS151S0100000_1(this, 956));
        this.LJLJJL = C17N.LJJIJL(new AqS151S0100000_1(this, 955));
        this.LJLJJLL = C17N.LJJIJL(new AqS151S0100000_1(this, 954));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C40B defaultState() {
        return new C40B(new C43I(Boolean.FALSE), C84283Sm.LJII((C63120Opw) this.LJLJJLL.getValue()), (C63120Opw) this.LJLJJLL.getValue());
    }

    public final C98563ts gv0() {
        return (C98563ts) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLILLLLZI.LIZLLL();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        String conversationId;
        String conversationId2;
        String conversationId3;
        C98563ts gv0;
        String conversationId4;
        Long LJJIZ;
        String str;
        super.onPrepared();
        Long l = null;
        if (this.LJLJJLL.getValue() == null && (gv0 = gv0()) != null && (conversationId4 = gv0.getConversationId()) != null && (LJJIZ = C38350F3i.LJJIZ(conversationId4)) != null) {
            long longValue = LJJIZ.longValue();
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C4WC c4wc = C4WC.LIZIZ;
            C98563ts gv02 = gv0();
            if (gv02 != null) {
                str = gv02.getConversationId();
            } else {
                str = null;
            }
            c4wc.LJIJ(str, longValue, AbstractC63505Ow9.LIZIZ, new IDcS364S0100000_1(this, 19));
        }
        C98563ts gv03 = gv0();
        if (gv03 != null && (conversationId3 = gv03.getConversationId()) != null) {
            C78999UzT.LJFF(C73542Ste.LJIIIIZZ(this.LJLIL.LIZLLL(conversationId3), null, null, new AqS167S0100000_1(this, 382), 3), this.LJLILLLLZI);
        }
        C63120Opw c63120Opw = (C63120Opw) this.LJLJJLL.getValue();
        if (c63120Opw != null) {
            C90643h6.LIZ(c63120Opw);
        }
        C98563ts gv04 = gv0();
        if (gv04 != null && (conversationId2 = gv04.getConversationId()) != null) {
            C81143Gk.LIZJ(C81143Gk.LIZ, conversationId2, null, null, 28);
        }
        C98563ts gv05 = gv0();
        if (gv05 != null && (conversationId = gv05.getConversationId()) != null) {
            l = C38350F3i.LJJIZ(conversationId);
        }
        C40C.LIZ(l);
    }
}
