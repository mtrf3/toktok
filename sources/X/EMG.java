package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.handler.ContactLegacyHandler", f = "ContactLegacyHandler.kt", l = {56}, m = "handleInternal")
/* loaded from: classes7.dex */
public final class EMG extends C3CS {
    public EML LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ EML LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EMG(EML eml, InterfaceC67352kd<? super EMG> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = eml;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(this);
    }
}
