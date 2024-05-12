package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.DefaultAddressListStrategyService;

/* renamed from: X.Ah0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26894Ah0 extends AbstractC65781Prl implements InterfaceC65784Pro<ViewModelProvider.Factory> {
    public static final C26894Ah0 LJLIL = new C26894Ah0();

    public C26894Ah0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ViewModelProvider.Factory invoke() {
        return new DefaultAddressListStrategyService();
    }
}
