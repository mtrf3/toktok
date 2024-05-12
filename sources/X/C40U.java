package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.handler.SingleChatBlockBannerHandler", f = "SingleChatBlockBannerHandler.kt", l = {23}, m = "handleInternal")
/* renamed from: X.40U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40U extends C3CS {
    public C40T LJLIL;
    public C3WV LJLILLLLZI;
    public C3WV LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C40T LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40U(C40T c40t, InterfaceC67352kd<? super C40U> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c40t;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return LJ(null, this);
    }
}
