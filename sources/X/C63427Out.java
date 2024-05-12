package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {233, 844}, m = "moveToWaitingState")
/* renamed from: X.Out, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63427Out extends C3CS {
    public C63420Oum LJLIL;
    public XJO LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C63420Oum LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63427Out(C63420Oum c63420Oum, InterfaceC67352kd<? super C63427Out> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c63420Oum;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJI(this);
    }
}
