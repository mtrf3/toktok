package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.handler.ContactBaseHandler", f = "ContactBaseHandler.kt", l = {35}, m = "handle")
/* loaded from: classes7.dex */
public final class EMI extends C3CS {
    public EMJ LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ EMJ LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EMI(EMJ emj, InterfaceC67352kd<? super EMI> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = emj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(this);
    }
}
