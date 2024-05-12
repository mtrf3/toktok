package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.DefaultAddressEditDetailStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;

/* renamed from: X.AbY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26556AbY extends AbstractC65781Prl implements InterfaceC65784Pro<IComponentStrategyService<AddressEditDetailViewModel>> {
    public static final C26556AbY LJLIL = new C26556AbY();

    public C26556AbY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IComponentStrategyService<AddressEditDetailViewModel> invoke() {
        return new DefaultAddressEditDetailStrategyService();
    }
}
