package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafUserPagingSource", f = "MafUserPagingSource.kt", l = {246}, m = "loadFromPagingApi")
/* renamed from: X.Mp7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57973Mp7 extends C3CS {
    public C57963Mox LJLIL;
    public C57972Mp6 LJLILLLLZI;
    public C57967Mp1 LJLJI;
    public Object LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C57963Mox LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57973Mp7(C57963Mox c57963Mox, InterfaceC67352kd<? super C57973Mp7> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c57963Mox;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZJ(null, null, null, this);
    }
}
