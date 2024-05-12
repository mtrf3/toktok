package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;

/* renamed from: X.AcF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26599AcF extends AbstractC65781Prl implements InterfaceC65784Pro<IComponentStrategyService<AddressEditViewModel>> {
    public static final C26599AcF LJLIL = new C26599AcF();

    public C26599AcF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IComponentStrategyService<AddressEditViewModel> invoke() {
        return new DefaultAddressEditStrategyService();
    }
}
