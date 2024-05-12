package X;

import com.ss.android.ugc.aweme.search.ecommerce.ECommerceGeneralSearchWidgetServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IECommerceGeneralSearchWidgetService;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;

/* loaded from: classes9.dex */
public final class JLA extends AbstractC65781Prl implements InterfaceC65784Pro<ITopLiveProductViewProvider> {
    public static final JLA LJLIL = new JLA();

    public JLA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ITopLiveProductViewProvider invoke() {
        IECommerceGeneralSearchWidgetService LIZJ = ECommerceGeneralSearchWidgetServiceImpl.LIZJ();
        if (LIZJ != null) {
            return LIZJ.LIZIZ();
        }
        return null;
    }
}
