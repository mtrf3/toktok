package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.handler.ContactHandler", f = "ContactHandler.kt", l = {61, 67}, m = "handleInternal")
/* loaded from: classes7.dex */
public final class EMF extends C3CS {
    public EMK LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ EMK LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EMF(EMK emk, InterfaceC67352kd<? super EMF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = emk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(this);
    }
}
