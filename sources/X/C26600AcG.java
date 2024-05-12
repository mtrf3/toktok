package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.DefaultAddressEditStrategyService;

/* renamed from: X.AcG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26600AcG extends AbstractC65781Prl implements InterfaceC65784Pro<ViewModelProvider.Factory> {
    public static final C26600AcG LJLIL = new C26600AcG();

    public C26600AcG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ViewModelProvider.Factory invoke() {
        return new DefaultAddressEditStrategyService();
    }
}
