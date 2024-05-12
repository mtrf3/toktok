package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService;

/* renamed from: X.AcE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26598AcE extends AbstractC65781Prl implements InterfaceC65784Pro<ViewModelProvider.Factory> {
    public static final C26598AcE LJLIL = new C26598AcE();

    public C26598AcE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ViewModelProvider.Factory invoke() {
        return new DefaultPaymentStrategyService();
    }
}
