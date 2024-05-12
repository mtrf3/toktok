package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.server.WsChannelService;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QMG implements QMK {
    public final Context LIZ;

    static {
        C16880lQ.LJLLJ(QMG.class);
    }

    @Override // X.QMK
    public final java.util.Map<Integer, IWsApp> LIZIZ() {
        String LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            LIZ = C66455Q6h.LIZIZ(this.LIZ).LIZ();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (TextUtils.isEmpty(LIZ)) {
            return linkedHashMap;
        }
        JSONArray jSONArray = new JSONArray(LIZ);
        int length = jSONArray.length();
        if (length <= 0) {
            return linkedHashMap;
        }
        for (int i = 0; i < length; i++) {
            new QOY();
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            SsWsApp ssWsApp = new SsWsApp();
            ssWsApp.LIZ(optJSONObject);
            if (LIZJ(ssWsApp)) {
                linkedHashMap.put(Integer.valueOf(ssWsApp.LJJLI()), ssWsApp);
            }
        }
        return linkedHashMap;
    }

    public QMG(Context context) {
        this.LIZ = context;
    }

    public static boolean LIZJ(IWsApp iWsApp) {
        if (iWsApp == null || iWsApp.LJJLI() <= 0 || iWsApp.getAppId() <= 0 || C38354F3m.LJ(iWsApp.getAppKey()) || iWsApp.getAppVersion() <= 0 || iWsApp.LLLLZ().isEmpty() || C38354F3m.LJ(iWsApp.getDeviceId()) || iWsApp.LLJJJJLIIL() <= 0 || C38354F3m.LJ(iWsApp.LIZJ()) || iWsApp.getPlatform() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.QMK
    public final void LIZ(java.util.Map<Integer, IWsApp> map) {
        if (map == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (WsChannelService.class) {
            for (Map.Entry<Integer, IWsApp> entry : map.entrySet()) {
                try {
                    if (LIZJ(entry.getValue())) {
                        jSONArray.put(entry.getValue().LJJIII());
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        try {
            C66455Q6h LIZIZ = C66455Q6h.LIZIZ(this.LIZ);
            String jSONArray2 = jSONArray.toString();
            C66454Q6g c66454Q6g = LIZIZ.LIZ;
            c66454Q6g.getClass();
            QM3 qm3 = new QM3(c66454Q6g.LIZ);
            qm3.LIZIZ.put("ws_apps", jSONArray2);
            qm3.LIZIZ();
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
