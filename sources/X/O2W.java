package X;

import com.bytedance.lynx.hybrid.service.IResourceService;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O2W implements InterfaceC61252O2e {
    public IResourceService LIZ;

    @Override // X.InterfaceC61252O2e
    public final boolean LIZ(String rootDir, String accessKey, String channel) {
        o.LJIIJ(rootDir, "rootDir");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        return false;
    }

    @Override // X.InterfaceC61252O2e
    public final String LIZJ(String offlineDir, String accessKey, String str) {
        o.LJIIJ(offlineDir, "offlineDir");
        o.LJIIJ(accessKey, "accessKey");
        return "";
    }

    @Override // X.InterfaceC61252O2e
    public final void LJ(O1M o1m, List<String> list, InterfaceC61273O2z interfaceC61273O2z) {
    }

    @Override // X.InterfaceC61252O2e
    public final void LJFF(IResourceService iResourceService) {
        this.LIZ = iResourceService;
    }

    @Override // X.InterfaceC61252O2e
    public final java.util.Map<String, String> LIZIZ(String offlineDir, String str) {
        o.LJIIJ(offlineDir, "offlineDir");
        return new LinkedHashMap();
    }
}
