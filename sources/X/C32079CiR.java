package X;

import com.bytedance.android.livesdk.TrackMessage;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageMonitorSamplingConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageSampleRatio;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageServerSample;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTrackerSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.o;

/* renamed from: X.CiR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32079CiR {
    public static final java.util.Map<String, Object> LIZ = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (new java.util.Random().nextDouble() < r4.p2pSamplingRate()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(X.CR6 r14) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32079CiR.LJI(X.CR6):void");
    }

    public static final void LJIIIIZZ(java.util.Map<String, ? extends Object> map) {
        boolean z;
        if (new Random().nextDouble() < LiveMessageMonitorSamplingConfig.INSTANCE.zstdSamplingRate()) {
            z = true;
        } else {
            z = false;
        }
        if (!ORY.LJJIJIIJIL("ttlive_message_decompress_all", LiveMessageTrackerSwitchSetting.INSTANCE.getValue()) || !z || !LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_message_decompress_all")) {
            return;
        }
        HashMap hashMap = new HashMap(LIZ);
        hashMap.put("status_code", 10000);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        LJIIL(0, "ttlive_message_decompress_all", hashMap);
    }

    public static final void LJIIJJI(LiveWsMessage liveWsMessage) {
        if (!ORY.LJJIJIIJIL("ttlive_message_web_socket_message_success", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(LIZ);
        hashMap.put("status_code", 10000);
        hashMap.put("seq_id", Long.valueOf(liveWsMessage.seqId));
        hashMap.put("log_id", Long.valueOf(liveWsMessage.logId));
        hashMap.put("service", Integer.valueOf(liveWsMessage.service));
        hashMap.put("method", Integer.valueOf(liveWsMessage.method));
        hashMap.put("payload_type", liveWsMessage.payloadType);
        LJIIL(0, "ttlive_message_web_socket_message_success", hashMap);
    }

    public static final void LIZIZ(String str, String str2) {
        if (!ORY.LJJIJIIJIL("ttlive_message_zstd_init_error", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(LIZ);
        hashMap.put("error", str);
        hashMap.put("zstd_dict_version", str2);
        LJIIL(1, "ttlive_message_zstd_init_all", hashMap);
        LJIIL(1, "ttlive_message_zstd_init_error", hashMap);
    }

    public static final void LIZJ(long j, String zstdDictVersion) {
        o.LJIIIZ(zstdDictVersion, "zstdDictVersion");
        if (!ORY.LJJIJIIJIL("ttlive_message_zstd_init_all", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(LIZ);
        hashMap.put("zstd_dict_version", zstdDictVersion);
        hashMap.put("duration", Long.valueOf(j));
        LJIIL(0, "ttlive_message_zstd_init_all", hashMap);
    }

    public static final void LIZLLL(Exception exc, int i) {
        int i2;
        if (!ORY.LJJIJIIJIL("ttlive_message_api_call_failed", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(LIZ);
        hashMap.put("fetch_rule", Integer.valueOf(i));
        if (exc instanceof C0TL) {
            i2 = ((C0TL) exc).statusCode;
        } else {
            i2 = -10000;
        }
        hashMap.put("status_code", Integer.valueOf(i2));
        hashMap.put("error_code", 0);
        hashMap.put("error_type", exc.getClass().getName());
        String message = exc.getMessage();
        if (message != null) {
            hashMap.put("error_msg", message);
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        hashMap.put("stack_trace", stringWriter.toString());
        LJIIL(1, "ttlive_message_api_call_failed", hashMap);
    }

    public static final void LJ(ProtoApiResult protoApiResult, int i) {
        if (!ORY.LJJIJIIJIL("ttlive_message_api_call_success", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(LIZ);
        hashMap.put("fetch_rule", Integer.valueOf(i));
        hashMap.put("fetch_type", Integer.valueOf(protoApiResult.fetchType));
        hashMap.put("status_code", 10000);
        ArrayList arrayList = new ArrayList();
        for (IMessage iMessage : protoApiResult.messages) {
            if (iMessage instanceof CR6) {
                Long valueOf = Long.valueOf(((CR6) iMessage).getMessageId());
                Integer valueOf2 = Integer.valueOf(iMessage.getGeneralMessageType());
                CR6 cr6 = (CR6) iMessage;
                arrayList.add(new TrackMessage(valueOf, valueOf2, cr6.getMethodName(), Integer.valueOf(cr6.getMessageFrom())));
            }
        }
        hashMap.put("message_list", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, arrayList));
        LJIIL(0, "ttlive_message_api_call_success", hashMap);
    }

    public static final void LJII(String reason, java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(reason, "reason");
        if (!ORY.LJJIJIIJIL("ttlive_message_decompress_error", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(LIZ);
        hashMap.put("error", reason);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        LJIIL(1, "ttlive_message_decompress_error", hashMap);
        if (new Random().nextDouble() < LiveMessageMonitorSamplingConfig.INSTANCE.zstdSamplingRate()) {
            LJIIL(1, "ttlive_message_decompress_all", hashMap);
        }
    }

    public static final void LJIIJ(LiveWsMessage liveWsMessage, Exception exc) {
        if (!ORY.LJJIJIIJIL("ttilve_message_web_socket_message_failed", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(LIZ);
        hashMap.put("status_code", -10002);
        hashMap.put("seq_id", Long.valueOf(liveWsMessage.seqId));
        hashMap.put("log_id", Long.valueOf(liveWsMessage.logId));
        hashMap.put("service", Integer.valueOf(liveWsMessage.service));
        hashMap.put("method", Integer.valueOf(liveWsMessage.method));
        hashMap.put("payload_type", liveWsMessage.payloadType);
        hashMap.put("error_type", exc.getClass().getName());
        hashMap.put("error_code", 2);
        String message = exc.getMessage();
        if (message != null) {
            hashMap.put("error_msg", message);
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        hashMap.put("stack_trace", stringWriter.toString());
        LJIIL(1, "ttilve_message_web_socket_message_failed", hashMap);
    }

    public static final boolean LIZ(CR6 message, boolean z, LiveMessageServerSample serverSample) {
        long j;
        LiveMessageSampleRatio roomRatio;
        String str;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(serverSample, "serverSample");
        CommonMessageData commonMessageData = message.baseMessage;
        if (commonMessageData == null) {
            return false;
        }
        long j2 = commonMessageData.messageId;
        try {
            IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
            if (iHostAppContext == null || (str = iHostAppContext.getServerDeviceId()) == null) {
                str = "";
            }
            j = CastLongProtector.parseLong(str);
        } catch (Exception unused) {
            j = 0;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (j2 == 0 || j == 0 || currentUserId == 0) {
            return false;
        }
        boolean LIZJ = C32072CiK.LIZJ(message.getGeneralMessageType());
        if (z) {
            if (LIZJ) {
                roomRatio = serverSample.getAnchorRatio().getP2pRatio();
            } else {
                roomRatio = serverSample.getAnchorRatio().getRoomRatio();
            }
        } else if (LIZJ) {
            roomRatio = serverSample.getAudienceRatio().getP2pRatio();
        } else {
            roomRatio = serverSample.getAudienceRatio().getRoomRatio();
        }
        long msgRatio = roomRatio.getMsgRatio();
        long deviceRatio = roomRatio.getDeviceRatio();
        long userRatio = roomRatio.getUserRatio();
        long baseRatio = roomRatio.getBaseRatio();
        if (baseRatio <= 0 || j2 % baseRatio >= msgRatio) {
            return false;
        }
        if (j % baseRatio >= deviceRatio && currentUserId % baseRatio >= userRatio) {
            return false;
        }
        return true;
    }

    public static final void LJIIIZ(String cursor, String url, boolean z) {
        o.LJIIIZ(cursor, "cursor");
        o.LJIIIZ(url, "url");
        if (!ORY.LJJIJIIJIL("ttlive_message_web_socket_connect_start", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(LIZ);
        hashMap.put("cursor", cursor);
        hashMap.put("ws_reuse", Boolean.valueOf(z));
        hashMap.put("url", url);
        LJIIL(0, "ttlive_message_web_socket_connect_start", hashMap);
    }

    public static void LJIIL(int i, String str, java.util.Map map) {
        HashMap hashMap = (HashMap) map;
        hashMap.put("date_time", new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss.SSS", Locale.ENGLISH).format(new Date()));
        C0K2.LJII(i, str, map);
        if (new Random().nextDouble() < LiveMessageMonitorSamplingConfig.INSTANCE.logSamplingRate()) {
            hashMap.put("event_name", str);
            if (i == 0) {
                C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_msg", map);
            } else {
                C28733BPl.LJIILIIL().LJ("ttlive_msg", map);
            }
        }
    }

    public static final void LJFF(Throwable th, ProtoApiResult.ProtoMessage protoMessage, List<ProtoApiResult.ProtoMessage> list, int i) {
        if (!ORY.LJJIJIIJIL("ttlive_message_decode_failed", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            return;
        }
        HashMap hashMap = new HashMap(LIZ);
        hashMap.put("status_code", -10001);
        hashMap.put("error_type", "Decode failed");
        hashMap.put("error_code", 1);
        String message = th.getMessage();
        if (message != null) {
            hashMap.put("error_msg", message);
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        hashMap.put("stack_trace", stringWriter.toString());
        hashMap.put("message_id", Long.valueOf(protoMessage.msgId));
        hashMap.put("message_type", Integer.valueOf(protoMessage.msgType));
        hashMap.put("message_method", protoMessage.method);
        hashMap.put("message_strategy", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (ProtoApiResult.ProtoMessage protoMessage2 : list) {
                arrayList.add(new TrackMessage(Long.valueOf(protoMessage2.msgId), Integer.valueOf(protoMessage2.msgType), protoMessage2.method, Integer.valueOf(i)));
            }
        }
        hashMap.put("total_message_list", arrayList);
        LJIIL(1, "ttlive_message_decode_failed", hashMap);
    }
}
