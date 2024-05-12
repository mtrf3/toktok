package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.SendMessageQueue", f = "SendMessageQueue.kt", l = {79, 80}, m = "getNetworkResult")
/* renamed from: X.Oz6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63688Oz6 extends C3CS {
    public C84657XKj LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C63686Oz4<Object> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63688Oz6(C63686Oz4<Object> c63686Oz4, InterfaceC67352kd<? super C63688Oz6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c63686Oz4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, null, this);
    }
}
