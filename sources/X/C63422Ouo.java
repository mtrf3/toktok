package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {844, 854, 292, 306, 307, 318, 320}, m = "processQueueAndNotify")
/* renamed from: X.Ouo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63422Ouo extends C3CS {
    public C63420Oum LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public XJO LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public long LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ C63420Oum LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63422Ouo(C63420Oum c63420Oum, InterfaceC67352kd<? super C63422Ouo> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = c63420Oum;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LJIIIZ(this);
    }
}
