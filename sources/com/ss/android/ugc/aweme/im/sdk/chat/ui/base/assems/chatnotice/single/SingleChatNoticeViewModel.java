package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single;

import X.C102303zu;
import X.C1026040y;
import X.C1036745b;
import X.C113554cx;
import X.C17N;
import X.C40W;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C99033ud;
import X.InterfaceC57106Mb8;
import X.OSZ;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingleChatNoticeViewModel extends AssemViewModel<C1026040y> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final C1036745b LJLIL;
    public final InterfaceC57106Mb8 LJLILLLLZI;
    public final C102303zu LJLJI;
    public final C55749LuL LJLJJI;
    public final C5H3 LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C1026040y defaultState() {
        return new C1026040y(false);
    }

    public SingleChatNoticeViewModel(C1036745b flowEngine) {
        InterfaceC57106Mb8 imSayHiService = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
        C102303zu c102303zu = C102303zu.LIZ;
        o.LJIIIZ(flowEngine, "flowEngine");
        o.LJIIIZ(imSayHiService, "imSayHiService");
        this.LJLIL = flowEngine;
        this.LJLILLLLZI = imSayHiService;
        this.LJLJI = c102303zu;
        this.LJLJJI = new C55749LuL(C47704Ins.LIZLLL(this, C40W.class, null), true);
        this.LJLJJL = C17N.LJJIJL(new AqS151S0100000_1(this, 854));
    }

    public final void gv0(Context context, String str) {
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", "chat"), new OSZ("message_type", "emoji"));
        if (((C99033ud) this.LJLJJL.getValue()).getEnterMethod().length() > 0) {
            LJJLIIIIJ.put("enter_method", "click_dm_invitation");
        }
        this.LJLILLLLZI.LIZ(context, str, null, false, LJJLIIIIJ, true, null);
    }
}
