package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.mota.queue.PQSupervisor$PendingQueue$enqueueOp$1$invokeSuspend$lambda$7$$inlined$collect$1", f = "PQSupervisor.kt", l = {143, 150, 156, 161, 163}, m = "emit")
/* loaded from: classes16.dex */
public final class XHP extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ XHK LJLJI;
    public XHK LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XHP(XHK xhk, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = xhk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
