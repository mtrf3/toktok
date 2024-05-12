package X;

import android.app.Application;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.service.IResourceService;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class O2S {
    public static final /* synthetic */ int LIZLLL = 0;
    public final O2J LIZ;
    public final java.util.Map<IResourceService, O2J> LIZIZ;
    public Application LIZJ;

    public O2S() {
        List LJJIJIL = C47261Igj.LJJIJIL("");
        boolean z = false;
        GeckoConfig geckoConfig = new GeckoConfig("", "", z, z, 12, null);
        geckoConfig.setGeckoDepender(new O2W());
        O2J o2j = new O2J("", LJJIJIL, geckoConfig, null, 8184);
        o2j.LJI = new C61262O2o();
        this.LIZ = o2j;
        this.LIZIZ = new LinkedHashMap();
    }

    public final O2J LIZ(IResourceService iResourceService) {
        if (iResourceService == null) {
            C39048FUe.LIZIZ.LIZ("getConfig service is null,return placeholder", EnumC39866Fkk.E, "ResLoaderConfigManager");
        }
        O2J o2j = (O2J) ((LinkedHashMap) this.LIZIZ).get(iResourceService);
        if (o2j != null) {
            return o2j;
        }
        return this.LIZ;
    }
}
