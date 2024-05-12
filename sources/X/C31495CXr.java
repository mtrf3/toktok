package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageDispatchSamplingConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageWsReuseSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSEIDelayTimeCorrectSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMonitor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CXr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31495CXr implements IMonitor {
    public static final java.util.Map<String, Object> LJLILLLLZI = new HashMap();
    public static final long LJLJI = LiveMessageTimeoutSetting.INSTANCE.getHttpFetchMonitorTimeout();
    public final EnumC32070CiI LJLIL;

    public static boolean LIZLLL() {
        long LIZ = C025908h.LIZ();
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
        if (map != null && String.valueOf(LIZ).equals(map.get("anchor_id"))) {
            return true;
        }
        return false;
    }

    public C31495CXr(EnumC32070CiI enumC32070CiI) {
        this.LJLIL = enumC32070CiI;
    }

    public static void LJI(long j) {
        if (Math.random() < LiveMessageDispatchSamplingConfig.INSTANCE.commonSamplingRate()) {
            HashMap hashMap = new HashMap();
            hashMap.put("status_code", Integer.valueOf(LiveSEIDelayTimeCorrectSetting.INSTANCE.enableSEITimeCorrect() ? 1 : 0));
            hashMap.put("delay", Long.valueOf(j));
            hashMap.put("time_diff", Long.valueOf(C31012CFc.LIZIZ));
            C0K2.LJII(0, "ttlive_message_stream_sei_delay", hashMap);
        }
    }

    public final void LIZ(java.util.Map<String, Object> map) {
        HashMap hashMap = (HashMap) map;
        hashMap.put("ws_reuse", Integer.valueOf(LiveMessageWsReuseSetting.webSocketReuse ? 1 : 0));
        hashMap.put("is_anchor_common", Integer.valueOf(LIZLLL() ? 1 : 0));
        hashMap.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        hashMap.put("imsdk_scene", Integer.valueOf(C32072CiK.LIZ(this.LJLIL)));
    }

    public final void LIZIZ(JSONObject jSONObject) {
        int i;
        if (jSONObject != null) {
            try {
                jSONObject.put("ws_reuse", LiveMessageWsReuseSetting.webSocketReuse ? 1 : 0);
                if (LIZLLL()) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_anchor_common", i);
                jSONObject.put("device_score", TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
                jSONObject.put("imsdk_scene", C32072CiK.LIZ(this.LJLIL));
            } catch (JSONException e) {
                C0NB.LJI("LiveMessageMonitor", e);
            }
        }
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null || !str.contains("message_first_dispatch") || LIZLLL()) {
            return;
        }
        long LIZIZ = C95A.LIZIZ("enter_room_start");
        long LIZIZ2 = C95A.LIZIZ("enter_room_api_start");
        long LIZIZ3 = C95A.LIZIZ("enter_room_api_end");
        long LIZIZ4 = C95A.LIZIZ("first_frame_show");
        long LIZIZ5 = C95A.LIZIZ("live_message_start");
        try {
            long j = JSONObjectProtectorUtils.getLong(jSONObject, "message_first_dispatch_total");
            jSONObject.put("enter_room_api", LIZIZ2 - LIZIZ);
            jSONObject.put("enter_room_api_end", LIZIZ3 - LIZIZ2);
            jSONObject.put("first_frame_show", LIZIZ4 - LIZIZ);
            jSONObject.put("im_message_start", LIZIZ5 - LIZIZ3);
            jSONObject.put("message_first_dispatch_total", (LIZIZ5 - LIZIZ) + j);
        } catch (JSONException e) {
            C0NB.LJI("LiveMessageMonitor", e);
        }
    }

    public final void LJII(String str, Throwable th) {
        HashMap hashMap = new HashMap();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        hashMap.put("status_code", -10001);
        hashMap.put("error_type", "ParseError");
        hashMap.put("error_code", "1");
        hashMap.put("method_name", str);
        hashMap.put("error_msg", th.getMessage());
        hashMap.put("stack_trace", stringWriter.toString());
        LIZ(hashMap);
        C0K2.LJII(1, O5Y.LJJLI("ttlive_fetch_message"), hashMap);
        hashMap.put("event_name", O5Y.LJJLI("ttlive_fetch_message").toUpperCase(Locale.getDefault()));
        C28733BPl.LJIILIIL().LJ("ttlive_msg", hashMap);
    }

    public static void LJ(long j, String str, String str2) {
        java.util.Map<String, ?> map = LJLILLLLZI;
        HashMap hashMap = (HashMap) map;
        hashMap.put("event_name", str);
        hashMap.put("method", str2);
        hashMap.put("msg_id", Long.valueOf(j));
        C28733BPl.LJIILIIL().LIZIZ("ttlive_msg", map);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorStatus(String str, int i, JSONObject jSONObject) {
        LIZIZ(jSONObject);
        LIZJ(str, jSONObject);
        C0K2.LJIIIIZZ(str, i, jSONObject);
    }

    public final void LJFF(int i, String str, String str2, String str3) {
        HashMap LIZJ = C03660Ck.LIZJ("error_code", CardStruct.IStatusCode.DEFAULT);
        LIZJ.put("status_code", Integer.valueOf(i));
        LIZJ.put("error_type", str);
        if (!TextUtils.isEmpty(str3)) {
            LIZJ.put("stack_trace", str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            LIZJ.put("error_msg", str2);
        }
        LIZ(LIZJ);
        C0K2.LJII(1, O5Y.LJJLI("ttlive_fetch_message"), LIZJ);
        LIZJ.put("event_name", O5Y.LJJLI("ttlive_fetch_message").toUpperCase(Locale.getDefault()));
        C28733BPl.LJIILIIL().LJ("ttlive_msg", LIZJ);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LIZIZ(jSONObject3);
        LIZJ(str, jSONObject3);
        C0K2.LIZLLL(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMonitor
    public final void monitorLatency(String str, long j, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        LIZIZ(jSONObject3);
        LIZJ(str, jSONObject3);
        if (jSONObject3 == null) {
            try {
                jSONObject3 = new JSONObject();
            } catch (JSONException e) {
                C0NB.LJ("LiveMessageMonitor", e.getMessage());
            }
        }
        if (j > 0) {
            jSONObject2.put("latency", j);
            jSONObject3.put("latency", j);
        }
        jSONObject3.put("event_module", "live_message");
        jSONObject3.put("event_type", "bussiness_api_call");
        C0K2.LIZLLL(str, jSONObject, jSONObject2, jSONObject3);
    }
}
