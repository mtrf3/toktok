package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel", f = "BaseChatPanel.kt", l = {614}, m = "addRemotePopupTasks")
/* renamed from: X.42N, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42N extends C3CS {
    public BaseChatPanel LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ BaseChatPanel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42N(BaseChatPanel baseChatPanel, InterfaceC67352kd<? super C42N> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = baseChatPanel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZJ(null, this);
    }
}
