package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Iky, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47524Iky {
    public final ConcurrentMap<String, ConcurrentMap<String, Object>> LIZ = new ConcurrentHashMap();
    public final ConcurrentMap<String, Object> LIZIZ = new ConcurrentHashMap();
    public final Queue<java.util.Map<String, Object>> LIZJ = new ConcurrentLinkedQueue();

    public static java.util.Map<String, Object> LIZ(java.util.Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof java.util.Map) {
                hashMap.put(entry.getKey(), LIZ((java.util.Map) entry.getValue()));
            } else if (entry.getValue() instanceof AtomicInteger) {
                hashMap.put(entry.getKey(), Integer.valueOf(((AtomicInteger) entry.getValue()).get()));
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public static java.util.Map LIZJ(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject(C47147Iet.LIZ.LJ().popLogData(i, str));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("traceId: ");
            LIZ.append(str);
            LIZ.append(", type: ");
            LIZ.append(i);
            LIZ.append(", gotten log data: ");
            LIZ.append(hashMap);
            C78253UnR.LJI("StrategyEvent", X1D.LIZIZ(LIZ));
            return hashMap;
        } catch (JSONException e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("event log parse failed: ");
            LIZ2.append(e);
            C78253UnR.LIZLLL("StrategyEvent", X1D.LIZIZ(LIZ2));
            return null;
        }
    }

    public static ConcurrentMap<String, Object> LIZLLL(ConcurrentMap<String, Object> concurrentMap, String str) {
        concurrentMap.putIfAbsent(str, new ConcurrentHashMap());
        return (ConcurrentMap) concurrentMap.get(str);
    }

    public final void LIZIZ(int i, int i2, String str, String str2) {
        ConcurrentMap<String, Object> concurrentMap;
        Object obj;
        if (!TextUtils.isEmpty(str) && !"unknown".equalsIgnoreCase(str)) {
            ((ConcurrentHashMap) this.LIZ).putIfAbsent(str, new ConcurrentHashMap());
            concurrentMap = (ConcurrentMap) ((ConcurrentHashMap) this.LIZ).get(str);
        } else {
            concurrentMap = this.LIZIZ;
        }
        if (i != 2021) {
            switch (i) {
                case LiveNetAdaptiveHurryTimeSetting.DEFAULT /* 2000 */:
                    concurrentMap.putIfAbsent("st_play_task_op", new ConcurrentHashMap());
                    ConcurrentMap concurrentMap2 = (ConcurrentMap) concurrentMap.get("st_play_task_op");
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    if (i2 != 6) {
                                        if (i2 != 7) {
                                            switch (i2) {
                                                case 100:
                                                    concurrentMap2.put("seek_label", str2);
                                                    return;
                                                case 101:
                                                    try {
                                                        try {
                                                            concurrentMap2.put("first_block_decision_time", Long.valueOf(CastLongProtector.parseLong(str2)));
                                                            return;
                                                        } catch (NumberFormatException e) {
                                                            e = e;
                                                            StringBuilder LIZ = X1D.LIZ();
                                                            LIZ.append("PLAY_TASK_FIRST_BLOCK_DECISION_TIME:\n");
                                                            LIZ.append(e);
                                                            C78253UnR.LIZLLL("StrategyEvent", X1D.LIZIZ(LIZ));
                                                            concurrentMap2.put("first_block_decision_time", str2);
                                                            return;
                                                        }
                                                    } catch (NumberFormatException e2) {
                                                        e = e2;
                                                    }
                                                case 102:
                                                    try {
                                                        try {
                                                            concurrentMap2.put("first_block_exec_time", Long.valueOf(CastLongProtector.parseLong(str2)));
                                                            return;
                                                        } catch (NumberFormatException e3) {
                                                            e = e3;
                                                            StringBuilder LIZ2 = X1D.LIZ();
                                                            LIZ2.append("PLAY_TASK_FIRST_BLOCK_EXEC_TIME:\n");
                                                            LIZ2.append(e);
                                                            C78253UnR.LIZLLL("StrategyEvent", X1D.LIZIZ(LIZ2));
                                                            concurrentMap2.put("first_block_exec_time", str2);
                                                            return;
                                                        }
                                                    } catch (NumberFormatException e4) {
                                                        e = e4;
                                                    }
                                                case 103:
                                                    try {
                                                        concurrentMap2.put("est_play", Long.valueOf(CastLongProtector.parseLong(str2)));
                                                        return;
                                                    } catch (NumberFormatException e5) {
                                                        StringBuilder LIZ3 = X1D.LIZ();
                                                        LIZ3.append("EST_PLAYTIME:\n");
                                                        LIZ3.append(e5);
                                                        C78253UnR.LIZLLL("StrategyEvent", X1D.LIZIZ(LIZ3));
                                                        concurrentMap2.put("est_play", str2);
                                                        return;
                                                    }
                                                case 104:
                                                    concurrentMap2.put("smart_level", str2);
                                                    return;
                                                default:
                                                    return;
                                            }
                                        } else {
                                            if (str2 == null) {
                                                C78253UnR.LIZLLL("StrategyEvent", "PLAY_TASK_SAFE_FACTOR");
                                                return;
                                            }
                                            try {
                                                try {
                                                    concurrentMap2.put("safe_factor", new JSONObject(str2));
                                                    return;
                                                } catch (JSONException e6) {
                                                    e = e6;
                                                    StringBuilder LIZ4 = X1D.LIZ();
                                                    LIZ4.append("PLAY_TASK_SAFE_FACTOR:\n");
                                                    LIZ4.append(e);
                                                    TTVideoEngineLog.w("StrategyEvent", X1D.LIZIZ(LIZ4));
                                                    concurrentMap2.put("safe_factor", str2);
                                                    return;
                                                }
                                            } catch (JSONException e7) {
                                                e = e7;
                                            }
                                        }
                                    } else {
                                        if (str2 == null) {
                                            C78253UnR.LIZLLL("StrategyEvent", "PLAY_TASK_TARGET_BUFFER");
                                            return;
                                        }
                                        try {
                                        } catch (JSONException e8) {
                                            e = e8;
                                        }
                                        try {
                                            concurrentMap2.put("target_buffer", new JSONObject(str2));
                                            return;
                                        } catch (JSONException e9) {
                                            e = e9;
                                            StringBuilder LIZ5 = X1D.LIZ();
                                            LIZ5.append("PLAY_TASK_TARGET_BUFFER:\n");
                                            LIZ5.append(e);
                                            TTVideoEngineLog.w("StrategyEvent", X1D.LIZIZ(LIZ5));
                                            concurrentMap2.put("target_buffer", str2);
                                            return;
                                        }
                                    }
                                } else {
                                    if (str2 == null) {
                                        C78253UnR.LIZLLL("StrategyEvent", "PLAY_TASK_RANGE_DURATION: logInfo is null");
                                        return;
                                    }
                                    try {
                                        try {
                                            concurrentMap2.put("range_dur", new JSONObject(str2));
                                            return;
                                        } catch (JSONException e10) {
                                            e = e10;
                                            StringBuilder LIZ6 = X1D.LIZ();
                                            LIZ6.append("PLAY_TASK_RANGE_DURATION:\n");
                                            LIZ6.append(e);
                                            TTVideoEngineLog.w("StrategyEvent", X1D.LIZIZ(LIZ6));
                                            concurrentMap2.put("range_dur", str2);
                                            return;
                                        }
                                    } catch (JSONException e11) {
                                        e = e11;
                                    }
                                }
                            } else {
                                concurrentMap2.putIfAbsent("range", new AtomicInteger());
                                ((AtomicInteger) concurrentMap2.get("range")).incrementAndGet();
                                return;
                            }
                        } else {
                            concurrentMap2.putIfAbsent("resume", new AtomicInteger());
                            ((AtomicInteger) concurrentMap2.get("resume")).incrementAndGet();
                            return;
                        }
                    } else {
                        concurrentMap2.putIfAbsent("pause", new AtomicInteger());
                        ((AtomicInteger) concurrentMap2.get("pause")).incrementAndGet();
                        return;
                    }
                case 2001:
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    LIZLLL(this.LIZIZ, "st_preload").put("name", str2);
                    return;
                case 2002:
                    LIZLLL(concurrentMap, "st_buf_dur").put("rebuf_dur_init", Integer.valueOf(i2));
                    return;
                case 2003:
                    ConcurrentMap<String, Object> LIZLLL = LIZLLL(concurrentMap, "st_buf_dur");
                    LIZLLL.put("startup_buf_dur", Integer.valueOf(i2));
                    if (str2 == null) {
                        return;
                    }
                    try {
                        LIZLLL.put("startup_cache", new JSONObject(str2));
                        return;
                    } catch (JSONException e12) {
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("LOG_KEY_STARTUP_CACHE_SIZE:\n");
                        LIZ7.append(e12);
                        TTVideoEngineLog.w("StrategyEvent", X1D.LIZIZ(LIZ7));
                        LIZLLL.put("startup_cache", str2);
                        return;
                    }
                case 2004:
                    LIZLLL(concurrentMap, "st_preload_personalized").put("preload_personalized_option", Integer.valueOf(i2));
                    return;
                case 2005:
                    LIZLLL(concurrentMap, "st_preload_personalized").put("watch_duration_label", Integer.valueOf(i2));
                    return;
                case 2006:
                    LIZLLL(concurrentMap, "st_preload_personalized").put("stall_label", Integer.valueOf(i2));
                    return;
                case 2007:
                    LIZLLL(concurrentMap, "st_preload_personalized").put("first_frame_label", Integer.valueOf(i2));
                    return;
                case 2008:
                    LIZLLL(concurrentMap, "st_adaptive_range").put("enabled", Integer.valueOf(i2));
                    return;
                case 2009:
                    if (str2 == null) {
                        C78253UnR.LIZLLL("StrategyEvent", "EVENT_ADAPTIVE_RANGE_BUFFER: logInfo is null");
                        return;
                    }
                    try {
                        obj = new JSONObject(str2);
                    } catch (JSONException e13) {
                        StringBuilder LIZ8 = X1D.LIZ();
                        LIZ8.append("EVENT_ADAPTIVE_RANGE_BUFFER:\n");
                        LIZ8.append(e13);
                        TTVideoEngineLog.w("StrategyEvent", X1D.LIZIZ(LIZ8));
                        obj = str2;
                    }
                    LIZLLL(concurrentMap, "st_adaptive_range").put("buffer_log", obj);
                    return;
                case 2010:
                    concurrentMap.put("st_remaining_buf_dur", Integer.valueOf(i2));
                    return;
                case 2011:
                    java.util.Map map = (java.util.Map) concurrentMap.get("st_buf_dur");
                    if (map == null) {
                        return;
                    }
                    Integer num = (Integer) map.get("diff_ret_count");
                    if (num == null) {
                        num = 0;
                    }
                    map.put("diff_ret_count", Integer.valueOf(num.intValue() + i2));
                    return;
                case 2012:
                    try {
                        concurrentMap.put("st_preload_finished_time", Long.valueOf(CastLongProtector.parseLong(str2)));
                        return;
                    } catch (NumberFormatException e14) {
                        StringBuilder LIZ9 = X1D.LIZ();
                        LIZ9.append("EVENT_PLAY_RELATED_PRELOAD_FINISHED:\n");
                        LIZ9.append(e14);
                        C78253UnR.LIZLLL("StrategyEvent", X1D.LIZIZ(LIZ9));
                        concurrentMap.put("st_preload_finished_time", str2);
                        return;
                    }
                case 2013:
                    ConcurrentMap<String, Object> LIZLLL2 = LIZLLL(concurrentMap, "st_band_range");
                    LIZLLL2.put("current_bandwidth", Integer.valueOf(i2));
                    try {
                        LIZLLL2.put("band_bitrate_ratio", Float.valueOf(CastFloatProtector.parseFloat(str2)));
                        return;
                    } catch (NumberFormatException e15) {
                        StringBuilder LIZ10 = X1D.LIZ();
                        LIZ10.append("LOG_KEY_BANDWIDTH_BITRATE_RATIO:\n");
                        LIZ10.append(e15);
                        C78253UnR.LIZLLL("StrategyEvent", X1D.LIZIZ(LIZ10));
                        LIZLLL2.put("band_bitrate_ratio", str2);
                        return;
                    }
                case 2014:
                    ((ConcurrentHashMap) this.LIZIZ).put("st_common", Collections.singletonMap("module_activated", Integer.valueOf(i2)));
                    return;
                case 2015:
                    if (str2 == null) {
                        return;
                    }
                    try {
                        LIZLLL(concurrentMap, "st_preload_decision").put("info", new JSONObject(str2));
                        return;
                    } catch (JSONException e16) {
                        StringBuilder LIZ11 = X1D.LIZ();
                        LIZ11.append("LOG_KEY_PRELOAD_DECISION_INFO:\n");
                        LIZ11.append(e16);
                        TTVideoEngineLog.w("StrategyEvent", X1D.LIZIZ(LIZ11));
                        LIZLLL(concurrentMap, "st_preload_decision").put("info", str2);
                        return;
                    }
                case 2016:
                    LIZLLL(concurrentMap, "st_buf_dur").put("lc_version", Integer.valueOf(i2));
                    return;
                case 2017:
                    LIZLLL(concurrentMap, "st_buf_dur").put("sliding_window", Integer.valueOf(i2));
                    return;
                case 2018:
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    LIZLLL(this.LIZIZ, "st_preload").put(WM7.SCENE_SERVICE, str2);
                    return;
                default:
                    return;
            }
        } else {
            if (str2 == null) {
                return;
            }
            try {
                LIZLLL(concurrentMap, "st_preload_decision2").put("info", new JSONObject(str2));
            } catch (JSONException e17) {
                StringBuilder LIZ12 = X1D.LIZ();
                LIZ12.append("LOG_KEY_PRELOAD_DECISION_INFO2:\n");
                LIZ12.append(e17);
                TTVideoEngineLog.w("StrategyEvent", X1D.LIZIZ(LIZ12));
                LIZLLL(concurrentMap, "st_preload_decision2").put("info", str2);
            }
        }
    }
}
