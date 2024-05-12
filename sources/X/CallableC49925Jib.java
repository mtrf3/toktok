package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Jib, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC49925Jib<V> implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ K4J LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public CallableC49925Jib(int i, int i2, long j, long j2, K4J k4j, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = k4j;
        this.LJLJJLL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        RequestLog.DetailedDuration detailedDuration;
        String str2;
        RequestLog.DetailedDuration detailedDuration2;
        String str3;
        RequestLog.DetailedDuration detailedDuration3;
        String str4;
        RequestLog.DetailedDuration detailedDuration4;
        String str5;
        RequestLog.DetailedDuration detailedDuration5;
        String str6;
        RequestLog.DetailedDuration detailedDuration6;
        String str7;
        RequestLog.DetailedDuration detailedDuration7;
        String str8;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.LJLIL);
        jSONObject.put("netCost", this.LJLILLLLZI);
        jSONObject.put("client_cost", this.LJLIL - this.LJLILLLLZI);
        jSONObject.put("status", 0);
        jSONObject.put("triggerNetStart", this.LJLJI);
        jSONObject.put("triggerStart", this.LJLJJI);
        jSONObject.put("itemCount", 0);
        K4J k4j = this.LJLJJL;
        if (k4j != null) {
            RequestLog requestLog = k4j.getRequestLog();
            if (requestLog != null) {
                RequestLog.Other other = requestLog.other;
                if (other != null) {
                    str = other.libcore;
                } else {
                    str = null;
                }
                jSONObject.put("libcore", str);
                RequestLog.Timing timing = requestLog.timing;
                if (timing != null && (detailedDuration7 = timing.detailedDuration) != null && (str8 = detailedDuration7.bodyRecv) != null) {
                    num = Integer.valueOf(CastIntegerProtector.parseInt(str8));
                } else {
                    num = null;
                }
                jSONObject.put("body_recv", num);
                RequestLog.Timing timing2 = requestLog.timing;
                if (timing2 != null && (detailedDuration6 = timing2.detailedDuration) != null && (str7 = detailedDuration6.dns) != null) {
                    num2 = Integer.valueOf(CastIntegerProtector.parseInt(str7));
                } else {
                    num2 = null;
                }
                jSONObject.put("dns", num2);
                RequestLog.Timing timing3 = requestLog.timing;
                if (timing3 != null && (detailedDuration5 = timing3.detailedDuration) != null && (str6 = detailedDuration5.inner) != null) {
                    num3 = Integer.valueOf(CastIntegerProtector.parseInt(str6));
                } else {
                    num3 = null;
                }
                jSONObject.put("inner", num3);
                RequestLog.Timing timing4 = requestLog.timing;
                if (timing4 != null && (detailedDuration4 = timing4.detailedDuration) != null && (str5 = detailedDuration4.rtt) != null) {
                    num4 = Integer.valueOf(CastIntegerProtector.parseInt(str5));
                } else {
                    num4 = null;
                }
                jSONObject.put("rtt", num4);
                RequestLog.Timing timing5 = requestLog.timing;
                if (timing5 != null && (detailedDuration3 = timing5.detailedDuration) != null && (str4 = detailedDuration3.send) != null) {
                    num5 = Integer.valueOf(CastIntegerProtector.parseInt(str4));
                } else {
                    num5 = null;
                }
                jSONObject.put("send", num5);
                RequestLog.Timing timing6 = requestLog.timing;
                if (timing6 != null && (detailedDuration2 = timing6.detailedDuration) != null && (str3 = detailedDuration2.tcp) != null) {
                    num6 = Integer.valueOf(CastIntegerProtector.parseInt(str3));
                } else {
                    num6 = null;
                }
                jSONObject.put("tcp", num6);
                RequestLog.Timing timing7 = requestLog.timing;
                if (timing7 != null && (detailedDuration = timing7.detailedDuration) != null && (str2 = detailedDuration.ttfb) != null) {
                    num7 = Integer.valueOf(CastIntegerProtector.parseInt(str2));
                } else {
                    num7 = null;
                }
                jSONObject.put("ttfb", num7);
            }
            C64668PZo requestInfo = this.LJLJJL.getRequestInfo();
            if (requestInfo != null) {
                jSONObject.put("timing_total", requestInfo.LJIILLIIL);
                jSONObject.put("requestStart", requestInfo.LJ);
                jSONObject.put("appLevelRequestStart", requestInfo.LIZJ);
            }
        }
        jSONObject.put("netLogId", this.LJLJJLL);
        jSONObject.put("errorMsg", (Object) null);
        FUA.LIZJ("search_intermediate_show_monitor", jSONObject);
        AppLogNewUtils.onEventV3("search_intermediate_show_monitor", jSONObject);
        return C76800UCe.LIZ;
    }
}
