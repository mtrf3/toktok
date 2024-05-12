package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;

/* loaded from: classes7.dex */
public final class EOQ extends AbstractC65781Prl implements InterfaceC65784Pro<EOT> {
    public static final EOQ LJLIL = new EOQ();

    public EOQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final EOT invoke() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSpecActDebugService();
    }
}
