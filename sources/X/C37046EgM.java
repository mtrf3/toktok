package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EgM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37046EgM implements InterfaceC39499Fep {
    @Override // X.InterfaceC39499Fep
    public final void LIZ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("【Rasp】block router -> url: ");
        LIZ.append(uri);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC39499Fep
    public final void LIZIZ(android.net.Uri uri) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("【Rasp】web load -> url: ");
        LIZ.append(uri);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC39499Fep
    public final void LIZJ(C39489Fef bridgeInfo, String action) {
        o.LJIIIZ(bridgeInfo, "bridgeInfo");
        o.LJIIIZ(action, "action");
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null) {
            localTestApi.showBridgeBlockTips(bridgeInfo, action);
        }
        if (o.LJ(action, "block")) {
            HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
            C79605VMb c79605VMb = new C79605VMb("jsb_offline_warning");
            c79605VMb.LIZIZ = "jsb_minimization";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("jsb_name", bridgeInfo.LJLILLLLZI);
            String str = bridgeInfo.LJLJLLL;
            if (str != null) {
                try {
                    C35994EAs LIZ = C35993EAr.LIZ(UriProtector.parse(str));
                    if (LIZ != null) {
                        jSONObject.put("url", LIZ.LIZ);
                        jSONObject.put("path", LIZ.LIZIZ);
                    }
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            jSONObject.put("error_code", -1);
            jSONObject.put("relativeViewType", bridgeInfo.LJLZ);
            c79605VMb.LIZLLL = jSONObject;
            c79605VMb.LIZIZ(0);
            hybridMultiMonitor.customReport(c79605VMb.LIZ());
        }
    }
}
