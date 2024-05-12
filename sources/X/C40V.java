package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.handler.SingleChatBlockBannerHandler", f = "SingleChatBlockBannerHandler.kt", l = {32}, m = "isValid")
/* renamed from: X.40V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40V extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C40T LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40V(C40T c40t, InterfaceC67352kd<? super C40V> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c40t;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return LJFF(null, this);
    }
}
