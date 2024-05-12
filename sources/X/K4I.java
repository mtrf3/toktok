package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class K4I {
    public long LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public K4J LJ;
    public int LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;

    public final void LIZ() {
        Object obj;
        Object obj2;
        Object obj3;
        C64668PZo requestInfo;
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
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
        if (o.LJ(this, K4K.LIZ) || this.LIZ == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJFF = (int) (currentTimeMillis - this.LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.LJFF);
        K4J k4j = this.LJ;
        if (k4j != null) {
            RequestLog requestLog = k4j.getRequestLog();
            if (requestLog != null) {
                RequestLog.Other other = requestLog.other;
                Integer num7 = null;
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
                }
                jSONObject.put("ttfb", num7);
            }
            K4J k4j2 = this.LJ;
            if (k4j2 != null && (requestInfo = k4j2.getRequestInfo()) != null) {
                long j = requestInfo.LJIILLIIL;
                if (j > 0) {
                    jSONObject.put("timing_total", j);
                    int optInt = jSONObject.optInt("inner");
                    if (optInt > 0) {
                        jSONObject.put("timing_net", requestInfo.LJIILLIIL - optInt);
                    }
                    jSONObject.put("triggerNetCost", this.LIZJ - this.LIZ);
                    jSONObject.put("timing_gap_start", requestInfo.LJ - this.LIZJ);
                    jSONObject.put("timing_gap_end", this.LIZLLL - requestInfo.LJII);
                    jSONObject.put("client_cost", this.LJFF - requestInfo.LJIILLIIL);
                    jSONObject.put("view_draw_cost", currentTimeMillis - this.LIZLLL);
                }
            }
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj4 = jSONObject.get(keys.next());
            if (((obj4 instanceof Integer) && ((Number) obj4).intValue() < 0) || ((obj4 instanceof Long) && ((Number) obj4).longValue() < 0)) {
                keys.remove();
            }
        }
        String str9 = "1";
        if (this.LIZIZ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_first_sug", obj);
        if (K7B.LJLILLLLZI.LJJII()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("sug_performance_optm_preinflate", obj2);
        if (C34132DaS.LJLILLLLZI.LJJII()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("sug_performance_optm_resuse_adapter", obj3);
        if (!C34485Dg9.LJLILLLLZI.LJJII()) {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("sug_performance_optm_rv_pool", str9);
        jSONObject.put("enter_from", this.LJI);
        jSONObject.put("tab_name", this.LJII);
        jSONObject.put("search_position", this.LJIIIIZZ);
        AppLogNewUtils.onEventV3("search_trigger_sug_monitor", jSONObject);
        FUA.LIZJ("search_trigger_sug_monitor", jSONObject);
        this.LIZ = 0L;
    }

    public K4I(String keyword) {
        o.LJIIIZ(keyword, "keyword");
    }
}
