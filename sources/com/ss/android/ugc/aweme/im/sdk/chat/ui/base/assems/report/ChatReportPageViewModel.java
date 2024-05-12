package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.report;

import X.C1045448k;
import X.C109544Rq;
import X.C47704Ins;
import X.C55749LuL;
import X.C89333ez;
import X.ORZ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;

/* loaded from: classes2.dex */
public final class ChatReportPageViewModel extends AssemViewModel<C1045448k> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C89333ez.class, null), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C1045448k defaultState() {
        return new C1045448k(0);
    }

    public final List<C109544Rq> gv0() {
        return ORZ.LLJI(getState().LJLIL);
    }
}
