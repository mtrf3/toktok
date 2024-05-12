package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Pas, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64734Pas implements InterfaceC64671PZr, WeakHandler.IHandler, EZV, InterfaceC64780Pbc, InterfaceC64700PaK, InterfaceC64699PaJ, InterfaceC48397Iz3, InterfaceC64666PZm, InterfaceC64702PaM, InterfaceC64783Pbf, OCD {
    public static C64734Pas LLIFFJFJJ = null;
    public static String LLII = null;
    public static int LLIIII = -1;
    public static int LLIIIILZ = -1;
    public static boolean LLIIIJ;
    public static boolean LLIIIL;
    public static final ArrayList<String> LLIIIZ;
    public static boolean LLIIJI;
    public final boolean LJLIL;
    public final Context LJLJJL;
    public volatile int LLD;
    public JSONObject LLFF;
    public String LLFFF;
    public final AtomicLong LJLILLLLZI = new AtomicLong(0);
    public final AtomicBoolean LJLJI = new AtomicBoolean(false);
    public final Object LJLJJI = new Object();
    public volatile boolean LJLJJLL = false;
    public String LJLJL = "";
    public volatile int LJLJLJ = -1;
    public long LJLJLLL = 0;
    public final AtomicBoolean LJLL = new AtomicBoolean(false);
    public int LJLLI = 0;
    public int LJLLILLLL = 0;
    public int LJLLJ = 0;
    public int LJLLL = 1;
    public int LJLLLL = 1;
    public int LJLLLLLL = 1;
    public int LJLZ = 1;
    public int LJZ = 1;
    public String LJZI = "";
    public final List<String> LJZL = new CopyOnWriteArrayList();
    public final List<String> LL = new CopyOnWriteArrayList();
    public String LLF = "";
    public final AtomicInteger LLFII = new AtomicInteger(10800);
    public final List<String> LLFZ = new CopyOnWriteArrayList();
    public final WeakHandler LLI = new WeakHandler(C16880lQ.LLJJJJ(), this);

    public final synchronized void LJIILLIIL() {
        if (System.currentTimeMillis() - this.LJLILLLLZI.get() > this.LLFII.get() * 1000) {
            this.LJLILLLLZI.set(System.currentTimeMillis());
            try {
                int LJI = TTNetInit.getTTNetDepend().LJI(this.LJLJJL, 0, "disable_framed_transport");
                if (LJI > 0) {
                    try {
                        if (PX1.LIZJ == 0) {
                            PX1.LIZJ = LJI;
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (C64728Pam.LJFF().LJIIL != null) {
                    C64728Pam.LJFF().LJIIL.LIZJ(this.LJLILLLLZI.get());
                }
            } catch (Exception unused2) {
            }
        }
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        LLIIIZ = arrayList;
        LLIIJI = false;
        C19U.LIZLLL(arrayList, "MI PAD 2", "YT3-X90L", "YT3-X90F", "GT-810");
    }

    @Override // X.EZV
    public final boolean LIZIZ() {
        if (this.LJLLJ > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC64700PaK
    public final boolean LIZJ() {
        if (this.LJLLI > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC64780Pbc
    public final boolean LJ() {
        if (LLIIIJ && this.LJLL.compareAndSet(false, true)) {
            SharedPreferences LIZIZ = F9J.LIZIZ(this.LJLJJL, 0, "ss_app_config");
            if (this.LJLJLJ < 0) {
                this.LJLJLJ = LIZIZ.getInt("chromium_boot_failures", 0);
            }
            this.LJLJLLL = LIZIZ.getLong("chromium_boot_failures_timestamp", 0L);
            if (this.LJLJLJ > 5 && System.currentTimeMillis() - this.LJLJLLL > TimeUnit.HOURS.toMillis(1L)) {
                this.LJLJLJ = 5;
            }
        }
        if (LLIIIL) {
            C64667PZn.LIZIZ = 0;
            return false;
        }
        if (LLIIJI) {
            C64667PZn.LIZIZ = 8;
            return false;
        }
        if (this.LJLJLJ > 5) {
            C64667PZn.LIZIZ = 3;
            return false;
        }
        TTNetInit.getTTNetDepend().LIZIZ();
        return true;
    }

    @Override // X.EZV
    public final boolean LJFF() {
        if (this.LJLLILLLL > 0) {
            return true;
        }
        return false;
    }

    @Override // X.EZV
    public final boolean LJII() {
        if (this.LJLLL > 0) {
            return true;
        }
        return false;
    }

    public final List<String> LJIIJ() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) this.LJZL).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0286 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ() {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64734Pas.LJIIZILJ():void");
    }

    public static String[] LJIIIIZZ() {
        String[] LJFF = TTNetInit.getTTNetDepend().LJFF();
        if (LJFF == null || LJFF.length <= 0) {
            return new String[0];
        }
        return LJFF;
    }

    @Override // X.InterfaceC64699PaJ
    public final boolean isCronetBootFailureExpected() {
        Logger.debug();
        SharedPreferences LIZIZ = F9J.LIZIZ(this.LJLJJL, 0, "ss_app_config");
        if (!LLIIIJ) {
            if (this.LJLJLJ < 0) {
                this.LJLJLJ = LIZIZ.getInt("chromium_boot_failures", 0);
            }
            this.LJLJLLL = LIZIZ.getLong("chromium_boot_failures_timestamp", 0L);
            if (this.LJLJLJ > 5 && System.currentTimeMillis() - this.LJLJLLL > TimeUnit.HOURS.toMillis(1L)) {
                this.LJLJLJ = 5;
            }
        }
        if (!LJ()) {
            return false;
        }
        SharedPreferences.Editor edit = LIZIZ.edit();
        edit.putInt("chromium_boot_failures", this.LJLJLJ + 1);
        edit.putLong("chromium_boot_failures_timestamp", System.currentTimeMillis());
        Logger.debug();
        WX6.LIZ(edit);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("chromium_boot_failures", Integer.valueOf(this.LJLJLJ + 1));
        TTNetInit.getTTNetDepend().LJ(this.LJLJJL, linkedHashMap);
        return true;
    }

    @Override // X.InterfaceC48397Iz3
    public final void LIZ() {
        Logger.debug();
    }

    public static C64734Pas LJIIIZ(Context context) {
        C64734Pas c64734Pas;
        synchronized (C64734Pas.class) {
            if (LLIFFJFJJ == null) {
                boolean LIZJ = C36841Ed3.LIZJ(context);
                LLIFFJFJJ = new C64734Pas(C16880lQ.LLLLL(context), LIZJ);
                if (LLIIIZ.contains(Build.MODEL)) {
                    LLIIJI = true;
                }
                LLII = context.getPackageName();
                if (LIZJ) {
                    C64734Pas c64734Pas2 = LLIFFJFJJ;
                    EZU.LIZ = c64734Pas2;
                    C64693PaD.LJIIIIZZ = c64734Pas2;
                    C64693PaD.LJII = LLIFFJFJJ;
                    C64693PaD.LJIIIZ = LLIFFJFJJ;
                    C64752PbA.LIZ = LLIFFJFJJ;
                    C48395Iz1 c48395Iz1 = C48398Iz4.LIZ;
                    C64734Pas c64734Pas3 = LLIFFJFJJ;
                    if (c64734Pas3 != null) {
                        c48395Iz1.LJ.add(c64734Pas3);
                    }
                    c48395Iz1.LIZJ.get();
                    C64735Pat.LIZJ = LLIFFJFJJ;
                    C64735Pat.LIZLLL = LLIFFJFJJ;
                    if (C64735Pat.LJIIL == null) {
                        C64735Pat.LJIIL = LLIFFJFJJ;
                    }
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                    try {
                        C16880lQ.LJJLIIIJILLIZJL(new C64742Pb0(), context, intentFilter);
                    } catch (Throwable unused) {
                    }
                    C64737Pav LJIIIZ = C64737Pav.LJIIIZ();
                    EZU.LIZ = LJIIIZ;
                    C64693PaD.LJIIIIZZ = LJIIIZ;
                    C64693PaD.LJII = LJIIIZ;
                    C64752PbA.LIZ = LJIIIZ;
                    if (C64735Pat.LJIIL == null) {
                        C64735Pat.LJIIL = LJIIIZ;
                    }
                }
                C64735Pat.LJIIJJI = LLIFFJFJJ;
                C64747Pb5.LIZ(context);
            }
            c64734Pas = LLIFFJFJJ;
        }
        return c64734Pas;
    }

    @Override // X.OCD
    public final List<String> LIZLLL(String str) {
        if (V1M.LJJIIZ(str, this.LJZL)) {
            return this.LJZL;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:5|6)|(5:8|9|10|11|12)|15|9|10|11|12) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r11) {
        /*
            r10 = this;
            r5 = r11
            boolean r0 = X.C38354F3m.LJ(r5)
            if (r0 == 0) goto L8
            return
        L8:
            r4 = r10
            X.Pb6 r6 = X.EnumC64748Pb6.TTCRONET     // Catch: java.lang.Exception -> L19
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L19
            r9 = 0
            boolean r0 = r4.LJIIL(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L1d
            r3 = 101(0x65, float:1.42E-43)
            goto L1f
        L19:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L1d:
            r3 = 102(0x66, float:1.43E-43)
        L1f:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "from"
            java.lang.String r0 = "cronet"
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L32
            X.Paz r0 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch: java.lang.Throwable -> L32
            r0.LIZJ()     // Catch: java.lang.Throwable -> L32
        L32:
            com.bytedance.common.utility.collection.WeakHandler r0 = r4.LLI
            r0.sendEmptyMessage(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64734Pas.LJIIJJI(java.lang.String):void");
    }

    public final void LJIILJJIL(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            jSONObject = null;
        } else {
            String[] split = str.split(",");
            JSONArray jSONArray = new JSONArray();
            for (String str2 : split) {
                jSONArray.put(str2);
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put("hit", jSONArray);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.LLFF = jSONObject;
    }

    public final boolean LJIILL(String str) {
        java.net.URI LIZJ;
        if (C38354F3m.LJ(str) || this.LJLLLLLL <= 0) {
            return false;
        }
        try {
            LIZJ = EZY.LIZJ(str);
        } catch (Throwable unused) {
        }
        if (LIZJ == null) {
            return false;
        }
        String host = LIZJ.getHost();
        if (C38354F3m.LJ(host)) {
            return false;
        }
        if (!host.endsWith(C17N.LJIL())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        switch (message.what) {
            case 101:
                this.LJLILLLLZI.set(System.currentTimeMillis());
                Logger.debug();
                this.LJLJI.set(false);
                return;
            case 102:
                Logger.debug();
                this.LJLJI.set(false);
                return;
            case 103:
                Logger.debug();
                LJIJ(EnumC64748Pb6.TTPOLL, false);
                return;
            case 104:
                Logger.debug();
                LJIJ(EnumC64748Pb6.TTSERVER, false);
                return;
            default:
                return;
        }
    }

    public C64734Pas(Context context, boolean z) {
        this.LJLJJL = context;
        this.LJLIL = z;
    }

    public final void LJIILIIL(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("return", str);
            jSONObject.put("CurrentShareCookieHostList", this.LJZL.toString());
        } catch (JSONException unused) {
        }
        InterfaceC64741Paz tTNetDepend = TTNetInit.getTTNetDepend();
        TTNetInit.getTTNetDepend().getContext();
        tTNetDepend.LIZLLL();
    }

    public final void LJIJ(EnumC64748Pb6 enumC64748Pb6, boolean z) {
        if (this.LJLIL) {
            Logger.debug();
            if (!this.LJLJI.compareAndSet(false, true)) {
                Logger.debug();
                return;
            } else {
                new C64729Pan(this, enumC64748Pb6, z).LIZ();
                return;
            }
        }
        if (this.LJLILLLLZI.get() > 0) {
            return;
        }
        try {
            new C64769PbR(this).LIZ();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<java.lang.String>] */
    @Override // X.OCD
    public final List<String> LJI(CookieManager cookieManager, OCG ocg, java.net.URI uri) {
        String str;
        String cookie;
        if (uri == null) {
            return null;
        }
        if (cookieManager == null && ocg == null) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        if (C38354F3m.LJ(str) || !V1M.LJJIIZ(str, this.LJZL)) {
            return null;
        }
        TTNetInit.getTTNetDepend().LJIIJ();
        if (C38354F3m.LJ("")) {
            return null;
        }
        ?? arrayList = new ArrayList();
        if (cookieManager != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(uri.getScheme());
            LIZ.append("://");
            TTNetInit.getTTNetDepend().LJIIJ();
            LIZ.append("");
            String LIZIZ = X1D.LIZIZ(LIZ);
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{LIZIZ}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "3265171754147427450"));
            if (LIZJ.LIZ) {
                cookie = (String) LIZJ.LIZIZ;
            } else {
                cookie = cookieManager.getCookie(LIZIZ);
            }
            if (!C38354F3m.LJ(cookie)) {
                arrayList.add(cookie);
                return arrayList;
            }
        }
        if (!C32151Nz.LJJIIJZLJL(arrayList) || ocg == null) {
            return arrayList;
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(uri.getScheme());
            LIZ2.append("://");
            TTNetInit.getTTNetDepend().LJIIJ();
            LIZ2.append("");
            java.util.Map<String, List<String>> map = ocg.get(java.net.URI.create(X1D.LIZIZ(LIZ2)), new LinkedHashMap());
            if (map == null || map.isEmpty()) {
                return arrayList;
            }
            arrayList = map.get("Cookie");
            return arrayList;
        } catch (Throwable unused2) {
            return arrayList;
        }
    }

    public final boolean LJIIL(Object obj, EnumC64748Pb6 enumC64748Pb6, long j, boolean z) {
        JSONObject jSONObject;
        boolean z2;
        boolean z3;
        String str;
        int i;
        String string;
        boolean z4;
        JSONObject jSONObject2 = new JSONObject();
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (C38354F3m.LJ(str2)) {
                LJIILIIL("empty response.", jSONObject2);
                return false;
            }
            jSONObject = new JSONObject(str2);
        } else if (!(obj instanceof JSONObject) || (jSONObject = (JSONObject) obj) == null) {
            LJIILIIL("object is null.", jSONObject2);
            return false;
        }
        this.LLFFF = jSONObject.optString("summary");
        JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
        LLIIII = jSONObject3.optInt("use_http_dns", -1);
        LLIIIILZ = jSONObject3.optInt("collect_recent_page_info_enable", -1);
        int optInt = jSONObject3.optInt("ok_http_open", 0);
        int optInt2 = jSONObject3.optInt("ok_http3_open", 0);
        int optInt3 = jSONObject3.optInt("cronet_version", 0);
        int optInt4 = jSONObject3.optInt("http_dns_enabled", 0);
        int optInt5 = jSONObject3.optInt("detect_open", 0);
        int optInt6 = jSONObject3.optInt("detect_native_page", 1);
        int optInt7 = jSONObject3.optInt("collect_recent_page_info_enable", 1);
        int optInt8 = jSONObject3.optInt("add_ss_queries_open", 0);
        int optInt9 = jSONObject3.optInt("add_ss_queries_header_open", 0);
        int optInt10 = jSONObject3.optInt("add_ss_queries_plaintext_open", 1);
        int optInt11 = jSONObject3.optInt("add_device_fingerprint_open", 1);
        int optInt12 = jSONObject3.optInt("image_ttnet_enabled", 1);
        int optInt13 = jSONObject3.optInt("sample_band_width_enabled", 1);
        int optInt14 = jSONObject3.optInt("cdn_sample_band_width_enabled", 1);
        int optInt15 = jSONObject3.optInt("dynamic_adjust_threadpool_size_open", 1);
        int optInt16 = jSONObject3.optInt("http_show_hijack", 1);
        int optInt17 = jSONObject3.optInt("http_verify_sign", 1);
        int optInt18 = jSONObject3.optInt("tnc_update_interval", -1);
        if (optInt18 > 0) {
            this.LLFII.set(optInt18);
        }
        boolean z5 = true;
        int optInt19 = jSONObject3.optInt("private_protocol_enabled", 1);
        if (optInt19 < 1) {
            z5 = false;
        }
        C64735Pat.LJIIZILJ = z5;
        JSONArray optJSONArray = jSONObject3.optJSONArray("send_tnc_host_arrays");
        if (optJSONArray != null) {
            ((CopyOnWriteArrayList) this.LLFZ).clear();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                if (!TextUtils.isEmpty(optJSONArray.optString(i2))) {
                    ((CopyOnWriteArrayList) this.LLFZ).add(optJSONArray.optString(i2));
                }
            }
        }
        int optInt20 = jSONObject3.optInt("crash_limit_times", 0);
        int optInt21 = jSONObject3.optInt("crash_detect_interval_ms", 5000);
        int optInt22 = jSONObject3.optInt("new_cookie_saver_enabled", 0);
        boolean z6 = true;
        if (optInt22 < 1) {
            z6 = false;
        }
        C64735Pat.LJIJ = z6;
        synchronized (this) {
            this.LJLLI = optInt4;
            this.LJLLILLLL = optInt8;
            this.LJLLJ = optInt9;
            this.LJLLL = optInt10;
            this.LJZ = optInt15;
            this.LJLLLL = optInt12;
            this.LJLLLLLL = optInt13;
            this.LJLZ = optInt14;
        }
        if (optInt15 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C64831PcR.LIZLLL(z2);
        if (jSONObject3.optInt("enable_req_ticket", 1) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C64759PbH.LIZIZ = z3;
        int optInt23 = jSONObject3.optInt("ttnet_response_verify_enabled", -1);
        JSONArray optJSONArray2 = jSONObject3.optJSONArray("ttnet_response_verify");
        if (optJSONArray2 != null) {
            str = optJSONArray2.toString();
        } else {
            str = "";
        }
        C48870JFy.LIZIZ(optJSONArray2, optInt23);
        C64774PbW c64774PbW = new C64774PbW();
        c64774PbW.LIZ = optInt23;
        c64774PbW.LIZIZ = str;
        if (this.LJLLILLLL > 0 || this.LJLLJ > 0) {
            SsInterceptor.LJLIL = true;
        }
        C64718Pac.LIZ = jSONObject3.optInt("read_response_buff_init_size", 0);
        C64718Pac.LIZIZ = jSONObject3.optInt("read_response_buff_increase_size", 0);
        C64693PaD.LJI = jSONObject3.optInt("cronet_inputstream_buff_size", 0);
        String optString = jSONObject3.optString("frontier_urls", "");
        String optString2 = jSONObject3.optString("share_cookie_host_list", "");
        TTNetInit.getTTNetDepend().LJII(optString2);
        String optString3 = jSONObject3.optString("api_http_host_list", "");
        String optString4 = jSONObject3.optString("concurrent_request_config", "");
        C64694PaE.LIZJ().LJ(optString4);
        String optString5 = jSONObject3.optString("add_common_params", "");
        C64789Pbl.LIZ().getClass();
        String optString6 = jSONObject3.optString("L0_params", "");
        C38092ExE.LIZLLL().LJIIIIZZ(optString6);
        int optInt24 = jSONObject3.optInt("query_filter_enabled", LiveLayoutPreloadThreadPriority.DEFAULT);
        String optString7 = jSONObject3.optString("query_filter_actions");
        if (optInt24 != Integer.MIN_VALUE) {
            C38092ExE LIZLLL = C38092ExE.LIZLLL();
            if (optInt24 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            LIZLLL.LIZIZ = z4;
            C38092ExE.LIZLLL().LJ(optString7);
        } else {
            optInt24 = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        this.LLD = jSONObject3.optInt("disable_encrypt_switch", 0);
        this.LJZI = jSONObject3.optString("cronet_so_path", "");
        if (this.LLD == 2) {
            i = 0;
            SharedPreferences.Editor edit = F9J.LIZIZ(this.LJLJJL, 0, "app_log_encrypt_switch_count").edit();
            edit.putInt("app_log_encrypt_faild_count", 0);
            WX6.LIZ(edit);
        } else {
            i = 0;
        }
        int optInt25 = jSONObject3.optInt("disable_framed_transport", i);
        if (optInt25 > 0) {
            try {
                if (PX1.LIZJ == 0) {
                    PX1.LIZJ = optInt25;
                }
            } catch (Throwable unused) {
            }
        }
        synchronized (this) {
            SharedPreferences LIZIZ = F9J.LIZIZ(this.LJLJJL, 0, "ss_app_config");
            string = LIZIZ.getString("share_cookie_host_list", "");
            SharedPreferences.Editor edit2 = LIZIZ.edit();
            edit2.putString("ttnet_response_verify", c64774PbW.LIZIZ);
            edit2.putInt("ttnet_response_verify_enabled", c64774PbW.LIZ);
            edit2.putInt("read_response_buff_init_size", C64718Pac.LIZ);
            edit2.putInt("read_response_buff_increase_size", C64718Pac.LIZIZ);
            edit2.putInt("cronet_inputstream_buff_size", C64693PaD.LJI);
            edit2.putInt("ok_http_open", optInt);
            edit2.putInt("ok_http3_open", optInt2);
            edit2.putInt("cronet_version", optInt3);
            edit2.putInt("http_dns_enabled", optInt4);
            edit2.putInt("detect_open", optInt5);
            edit2.putInt("detect_native_page", optInt6);
            edit2.putInt("collect_recent_page_info_enable", optInt7);
            edit2.putInt("add_ss_queries_open", optInt8);
            edit2.putInt("add_ss_queries_header_open", optInt9);
            edit2.putInt("add_ss_queries_plaintext_open", optInt10);
            edit2.putInt("add_device_fingerprint_open", optInt11);
            edit2.putInt("dynamic_adjust_threadpool_size_open", optInt15);
            edit2.putInt("image_ttnet_enabled", optInt12);
            edit2.putInt("use_http_dns", LLIIII);
            edit2.putInt("use_http_dns_refetch_on_expire", LLIIIILZ);
            edit2.putInt("http_show_hijack", optInt16);
            edit2.putInt("http_verify_sign", optInt17);
            edit2.putInt("crash_limit_times", optInt20);
            edit2.putInt("crash_detect_interval_ms", optInt21);
            edit2.putString("frontier_urls", optString);
            edit2.putString("cronet_so_path", this.LJZI);
            edit2.putString("share_cookie_host_list", optString2);
            jSONObject2.put("oldShareCookieHosts", string);
            jSONObject2.put("newShareCookieHosts", optString2);
            if (!TextUtils.isEmpty(optString2)) {
                ((CopyOnWriteArrayList) this.LJZL).clear();
                V1M.LJJIZ(optString2, this.LJZL);
            }
            TTNetInit.getTTNetDepend().LJIIJ();
            if (!C38354F3m.LJ("") && !V1M.LJJIIZ("", this.LJZL)) {
                ((CopyOnWriteArrayList) this.LJZL).add("");
            }
            edit2.putString("api_http_host_list", optString3);
            edit2.putString("concurrent_request_config", optString4);
            edit2.putString("add_common_params", optString5);
            edit2.putString("query_filter_actions", optString7);
            edit2.putString("L0_params", optString6);
            edit2.putInt("query_filter_enabled", optInt24);
            for (String str3 : optString3.split(",")) {
                if (!C38354F3m.LJ(str3) && !V1M.LJJIIZ(str3, this.LL)) {
                    ((CopyOnWriteArrayList) this.LL).add(str3.trim());
                }
            }
            edit2.putInt("android_log_encrypt_switch", this.LLD);
            edit2.putInt("image_ttnet_enabled", this.LJLLLL);
            edit2.putInt("sample_band_width_enabled", this.LJLLLLLL);
            edit2.putInt("cdn_sample_band_width_enabled", this.LJLZ);
            edit2.putInt("disable_framed_transport", optInt25);
            edit2.putInt("tnc_update_interval", this.LLFII.get());
            edit2.putInt("private_protocol_enabled", optInt19);
            edit2.putInt("new_cookie_saver_enabled", optInt22);
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < ((CopyOnWriteArrayList) this.LLFZ).size(); i3++) {
                sb.append((String) ((CopyOnWriteArrayList) this.LLFZ).get(i3));
                if (i3 != ((CopyOnWriteArrayList) this.LLFZ).size()) {
                    sb.append(',');
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                edit2.putString("send_tnc_host_arrays", sb2);
            }
            if (!TextUtils.isEmpty(this.LLFFF)) {
                edit2.putString("tnc_summary", this.LLFFF);
            }
            WX6.LIZ(edit2);
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!C38354F3m.LJ(optString) && !optString.equals(this.LJLJL)) {
                    this.LJLJL = optString;
                    linkedHashMap.put("frontier_urls", optString);
                }
                linkedHashMap.put("http_dns_enabled", Integer.valueOf(optInt4));
                linkedHashMap.put("add_ss_queries_open", Integer.valueOf(optInt8));
                linkedHashMap.put("add_ss_queries_header_open", Integer.valueOf(optInt9));
                linkedHashMap.put("add_ss_queries_plaintext_open", Integer.valueOf(optInt10));
                linkedHashMap.put("share_cookie_host_list", optString2);
                linkedHashMap.put("disable_framed_transport", Integer.valueOf(optInt25));
                linkedHashMap.put("query_filter_actions", optString7);
                linkedHashMap.put("L0_params", optString6);
                linkedHashMap.put("query_filter_enabled", Integer.valueOf(optInt24));
                linkedHashMap.put("private_protocol_enabled", Integer.valueOf(optInt19));
                linkedHashMap.put("new_cookie_saver_enabled", Integer.valueOf(optInt22));
                TTNetInit.getTTNetDepend().LJ(this.LJLJJL, linkedHashMap);
                Intent intent = new Intent("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                if (!TextUtils.isEmpty(LLII)) {
                    intent.setPackage(LLII);
                }
                this.LJLJJL.sendBroadcast(intent);
            } catch (Throwable unused2) {
            }
        }
        if (!C38354F3m.LJ(optString2)) {
            C48302IxW LIZ = C48302IxW.LIZ();
            LIZ.getClass();
            if (!optString2.equals(string)) {
                new C61698OJi(LIZ, string, optString2).LIZ();
            }
        }
        if (C64747Pb5.LJFF != null) {
            C64747Pb5 c64747Pb5 = C64747Pb5.LJFF;
            c64747Pb5.getClass();
            try {
                if (jSONObject3.length() > 0) {
                    int optInt26 = jSONObject3.optInt("image_opt_switch", 0);
                    long optLong = jSONObject3.optLong("image_opt_black_interval", 0L);
                    int optInt27 = jSONObject3.optInt("image_opt_failed_times", 0);
                    int optInt28 = jSONObject3.optInt("image_opt_limit_count", 0);
                    if (C64747Pb5.LJII == null) {
                        C64747Pb5.LJII = F9J.LIZIZ(c64747Pb5.LIZ, 0, "image_opt_table");
                    }
                    SharedPreferences.Editor edit3 = C64747Pb5.LJII.edit();
                    if (optInt26 != c64747Pb5.LIZIZ) {
                        edit3.putInt("image_opt_switch", optInt26);
                    }
                    if (optLong != c64747Pb5.LIZJ) {
                        edit3.putLong("image_opt_black_interval", optLong);
                    }
                    if (optInt27 != c64747Pb5.LIZLLL) {
                        edit3.putInt("image_opt_failed_times", optInt27);
                    }
                    if (optInt28 != c64747Pb5.LJ) {
                        edit3.putInt("image_opt_limit_count", optInt28);
                    }
                    edit3.apply();
                    c64747Pb5.LIZIZ = optInt26;
                    c64747Pb5.LIZJ = optLong;
                    c64747Pb5.LIZLLL = optInt27;
                    c64747Pb5.LJ = optInt28;
                }
            } catch (Throwable unused3) {
            }
        }
        if (C64728Pam.LJFF().LJIIL != null) {
            C64728Pam.LJFF().LJIIL.LIZ(jSONObject3, enumC64748Pb6, this.LLF, j);
            if (z) {
                C64704PaO.LJFF().LJII();
            }
        }
        LJIILIIL("return true", jSONObject2);
        return true;
    }
}
