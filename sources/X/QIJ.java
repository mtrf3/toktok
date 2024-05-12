package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.applog.AppLog;
import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.RegionService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIJ {
    public static boolean LIZ;
    public static final QI3 LIZIZ = AppLog.LIZ;

    public static void LIZIZ(Context context, String str, JSONObject jSONObject) {
        o.LJIIIZ(context, "context");
        if (!ujb.o.LJJJJJL(str)) {
            NetworkService.LJI().LJFF();
            if (!LIZ) {
                try {
                    QIN qin = new QIN(String.valueOf(EF7.LJIIIZ), DeviceRegisterManager.getChannel(context));
                    qin.LJ = RegionService.LIZ().getRegion();
                    qin.LJIIIZ = EF7.LIZ();
                    qin.LJIIJJI = EF7.LIZLLL();
                    qin.LJIILIIL = EF7.LIZJ();
                    C66779QIt c66779QIt = new C66779QIt();
                    c66779QIt.LIZLLL = new C48852JFg(new C48306Ixa("https://log-va.tiktokv.com/service/2/device_register/", "https://log-va.tiktokv.com/service/2/app_alert_check/"), true, false, false);
                    c66779QIt.LIZ = new String[]{"https://log-va.tiktokv.com/service/2/app_log/", "log-va.tiktokv.com"};
                    c66779QIt.LIZIZ = new String[]{"https://rtlog.tiktokv.com/service/2/app_log/"};
                    c66779QIt.LIZJ = "https://log-va.tiktokv.com/service/2/log_settings/";
                    qin.LJIIJ = new C66770QIk(c66779QIt);
                    qin.LIZIZ = true;
                    qin.LJII = 1;
                    QI3 qi3 = LIZIZ;
                    qi3.LJIJI = true;
                    qi3.LJII(context, qin);
                } catch (Throwable unused) {
                }
                LIZ = true;
            }
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "extraData.toString()");
            LIZIZ.LJIIJ(str, jSONObject2);
        }
    }

    public static void LIZ(Context context, int i, String str, C35767E1z c35767E1z) {
        o.LJIIIZ(context, "context");
        if (ujb.o.LJJJJJL(str)) {
            return;
        }
        Intent intent = new Intent("com.ss.android.ugc.tiktok.app.widget.SEARCH_SUGGEST_LIST_WIDGET_REPORT");
        intent.putExtra("report_event_data", c35767E1z);
        intent.putExtra("report_event_name", str);
        intent.putExtra("widgetId", i);
        C10760bY.LIZ(context).LIZJ(intent);
    }
}
