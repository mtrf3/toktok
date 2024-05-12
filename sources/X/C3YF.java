package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.RelationFetchManager", f = "RelationFetchManager.kt", l = {352, 353}, m = "doRealDBUpdate")
/* renamed from: X.3YF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YF extends C3CS {
    public C3YC LJLIL;
    public C3YM LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ C3YC LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3YF(C3YC c3yc, InterfaceC67352kd<? super C3YF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = c3yc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LJFF(null, null, false, this);
    }
}
