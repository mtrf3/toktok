package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;

/* loaded from: classes10.dex */
public final class LFF extends AbstractC65781Prl implements InterfaceC65784Pro<LFD> {
    public static final LFF LJLIL = new LFF();

    public LFF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LFD invoke() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getTabletService();
    }
}
