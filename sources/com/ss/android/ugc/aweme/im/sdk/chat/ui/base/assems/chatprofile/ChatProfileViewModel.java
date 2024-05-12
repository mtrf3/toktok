package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatprofile;

import X.C1042547h;
import X.C17N;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C78613UtF;
import X.C80533Eb;
import X.C89333ez;
import X.XIA;
import X.XKW;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChatProfileViewModel extends AssemViewModel<C33Q> {
    public final C1042547h LJLIL;
    public final C80533Eb LJLILLLLZI;
    public final XKW LJLJI;
    public final C55749LuL LJLJJI;
    public final C5H3 LJLJJL;

    public ChatProfileViewModel() {
        C1042547h c1042547h = C1042547h.LIZ;
        C80533Eb userRepository = C80533Eb.LIZ;
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(userRepository, "userRepository");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = c1042547h;
        this.LJLILLLLZI = userRepository;
        this.LJLJI = ioDispatcher;
        this.LJLJJI = new C55749LuL(C47704Ins.LIZLLL(this, C89333ez.class, null), true);
        this.LJLJJL = C17N.LJJIJL(new AqS151S0100000_1(this, 906));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C33Q() { // from class: X.4F6
        };
    }
}
