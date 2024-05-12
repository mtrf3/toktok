package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.UserCardDataSource", f = "UserCardDataSource.kt", l = {147}, m = "load")
/* renamed from: X.MpA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57976MpA extends C3CS {
    public C57962Mow LJLIL;
    public InterfaceC57960Mou LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C57962Mow LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57976MpA(C57962Mow c57962Mow, InterfaceC67352kd<? super C57976MpA> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c57962Mow;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIJJLI(false, null, this);
    }
}
