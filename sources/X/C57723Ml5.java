package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.repo.MaFVideoRepository", f = "MaFVideoRepository.kt", l = {54}, m = "loadMaFVideoList")
/* renamed from: X.Ml5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57723Ml5 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57721Ml3 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57723Ml5(C57721Ml3 c57721Ml3, InterfaceC67352kd<? super C57723Ml5> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57721Ml3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJFF(null, this);
    }
}
