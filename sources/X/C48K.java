package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics", f = "IMMessageAnalytics.kt", l = {273}, m = "makeCommonMessageEventParams")
/* renamed from: X.48K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48K extends C3CS {
    public C109544Rq LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C48G LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48K(C48G c48g, InterfaceC67352kd<? super C48K> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c48g;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJ(null, null, false, this);
    }
}
