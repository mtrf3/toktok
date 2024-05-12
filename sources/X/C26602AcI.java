package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;

/* renamed from: X.AcI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26602AcI extends AbstractC65781Prl implements InterfaceC65784Pro<IComponentStrategyService<AddressListViewModel>> {
    public static final C26602AcI LJLIL = new C26602AcI();

    public C26602AcI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IComponentStrategyService<AddressListViewModel> invoke() {
        return new DefaultAddressListStrategyService();
    }
}
