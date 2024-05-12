package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.repo.MaFVideoRepository", f = "MaFVideoRepository.kt", l = {21}, m = "load")
/* renamed from: X.Ml4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57722Ml4 extends C3CS {
    public C57721Ml3 LJLIL;
    public C57720Ml2 LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C57721Ml3 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57722Ml4(C57721Ml3 c57721Ml3, InterfaceC67352kd<? super C57722Ml4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c57721Ml3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
