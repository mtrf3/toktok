package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.handler.bottom.SingleChatBlockBannerHandler", f = "SingleChatBlockBannerHandler.kt", l = {35}, m = "handleInternal")
/* renamed from: X.40k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1024640k extends C3CS {
    public C1024040e LJLIL;
    public C3WV LJLILLLLZI;
    public C3WV LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C1024040e LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024640k(C1024040e c1024040e, InterfaceC67352kd<? super C1024640k> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c1024040e;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return LJ(null, this);
    }
}
