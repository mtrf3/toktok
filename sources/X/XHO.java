package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.mota.queue.PQSupervisor$PendingQueue", f = "PQSupervisor.kt", l = {229}, m = "processQueue")
/* loaded from: classes16.dex */
public final class XHO extends C3CS {
    public XHM LJLIL;
    public XJO LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ XHM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XHO(XHM xhm, InterfaceC67352kd<? super XHO> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = xhm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZIZ(this);
    }
}
