package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.41r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1027941r extends TBS implements InterfaceC88472Yns<AbstractC89473fD, C76800UCe> {
    public C1027941r(SingleChatNoticeViewModel singleChatNoticeViewModel) {
        super(1, singleChatNoticeViewModel, SingleChatNoticeViewModel.class, "onMessageEvent", "onMessageEvent(Lcom/ss/android/ugc/aweme/im/sdk/chat/data/rx/MessageEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC89473fD abstractC89473fD) {
        AbstractC89473fD p0 = abstractC89473fD;
        o.LJIIIZ(p0, "p0");
        SingleChatNoticeViewModel singleChatNoticeViewModel = (SingleChatNoticeViewModel) this.receiver;
        singleChatNoticeViewModel.getClass();
        if (p0 instanceof C91603ie) {
            if (((C91603ie) p0).LIZ == AbstractC63551Owt.LIZ) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(singleChatNoticeViewModel), null, null, new C1028141t(singleChatNoticeViewModel, null), 3);
            }
        } else if (p0 instanceof C89463fC) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(singleChatNoticeViewModel), null, null, new C1028241u(singleChatNoticeViewModel, null), 3);
        } else if (p0 instanceof C91233i3) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(singleChatNoticeViewModel), null, null, new C1028041s(singleChatNoticeViewModel, null), 3);
        }
        return C76800UCe.LIZ;
    }
}
