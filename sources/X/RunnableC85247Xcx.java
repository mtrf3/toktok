package X;

import android.content.Context;
import android.location.LocationManager;
import com.bytedance.bdlocation.BDLocationSpi;
import com.bytedance.bdlocation.init.IBDLocationAgent;
import com.bytedance.pumbaa.bpea.adapter.BPEAServiceImp;
import com.bytedance.pumbaa.bpea.adapter.api.IBPEAService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xcx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC85247Xcx implements Runnable {
    public static final RunnableC85247Xcx LJLIL = new RunnableC85247Xcx();

    public static void LIZ() {
        Boolean bool;
        boolean z;
        String str;
        IBPEAService LIZJ = BPEAServiceImp.LIZJ();
        if (LIZJ != null) {
            bool = Boolean.valueOf(LIZJ.isInit());
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.FALSE)) {
            PJZ.LIZIZ(new Throwable(), "bpea_not_init");
        }
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).mobLocationStatus(LQA.LIZIZ.LJIJI(), C85249Xcz.LJLIL);
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).uploadInAppPreciseStatusAfterAppLaunch();
        boolean z2 = true;
        boolean z3 = !C35908E7k.LIZIZ().contains("location_permission_is_allow");
        boolean z4 = C35908E7k.LIZIZ().getBoolean("location_permission_is_allow", false);
        Context LIZIZ = EF7.LIZIZ();
        try {
            OHI.LIZ.getClass();
            z = OHI.LJ(LIZIZ, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception e) {
            e.getMessage();
            z = false;
        }
        if (z4) {
            if (z) {
                str = "long_term_permission";
            } else {
                str = "short_term_permission";
            }
        } else if (!z4) {
            if (z) {
                str = "deny_and_change";
            } else {
                str = "long_term_deny";
            }
        } else {
            throw new C162476Zf();
        }
        if (!z3) {
            if (z != z4) {
                C35908E7k.LIZIZ().storeBoolean("location_permission_is_allow", z);
            }
        } else {
            C35908E7k.LIZIZ().storeBoolean("location_permission_is_allow", z);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!z3) {
            linkedHashMap.put("app_status", str);
        }
        if (o.LJ(str, "long_term_permission")) {
            Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "location");
            o.LJII(LLILL, "null cannot be cast to non-null type android.location.LocationManager");
            linkedHashMap.put("system_status", String.valueOf(((LocationManager) LLILL).isProviderEnabled("gps") ? 1 : 0));
        }
        FMX.LJIIL("location_permission_status", linkedHashMap);
        IBDLocationAgent bDLocationAgent = BDLocationSpi.getBDLocationAgent();
        if (bDLocationAgent == null || !bDLocationAgent.isInit()) {
            LocationServiceImpl.LJIJJ().LJIILL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Init Location SDK: ");
            IBDLocationAgent bDLocationAgent2 = BDLocationSpi.getBDLocationAgent();
            if (bDLocationAgent2 == null || !bDLocationAgent2.isInit()) {
                z2 = false;
            }
            LIZ.append(z2);
            X1D.LIZIZ(LIZ);
        }
        C85295Xdj.LIZIZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
