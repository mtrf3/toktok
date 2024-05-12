package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist;

import X.AbstractC73946T0k;
import X.C106884Hk;
import X.C17N;
import X.C213688a4;
import X.C221108m2;
import X.C43X;
import X.C43Y;
import X.C44L;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73969T1h;
import X.C78999UzT;
import X.C89333ez;
import X.C99033ud;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;

/* loaded from: classes2.dex */
public final class MessageListViewModel extends AssemViewModel<C43Y> {
    public final C44L LJLIL;
    public final AbstractC73946T0k LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C73318Sq2 LJLJJL;
    public final C5H3 LJLJJLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(this.LJLIL.LIZLLL(gv0().getConversationId()).LJJJ(this.LJLILLLLZI), null, null, new C43X(this), 3), this.LJLJJL);
        AssemViewModel.subscribeInternal$default(this, C213688a4.LJ(), null, null, new AqS167S0100000_1(this, 445), 6, null);
    }

    public MessageListViewModel() {
        C106884Hk c106884Hk = new C106884Hk();
        AbstractC73946T0k LIZIZ = C73969T1h.LIZIZ();
        this.LJLIL = c106884Hk;
        this.LJLILLLLZI = LIZIZ;
        this.LJLJI = new C55749LuL(C47704Ins.LIZLLL(this, C89333ez.class, null), true);
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1006));
        this.LJLJJL = new C73318Sq2();
        this.LJLJJLL = C17N.LJJIJL(new AqS151S0100000_1(this, 1005));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C43Y defaultState() {
        return new C43Y(gv0().isHighRiskConversation(), gv0().isMediaMsgMasking(), true);
    }

    public final C99033ud gv0() {
        return (C99033ud) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLJJL.LIZLLL();
    }
}
