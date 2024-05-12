package X;

import Y.ARunnableS13S0000000_6;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: X.PDs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64100PDs implements PE2 {
    public volatile boolean LJLIL;
    public volatile boolean LJLILLLLZI;
    public volatile JSONObject LJLJI;
    public volatile JSONObject LJLJJI;
    public volatile JSONObject LJLJJL;
    public volatile SharedPreferences LJLJLJ;
    public InterfaceC58333Muv LJLJLLL;
    public JSONObject LJLL;
    public boolean LJLLI;
    public volatile boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public long LJZ;
    public List<InterfaceC64103PDv> LJZI;
    public List<String> LJLJJLL = C39038FTu.LIZ;
    public volatile long LJLJL = 1200;
    public long LJLLILLLL = -1;
    public long LJLLJ = 60000;
    public long LJLLL = -1;

    public final void LIZLLL() {
        if (!this.LJLIL) {
            this.LJLIL = true;
            List<InterfaceC64103PDv> list = this.LJZI;
            if (list != null) {
                Iterator it = ((CopyOnWriteArrayList) list).iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC64103PDv) it.next()).LIZ();
                    } catch (Throwable th) {
                        C78983UzD.LJIIZILJ(th);
                    }
                }
            }
        }
    }

    public final String LJFF() {
        if (this.LJLJLJ == null) {
            synchronized (this) {
                if (this.LJLJLJ == null) {
                    this.LJLJLJ = SharedPreferencesC37314Ekg.LIZIZ(C09970aH.LIZ, "monitor_config");
                }
            }
        }
        String string = this.LJLJLJ.getString("monitor_net_config", "");
        if (C09970aH.LJII()) {
            C1JX.LJIIIIZZ("SlardarConfigFetcher.queryFromLocal: ", string);
        }
        return string;
    }

    public final boolean LJIIIZ() {
        String LJFF = LJFF();
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("configStr:");
            LIZ.append(LJFF);
            C64028PAy.LIZ("SlardarConfigFetcher", X1D.LIZIZ(LIZ));
        }
        if (C09970aH.LJII()) {
            C1JX.LJIIIIZZ("SlardarConfigFetcher.updateFromLocal, configStr=", LJFF);
        }
        boolean z = true;
        if (!TextUtils.isEmpty(LJFF)) {
            try {
                JSONObject jSONObject = new JSONObject(LJFF);
                this.LJLLI = true;
                int i = this.LJLJLJ.getInt("setting_version", 0);
                if (C09970aH.LJII()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("SlardarConfigFetcher.updateFromLocal, settingVersion=");
                    LIZ2.append(i);
                    X1D.LIZIZ(LIZ2);
                }
                if (i == 3) {
                    this.LJLLILLLL = this.LJLJLJ.getLong("monitor_configure_refresh_time", 0L);
                    this.LJZ = this.LJLJLJ.getLong("monitor_last_calculate_timestamp", 0L);
                    if (C09970aH.LJII()) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("lastCalculateTimestamp:");
                        LIZ3.append(this.LJZ);
                        C64028PAy.LIZ("SlardarConfigFetcher", X1D.LIZIZ(LIZ3));
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(this.LJLLILLLL);
                    LIZ4.append("");
                    C09970aH.LIZ("config_time", X1D.LIZIZ(LIZ4));
                    PC5.LJZI = this.LJLLILLLL;
                    LJIIIIZZ(jSONObject);
                    LJ(jSONObject, true);
                    LIZLLL();
                    z = false;
                }
            } catch (Exception unused) {
            }
        }
        if (C09970aH.LJII()) {
            C07670Rv.LIZLLL("SlardarConfigFetcher.updateFromLocal, isForceRefreshFromNet=", z);
        }
        return z;
    }

    public static void LJII(JSONObject jSONObject) {
        SharedPreferences sharedPreferences;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = true;
        if (jSONObject.optJSONObject("general") != null) {
            C64102PDu.LIZIZ(32, !r1.optBoolean("enable_salvage_log", true));
        }
        JSONObject LJIJI = C43001GuD.LJIJI("performance_modules", "smooth", jSONObject);
        if (LJIJI != null) {
            if (LJIJI.optInt("block_enable_upload", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            C64102PDu.LIZIZ(1, z3);
            if (LJIJI.optInt("enable_trace", 0) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i = 2;
            C64102PDu.LIZIZ(2, z4);
            if (LJIJI.optInt("enable_stack_sampling", 0) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            C64102PDu.LIZIZ(64, z5);
            if (LJIJI.optInt("enable_history_message_logging", 0) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            C64102PDu.LIZIZ(128, z6);
            C64102PDu.LJ = LJIJI.optLong("atrace_tag", 0L);
            int LJIJ = C43001GuD.LJIJ("smooth", "block_monitor_mode", jSONObject);
            if (LJIJ != 11) {
                if (LJIJ != 101) {
                    if (LJIJ != 1001) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 3;
                }
            }
            C64102PDu.LIZLLL = ((i << 29) & (-536870912)) + (C64102PDu.LIZLLL & 536870911);
            if (LJIJI.optInt("enable_socket_total_traffic_collect", 0) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            C64102PDu.LIZIZ(256, z7);
            if (LJIJI.optInt("enable_socket_dumpstack_collect", 0) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            C64102PDu.LIZIZ(512, z8);
        }
        JSONObject LJIJI2 = C43001GuD.LJIJI("performance_modules", "start_trace", jSONObject);
        if (LJIJI2 != null) {
            if (LJIJI2.optInt("enable_perf_data_collect", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            C64102PDu.LIZIZ(4, z);
            if (LJIJI2.optInt("enable_lock_data_collect", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C64102PDu.LIZIZ(8, z2);
            if (LJIJI2.optInt("enable_long_sleep_data_collect", 0) != 1) {
                z9 = false;
            }
            C64102PDu.LIZIZ(16, z9);
        }
        if ((LJIJI != null || LJIJI2 != null) && (sharedPreferences = C64102PDu.LIZIZ) != null) {
            sharedPreferences.edit().putInt("monitor_switch_config_first_flag", C64102PDu.LIZLLL).putLong("monitor_switch_config_atrace_flag", C64102PDu.LJ).apply();
        }
    }

    public final boolean LIZ(C36633EZh c36633EZh) {
        byte[] bArr;
        if (c36633EZh == null || c36633EZh.LIZ != 200 || (bArr = c36633EZh.LIZJ) == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(new String(bArr));
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("resultJSON:");
            LIZ.append(jSONObject);
            C64028PAy.LIZ("SlardarConfigFetcher", X1D.LIZIZ(LIZ));
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            this.LJLLI = false;
            LJIIIIZZ(optJSONObject);
            LJ(optJSONObject, false);
            LIZLLL();
            this.LJLLILLLL = System.currentTimeMillis();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLLILLLL);
            LIZ2.append("");
            C09970aH.LIZ("config_time", X1D.LIZIZ(LIZ2));
            PC5.LJZI = this.LJLLILLLL;
            try {
                LJII(optJSONObject);
                SharedPreferences.Editor edit = this.LJLJLJ.edit();
                edit.putString("monitor_net_config", optJSONObject.toString());
                edit.putInt("setting_version", 3);
                edit.putLong("monitor_configure_refresh_time", this.LJLLILLLL);
                long currentTimeMillis = System.currentTimeMillis();
                this.LJZ = currentTimeMillis;
                edit.putLong("monitor_last_calculate_timestamp", currentTimeMillis);
                edit.commit();
            } catch (Exception e) {
                C64028PAy.LIZJ("SlardarConfigFetcher", "saveToLocal", e);
            }
            F9U.LIZ.LIZLLL(1000L, new ARunnableS13S0000000_6(54));
            C80036Vb6.LJIIIIZZ("apm_debug", "APM_SETTING_READY");
            return true;
        }
        if (jSONObject.optInt("code", -1) == 1) {
            this.LJLLILLLL = System.currentTimeMillis();
            SharedPreferences.Editor edit2 = this.LJLJLJ.edit();
            edit2.putLong("monitor_configure_refresh_time", this.LJLLILLLL);
            edit2.commit();
            return true;
        }
        return false;
    }

    @Override // X.PE2
    public final void LIZIZ(long j) {
        LJI(false);
    }

    public final boolean LIZJ(long j) {
        long j2 = this.LJLLJ;
        if (j2 > 60000) {
            if (j - this.LJLLL > j2) {
                return true;
            }
            return false;
        }
        if (j - this.LJLLILLLL > this.LJLJL * 1000) {
            return true;
        }
        return false;
    }

    public final void LJI(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SlardarConfigFetcher.queryFromNet.");
            if (this.LJLZ || this.LJLLLLLL) {
                z2 = true;
            } else {
                z2 = false;
            }
            LIZ.append(z2);
            LIZ.append(" ");
            LIZ.append(LIZJ(System.currentTimeMillis()));
            X1D.LIZIZ(LIZ);
        }
        if (this.LJLZ || this.LJLLLLLL) {
            if (z || LIZJ(System.currentTimeMillis())) {
                if (!C48168IvM.LIZ(C09970aH.LIZ)) {
                    C09970aH.LJII();
                    return;
                }
                InterfaceC58333Muv interfaceC58333Muv = this.LJLJLLL;
                if (interfaceC58333Muv == null || interfaceC58333Muv.LIZ() == null || this.LJLJLLL.LIZ().isEmpty()) {
                    C09970aH.LJII();
                    return;
                }
                if (this.LJZ == 0) {
                    this.LJZ = this.LJLJLJ.getLong("monitor_last_calculate_timestamp", 0L);
                }
                HashMap hashMap = new HashMap(this.LJLJLLL.LIZ());
                hashMap.put("last_calculate_timestamp", String.valueOf(this.LJZ));
                hashMap.put("slardar_settings_v4", String.valueOf(1));
                if (System.currentTimeMillis() - this.LJZ >= 345600000) {
                    hashMap.put("force_refresh", String.valueOf(1));
                }
                if (C09970aH.LJII()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("queryFromNet:");
                    LIZ2.append(hashMap);
                    C64028PAy.LIZ("SlardarConfigFetcher", X1D.LIZIZ(LIZ2));
                }
                this.LJLLL = System.currentTimeMillis();
                Iterator<String> it = this.LJLJJLL.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            C58330Mus LIZ3 = new PDT(it.next()).LIZ(hashMap);
                            C36633EZh doGet = C09970aH.LJIIIIZZ.doGet(LIZ3.LIZ, LIZ3.LIZIZ);
                            z3 = LIZ(doGet);
                            if (C09970aH.LJII()) {
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("SlardarConfigFetcher.queryFromNet.fetchResult: ");
                                LIZ4.append(doGet.LIZJ.length);
                                LIZ4.append(" ");
                                LIZ4.append(z3);
                                X1D.LIZIZ(LIZ4);
                            }
                        } catch (Throwable unused) {
                        }
                        if (z3) {
                            break;
                        }
                    } else if (!z3) {
                        this.LJLLJ = Math.min(this.LJLLJ * 2, 600000L);
                        return;
                    }
                }
                this.LJLLJ = 60000L;
            }
        }
    }

    public final void LJIIIIZZ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        boolean z;
        JSONObject jSONObject3;
        if (C43001GuD.LJIILIIL(jSONObject)) {
            return;
        }
        JSONObject LJIJI = C43001GuD.LJIJI("general", "slardar_api_settings", jSONObject);
        if (LJIJI != null) {
            JSONObject optJSONObject2 = LJIJI.optJSONObject("fetch_setting");
            if (optJSONObject2 != null) {
                this.LJLJL = optJSONObject2.optLong("fetch_setting_interval", 1200L);
            }
            if (this.LJLJL < 600) {
                this.LJLJL = 600L;
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("custom_event_settings");
        if (optJSONObject3 != null) {
            this.LJLJI = optJSONObject3.optJSONObject("allow_log_type");
            this.LJLJJI = optJSONObject3.optJSONObject("allow_metric_type");
            this.LJLJJL = optJSONObject3.optJSONObject("allow_service_name");
        }
        this.LJLL = jSONObject;
        if (TextUtils.isEmpty("exception_modules") || (jSONObject3 = this.LJLL) == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject3.optJSONObject("exception_modules");
        }
        if (jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("exception")) != null) {
            if (optJSONObject.optInt("enable_upload") == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJLILLLLZI = z;
        }
        if (this.LJLJJL == null || TextUtils.isEmpty("apm_cost") || this.LJLJJL.optInt("apm_cost") != 1) {
            return;
        }
        PF6.LJFF = new C64101PDt(this);
        PF6.LJI = true;
    }

    public final void LJ(JSONObject jSONObject, boolean z) {
        List<InterfaceC64103PDv> list = this.LJZI;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC64103PDv) it.next()).LJ(jSONObject, z);
                } catch (Throwable th) {
                    C78983UzD.LJIIZILJ(th);
                }
            }
        }
    }
}
