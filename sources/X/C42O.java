package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.ClickToMsgViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.42O, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C42O extends TBS implements InterfaceC88472Yns<AbstractC89473fD, C76800UCe> {
    public C42O(ClickToMsgViewModel clickToMsgViewModel) {
        super(1, clickToMsgViewModel, ClickToMsgViewModel.class, "onMessageEvent", "onMessageEvent(Lcom/ss/android/ugc/aweme/im/sdk/chat/data/rx/MessageEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC89473fD abstractC89473fD) {
        AnonymousClass444 anonymousClass444;
        AbstractC89473fD p0 = abstractC89473fD;
        o.LJIIIZ(p0, "p0");
        ClickToMsgViewModel clickToMsgViewModel = (ClickToMsgViewModel) this.receiver;
        clickToMsgViewModel.getClass();
        if (p0 instanceof C91233i3) {
            C91233i3 c91233i3 = (C91233i3) p0;
            if (c91233i3.LIZIZ.getMsgStatus() == 2 && (anonymousClass444 = clickToMsgViewModel.LJLILLLLZI) != null) {
                anonymousClass444.LIZLLL(c91233i3.LIZIZ);
            }
        }
        return C76800UCe.LIZ;
    }
}
