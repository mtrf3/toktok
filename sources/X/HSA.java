package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.IAnchorService;

/* loaded from: classes8.dex */
public final class HSA extends AbstractC65781Prl implements InterfaceC65784Pro<IAnchorService> {
    public static final HSA LJLIL = new HSA();

    public HSA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAnchorService invoke() {
        return AVExternalServiceImpl.LIZ().anchorService();
    }
}
