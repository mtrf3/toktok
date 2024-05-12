package X;

import com.ss.android.ugc.aweme.network.spi.INetworkLevelService;
import com.ss.android.ugc.aweme.services.NetworkLevelService;

/* loaded from: classes9.dex */
public final class IEN implements INetworkLevelService {
    public static final IEN LIZIZ = new IEN();
    public final /* synthetic */ INetworkLevelService LIZ = NetworkLevelService.createINetworkLevelServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkLevelService
    public final void notifyNQEChange(int i) {
        this.LIZ.notifyNQEChange(i);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkLevelService
    public final void reportNetworkLevel(String str) {
        this.LIZ.reportNetworkLevel(str);
    }
}
