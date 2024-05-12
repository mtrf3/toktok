package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMX {
    public static int LIZIZ(String str) {
        if (C77318UWc.LJLIL) {
            return 1;
        }
        java.util.Map<String, Integer> LJFF = HybridMultiMonitor.getInstance().getHybridSettingManager().LJFF();
        if (!LJFF.containsKey(str)) {
            return -1;
        }
        return LJFF.get(str).intValue();
    }

    public static boolean LIZLLL(String str) {
        if (C77318UWc.LJLIL) {
            return true;
        }
        return HybridMultiMonitor.getInstance().getHybridSettingManager().LIZ().LIZ(str).tea_switch;
    }

    public static VMZ LJ(String str) {
        long optLong;
        long optLong2;
        VMZ vmz = new VMZ();
        try {
            JSONObject optJSONObject = C77123UOp.LJJJLL(str).optJSONObject("data");
            long j = 0;
            if (optJSONObject == null) {
                optLong = 0;
            } else {
                optLong = optJSONObject.optLong("update_time", 0L);
            }
            vmz.LIZJ = optLong;
            vmz.LIZLLL = C77123UOp.LJJJJI("duration", optJSONObject);
            if (optJSONObject == null) {
                optLong2 = 0;
            } else {
                optLong2 = optJSONObject.optLong("setting_id", 0L);
            }
            vmz.LJ = optLong2;
            if (optJSONObject != null) {
                j = optJSONObject.optLong("enable_switch", 0L);
            }
            C40068Fo0 c40068Fo0 = new C40068Fo0();
            VMS.resetAll(j);
            vmz.LIZIZ = c40068Fo0;
            vmz.LJFF = LJIIIIZZ(C77123UOp.LJJJJJ("all_event_sample", optJSONObject));
            JSONArray LJJJJIZL = C77123UOp.LJJJJIZL("host_list", optJSONObject);
            HashSet hashSet = new HashSet();
            if (LJJJJIZL != null) {
                try {
                    if (LJJJJIZL.length() > 0) {
                        for (int i = 0; i < LJJJJIZL.length(); i++) {
                            hashSet.add(LJJJJIZL.optString(i));
                        }
                    }
                } catch (Throwable th) {
                    C77117UOj.LJIIZILJ(th);
                }
            }
            vmz.LJI = hashSet;
            vmz.LJII = LJII(C77123UOp.LJJJJJ("check_filter", optJSONObject));
        } catch (Throwable th2) {
            C77117UOj.LJIILLIIL("startup_handle", th2);
        }
        return vmz;
    }

    public static VMZ LJFF(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        VMZ vmz = new VMZ();
        try {
            JSONObject optJSONObject = C77123UOp.LJJJLL(str).optJSONObject("data");
            JSONObject LJJJJJ = C77123UOp.LJJJJJ("bid_info", optJSONObject);
            long j = 0;
            if (optJSONObject != null) {
                j = optJSONObject.optLong("setting_id", 0L);
            }
            vmz.LIZ = LJI(LJJJJJ, j);
            HashMap hashMap = new HashMap();
            hashMap.put("bid_count", Long.valueOf(((HashMap) vmz.LIZ.LIZ).size()));
            hashMap.put("regex_count", Long.valueOf(((ArrayList) vmz.LIZ.LIZIZ).size()));
            hashMap.put("setting_parse_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            C40048Fng.LIZIZ(null, "setting_parse_perf", null, hashMap);
        } catch (Throwable th) {
            C77117UOj.LJIILLIIL("startup_handle", th);
        }
        return vmz;
    }

    public static C75312xT LJII(JSONObject jSONObject) {
        C75312xT c75312xT = new C75312xT();
        try {
            JSONObject LJJJJJ = C77123UOp.LJJJJJ("filter", jSONObject);
            HashMap hashMap = new HashMap();
            for (String str : InterfaceC39125FXd.LIZ) {
                hashMap.put(str, C77123UOp.LJJIJL(C77123UOp.LJJJJIZL(str, LJJJJJ)));
            }
            return new C75312xT(hashMap, C77123UOp.LJJIJL(C77123UOp.LJJJJIZL("category", jSONObject)), C77123UOp.LJJJJLI("id", jSONObject));
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
            return c75312xT;
        }
    }

    public static java.util.Map<String, Integer> LJIIIIZZ(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, Integer.valueOf(C77123UOp.LJJJJI(next, jSONObject)));
            }
        } catch (Throwable th) {
            C77117UOj.LJIILLIIL("startup_handle", th);
        }
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x000f. Please report as an issue. */
    public static void LIZ(BidInfo.BidConfig bidConfig, long j) {
        int i = 0;
        do {
            if (i != 0) {
                j >>= 1;
            }
            if (j % 2 == 1) {
                switch (i) {
                    case 0:
                        bidConfig.custom_p0 = true;
                        break;
                    case 1:
                        bidConfig.custom_p1 = true;
                        break;
                    case 2:
                        bidConfig.custom_p2 = true;
                        break;
                    case 3:
                        bidConfig.custom_p3 = true;
                        break;
                    case 4:
                        bidConfig.custom_p4 = true;
                        break;
                    case 5:
                        bidConfig.custom_p5 = true;
                        break;
                    case 6:
                        bidConfig.custom_p6 = true;
                        break;
                    case 7:
                        bidConfig.custom_p7 = true;
                        break;
                    case 8:
                        bidConfig.custom_p8 = true;
                        break;
                    case 9:
                        bidConfig.perf_web = true;
                        break;
                    case 10:
                        bidConfig.ajax_web = true;
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        bidConfig.static_perf_web = true;
                        break;
                    case 12:
                        bidConfig.static_error_web = true;
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        bidConfig.js_exception_web = true;
                        break;
                    case 14:
                        bidConfig.blank_web = true;
                        break;
                    case 15:
                        bidConfig.fetch_error_web = true;
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        bidConfig.jsb_error_web = true;
                        break;
                    case 17:
                        bidConfig.jsb_perf_web = true;
                        break;
                    case 18:
                        bidConfig.falcon_perf_web = true;
                        break;
                    case 19:
                        bidConfig.native_error_web = true;
                        break;
                    case 20:
                        bidConfig.navigation_start_web = true;
                        break;
                    case 21:
                        bidConfig.static_sri_web = true;
                        break;
                    case 22:
                        bidConfig.performance_lynx = true;
                        break;
                    case 23:
                        bidConfig.blank_lynx = true;
                        break;
                    case 24:
                        bidConfig.fetch_error_lynx = true;
                        break;
                    case 25:
                        bidConfig.jsb_error_lynx = true;
                        break;
                    case 26:
                        bidConfig.jsb_perf_lynx = true;
                        break;
                    case 27:
                        bidConfig.native_error_lynx = true;
                        break;
                    case 28:
                        bidConfig.navigation_start_lynx = true;
                        break;
                    case 29:
                        bidConfig.performance_reactnative = true;
                        break;
                    case 30:
                        bidConfig.blank_reactnative = true;
                        break;
                    case 31:
                        bidConfig.fetch_error_reactnative = true;
                        break;
                    case 32:
                        bidConfig.jsb_error_reactnative = true;
                        break;
                    case 33:
                        bidConfig.native_error_reactnative = true;
                        break;
                    case 34:
                        bidConfig.container_error = true;
                        break;
                    case 35:
                        bidConfig.js_exception_lynx = true;
                        break;
                    case 36:
                        bidConfig.static_error_lynx = true;
                        break;
                    case 37:
                        bidConfig.tea_switch = true;
                        break;
                    case 38:
                        bidConfig.res_loader_perf_web = true;
                        break;
                    case 39:
                        bidConfig.res_loader_perf_template_web = true;
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        bidConfig.res_loader_error_web = true;
                        break;
                    case 41:
                        bidConfig.res_loader_error_template_web = true;
                        break;
                    case 42:
                        bidConfig.res_loader_perf_lynx = true;
                        break;
                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                        bidConfig.res_loader_perf_template_lynx = true;
                        break;
                    case 44:
                        bidConfig.res_loader_error_lynx = true;
                        break;
                    case 45:
                        bidConfig.res_loader_error_template_lynx = true;
                        return;
                }
            }
            i++;
        } while (i < 46);
    }

    public static int LIZJ(String str, String str2) {
        if (C77318UWc.LJLIL) {
            return 1;
        }
        java.util.Map<String, Integer> map = HybridMultiMonitor.getInstance().getHybridSettingManager().LIZ().LIZ(str).eventNameSample;
        if (!map.containsKey(str2)) {
            return -1;
        }
        return map.get(str2).intValue();
    }

    public static BidInfo LJI(JSONObject jSONObject, long j) {
        BidInfo bidInfo = new BidInfo();
        if (jSONObject == null) {
            return bidInfo;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                JSONObject LJJJJJ = C77123UOp.LJJJJJ(next, jSONObject);
                long j2 = 0;
                if (LJJJJJ != null) {
                    j2 = LJJJJJ.optLong("hit_sample", 0L);
                }
                BidInfo.BidConfig bidConfig = new BidInfo.BidConfig(next);
                bidConfig.hitSample = j2;
                bidConfig.settingId = j;
                bidConfig.eventNameSample = LJIIIIZZ(C77123UOp.LJJJJJ("event_name_sample", LJJJJJ));
                java.util.Map<String, BidInfo.BidConfig> map = bidInfo.LIZ;
                LIZ(bidConfig, j2);
                ((HashMap) map).put(next, bidConfig);
                JSONArray optJSONArray = LJJJJJ.optJSONArray("regex_list");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        try {
                            ((ArrayList) bidInfo.LIZIZ).add(new C38918FPe(next, new OJD(optJSONArray.optString(i))));
                        } catch (Throwable th) {
                            C77117UOj.LJIILLIIL("startup_handle", th);
                        }
                    }
                }
            } catch (Throwable th2) {
                C77117UOj.LJIILLIIL("startup_handle", th2);
            }
        }
        Collections.sort(bidInfo.LIZIZ);
        return bidInfo;
    }
}
