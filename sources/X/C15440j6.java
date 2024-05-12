package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.gecko.TTLiveGeckoSplitSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.0j6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15440j6 {
    public static java.util.Set<String> LIZLLL;
    public static int LIZ = -1;
    public static int LIZIZ = -1;
    public static int LIZJ = -1;
    public static int LJ = -1;
    public static final List<String> LJFF = C47261Igj.LJJIJIL("AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GB", "GF", "GP", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MF", "MQ", "MT", "NL", "NO", "PL", "PT", "RE", "RO", "SE", "SI", "SK", "YT");

    public static int LIZ() {
        String str;
        int i;
        if (LJ < 0) {
            String str2 = C64707PaR.LIZJ;
            if (str2 != null) {
                str = str2.toUpperCase(Locale.ROOT);
                o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                i = 0;
            } else if (o.LJ("US", str)) {
                i = 2;
            } else if (LJFF.contains(str)) {
                i = 3;
            } else {
                i = 1;
            }
            LJ = i;
        }
        return LJ;
    }

    public static void LJ(String str, String str2, String str3) {
        if (!TTLiveGeckoSplitSetting.INSTANCE.isEnableReport() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        LIZLLL(2, str, str2, str3);
    }

    public static void LIZJ(long j, String str, String extra, boolean z) {
        o.LJIIIZ(extra, "extra");
        LIZIZ(j, str, "", "", extra, z);
    }

    public static void LIZLLL(Integer num, String str, String str2, String str3) {
        int i;
        if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gecko_get_asset_path_info_report", 0.01d) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("channel", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("filename", str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("path", str3);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        hashMap.put("load_resource_type", Integer.valueOf(i));
        hashMap.put("gecko_region", Integer.valueOf(LIZ()));
        C0K2.LJII(0, "ttlive_gecko_get_asset_path_info_report", hashMap);
    }

    public static void LIZIZ(long j, String str, String str2, String str3, String str4, boolean z) {
        int i;
        Context applicationContext;
        String obj;
        HH1.LIZ(str2, "gchannel", str3, "gfileName", str4, "extra");
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_gecko_file_info_report") && !TextUtils.isEmpty(str) && str != null && s.LJJJLZIJ(str, "live", false)) {
            HashMap LIZJ2 = C03660Ck.LIZJ("path", str);
            LIZJ2.put("cost_time", Long.valueOf((System.nanoTime() - j) / 1000000));
            LIZJ2.put("is_load_success", Boolean.valueOf(z));
            if (ujb.o.LJJJLIIL(str, "file:", false) || ujb.o.LJJJLIIL(str, "/data/", false)) {
                i = 2;
            } else if (ujb.o.LJJJLIIL(str, "http:", false) || ujb.o.LJJJLIIL(str, "https:", false)) {
                i = 3;
            } else {
                if (!ujb.o.LJJJLIIL(str, "asset:", false)) {
                    if (!TextUtils.isEmpty(str) && ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
                        if (LIZLLL == null) {
                            LIZLLL = C77275UUl.LJIIIIZZ("tiktok_live_broadcast_resource", "tiktok_live_watch_resource", "tiktok_live_interaction_resource", "tiktok_live_basic_resource", "tiktok_live_lottie_resource", "tiktok_live_link_mic", "tiktok_live_watch_resource_normal_1", "tiktok_live_watch_resource_demand_1", "tiktok_live_watch_resource_demand_2", "tiktok_live_link_mic", "tiktok_live_interaction_normal_1", "tiktok_live_interaction_normal_2", "tiktok_live_interaction_normal_3", "tiktok_live_interaction_demand_1", "tiktok_live_interaction_demand_2", "tiktok_live_interaction_demand_3", "tiktok_live_interaction_demand_4", "tiktok_live_revenue_normal_1", "tiktok_live_revenue_demand_1", "tiktok_live_revenue_demand_2", "tiktok_live_revenue_demand_3", "tiktok_live_revenue_demand_4", "tiktok_live_broadcast_demand_1", "tiktok_live_broadcast_demand_2", "tiktok_live_game_demand_1", "tiktok_live_outside_demand_1", "tiktok_live_match_resource", "tiktok_live_wallet_resource", "tiktok_live_gift_send_sound", "live_im_push_compress_zstd_dict", "tiktok_live_user_level_webp_0_native", "tiktok_live_user_level_webp_1_native", "tiktok_live_user_level_webp_2_native", "tiktok_live_user_level_webp_3_native", "tiktok_live_user_level_webp_4_native", "tiktok_live_user_level_webp_lighting_native", "tiktok_live_fans_club_entrance", "tiktok_live_fans_club_barrage_webp_2_native", "tiktok_live_fans_club_barrage_webp_3_native", "tiktok_live_fans_club_barrage_webp_4_native");
                        }
                        java.util.Set<String> set = LIZLLL;
                        if (set != null) {
                            Iterator<String> it = set.iterator();
                            while (it.hasNext()) {
                                if (ujb.o.LJJJLIIL(str, it.next(), false)) {
                                }
                            }
                        }
                    }
                    i = 0;
                }
                i = 1;
                break;
            }
            LIZJ2.put("load_resource_type", Integer.valueOf(i));
            if (!TextUtils.isEmpty(str) && !(true ^ s.LJJJLZIJ(str, "/", false))) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, "/");
                if (stringTokenizer.countTokens() > 0) {
                    int countTokens = stringTokenizer.countTokens();
                    ArrayList list = Collections.list(stringTokenizer);
                    o.LJIIIIZZ(list, "list(this)");
                    Object obj2 = ListProtector.get(list, countTokens - 1);
                    o.LJIIIIZZ(obj2, "tokens[len - 1]");
                    LIZJ2.put("filename", obj2);
                    boolean z2 = false;
                    for (int i2 = countTokens - 2; i2 > 0; i2--) {
                        Object obj3 = ListProtector.get(list, i2);
                        if (obj3 != null && (obj = obj3.toString()) != null) {
                            if (ujb.o.LJJJLIIL(obj, "tiktok_live_", false) || o.LJ(obj, "live_im_push_compress_zstd_dict")) {
                                LIZJ2.put("channel", obj);
                                if (z2) {
                                    break;
                                }
                                if (i != 2) {
                                    break;
                                }
                                z2 = true;
                            } else if (i == 2 && new OJD("[-+]?\\d+(\\.\\d+)?").matches(obj)) {
                                LIZJ2.put("version", obj);
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                            }
                        }
                    }
                }
            }
            if ((LIZ <= 0 || LIZIZ <= 0 || LIZJ <= 0) && (applicationContext = GlobalContext.getApplicationContext()) != null) {
                C1XD LJ2 = C15390j1.LJ(applicationContext);
                LIZ = LJ2.LJLIL;
                LIZIZ = LJ2.LJLILLLLZI;
                LIZJ = LJ2.LJLJI;
            }
            LIZJ2.put("dpi", Integer.valueOf(LIZ));
            LIZJ2.put("width", Integer.valueOf(LIZIZ));
            LIZJ2.put("height", Integer.valueOf(LIZJ));
            LIZJ2.put("extra_info", str4);
            LIZJ2.put("gecko_region", Integer.valueOf(LIZ()));
            C0K2.LJII(0, "ttlive_gecko_file_info_report", LIZJ2);
        }
    }
}
