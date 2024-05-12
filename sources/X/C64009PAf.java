package X;

import Y.ARunnableS0S3201200_11;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.slardar.config.IConfigManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PAf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64009PAf implements PCY {
    public static long LJJI;
    public static final AtomicLong LJJIFFI = new AtomicLong(0);
    public Context LIZ;
    public JSONObject LIZIZ;
    public volatile long LIZJ;
    public volatile long LIZLLL;
    public volatile int LJ;
    public volatile int LJFF;
    public volatile JSONObject LJI;
    public volatile IHttpService LJII;
    public volatile int LJIIIIZZ;
    public volatile int LJIIIZ;
    public volatile List<String> LJIIJ;
    public volatile List<Pattern> LJIIJJI;
    public volatile List<String> LJIIL;
    public volatile List<Pattern> LJIILIIL;
    public InterfaceC64016PAm LJIILJJIL;
    public java.util.Map<String, String> LJIILL;
    public volatile boolean LJIJ;
    public final String LJIJJLI;
    public boolean LJIL;
    public long LJJ;
    public final List<String> LJIILLIIL = new LinkedList();
    public volatile boolean LJIIZILJ = true;
    public volatile boolean LJIJI = false;
    public final C64010PAg LJIJJ = new C64010PAg();

    public final IHttpService LJFF() {
        if (this.LJII == null) {
            this.LJII = (IHttpService) C171096nZ.LIZ(IHttpService.class);
        }
        if (this.LJII != null) {
            return this.LJII;
        }
        synchronized (this) {
        }
        return null;
    }

    public final SharedPreferences LJI() {
        Context context = this.LIZ;
        if (context != null) {
            String LJJZ = V1B.LJJZ(context);
            Context context2 = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("monitor_config");
            LIZ.append(this.LJIJJLI);
            LIZ.append(LJJZ);
            return F9J.LIZIZ(context2, 0, X1D.LIZIZ(LIZ));
        }
        return null;
    }

    public final void LJIILLIIL() {
        if (this.LIZLLL < 600) {
            this.LIZLLL = 600L;
        }
        if ((System.currentTimeMillis() - this.LIZJ) / 1000 > this.LIZLLL && C16880lQ.LLLLIL(this.LIZ)) {
            synchronized (C64009PAf.class) {
                this.LIZJ = System.currentTimeMillis();
            }
            try {
                C48661J7x.LIZ.LIZIZ(new ARunnableS47S0100000_11(this, 85));
            } catch (Throwable unused) {
            }
        }
    }

    public final void LJII() {
        boolean z;
        SharedPreferences LJI = LJI();
        C64006PAc c64006PAc = null;
        String string = LJI.getString("monitor_net_config", null);
        this.LIZJ = LJI.getLong("monitor_configure_refresh_time", 0L);
        this.LJJ = LJI.getLong("monitor_last_calculate_timestamp", 0L);
        if (LJI.getInt("monitor_config_update", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        C48661J7x.LIZ.LIZ(this);
        if (!TextUtils.isEmpty(string)) {
            try {
                this.LJIJI = true;
                JSONObject jSONObject = new JSONObject(string);
                if (!z) {
                    jSONObject.remove("report_host_new");
                }
                LJIILL(jSONObject);
            } catch (Exception unused) {
            }
        }
        IConfigManager iConfigManager = (IConfigManager) C171096nZ.LIZ(IConfigManager.class);
        if (iConfigManager != null) {
            iConfigManager.registerConfigListener(new C64011PAh());
        }
        LJIILLIIL();
        C64005PAb c64005PAb = PAJ.LIZ;
        C64012PAi c64012PAi = new C64012PAi(C63985P9h.LIZ);
        c64005PAb.LIZIZ = c64012PAi;
        String string2 = c64012PAi.LIZ.getString("rule", null);
        if (string2 != null) {
            try {
                C64006PAc LIZ = C64006PAc.LIZ(new JSONObject(string2));
                if (System.currentTimeMillis() < LIZ.LIZ) {
                    c64006PAc = LIZ;
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        c64005PAb.LIZ(c64006PAc, false);
    }

    public C64009PAf(String str) {
        this.LJIJJLI = str;
    }

    public final StringBuilder LIZ(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isDigitsOnly(str) && this.LJIILL != null) {
            if (!str.contains("?")) {
                sb.append("?");
            }
            LIZLLL(sb, "sdk_version", String.valueOf(LiveChatShowDelayForHotLiveSetting.DEFAULT));
            HashMap hashMap = new HashMap(this.LJIILL);
            if (!TextUtils.isEmpty(null)) {
                hashMap.put("host_aid", null);
            }
            if (hashMap.size() > 0) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (entry.getKey() != null) {
                        LIZLLL(sb, String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                    }
                }
            }
        }
        return sb;
    }

    @Override // X.PCY
    public final void LIZIZ(long j) {
        if (this.LIZLLL <= 0) {
            return;
        }
        LJIILLIIL();
    }

    public final void LIZJ(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("aid", this.LJIJJLI);
            C64018PAo.LIZ(jSONObject2);
            jSONObject2.put("process_name", OHZ.LJFF());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJJI);
            LIZ.append("_");
            LIZ.append(LJJIFFI.getAndAdd(1L));
            jSONObject2.put("_debug_uuid", X1D.LIZIZ(LIZ));
            jSONObject.put("_debug_self", jSONObject2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:85|(2:86|87)|(12:91|(3:93|(2:95|96)(1:98)|97)|100|101|102|103|(7:107|(3:109|(2:111|112)(1:114)|113)|116|117|118|119|(7:121|122|123|124|125|(1:127)(4:130|(4:133|(3:135|136|137)(1:139)|138|131)|140|141)|128)(8:144|(4:147|(3:149|150|151)(1:153)|152|145)|154|123|124|125|(0)(0)|128))|157|117|118|119|(0)(0))|159|101|102|103|(8:105|107|(0)|116|117|118|119|(0)(0))|157|117|118|119|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:85|86|87|(12:91|(3:93|(2:95|96)(1:98)|97)|100|101|102|103|(7:107|(3:109|(2:111|112)(1:114)|113)|116|117|118|119|(7:121|122|123|124|125|(1:127)(4:130|(4:133|(3:135|136|137)(1:139)|138|131)|140|141)|128)(8:144|(4:147|(3:149|150|151)(1:153)|152|145)|154|123|124|125|(0)(0)|128))|157|117|118|119|(0)(0))|159|101|102|103|(8:105|107|(0)|116|117|118|119|(0)(0))|157|117|118|119|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0182 A[Catch: Exception -> 0x0196, all -> 0x01fd, TryCatch #2 {Exception -> 0x0196, blocks: (B:103:0x016b, B:105:0x0171, B:107:0x0177, B:109:0x0182, B:111:0x018c, B:113:0x0193), top: B:102:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d5 A[Catch: Exception -> 0x01f9, all -> 0x01fd, TryCatch #0 {Exception -> 0x01f9, blocks: (B:125:0x01ca, B:130:0x01d5, B:131:0x01de, B:133:0x01e4, B:136:0x01f0), top: B:124:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6 A[Catch: Exception -> 0x01c5, all -> 0x01fd, TryCatch #4 {Exception -> 0x01c5, blocks: (B:119:0x019b, B:144:0x01a6, B:145:0x01af, B:147:0x01b5, B:150:0x01c1), top: B:118:0x019b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJIILL(org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64009PAf.LJIILL(org.json.JSONObject):void");
    }

    public static void LJ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJIIZILJ(int i, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                LJIILL(jSONObject);
                SharedPreferences.Editor edit = LJI().edit();
                long currentTimeMillis = System.currentTimeMillis();
                edit.putLong("monitor_configure_refresh_time", currentTimeMillis);
                edit.putInt("monitor_config_update", 1);
                edit.putLong("monitor_last_calculate_timestamp", currentTimeMillis);
                edit.putString("monitor_net_config", jSONObject.toString());
                edit.apply();
                if (!this.LJIJI) {
                    this.LJIJI = true;
                    this.LJIJJ.LIZIZ(this);
                    return;
                }
                return;
            } catch (Throwable th) {
                PAU.LIZIZ("updateToSP", th);
                return;
            }
        }
        if (i == 1) {
            SharedPreferences.Editor edit2 = LJI().edit();
            edit2.putLong("monitor_configure_refresh_time", System.currentTimeMillis());
            edit2.putInt("monitor_config_update", 1);
            edit2.apply();
        }
    }

    public static void LIZLLL(StringBuilder sb, String str, String str2) {
        if (sb.charAt(sb.length() - 1) != '?') {
            sb.append("&");
        }
        try {
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append('=');
            try {
                sb.append(URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static boolean LJIIIIZZ(String str, List list, List list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C1E2.LIZ(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (str.contains((String) it.next())) {
                    return true;
                }
            }
        }
        try {
            String path = new java.net.URI(str).getPath();
            if (!C1E2.LIZ(list2)) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((Pattern) it2.next()).matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void LJIIJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            if (!this.LJIJI) {
                this.LJIJJ.LIZLLL(new C64014PAk(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis()));
            } else {
                C48661J7x.LIZ.LIZIZ(new RunnableC64015PAl(this, str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJIILIIL(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (!this.LJIJI) {
                this.LJIJJ.LIZLLL(new C64014PAk(str, i, jSONObject, null, null, jSONObject2, System.currentTimeMillis()));
            } else {
                C48661J7x.LIZ.LIZIZ(new RunnableC64015PAl(this, str, i, jSONObject, null, null, jSONObject2, System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJIIIZ(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        try {
            if (!this.LJIJI) {
                this.LJIJJ.LIZJ(new C64013PAj(j, j2, str, str2, str3, i, jSONObject));
            } else {
                C48661J7x.LIZ.LIZIZ(new ARunnableS0S3201200_11(this, j, j2, str, str2, str3, i, jSONObject, 1));
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJIIJJI(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        try {
            if (!this.LJIJI) {
                this.LJIJJ.LIZJ(new C64013PAj(j, j2, str, str2, str3, i, jSONObject));
            } else {
                C48661J7x.LIZ.LIZIZ(new ARunnableS0S3201200_11(this, j, j2, str, str2, str3, i, jSONObject, 0));
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJIIL(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j) {
        String str2;
        if (jSONObject4 == null) {
            try {
                jSONObject4 = new JSONObject();
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObject4.put("log_type", "service_monitor");
        jSONObject4.put("service", str);
        jSONObject4.put("status", i);
        jSONObject4.put("network_type", C48189Ivh.LJ(this.LIZ).getValue());
        jSONObject4.put("value", jSONObject);
        if (jSONObject2 != null) {
            jSONObject4.put("category", jSONObject2);
        }
        if (jSONObject3 != null) {
            jSONObject4.put("metric", jSONObject3);
        }
        if (jSONObject4.isNull("timestamp")) {
            jSONObject4.put("timestamp", j);
        }
        InterfaceC64016PAm interfaceC64016PAm = this.LJIILJJIL;
        String str3 = null;
        if (interfaceC64016PAm != null) {
            str2 = interfaceC64016PAm.getSessionId();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            InterfaceC64016PAm interfaceC64016PAm2 = this.LJIILJJIL;
            if (interfaceC64016PAm2 != null) {
                str3 = interfaceC64016PAm2.getSessionId();
            }
            jSONObject4.put("session_id", str3);
        }
        if (this.LJI != null && !TextUtils.isEmpty(str) && this.LJI.opt(str) != null) {
            LIZJ(jSONObject4);
            PAX.LIZ.LIZIZ(jSONObject4, CastLongProtector.parseLong(this.LJIJJLI));
        }
    }

    public final JSONObject LJIILJJIL(int i, String str, long j, String str2, String str3, long j2, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", str);
            jSONObject.put("duration", j);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", UriProtector.parse(str2));
            }
            if (j2 > 0) {
                jSONObject.put("timestamp", j2);
            }
            jSONObject.put("status", i);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(C63832P3k.LIZ, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("trace_code", str4);
            } else {
                jSONObject.put("trace_code", "");
            }
            jSONObject.put("network_type", C48189Ivh.LJ(this.LIZ).getValue());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
