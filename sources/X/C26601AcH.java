package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;

/* renamed from: X.AcH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26601AcH extends AbstractC65781Prl implements InterfaceC65784Pro<IComponentStrategyService<AddressListViewModel>> {
    public static final C26601AcH LJLIL = new C26601AcH();

    public C26601AcH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IComponentStrategyService<AddressListViewModel> invoke() {
        return new DefaultAddressListStrategyService();
    }
}
