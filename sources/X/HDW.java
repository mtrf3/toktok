package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrApi;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HDW extends AbstractC65781Prl implements InterfaceC65784Pro<AfrApi> {
    public static final HDW LJLIL = new HDW();

    public HDW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AfrApi invoke() {
        String host = ((Host) ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0)).getItemName();
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        o.LJIIIIZZ(host, "host");
        return networkService.createRetrofit(host, true, AfrApi.class);
    }
}
