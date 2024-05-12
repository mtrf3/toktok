package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.DefaultAddressEditDetailStrategyService;

/* renamed from: X.Ac9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26593Ac9 extends AbstractC65781Prl implements InterfaceC65784Pro<ViewModelProvider.Factory> {
    public static final C26593Ac9 LJLIL = new C26593Ac9();

    public C26593Ac9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ViewModelProvider.Factory invoke() {
        return new DefaultAddressEditDetailStrategyService();
    }
}
