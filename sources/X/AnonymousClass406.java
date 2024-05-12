package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel", f = "SingleChatPanel.kt", l = {187, 188, 189, 190, 191}, m = "addLocalPopupTasks")
/* renamed from: X.406, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass406 extends C3CS {
    public Object LJLIL;
    public C1036745b LJLILLLLZI;
    public C1036745b LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ SingleChatPanel LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass406(SingleChatPanel singleChatPanel, InterfaceC67352kd<? super AnonymousClass406> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = singleChatPanel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, this);
    }
}
