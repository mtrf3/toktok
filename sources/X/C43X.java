package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import kotlin.jvm.internal.AqS167S0100000_1;

/* renamed from: X.43X, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C43X extends TBS implements InterfaceC88472Yns<C40S, C76800UCe> {
    public C43X(Object obj) {
        super(1, obj, MessageListViewModel.class, "onConversationEvent", "onConversationEvent(Lcom/ss/android/ugc/aweme/im/sdk/chat/data/rx/ConversationEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C40S c40s) {
        C40S c40s2 = c40s;
        AssemViewModel assemViewModel = (AssemViewModel) this.receiver;
        assemViewModel.getClass();
        if (c40s2 instanceof C1029142d) {
            assemViewModel.setState(new AqS167S0100000_1(((C1029142d) c40s2).LIZ, 444));
        }
        return C76800UCe.LIZ;
    }
}
