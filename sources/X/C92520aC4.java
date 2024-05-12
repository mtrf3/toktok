package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel", f = "AddressViewModel.kt", l = {272}, m = "initDataForFirstState")
/* renamed from: X.aC4, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92520aC4 extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AddressViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92520aC4(AddressViewModel addressViewModel, InterfaceC67352kd<? super C92520aC4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = addressViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.rv0(null, null, null, this);
    }
}
