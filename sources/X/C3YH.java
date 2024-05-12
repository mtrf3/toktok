package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.RelationFetchManager", f = "RelationFetchManager.kt", l = {228, 229, 239}, m = "doRelationFetchSync")
/* renamed from: X.3YH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YH extends C3CS {
    public C3YC LJLIL;
    public C3YM LJLILLLLZI;
    public C3YD LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C3YC LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3YH(C3YC c3yc, InterfaceC67352kd<? super C3YH> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c3yc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJIIIIZZ(null, this);
    }
}
