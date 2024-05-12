package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel", f = "AddressListViewModel.kt", l = {371}, m = "openAddressEditForResult")
/* renamed from: X.Aei, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26752Aei<R> extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AddressListViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26752Aei(AddressListViewModel addressListViewModel, InterfaceC67352kd<? super C26752Aei> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = addressListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.Qv0(null, this);
    }
}
