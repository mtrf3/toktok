package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.SendMessageQueue", f = "SendMessageQueue.kt", l = {135}, m = "exponentialBackoff")
/* renamed from: X.Oz7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63689Oz7 extends C3CS {
    public C63686Oz4 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C63686Oz4<T> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63689Oz7(C63686Oz4<T> c63686Oz4, InterfaceC67352kd<? super C63689Oz7> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c63686Oz4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(this);
    }
}
