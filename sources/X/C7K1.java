package X;

import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import org.json.JSONObject;

/* renamed from: X.7K1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7K1 {
    public static boolean LIZ;
    public static IPitayaCore LIZIZ;

    public static IPitayaCore LIZ() {
        IPitayaCore iPitayaCore = LIZIZ;
        if (iPitayaCore != null) {
            return iPitayaCore;
        }
        return PitayaCoreFactory.getCore(String.valueOf(EF7.LJIIIZ));
    }

    public static boolean LIZJ() {
        if (LIZ) {
            return true;
        }
        boolean isReady = LIZ().isReady();
        if (isReady) {
            LIZ = true;
            LIZIZ = LIZ();
        }
        return isReady;
    }

    public static PTYTaskData LIZIZ(String str, Aweme aweme, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trigger_source", str);
            jSONObject.put("enter_from", str2);
            if (((Number) C7K2.LIZ.getValue()).intValue() == 1 && aweme != null) {
                jSONObject.put("item", GsonHolder.LIZLLL().LIZ().LJIILL(aweme));
            }
        } catch (Throwable th) {
            OSZ[] oszArr = new OSZ[2];
            if (aweme != null) {
                str3 = aweme.getAid();
            } else {
                str3 = null;
            }
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            oszArr[0] = new OSZ(str3, "group_id");
            String message = th.getMessage();
            if (message != null) {
                str4 = message;
            }
            oszArr[1] = new OSZ(str4, "message");
            FMX.LJIILL("repost_client_ai_error", oszArr);
        }
        return new PTYTaskData(jSONObject);
    }
}
