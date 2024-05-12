package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.squareup.wire.Message;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {844, 509}, m = "processNewMsgNotify")
/* renamed from: X.Oun, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63421Oun extends C3CS {
    public C63420Oum LJLIL;
    public C63426Ous LJLILLLLZI;
    public Message LJLJI;
    public Object LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ C63420Oum LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63421Oun(C63420Oum c63420Oum, InterfaceC67352kd<? super C63421Oun> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = c63420Oum;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LJIIIIZZ(null, 0L, null, null, this);
    }
}
