package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat;

import X.C47704Ins;
import X.C55749LuL;
import X.C89313ex;
import X.C89333ez;
import X.C98593tv;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatBusinessAccountViewModel extends AssemViewModel<C89313ex> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C89333ez.class, null), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C89313ex defaultState() {
        return new C89313ex(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C98593tv c98593tv = ((C89333ez) this.LJLIL.getValue()).LJLJI;
        if (c98593tv != null && o.LJ(c98593tv.getWelcomeMsgEnabled(), Boolean.TRUE)) {
            setState(new AqS167S0100000_1(c98593tv, 464));
        }
    }
}
