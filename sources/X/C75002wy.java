package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.api.EcMessageApi$Companion", f = "EcMessageApi.kt", l = {91, 93}, m = "refreshShortTouch")
/* renamed from: X.2wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75002wy extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C74992wx LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75002wy(C74992wx c74992wx, InterfaceC67352kd<? super C75002wy> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c74992wx;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, null, null, 0L, this);
    }
}
