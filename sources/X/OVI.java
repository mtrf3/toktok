package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;

/* loaded from: classes11.dex */
public final class OVI extends AbstractC65781Prl implements InterfaceC65784Pro<IExternalService> {
    public static final OVI LJLIL = new OVI();

    public OVI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IExternalService invoke() {
        return AVExternalServiceImpl.LIZ();
    }
}
