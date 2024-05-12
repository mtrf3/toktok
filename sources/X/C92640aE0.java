package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.controller.StreetFillerController", f = "StreetFillerController.kt", l = {165}, m = "getPlaceAutoComplete")
/* renamed from: X.aE0, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92640aE0 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C92357a9R LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92640aE0(C92357a9R c92357a9R, InterfaceC67352kd<? super C92640aE0> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c92357a9R;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIILL(null, this);
    }
}
