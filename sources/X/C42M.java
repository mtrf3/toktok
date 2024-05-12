package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel", f = "BaseChatPanel.kt", l = {564, 565, 566}, m = "addLocalPopupTasks$suspendImpl")
/* renamed from: X.42M, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42M extends C3CS {
    public C1036745b LJLIL;
    public C1036745b LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ BaseChatPanel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42M(BaseChatPanel baseChatPanel, InterfaceC67352kd<? super C42M> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = baseChatPanel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return BaseChatPanel.LIZIZ(this.LJLJJI, null, this);
    }
}
