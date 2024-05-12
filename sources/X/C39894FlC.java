package X;

import android.app.Activity;
import android.app.Application;
import com.bytedance.android.livesdk.livesetting.hybrid.LivePrefixInjectToHostSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.FlC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39894FlC {
    public static final void LIZ() {
        Activity topActivity;
        List<String> arrayList;
        O2J resourceConfig;
        String path;
        O2J resourceConfig2;
        List<String> list;
        String path2;
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        GeckoXNetImpl geckoXNetImpl = null;
        if (iHostAction == null || (topActivity = iHostAction.getTopActivity()) == null) {
            return;
        }
        C61483OBb.LIZJ.getClass();
        C61483OBb LIZIZ = C61484OBc.LIZIZ();
        Application application = topActivity.getApplication();
        o.LJIIIIZZ(application, "context.application");
        O2K o2k = new O2K(application);
        Application application2 = o2k.LIZLLL;
        String yg = ((IHostResource) CN1.LIZ(IHostResource.class)).yg();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) C46104I7o.LJJIIJ()).iterator();
        while (it.hasNext()) {
            Pattern pattern = (Pattern) it.next();
            if (pattern != null) {
                String pattern2 = pattern.toString();
                o.LJIIIIZZ(pattern2, "p.toString()");
                if (pattern2.length() > 0 && (path2 = UriProtector.parse(pattern.toString()).getPath()) != null && path2.length() != 0 && !arrayList2.contains(path2)) {
                    arrayList2.add(path2);
                }
            }
        }
        GeckoConfig geckoConfig = new GeckoConfig(((IHostResource) CN1.LIZ(IHostResource.class)).WK(), "offlineX", true, false, 8, null);
        IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
        if (iHostResource != null) {
            geckoXNetImpl = iHostResource.Ct(application2);
        }
        o2k.init(new O2J(yg, arrayList2, geckoConfig, geckoXNetImpl, 8136));
        LIZIZ.LIZ("live", IResourceService.class, o2k);
        if (!LivePrefixInjectToHostSetting.INSTANCE.getValue()) {
            return;
        }
        C61483OBb.LIZJ.getClass();
        IResourceService iResourceService = (IResourceService) C61484OBc.LIZIZ().LIZIZ(IResourceService.class, "hybridkit_default_bid");
        if (iResourceService != null && (resourceConfig2 = iResourceService.getResourceConfig()) != null && (list = resourceConfig2.LIZIZ) != null) {
            arrayList = ORZ.LLJILJILJ(list);
        } else {
            arrayList = new ArrayList<>();
        }
        Iterator it2 = ((ArrayList) C46104I7o.LJJIIJ()).iterator();
        while (it2.hasNext()) {
            Pattern pattern3 = (Pattern) it2.next();
            if (pattern3 != null) {
                String pattern4 = pattern3.toString();
                o.LJIIIIZZ(pattern4, "p.toString()");
                if (pattern4.length() > 0 && (path = UriProtector.parse(pattern3.toString()).getPath()) != null && path.length() != 0 && !arrayList.contains(path)) {
                    arrayList.add(path);
                }
            }
        }
        C61483OBb.LIZJ.getClass();
        IResourceService iResourceService2 = (IResourceService) C61484OBc.LIZIZ().LIZIZ(IResourceService.class, "hybridkit_default_bid");
        if (iResourceService2 == null || (resourceConfig = iResourceService2.getResourceConfig()) == null) {
            return;
        }
        resourceConfig.LIZIZ = arrayList;
    }

    public static final synchronized void LIZIZ() {
        synchronized (C39894FlC.class) {
            C61483OBb.LIZJ.getClass();
            IResourceService iResourceService = (IResourceService) C61484OBc.LIZIZ().LIZIZ(IResourceService.class, "live");
            if (iResourceService == null || !o.LJ(iResourceService.getBid(), "live")) {
                LIZ();
            }
        }
    }
}
