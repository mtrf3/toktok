package X;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O1S implements O1Z {
    public IResourceLoaderService LIZ;

    @Override // X.O1Z
    public final boolean LIZ(String rootDir, String accessKey, String channel) {
        o.LJIIJ(rootDir, "rootDir");
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(channel, "channel");
        return false;
    }

    @Override // X.O1Z
    public final String LIZJ(String offlineDir, String accessKey, String str) {
        o.LJIIJ(offlineDir, "offlineDir");
        o.LJIIJ(accessKey, "accessKey");
        return "";
    }

    @Override // X.O1Z
    public final void LJFF(O1L o1l, List<String> list, InterfaceC61240O1s interfaceC61240O1s) {
    }

    @Override // X.O1Z
    public final void LJ(IResourceLoaderService iResourceLoaderService) {
        this.LIZ = iResourceLoaderService;
    }

    @Override // X.O1Z
    public final java.util.Map<String, String> LIZIZ(String offlineDir, String str) {
        o.LJIIJ(offlineDir, "offlineDir");
        return new LinkedHashMap();
    }
}
