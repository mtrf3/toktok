package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.group;

import X.C1036745b;
import X.C17N;
import X.C33Q;
import X.C3Q9;
import X.C40I;
import X.C47704Ins;
import X.C4WC;
import X.C55749LuL;
import X.C5H3;
import X.C75782yE;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatNoticeViewModel extends AssemViewModel<C33Q> {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C1036745b LJLIL;
    public final C3Q9 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C5H3 LJLJJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C33Q() { // from class: X.40L
        };
    }

    public GroupChatNoticeViewModel(C1036745b flowEngine) {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        o.LJIIIZ(flowEngine, "flowEngine");
        this.LJLIL = flowEngine;
        this.LJLILLLLZI = c4wc;
        this.LJLJI = new C55749LuL(C47704Ins.LIZLLL(this, C40I.class, null), true);
        this.LJLJJI = C17N.LJJIJL(new AqS151S0100000_1(this, 801));
    }
}
