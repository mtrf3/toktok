package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectController", f = "LiveEffectController.kt", l = {161, 164}, m = "getEffect")
/* renamed from: X.1vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48881vw extends C3CS {
    public C1KC LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C1KC LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48881vw(C1KC c1kc, InterfaceC67352kd<? super C48881vw> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c1kc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJI(null, null, this);
    }
}
