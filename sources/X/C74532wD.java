package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi$Companion", f = "ECActionApi.kt", l = {24}, m = "getCartItemCount")
/* renamed from: X.2wD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74532wD extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C74542wE LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74532wD(C74542wE c74542wE, InterfaceC67352kd<? super C74532wD> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c74542wE;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(this);
    }
}
