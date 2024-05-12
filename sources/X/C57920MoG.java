package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafRelatedSource", f = "MafRelatedSource.kt", l = {74}, m = "fetchRelatedUserList")
/* renamed from: X.MoG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57920MoG extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57918MoE LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57920MoG(C57918MoE c57918MoE, InterfaceC67352kd<? super C57920MoG> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57918MoE;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(null, null, this);
    }
}
