package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.ContactRepositoryImpl", f = "ContactRepositoryImpl.kt", l = {27, 32}, m = "sync")
/* loaded from: classes7.dex */
public final class EMP extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EMN LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EMP(EMN emn, InterfaceC67352kd<? super EMP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = emn;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
