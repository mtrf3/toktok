package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IAVMobService;

/* loaded from: classes16.dex */
public final class XTD extends AbstractC65781Prl implements InterfaceC65784Pro<IAVMobService> {
    public static final XTD LJLIL = new XTD();

    public XTD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVMobService invoke() {
        return AVExternalServiceImpl.LIZ().getAVMobService();
    }
}
