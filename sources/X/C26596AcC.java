package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService;

/* renamed from: X.AcC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26596AcC extends AbstractC65781Prl implements InterfaceC65784Pro<ViewModelProvider.Factory> {
    public static final C26596AcC LJLIL = new C26596AcC();

    public C26596AcC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ViewModelProvider.Factory invoke() {
        return new DefaultOspStrategyService();
    }
}
