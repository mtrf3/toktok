package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafUserPagingSource", f = "MafUserPagingSource.kt", l = {298}, m = "fetch")
/* renamed from: X.MpC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57978MpC extends C3CS {
    public C57963Mox LJLIL;
    public C57967Mp1 LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C57963Mox LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57978MpC(C57963Mox c57963Mox, InterfaceC67352kd<? super C57978MpC> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c57963Mox;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, this);
    }
}
