package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService;

/* renamed from: X.AcA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26594AcA extends AbstractC65781Prl implements InterfaceC65784Pro<ViewModelProvider.Factory> {
    public static final C26594AcA LJLIL = new C26594AcA();

    public C26594AcA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ViewModelProvider.Factory invoke() {
        return new DefaultLogisticStrategyService();
    }
}
