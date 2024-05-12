package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics", f = "IMMessageAnalytics.kt", l = {591}, m = "makeRecRelatedParams")
/* renamed from: X.48J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48J extends C3CS {
    public long LJLIL;
    public C109544Rq LJLILLLLZI;
    public C48M LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C48G LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48J(C48G c48g, InterfaceC67352kd<? super C48J> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c48g;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LJII(0L, null, null, this);
    }
}
