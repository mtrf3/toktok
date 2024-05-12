package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeHandler", f = "ChatNoticeHandler.kt", l = {29, 69}, m = "handle")
/* renamed from: X.45k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037645k extends C3CS {
    public C3WY LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AbstractC1036945d<T> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037645k(AbstractC1036945d<T> abstractC1036945d, InterfaceC67352kd<? super C1037645k> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = abstractC1036945d;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZLLL(null, this);
    }
}
