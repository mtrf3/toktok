package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics", f = "IMMessageAnalytics.kt", l = {292}, m = "makeCommonSendMessageParams")
/* renamed from: X.48L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48L extends C3CS {
    public C109544Rq LJLIL;
    public C48M LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C48G LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48L(C48G c48g, InterfaceC67352kd<? super C48L> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c48g;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJI(null, null, this);
    }
}
