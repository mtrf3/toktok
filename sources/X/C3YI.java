package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.RelationFetchManager", f = "RelationFetchManager.kt", l = {145}, m = "fetchRelationAsyncInternal")
/* renamed from: X.3YI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YI extends C3CS {
    public C3YC LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public C3YM LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C3YC LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3YI(C3YC c3yc, InterfaceC67352kd<? super C3YI> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c3yc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIIJ(null, null, false, this);
    }
}
