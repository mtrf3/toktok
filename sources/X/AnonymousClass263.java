package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {80, 82, 83}, m = "animate")
/* renamed from: X.263, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass263 extends C3CS {
    public C23190vb LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C23190vb LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass263(C23190vb c23190vb, InterfaceC67352kd<? super AnonymousClass263> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c23190vb;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(this);
    }
}
