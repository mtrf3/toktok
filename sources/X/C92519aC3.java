package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel", f = "AddressViewModel.kt", l = {291, 733}, m = "fetchData")
/* renamed from: X.aC3, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92519aC3 extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public C68322mC LJLJJL;
    public Object LJLJJLL;
    public C72242sW LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public long LJLLI;
    public double LJLLILLLL;
    public /* synthetic */ Object LJLLJ;
    public final /* synthetic */ AddressViewModel LJLLL;
    public int LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92519aC3(AddressViewModel addressViewModel, InterfaceC67352kd<? super C92519aC3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLL = addressViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLJ = obj;
        this.LJLLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLL.lv0(null, null, null, this);
    }
}
