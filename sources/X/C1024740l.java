package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.handler.bottom.SingleChatBlockBannerHandler", f = "SingleChatBlockBannerHandler.kt", l = {46}, m = "isValid")
/* renamed from: X.40l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1024740l extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C1024040e LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024740l(C1024040e c1024040e, InterfaceC67352kd<? super C1024740l> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c1024040e;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return LJFF(null, this);
    }
}
