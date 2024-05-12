package X;

import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.legoImp.task.PitayaDlpTask;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.F8v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38493F8v {
    public final double LIZ;
    public final int LIZIZ;
    public final IPitayaCore LIZJ;
    public final String LIZLLL;
    public final ArrayList<String> LJ;

    public final void LIZ(PTYTaskData pTYTaskData, long j) {
        JSONObject params;
        JSONArray jSONArray;
        boolean z;
        if (pTYTaskData != null && (params = pTYTaskData.getParams()) != null) {
            Object obj = params.get("result");
            if ((obj instanceof JSONArray) && (jSONArray = (JSONArray) obj) != null) {
                long currentTimeMillis = (System.currentTimeMillis() - j) / jSONArray.length();
                int i = 0;
                while (i < jSONArray.length()) {
                    int i2 = i + 1;
                    if (JSONArrayProtectorUtils.getDouble(jSONArray, i) >= this.LIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ApmEvent apmEvent = new ApmEvent("dlp_breached_monitor");
                    apmEvent.LIZ(String.valueOf(z), "breached");
                    apmEvent.LIZJ(Long.valueOf(currentTimeMillis), "cost");
                    C66059PwF.LIZIZ(apmEvent);
                    i = i2;
                }
            }
        }
    }

    public C38493F8v(PitayaDlpTask host, double d, int i) {
        o.LJIIIZ(host, "host");
        this.LIZ = d;
        this.LIZIZ = i;
        this.LIZLLL = "tiktok_pns_logging";
        this.LJ = new ArrayList<>(i);
        this.LIZJ = PitayaCoreFactory.getCore(String.valueOf(EF7.LJIIIZ));
        ALog.addMessageInterceptor(host.LJLJJI);
    }
}
