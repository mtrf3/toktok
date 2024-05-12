package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.RelationFetchManager", f = "RelationFetchManager.kt", l = {324}, m = "doRealNetworkRequest")
/* renamed from: X.3YG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YG extends C3CS {
    public C3YC LJLIL;
    public C3YM LJLILLLLZI;
    public C3YM LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public int LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C3YC LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3YG(C3YC c3yc, InterfaceC67352kd<? super C3YG> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c3yc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LJII(null, 0L, 0L, this);
    }
}
