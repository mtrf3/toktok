package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JiY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49922JiY {
    public static long LIZ;
    public static boolean LIZIZ;
    public static C49923JiZ LIZLLL;
    public static int LJFF;
    public static final java.util.Map<String, C49923JiZ> LIZJ = new LinkedHashMap();
    public static long LJ = -1;

    public static void LIZ(SearchResultParam searchResultParam) {
        List<C49935Jil> LIZ2;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        C49935Jil c49935Jil;
        int i;
        int i2;
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
        int i3;
        boolean z;
        int i4;
        if (searchResultParam == null) {
            return;
        }
        C49923JiZ c49923JiZ = (C49923JiZ) ((LinkedHashMap) LIZJ).get(C49567Jcp.LIZ(searchResultParam));
        if (c49923JiZ != null) {
            if (c49923JiZ.LIZIZ != 0 && c49923JiZ.LJIIJJI != -1) {
                try {
                    if (!c49923JiZ.LJJI) {
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            int i5 = c49923JiZ.LJIL;
                            if (i5 > 0) {
                                c49923JiZ.LJIIZILJ = i5;
                                c49923JiZ.LJJ = (int) (currentTimeMillis - c49923JiZ.LIZIZ);
                            } else {
                                c49923JiZ.LJIIZILJ = (int) (currentTimeMillis - c49923JiZ.LIZIZ);
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("tab_type", c49923JiZ.LJIJJ);
                            jSONObject.put("trigger_type", c49923JiZ.LIZJ);
                            jSONObject.put("itemCount", c49923JiZ.LJII);
                            jSONObject.put("cost", c49923JiZ.LJIIZILJ);
                            jSONObject.put("displayCost", c49923JiZ.LJJ);
                            jSONObject.put("netLogId", c49923JiZ.LJIIJ);
                            jSONObject.put("status", c49923JiZ.LJIIJJI);
                            jSONObject.put("errorMsg", c49923JiZ.LJIIL);
                            jSONObject.put("errorCode", c49923JiZ.LJIILIIL);
                            jSONObject.put("tick_search_start", c49923JiZ.LIZIZ);
                            K4J k4j = c49923JiZ.LJI;
                            if (k4j != null) {
                                try {
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
                                            num = Integer.valueOf(Integer.parseInt(str8));
                                        } else {
                                            num = null;
                                        }
                                        jSONObject.put("body_recv", num);
                                        RequestLog.Timing timing2 = requestLog.timing;
                                        if (timing2 != null && (detailedDuration6 = timing2.detailedDuration) != null && (str7 = detailedDuration6.dns) != null) {
                                            num2 = Integer.valueOf(Integer.parseInt(str7));
                                        } else {
                                            num2 = null;
                                        }
                                        jSONObject.put("dns", num2);
                                        RequestLog.Timing timing3 = requestLog.timing;
                                        if (timing3 != null && (detailedDuration5 = timing3.detailedDuration) != null && (str6 = detailedDuration5.inner) != null) {
                                            num3 = Integer.valueOf(Integer.parseInt(str6));
                                        } else {
                                            num3 = null;
                                        }
                                        jSONObject.put("inner", num3);
                                        RequestLog.Timing timing4 = requestLog.timing;
                                        if (timing4 != null && (detailedDuration4 = timing4.detailedDuration) != null && (str5 = detailedDuration4.rtt) != null) {
                                            num4 = Integer.valueOf(Integer.parseInt(str5));
                                        } else {
                                            num4 = null;
                                        }
                                        jSONObject.put("rtt", num4);
                                        RequestLog.Timing timing5 = requestLog.timing;
                                        if (timing5 != null && (detailedDuration3 = timing5.detailedDuration) != null && (str4 = detailedDuration3.send) != null) {
                                            num5 = Integer.valueOf(Integer.parseInt(str4));
                                        } else {
                                            num5 = null;
                                        }
                                        jSONObject.put("send", num5);
                                        RequestLog.Timing timing6 = requestLog.timing;
                                        if (timing6 != null && (detailedDuration2 = timing6.detailedDuration) != null && (str3 = detailedDuration2.tcp) != null) {
                                            num6 = Integer.valueOf(Integer.parseInt(str3));
                                        } else {
                                            num6 = null;
                                        }
                                        jSONObject.put("tcp", num6);
                                        RequestLog.Timing timing7 = requestLog.timing;
                                        if (timing7 != null && (detailedDuration = timing7.detailedDuration) != null && (str2 = detailedDuration.ttfb) != null) {
                                            num7 = Integer.valueOf(Integer.parseInt(str2));
                                        } else {
                                            num7 = null;
                                        }
                                        jSONObject.put("ttfb", num7);
                                    }
                                    K4J k4j2 = c49923JiZ.LJI;
                                    o.LJI(k4j2);
                                    C64668PZo requestInfo = k4j2.getRequestInfo();
                                    if (requestInfo != null) {
                                        long j = requestInfo.LJIILLIIL;
                                        if (j > 0) {
                                            jSONObject.put("timing_total", j);
                                            jSONObject.put("requestStart", requestInfo.LJ);
                                            jSONObject.put("appLevelRequestStart", requestInfo.LIZJ);
                                            int optInt = jSONObject.optInt("inner");
                                            if (optInt > 0) {
                                                jSONObject.put("timing_net", requestInfo.LJIILLIIL - optInt);
                                            }
                                        }
                                        C49932Jii c49932Jii = c49923JiZ.LJIILLIIL;
                                        if (c49932Jii != null) {
                                            List<C49935Jil> snapshots = c49932Jii.LIZ();
                                            if (c49923JiZ.LJIIIZ == 1 && snapshots.size() >= 2) {
                                                c49935Jil = snapshots.get(1);
                                            } else if (c49923JiZ.LJIIIZ == 0 && snapshots.size() >= 3) {
                                                c49935Jil = snapshots.get(2);
                                            } else if (c49923JiZ.LJIIIZ == -1 && snapshots.size() >= 1) {
                                                c49935Jil = snapshots.get(0);
                                            } else {
                                                o.LJIIIIZZ(snapshots, "snapshots");
                                                if (!snapshots.isEmpty()) {
                                                    c49935Jil = snapshots.get(snapshots.size() - 1);
                                                } else {
                                                    c49935Jil = null;
                                                }
                                            }
                                            long j2 = c49923JiZ.LJ - c49923JiZ.LIZIZ;
                                            jSONObject.put("triggerNetCost", j2);
                                            if (c49935Jil != null) {
                                                long j3 = c49935Jil.LIZJ;
                                                int i6 = (int) (j3 - requestInfo.LJ);
                                                int i7 = (int) (c49935Jil.LIZLLL - j3);
                                                int i8 = c49935Jil.LIZIZ;
                                                int i9 = i6 + i8;
                                                int i10 = c49935Jil.LIZ;
                                                i2 = (i7 - i8) - i10;
                                                i = i10 + i2;
                                                jSONObject.put("client_cost_new", (currentTimeMillis - j3) + j2);
                                                jSONObject.put("after_net", currentTimeMillis - c49935Jil.LIZJ);
                                                if (i9 > 0) {
                                                    jSONObject.put("timing_total", i9);
                                                    jSONObject.put("client_cost", c49923JiZ.LJIIZILJ - requestInfo.LJIILLIIL);
                                                }
                                            } else {
                                                i = 0;
                                                i2 = 0;
                                            }
                                            if (i > 0) {
                                                jSONObject.put("timing_gap_end", i);
                                            }
                                            if (i2 > 0) {
                                                jSONObject.put("chunk_data_parsing_cost", i2);
                                            }
                                        }
                                        jSONObject.put("timing_rtt", (int) ((requestInfo.LJFF - requestInfo.LJ) - c49923JiZ.LJJIJIIJIL));
                                        if (c49923JiZ.LJIIJJI == 2) {
                                            jSONObject.put("cancel_search_time", c49923JiZ.LJIIZILJ);
                                        }
                                        if (c49923JiZ.LJIL > 0) {
                                            jSONObject.put("preDisplayCostGap", c49923JiZ.LJJ - c49923JiZ.LJIIZILJ);
                                        }
                                        Integer num8 = c49923JiZ.LJJIFFI;
                                        if (num8 != null && (intValue5 = num8.intValue()) > 0) {
                                            jSONObject.put("pre_create_video_holder_count", intValue5);
                                        }
                                        Integer num9 = c49923JiZ.LJJII;
                                        if (num9 != null && (intValue4 = num9.intValue()) > 0) {
                                            jSONObject.put("pre_create_user_holder_count", intValue4);
                                        }
                                        Integer num10 = c49923JiZ.LJJIII;
                                        if (num10 != null && (intValue3 = num10.intValue()) > 0) {
                                            jSONObject.put("pre_async_create_video_holder_count", intValue3);
                                        }
                                        Integer num11 = c49923JiZ.LJJIIJ;
                                        if (num11 != null && (intValue2 = num11.intValue()) > 0) {
                                            jSONObject.put("pre_create_footer_holder_count", intValue2);
                                        }
                                        Integer num12 = c49923JiZ.LJJIIJZLJL;
                                        if (num12 != null && (intValue = num12.intValue()) > 0) {
                                            jSONObject.put("pre_inflate_layout_count", intValue);
                                        }
                                        jSONObject.put("view_draw_cost", currentTimeMillis - c49923JiZ.LIZLLL);
                                        jSONObject.put("server_stream_time", c49923JiZ.LJJIJIL);
                                        jSONObject.put("dc", c49923JiZ.LJJIIZ);
                                        if (c49923JiZ.LJJIJ) {
                                            jSONObject.put("patch_status", c49923JiZ.LJJIIZI);
                                            jSONObject.put("patch_cost", c49923JiZ.LJJIJIIJI);
                                        }
                                        jSONObject.put("client_cost", (int) ((c49923JiZ.LJIIZILJ - r1) - c49923JiZ.LJJIZ));
                                        if (c49932Jii != null && (LIZ2 = c49932Jii.LIZ()) != null) {
                                            int i11 = 0;
                                            int i12 = 0;
                                            for (C49935Jil c49935Jil2 : LIZ2) {
                                                int i13 = i11 + 1;
                                                if (i11 >= 0) {
                                                    C49935Jil c49935Jil3 = c49935Jil2;
                                                    if (c49935Jil3 != null) {
                                                        int i14 = c49935Jil3.LIZIZ - i12;
                                                        i12 += i14;
                                                        StringBuilder LIZ3 = X1D.LIZ();
                                                        LIZ3.append("snapshots_start");
                                                        LIZ3.append(i11);
                                                        jSONObject.put(X1D.LIZIZ(LIZ3), c49935Jil3.LJ);
                                                        StringBuilder LIZ4 = X1D.LIZ();
                                                        LIZ4.append("snapshots_data_parse_cost");
                                                        LIZ4.append(i11);
                                                        jSONObject.put(X1D.LIZIZ(LIZ4), c49935Jil3.LIZ);
                                                        StringBuilder LIZ5 = X1D.LIZ();
                                                        LIZ5.append("snapshots_parse_cost");
                                                        LIZ5.append(i11);
                                                        jSONObject.put(X1D.LIZIZ(LIZ5), c49935Jil3.LIZIZ);
                                                        StringBuilder LIZ6 = X1D.LIZ();
                                                        LIZ6.append("snapshots_single_parse_cost");
                                                        LIZ6.append(i11);
                                                        jSONObject.put(X1D.LIZIZ(LIZ6), i14);
                                                    }
                                                    i11 = i13;
                                                } else {
                                                    try {
                                                        C47261Igj.LJJJJJ();
                                                        throw null;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        C16880lQ.LLLLIIL(e);
                                                        LIZJ.remove(C49567Jcp.LIZ(searchResultParam));
                                                        LJ = -1L;
                                                        C65777Prh.LIZJ(C49921JiX.LIZJ).remove(C49567Jcp.LIZ(searchResultParam));
                                                        LIZLLL = null;
                                                        return;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        LIZJ.remove(C49567Jcp.LIZ(searchResultParam));
                                                        LJ = -1L;
                                                        C65777Prh.LIZJ(C49921JiX.LIZJ).remove(C49567Jcp.LIZ(searchResultParam));
                                                        LIZLLL = null;
                                                        throw th;
                                                    }
                                                }
                                            }
                                        }
                                        jSONObject.put("prefetch_real_request_gap", c49923JiZ.LJ - requestInfo.LJFF);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            Iterator<String> it = c49923JiZ.LJJIL.iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                if (sb.length() == 0) {
                                    sb.append(next);
                                } else {
                                    StringBuilder LIZ7 = X1D.LIZ();
                                    LIZ7.append(',');
                                    LIZ7.append(next);
                                    sb.append(X1D.LIZIZ(LIZ7));
                                }
                            }
                            c49923JiZ.LJJIL.clear();
                            jSONObject.put("native_cards_type", sb.toString());
                            LIZJ(jSONObject);
                            jSONObject.put("is_first_search", c49923JiZ.LJIILJJIL);
                            c49923JiZ.LJ();
                            c49923JiZ.LJFF();
                            jSONObject.put("chunk_data_reading_cost", c49923JiZ.LJIIIIZZ);
                            jSONObject.put("hit_chunk_cache", c49923JiZ.LJIIIZ);
                            String str9 = c49923JiZ.LJIJ;
                            String str10 = "";
                            if (str9 == null) {
                                str9 = "";
                            }
                            jSONObject.put("enter_from", str9);
                            String str11 = c49923JiZ.LJIJI;
                            if (str11 != null) {
                                str10 = str11;
                            }
                            jSONObject.put("enter_method", str10);
                            if (C16880lQ.LLLZLL()) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            jSONObject.put("is_poor_performance", i3);
                            jSONObject.put("keyword", searchResultParam.getKeyword());
                            jSONObject.put("cursor", c49923JiZ.LJIJJLI);
                            jSONObject.put("network_type", c49923JiZ.LJFF);
                            jSONObject.put("lynx_load_time", LJFF);
                            jSONObject.put("lynx_create_view_holder_cost", c49923JiZ.LJJIJL);
                            jSONObject.put("lynx_on_bind_view_holder_cost", c49923JiZ.LJJIJLIJ);
                            jSONObject.put("native_user_on_bind_view_holder_cost", c49923JiZ.LJIILL);
                            if (c49923JiZ.LJJIJLIJ <= 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            jSONObject.put("has_lynx_cards", i4);
                            try {
                                if (!LIZIZ(searchResultParam, z)) {
                                    AppLogNewUtils.onEventV3("search_trigger_refresh_monitor_v2", jSONObject);
                                } else {
                                    String keyword = searchResultParam.getKeyword();
                                    o.LJIIIIZZ(keyword, "searchParam.keyword");
                                    C49963JjD LIZ8 = C49966JjG.LIZ(keyword);
                                    if (LIZ8.LIZIZ != 0) {
                                        LIZ8.LIZJ = "search_trigger_refresh_monitor_v2";
                                        LIZ8.LIZLLL = jSONObject;
                                        new Handler().postDelayed(new ARunnableS44S0100000_8(LIZ8, 78), 2000L);
                                    }
                                }
                                LIZJ.remove(C49567Jcp.LIZ(searchResultParam));
                                LJ = -1L;
                                C65777Prh.LIZJ(C49921JiX.LIZJ).remove(C49567Jcp.LIZ(searchResultParam));
                            } catch (Exception e3) {
                                e = e3;
                                C16880lQ.LLLLIIL(e);
                                LIZJ.remove(C49567Jcp.LIZ(searchResultParam));
                                LJ = -1L;
                                C65777Prh.LIZJ(C49921JiX.LIZJ).remove(C49567Jcp.LIZ(searchResultParam));
                                LIZLLL = null;
                                return;
                            }
                        } catch (Exception e4) {
                            e = e4;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        LIZLLL = null;
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (c49923JiZ != null && c49923JiZ.LJJI) {
                c49923JiZ.LJJI = false;
                c49923JiZ.LJIL = (int) (System.currentTimeMillis() - c49923JiZ.LIZIZ);
            }
        }
    }

    public static void LIZJ(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                keys.remove();
            }
        }
    }

    public static C49923JiZ LIZLLL(SearchResultParam searchResultParam) {
        if (searchResultParam != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LIZJ;
            if (linkedHashMap.get(C49567Jcp.LIZ(searchResultParam)) == null) {
                LJ = System.currentTimeMillis();
            }
            C49923JiZ c49923JiZ = (C49923JiZ) linkedHashMap.get(C49567Jcp.LIZ(searchResultParam));
            if (c49923JiZ == null) {
                return C49936Jim.LIZ;
            }
            return c49923JiZ;
        }
        return C49936Jim.LIZ;
    }

    public static boolean LIZIZ(SearchResultParam searchResultParam, boolean z) {
        if (z && searchResultParam != null && !TextUtils.isEmpty(searchResultParam.getKeyword())) {
            return true;
        }
        return false;
    }

    public static C49923JiZ LJ(int i, SearchResultParam searchParam) {
        o.LJIIIZ(searchParam, "searchParam");
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - LIZ;
        LIZ = currentTimeMillis;
        if (j < 1000) {
            return null;
        }
        LIZIZ = false;
        SearchResultParam copy = searchParam.copy();
        o.LJIIIIZZ(copy, "searchParam.copy()");
        C49923JiZ c49923JiZ = new C49923JiZ(copy);
        c49923JiZ.LIZIZ = currentTimeMillis;
        c49923JiZ.LJJIL.clear();
        c49923JiZ.LIZJ = i;
        c49923JiZ.LJIJ = searchParam.getSearchFrom();
        c49923JiZ.LJIJI = searchParam.getEnterMethod();
        long j2 = LJ;
        if (j2 > 0) {
            c49923JiZ.LJ = j2;
        }
        LIZJ.put(C49567Jcp.LIZ(copy), c49923JiZ);
        LIZLLL = c49923JiZ;
        return c49923JiZ;
    }
}
