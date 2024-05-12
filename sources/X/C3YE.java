package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.RelationFetchResponse;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.RelationFetchManager", f = "RelationFetchManager.kt", l = {258, 268, 281, 286}, m = "doRealFetchAndDBUpdate")
/* renamed from: X.3YE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YE extends C3CS {
    public C3YC LJLIL;
    public C3YM LJLILLLLZI;
    public C3YD LJLJI;
    public Object LJLJJI;
    public RelationFetchResponse LJLJJL;
    public Object LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public /* synthetic */ Object LJLLILLLL;
    public final /* synthetic */ C3YC LJLLJ;
    public int LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3YE(C3YC c3yc, InterfaceC67352kd<? super C3YE> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLJ = c3yc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLILLLL = obj;
        this.LJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLJ.LJI(null, 0L, 0L, this);
    }
}
