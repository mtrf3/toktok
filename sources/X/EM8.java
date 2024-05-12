package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.monitor.ContactMonitorByPsi", f = "ContactMonitorByPsi.kt", l = {98}, m = "measureTs")
/* loaded from: classes7.dex */
public final class EM8<T> extends C3CS {
    public EM2 LJLIL;
    public EMC LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ EM2 LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EM8(EM2 em2, InterfaceC67352kd<? super EM8> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = em2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJ(null, null, this);
    }
}
