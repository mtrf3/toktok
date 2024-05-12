package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;

/* loaded from: classes10.dex */
public final class LK0 extends AbstractC65781Prl implements InterfaceC65784Pro<IEnterFromService> {
    public static final LK0 LJLIL = new LK0();

    public LK0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IEnterFromService invoke() {
        return AVExternalServiceImpl.LIZ().enterFromService();
    }
}
