package X;

import android.content.Context;
import android.webkit.WebSettings;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OGQ extends OGR {
    public final String LJLJJL = "livesdk_gp_mmp_event";
    public GameLivePartnershipRetrofitApi LJLJJLL;

    public static void LJIIIIZZ(OGS ogs, JSONObject jSONObject) {
        BZI LIZ = C28787BRn.LIZ("livesdk_gamepad_attributing_mmp_interface");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(ogs.getRoomID(), "room_id");
        LIZ.LJIJJ(ogs.getGameID(), "game_id");
        LIZ.LJIJJ(ogs.getAnchorID(), "anchor_id");
        LIZ.LJIJJ(ogs.getTaskID(), "task_id");
        LIZ.LJIJJ(ogs.getAppID(), "app_id");
        LIZ.LJIJJ(jSONObject.optString("error_code", "-1"), "error_code");
        LIZ.LJIJJ(Long.valueOf(jSONObject.optLong("duration", 0L)), "duration");
        LIZ.LJIJJ(jSONObject.optString("http_code", "-1"), "http_status");
        String viewReportScene = ogs.getViewReportScene();
        if (viewReportScene == null) {
            viewReportScene = "";
        }
        LIZ.LJIJJ(viewReportScene, "view_report_scene");
        String gameName = ogs.getGameName();
        if (gameName == null) {
            gameName = "";
        }
        LIZ.LJIJJ(gameName, "game_name");
        LIZ.LJIJJ(jSONObject.optString("error_message", ""), "error_desc");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        OGS ogs = (OGS) xBaseParamModel;
        o.LJIIIZ(type, "type");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = ogs.getTrackingURLs().getImpressionURL();
        String str = this.LJLJJL;
        JSONObject jSONObject = new JSONObject();
        BZI LIZIZ = C0N3.LIZIZ(str, "show", "event");
        LIZIZ.LJIJJ(ogs.getRoomID(), "room_id");
        LIZIZ.LJIJJ(ogs.getGameID(), "game_id");
        LIZIZ.LJIJJ(ogs.getGameName(), "game_name");
        LIZIZ.LJIJJ(ogs.getAnchorID(), "anchor_id");
        LIZIZ.LJIJJ(ogs.getTaskID(), "task_id");
        LIZIZ.LJIJJ(ogs.getAppID(), "app_id");
        String viewReportScene = ogs.getViewReportScene();
        String str2 = "";
        if (viewReportScene == null) {
            viewReportScene = "";
        }
        LIZIZ.LJIJJ(viewReportScene, "view_report_scene");
        String packageName = ogs.getPackageName();
        if (packageName != null) {
            str2 = packageName;
        }
        LIZIZ.LJIJJ(str2, "package_name");
        LIZIZ.LJJ(jSONObject);
        LIZIZ.LJJIIJZLJL();
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            if (defaultUserAgent == null) {
                defaultUserAgent = "ua";
            }
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new OGP(c68322mC, this, context, URLEncoder.encode(defaultUserAgent, "UTF-8"), c37356ElM, ogs, null), 2);
        }
    }

    public static void LJII(Exception exc, CompletionBlock completionBlock, JSONObject jSONObject, OGS ogs) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("e: ");
        LIZ.append(exc);
        C0NB.LJ("SendThirdPartyLogMethod", X1D.LIZIZ(LIZ));
        C31626Cb8.LIZ(completionBlock, 0, exc.toString(), 4);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("exception in SendThirdPartyLogMethod, e: ");
        LIZ2.append(exc);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (exc instanceof C64799Pbv) {
            jSONObject.put("http_code", ((C64799Pbv) exc).getStatusCode());
        }
        jSONObject.put("error_code", -20);
        jSONObject.put("error_message", LIZIZ);
        LJIIIIZZ(ogs, jSONObject);
    }
}
