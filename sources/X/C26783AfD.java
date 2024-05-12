package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.engine.DefaultPdpStrategyService;

/* renamed from: X.AfD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26783AfD extends AbstractC65781Prl implements InterfaceC65784Pro<ViewModelProvider.Factory> {
    public static final C26783AfD LJLIL = new C26783AfD();

    public C26783AfD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ViewModelProvider.Factory invoke() {
        return new DefaultPdpStrategyService();
    }
}
