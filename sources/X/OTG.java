package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.authorize.network.AuthorizeApiImpl", f = "AuthorizeApiImpl.kt", l = {38}, m = "getAuthTicketInfo")
/* loaded from: classes11.dex */
public final class OTG extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ OTE LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTG(OTE ote, InterfaceC67352kd<? super OTG> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = ote;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(null, null, this);
    }
}
