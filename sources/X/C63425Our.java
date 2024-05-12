package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {844, 147, 854, 154, 864, 874, 884, 180, 894, 189, 192}, m = "consumeEvent")
/* renamed from: X.Our, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63425Our extends C3CS {
    public C63420Oum LJLIL;
    public AbstractC63432Ouy LJLILLLLZI;
    public XJO LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C63420Oum LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63425Our(C63420Oum c63420Oum, InterfaceC67352kd<? super C63425Our> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c63420Oum;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZLLL(null, this);
    }
}
