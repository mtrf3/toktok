package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.repo.MaFUserRepository", f = "MaFUserRepository.kt", l = {99}, m = "dislikeUser")
/* renamed from: X.Mnd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57881Mnd extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C57877MnZ LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57881Mnd(C57877MnZ c57877MnZ, InterfaceC67352kd<? super C57881Mnd> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c57877MnZ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(null, 0, 0, this);
    }
}
