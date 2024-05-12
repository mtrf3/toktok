package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.repo.MaFUserRepository", f = "MaFUserRepository.kt", l = {75}, m = "loadMaFUserList")
/* renamed from: X.Mnc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57880Mnc extends C3CS {
    public C57877MnZ LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C57877MnZ LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57880Mnc(C57877MnZ c57877MnZ, InterfaceC67352kd<? super C57880Mnc> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c57877MnZ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJFF(null, this);
    }
}
