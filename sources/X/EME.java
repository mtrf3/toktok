package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.monitor.ContactMonitor", f = "ContactMonitor.kt", l = {210}, m = "withRequest")
/* loaded from: classes7.dex */
public final class EME<T> extends C3CS {
    public C37065Egf LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C37065Egf LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EME(C37065Egf c37065Egf, InterfaceC67352kd<? super EME> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c37065Egf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIL(null, this);
    }
}
