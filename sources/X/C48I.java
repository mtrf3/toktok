package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics", f = "IMMessageAnalytics.kt", l = {132}, m = "reportMessage$im_base_release")
/* renamed from: X.48I, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48I extends C3CS {
    public C48G LJLIL;
    public C109544Rq LJLILLLLZI;
    public C48N LJLJI;
    public C48M LJLJJI;
    public InterfaceC75532xp LJLJJL;
    public BaseContent LJLJJLL;
    public Object LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ C48G LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48I(C48G c48g, InterfaceC67352kd<? super C48I> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = c48g;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LJIIIIZZ(null, null, null, null, this);
    }
}
