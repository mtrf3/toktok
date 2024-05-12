package X;

import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;

/* loaded from: classes11.dex */
public final class NSA extends AbstractC65781Prl implements InterfaceC65784Pro<IECommerceService> {
    public static final NSA INSTANCE = new NSA();

    public NSA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IECommerceService invoke() {
        return ECommerceService.createIECommerceServicebyMonsterPlugin(false);
    }
}
