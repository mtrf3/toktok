package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.Config;
import com.bytedance.im.core.proto.GetConfigsResponseBody;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Ot4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63314Ot4 {
    public static boolean LIZ = false;
    public static boolean LIZIZ = false;
    public static long LIZJ = 60;
    public static long LIZLLL = 300;
    public static boolean LJ = true;
    public static long LJFF = 86400000;
    public static long LJI = 0;
    public static int LJII = 100;
    public static float LJIIIIZZ = 0.2f;
    public static boolean LJIIIZ = true;
    public static long LJIIJ = 100;
    public static Float LJIIJJI;
    public static java.util.Map<String, String> LJIIL;
    public static JSONObject LJIILIIL;
    public static JSONObject LJIILJJIL;

    static {
        if (LJIILIIL != null) {
            return;
        }
        try {
            C63291Osh LIZ2 = C63291Osh.LIZ();
            InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LJ;
            LIZ2.getClass();
            String string = interfaceC63293Osj.getString(C63291Osh.LJIIIZ("key_imsdk_settings"), "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            LJIILJJIL = jSONObject;
            if (!jSONObject.has("im_config")) {
                return;
            }
            LJIILIIL = LJIILJJIL.optJSONObject("im_config");
        } catch (Exception e) {
            C63322OtC.LJI("CloudConfig", "tryInitImSettings", e);
        }
    }

    public static int LIZLLL() {
        String LIZJ2 = LIZJ("ws_report_interval");
        if (TextUtils.isEmpty(LIZJ2)) {
            return -1;
        }
        try {
            return CastIntegerProtector.parseInt(LIZJ2);
        } catch (Exception e) {
            C63337OtR.LJ("getWsReportIntervalSec", e);
            return -1;
        }
    }

    public static boolean LJ() {
        JSONObject jSONObject = LJIILIIL;
        if (jSONObject != null) {
            if (jSONObject.optInt("autoPollingMsgEnabled") == 1) {
                return true;
            }
            return false;
        }
        return LIZ;
    }

    public static boolean LJFF() {
        JSONObject jSONObject = LJIILIIL;
        if (jSONObject != null) {
            if (jSONObject.optInt("repairEnabled") == 1) {
                return true;
            }
            return false;
        }
        return LJ;
    }

    public static boolean LJI() {
        JSONObject jSONObject = LJIILIIL;
        if (jSONObject != null) {
            if (jSONObject.optInt("triggerPollingMsgEnabled") == 1) {
                return true;
            }
            return false;
        }
        return LIZIZ;
    }

    public static boolean LJII() {
        return "1".equals(LIZJ("should_stop_polling_when_background"));
    }

    public static boolean LIZ() {
        if (C63308Osy.LJI().LIZLLL().LJJJLZIJ || "1".equals(LIZJ("auto_polling_when_no_ws"))) {
            return true;
        }
        return false;
    }

    public static java.util.Map<String, String> LIZIZ(List<Config> list) {
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (Config config : list) {
                hashMap.put(config.conf_name, config.conf_value);
            }
        }
        return hashMap;
    }

    public static String LIZJ(String str) {
        GetConfigsResponseBody getConfigsResponseBody;
        Object opt;
        JSONObject jSONObject = LJIILIIL;
        if (jSONObject != null && (opt = jSONObject.opt(str)) != null) {
            return opt.toString();
        }
        if (LJIIL == null) {
            try {
                C63291Osh LIZ2 = C63291Osh.LIZ();
                InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
                LIZ2.getClass();
                getConfigsResponseBody = (GetConfigsResponseBody) C63682Oz0.LIZ.LJI(interfaceC63293Osj.getString(C63291Osh.LJIIIZ("imsdk_cloud_config"), ""), GetConfigsResponseBody.class);
            } catch (Exception e) {
                C63322OtC.LJI("CloudConfig", "getConfig error", e);
                getConfigsResponseBody = null;
            }
            if (getConfigsResponseBody != null) {
                LJIIL = LIZIZ(getConfigsResponseBody.configs);
            } else {
                LJIIL = new HashMap();
            }
        }
        return (String) ((HashMap) LJIIL).get(str);
    }
}
