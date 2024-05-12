package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectController", f = "LiveEffectController.kt", l = {39, 41}, m = "downloadEffect")
/* renamed from: X.1vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48861vu extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C1KC LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48861vu(C1KC c1kc, InterfaceC67352kd<? super C48861vu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c1kc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(null, null, null, this);
    }
}
