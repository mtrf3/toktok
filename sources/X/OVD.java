package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.IConfigService;

/* loaded from: classes11.dex */
public final class OVD extends AbstractC65781Prl implements InterfaceC65784Pro<IConfigService> {
    public static final OVD LJLIL = new OVD();

    public OVD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IConfigService invoke() {
        return AVExternalServiceImpl.LIZ().configService();
    }
}
