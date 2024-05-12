package X;

import com.ss.android.ugc.aweme.network.spi.INetworkContextService;
import com.ss.android.ugc.aweme.services.NetworkContextService;

/* renamed from: X.POv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64389POv implements INetworkContextService {
    public static final C64389POv LIZIZ = new C64389POv();
    public final /* synthetic */ INetworkContextService LIZ = NetworkContextService.createINetworkContextServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkContextService
    public final C64388POu removeNetworkContext(String str) {
        return this.LIZ.removeNetworkContext(str);
    }
}
