package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.RelationFetchManager", f = "RelationFetchManager.kt", l = {383, 394}, m = "checkFetchResult")
/* renamed from: X.3YJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YJ extends C3CS {
    public C3YC LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C3YC LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3YJ(C3YC c3yc, InterfaceC67352kd<? super C3YJ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c3yc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZLLL(null, this);
    }
}
