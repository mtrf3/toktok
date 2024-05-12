package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.model.RecUser;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafRelatedSource", f = "MafRelatedSource.kt", l = {41}, m = "getRelatedUserList")
/* renamed from: X.MoF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57919MoF extends C3CS {
    public C57918MoE LJLIL;
    public RecUser LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C57918MoE LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57919MoF(C57918MoE c57918MoE, InterfaceC67352kd<? super C57919MoF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c57918MoE;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZ(null, null, this);
    }
}
