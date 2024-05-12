package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectController", f = "LiveEffectController.kt", l = {137}, m = "getEffectFromCache")
/* renamed from: X.1vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48891vx extends C3CS {
    public C1KC LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C1KC LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48891vx(C1KC c1kc, InterfaceC67352kd<? super C48891vx> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c1kc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIIIZZ(null, null, null, this);
    }
}
