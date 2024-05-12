package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.base.Configuration", f = "Configuration.kt", l = {47}, m = "getIdempotency")
/* renamed from: X.aKP, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93037aKP extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C92106a5O LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93037aKP(C92106a5O c92106a5O, InterfaceC67352kd<? super C93037aKP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c92106a5O;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(this);
    }
}
