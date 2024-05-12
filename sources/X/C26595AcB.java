package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.address.DefaultAddressSelectStrategyService;

/* renamed from: X.AcB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26595AcB extends AbstractC65781Prl implements InterfaceC65784Pro<ViewModelProvider.Factory> {
    public static final C26595AcB LJLIL = new C26595AcB();

    public C26595AcB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ViewModelProvider.Factory invoke() {
        return new DefaultAddressSelectStrategyService();
    }
}
