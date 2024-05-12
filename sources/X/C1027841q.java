package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.41q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1027841q extends TBS implements InterfaceC88472Yns<AbstractC89473fD, C76800UCe> {
    public C1027841q(CommonChatNoticeViewModel commonChatNoticeViewModel) {
        super(1, commonChatNoticeViewModel, CommonChatNoticeViewModel.class, "onMessageEvent", "onMessageEvent(Lcom/ss/android/ugc/aweme/im/sdk/chat/data/rx/MessageEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC89473fD abstractC89473fD) {
        AbstractC89473fD p0 = abstractC89473fD;
        o.LJIIIZ(p0, "p0");
        CommonChatNoticeViewModel commonChatNoticeViewModel = (CommonChatNoticeViewModel) this.receiver;
        commonChatNoticeViewModel.getClass();
        if (p0 instanceof C89463fC) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(commonChatNoticeViewModel), null, null, new C41Z((C89463fC) p0, commonChatNoticeViewModel, null), 3);
        } else if (p0 instanceof C91233i3) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(commonChatNoticeViewModel), null, null, new C1026441c((C91233i3) p0, commonChatNoticeViewModel, null), 3);
        }
        return C76800UCe.LIZ;
    }
}
