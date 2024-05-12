package com.ss.ugc.live.sdk.message;

import X.C16880lQ;
import X.C32072CiK;
import X.CN0;
import X.V0N;
import X.WM7;
import X.X1D;
import X.YMB;
import android.os.SystemClock;
import com.ss.ugc.live.sdk.message.data.IMessage;
import defpackage.i0;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class MessageMonitor {
    public YMB mMessageContext;

    /* loaded from: classes16.dex */
    public interface LiveMessageStage {
        public static final String[] STAGES = {"api_call_time", "all_time", "decode_whole_message_time", "decode_self_message_time", "enqueue_time", "interceptor_time", "dispatch_time"};
    }

    /* renamed from: com.ss.ugc.live.sdk.message.MessageMonitor$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$ugc$live$sdk$message$MessageMonitor$Stage;

        static {
            int[] iArr = new int[Stage.values().length];
            $SwitchMap$com$ss$ugc$live$sdk$message$MessageMonitor$Stage = iArr;
            try {
                iArr[Stage.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$ugc$live$sdk$message$MessageMonitor$Stage[Stage.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public enum Stage {
        START,
        END;

        public static Stage valueOf(String str) {
            return (Stage) V0N.LJJJ(Stage.class, str);
        }
    }

    public MessageMonitor(YMB ymb) {
        this.mMessageContext = ymb;
    }

    public static String listToString(List<String> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public void monitorWSReuseCount(int i) {
        if (i != 0 && this.mMessageContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("room_count", i);
                this.mMessageContext.monitor("ws_reuse_count", null, null, jSONObject);
                if (CN0.LIZ) {
                    YMB ymb = this.mMessageContext;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("monitorWSReuseCount, extra: ");
                    LIZ.append(jSONObject.toString());
                    ymb.log("MessageMonitor", X1D.LIZIZ(LIZ));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    private void dealExtraParams(JSONObject jSONObject, Map<String, Object> map) {
        try {
            for (String str : LiveMessageStage.STAGES) {
                Object obj = map.get(getLiveMessageStageName(str, Stage.START));
                Object obj2 = map.get(getLiveMessageStageName(str, Stage.END));
                if ((obj instanceof Long) && (obj2 instanceof Long)) {
                    Long l = (Long) obj;
                    Long l2 = (Long) obj2;
                    if (l.longValue() != 0 && l2.longValue() != 0 && l2.longValue() >= l.longValue()) {
                        jSONObject.put(str, l2.longValue() - l.longValue());
                    }
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static String getLiveMessageStageName(String str, Stage stage) {
        int i = AnonymousClass1.$SwitchMap$com$ss$ugc$live$sdk$message$MessageMonitor$Stage[stage.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return str;
            }
            return i0.LJFF(str, "_end");
        }
        return i0.LJFF(str, "_start");
    }

    public void log(String str, String str2) {
        if (CN0.LIZ) {
            this.mMessageContext.log(str, str2);
        } else {
            if (this.mMessageContext.LJLJI < 1.0d && Math.random() >= this.mMessageContext.LJLJI) {
                return;
            }
            this.mMessageContext.log(str, str2);
        }
    }

    public void monitorImEnterRoomDelay(long j, int i) {
        if (this.mMessageContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("delay", j);
                jSONObject.put("room_count", i);
                this.mMessageContext.monitor("im_enter_room_delay", null, null, jSONObject);
                if (CN0.LIZ) {
                    YMB ymb = this.mMessageContext;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("monitorImEnterRoomDelay, extra: ");
                    LIZ.append(jSONObject.toString());
                    ymb.log("MessageMonitor", X1D.LIZIZ(LIZ));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    private long getExtraParamsTime(Map<String, Object> map, String str, Stage stage) {
        try {
            Object obj = map.get(getLiveMessageStageName(str, stage));
            if (obj instanceof Long) {
                return ((Long) obj).longValue();
            }
            return 0L;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return 0L;
        }
    }

    public void monitorMsgStreamInteractDelay(long j, long j2, String str) {
        if (this.mMessageContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("delay", j);
                jSONObject.put("predict_delay", Math.abs(j2));
                jSONObject.put("predict_delay_sync_rate", Math.abs((j2 * 1.0d) / j));
                jSONObject.put("method", str);
                this.mMessageContext.monitor("message_stream_interact_delay", null, null, jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public void monitorMsgDispatchListDelay(long j, int i, int i2, int i3) {
        if (this.mMessageContext != null && C32072CiK.LIZIZ("message_dispatch_list_delay")) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("delay", j);
                jSONObject.put("dispatch_size", i);
                jSONObject.put("queue_size", i2);
                jSONObject.put("dispatch_strategy", i3);
                this.mMessageContext.monitor("message_dispatch_list_delay", null, null, jSONObject);
                if (CN0.LIZ) {
                    YMB ymb = this.mMessageContext;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("monitorMsgDispatchListDelay, extra: ");
                    LIZ.append(jSONObject.toString());
                    ymb.log("MessageMonitor", X1D.LIZIZ(LIZ));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public void monitorMessageFirstDispatch(IMessage iMessage, long j, int i, int i2, Map<String, Object> map) {
        try {
            long extraParamsTime = getExtraParamsTime(iMessage.getExtraParams(), "all_time", Stage.START);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("im_message_first_msgs", extraParamsTime - j);
            jSONObject.put("im_message_first_dispatch", elapsedRealtime - extraParamsTime);
            jSONObject.put("message_first_dispatch_total", elapsedRealtime - j);
            jSONObject.put("msg_from", iMessage.getMessageFrom());
            jSONObject.put("room_count", i);
            jSONObject.put("dispatch_strategy", i2);
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            this.mMessageContext.monitor("message_first_dispatch", null, null, jSONObject);
            if (CN0.LIZ) {
                YMB ymb = this.mMessageContext;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("monitorMessageFirstDispatch, extra: ");
                LIZ.append(jSONObject.toString());
                ymb.log("MessageMonitor", X1D.LIZIZ(LIZ));
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void monitorMsgStreamInteractStatus(int i, String str, String str2, long j, long j2) {
        if (this.mMessageContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method", str);
                jSONObject.put(WM7.SCENE_SERVICE, str2);
                jSONObject.put("delay", j);
                jSONObject.put("predict_delay", j2);
                this.mMessageContext.monitorStatus("message_stream_interact_status", i, jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public void monitorWSReuseMessage(int i, int i2, int i3, int i4, int i5, Map<String, Object> map) {
        if (this.mMessageContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("room_count", i);
                jSONObject.put("ws_connect_count", i2);
                jSONObject.put("ws_connect_success_count", i3);
                int i6 = i4 + i5;
                if (i6 != 0) {
                    jSONObject.put("im_enter_room_success_ratio", (i4 * 1.0d) / i6);
                }
                jSONObject.put("im_enter_room_success_count", i4);
                jSONObject.put("im_enter_room_fail_count", i5);
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry != null) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                this.mMessageContext.monitor("ws_reuse_message", null, null, jSONObject);
                if (CN0.LIZ) {
                    YMB ymb = this.mMessageContext;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("monitorWSReuseMessage, extra: ");
                    LIZ.append(jSONObject.toString());
                    ymb.log("MessageMonitor", X1D.LIZIZ(LIZ));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public void monitorMsgDispatchSize(int i, int i2, boolean z, long j, int i3, int i4, long j2, int i5) {
        if (this.mMessageContext != null && C32072CiK.LIZIZ("message_dispatch_size")) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dispatch_size", i);
                jSONObject.put("queue_size", i2);
                jSONObject.put("smooth_dispatch_opt", z);
                jSONObject.put("interval", j);
                jSONObject.put("too_many_msg", i3);
                jSONObject.put("msg_strategy", i4);
                jSONObject.put("room_id", j2);
                jSONObject.put("dispatch_strategy", i5);
                this.mMessageContext.monitor("message_dispatch_size", null, null, jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public void monitorMsgP2pDispatchDirectly(int i, String str, long j, int i2, boolean z, boolean z2, int i3, Map<String, Object> map) {
        if (this.mMessageContext != null && C32072CiK.LIZIZ("message_p2p_dispatch_direct")) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("size", i);
                jSONObject.put("method", str);
                jSONObject.put("delay", j);
                jSONObject.put("msg_from", i2);
                jSONObject.put("dispatch_async", z);
                jSONObject.put("enable_dispatch_async", z2);
                jSONObject.put("dispatch_strategy", i3);
                dealExtraParams(jSONObject, map);
                this.mMessageContext.monitor("message_p2p_dispatch_direct", null, null, jSONObject);
                if (CN0.LIZ) {
                    YMB ymb = this.mMessageContext;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("monitorMsgP2pDispatchDirectly, monitor consume time: ");
                    LIZ.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    LIZ.append(", extra: ");
                    LIZ.append(jSONObject.toString());
                    ymb.log("MessageMonitor", X1D.LIZIZ(LIZ));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public void monitorMsgDispatchDelay(long j, int i, boolean z, String str, boolean z2, long j2, Map<String, Object> map, List<String> list, int i2, boolean z3, boolean z4, int i3) {
        if (this.mMessageContext != null && C32072CiK.LIZIZ("message_dispatch_delay")) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("delay", j);
                jSONObject.put("msg_from", i);
                jSONObject.put("is_p2p_msg", z);
                jSONObject.put("method", str);
                jSONObject.put("direct_dispatch_p2p", z2);
                jSONObject.put("msg_id", j2);
                jSONObject.put("timeout_listeners", listToString(list));
                jSONObject.put("dispatch_strategy", i2);
                jSONObject.put("dispatch_async", z3);
                jSONObject.put("enable_dispatch_async", z4);
                jSONObject.put("msg_payload_size", i3);
                dealExtraParams(jSONObject, map);
                this.mMessageContext.monitor("message_dispatch_delay", null, null, jSONObject);
                if (CN0.LIZ) {
                    YMB ymb = this.mMessageContext;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("monitorMsgDispatchDelay, , monitor consume time: ");
                    LIZ.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    LIZ.append(", extra: ");
                    LIZ.append(jSONObject.toString());
                    ymb.log("MessageMonitor", X1D.LIZIZ(LIZ));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
