package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.controller.CardNumberController", f = "CardNumberController.kt", l = {489}, m = "getUnifiedBinDetail")
/* renamed from: X.aE4, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92644aE4 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C92363a9X LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92644aE4(C92363a9X c92363a9X, InterfaceC67352kd<? super C92644aE4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c92363a9X;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIIZILJ(null, this);
    }
}
