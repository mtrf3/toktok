package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common;

import X.AnonymousClass432;
import X.C1036745b;
import X.C17N;
import X.C43R;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C76800UCe;
import X.C89333ez;
import X.EnumC58928NAu;
import X.InterfaceC1038045o;
import X.InterfaceC67352kd;
import X.XIA;
import X.XKW;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommonChatNoticeViewModel extends AssemViewModel<AnonymousClass432> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final C1036745b LJLIL;
    public final XKW LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C5H3 LJLJJI;
    public boolean LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final AnonymousClass432 defaultState() {
        return new AnonymousClass432(null, null, false);
    }

    public CommonChatNoticeViewModel(C1036745b flowEngine, XIA ioDispatcher) {
        o.LJIIIZ(flowEngine, "flowEngine");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = flowEngine;
        this.LJLILLLLZI = ioDispatcher;
        this.LJLJI = new C55749LuL(C47704Ins.LIZLLL(this, C89333ez.class, null), true);
        this.LJLJJI = C17N.LJJIJL(new AqS151S0100000_1(this, 13));
        flowEngine.LIZJ = new InterfaceC1038045o() { // from class: X.42v
            @Override // X.InterfaceC1038045o
            public final void LIZ(C45Q sceneId) {
                o.LJIIIZ(sceneId, "sceneId");
            }

            @Override // X.InterfaceC1038045o
            public final void LIZIZ(C41X templateId) {
                o.LJIIIZ(templateId, "templateId");
                CommonChatNoticeViewModel.this.setState(new AqS167S0100000_1(templateId, 9));
            }

            @Override // X.InterfaceC1038045o
            public final void LIZJ(C41X templateId) {
                o.LJIIIZ(templateId, "templateId");
                int i = C1031142x.LIZ[templateId.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    CommonChatNoticeViewModel commonChatNoticeViewModel = CommonChatNoticeViewModel.this;
                    commonChatNoticeViewModel.getClass();
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(commonChatNoticeViewModel), null, null, new C42K(commonChatNoticeViewModel, null), 3);
                    return;
                }
                CommonChatNoticeViewModel commonChatNoticeViewModel2 = CommonChatNoticeViewModel.this;
                commonChatNoticeViewModel2.getClass();
                XKX.LIZLLL(ViewModelKt.getViewModelScope(commonChatNoticeViewModel2), null, null, new C42J(commonChatNoticeViewModel2, null), 3);
            }

            @Override // X.InterfaceC1038045o
            public final void LIZLLL(C45Q sceneId) {
                o.LJIIIZ(sceneId, "sceneId");
                CommonChatNoticeViewModel.this.setState(new AqS167S0100000_1(sceneId, 8));
            }
        };
    }

    public final Object gv0(boolean z, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LIZ = this.LJLIL.LIZ(new C43R(z), interfaceC67352kd);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }
}
