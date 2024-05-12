package X;

import Y.IDHandlerS23S0100000_11;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import ee1.l;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Pam, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64728Pam implements InterfaceC64615PXn {
    public static C64728Pam LJJI;
    public static String LJJIFFI;
    public long LIZ;
    public volatile long LIZIZ;
    public volatile long LIZJ;
    public volatile long LJ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public volatile long LJIIIZ;
    public boolean LJIIJ;
    public Context LJIIJJI;
    public C64733Par LJIIL;
    public volatile int LJIILIIL;
    public volatile long LJIILJJIL;
    public volatile long LJIILL;
    public int LJIILLIIL;
    public EnumC64748Pb6 LIZLLL = EnumC64748Pb6.TTCACHE;
    public final HashMap<String, Integer> LJIIZILJ = new HashMap<>();
    public final HashMap<String, Integer> LJIJ = new HashMap<>();
    public int LJIJI = 0;
    public final HashMap<String, Integer> LJIJJ = new HashMap<>();
    public final HashMap<String, Integer> LJIJJLI = new HashMap<>();
    public boolean LJIL = true;
    public final IDHandlerS23S0100000_11 LJJ = new IDHandlerS23S0100000_11(this, C16880lQ.LLJJJJ(), 4);

    public static synchronized C64728Pam LJFF() {
        C64728Pam c64728Pam;
        synchronized (C64728Pam.class) {
            if (LJJI == null) {
                LJJI = new C64728Pam();
            }
            c64728Pam = LJJI;
        }
        return c64728Pam;
    }

    @Override // X.InterfaceC64615PXn
    public final JSONObject LIZJ() {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("update_time", this.LJ);
            jSONObject2.put("source", this.LIZLLL.mValue);
            int i2 = 1;
            if (this.LJFF) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("cold_start", i);
            if (!this.LJI) {
                i2 = 0;
            }
            jSONObject2.put("config_updated", i2);
            if (!TextUtils.isEmpty(this.LJII)) {
                jSONObject2.put("config", this.LJII);
            }
            if (!TextUtils.isEmpty(this.LJIIIIZZ)) {
                jSONObject2.put("canary", this.LJIIIIZZ);
            }
            jSONObject2.put("local_probe_version", this.LJIILL);
            String str = C64734Pas.LJIIIZ(this.LJIIJJI).LLFFF;
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("rules", str);
            }
            C64733Par c64733Par = this.LJIIL;
            if (c64733Par != null) {
                c64733Par.getClass();
                if (!TextUtils.isEmpty("")) {
                    this.LJIIL.getClass();
                    if (!TextUtils.isEmpty("")) {
                        this.LJIIL.getClass();
                        jSONObject2.put("region", "");
                        this.LJIIL.getClass();
                        jSONObject2.put("region_source", "");
                    }
                }
            }
            jSONObject.put("data", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("version", this.LJIILJJIL);
            jSONObject3.put("cmd", this.LJIILIIL);
            jSONObject3.put("send_time", this.LIZIZ);
            jSONObject3.put("get_time", this.LIZJ);
            jSONObject.put("probe", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("probe_version", this.LJIILL);
            jSONObject4.put("source", this.LIZLLL.mValue);
            jSONObject4.put("start_time", this.LJIIIZ);
            jSONObject.put("request", jSONObject4);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final void LJIIIIZZ() {
        Logger.debug();
        this.LJIILLIIL = 0;
        this.LJIIZILJ.clear();
        this.LJIJ.clear();
        this.LJIJI = 0;
        this.LJIJJ.clear();
        this.LJIJJLI.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C64598PWw r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L3
            return
        L3:
            boolean r0 = r11.LJIL
            if (r0 != 0) goto L8
            return
        L8:
            java.lang.String r1 = "tt-idc-switch"
            r0 = 0
            java.lang.String r1 = r12.LIZ(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L19
            com.bytedance.common.utility.Logger.debug()
            return
        L19:
            java.lang.String r0 = "@"
            java.lang.String[] r3 = r1.split(r0)
            if (r3 == 0) goto L25
            int r1 = r3.length
            r0 = 2
            if (r1 == r0) goto L29
        L25:
            com.bytedance.common.utility.Logger.debug()
            return
        L29:
            r10 = 0
            r6 = 1
            r1 = 0
            r0 = r3[r10]     // Catch: java.lang.Throwable -> L3a
            int r9 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> L3a
            r0 = r3[r6]     // Catch: java.lang.Throwable -> L3b
            long r3 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L3b
            goto L40
        L3a:
            r9 = 0
        L3b:
            com.bytedance.common.utility.Logger.debug()
            r3 = 0
        L40:
            com.bytedance.common.utility.Logger.debug()
            long r7 = r11.LJIILJJIL
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L4a
            return
        L4a:
            r11.LJIILIIL = r9
            r11.LJIILJJIL = r3
            long r7 = java.lang.System.currentTimeMillis()
            r11.LIZJ = r7
            android.content.Context r5 = r11.LJIIJJI
            java.lang.String r0 = "ttnet_tnc_config"
            android.content.SharedPreferences r0 = X.F9J.LIZIZ(r5, r10, r0)
            android.content.SharedPreferences$Editor r5 = r0.edit()
            java.lang.String r0 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r0, r9)
            java.lang.String r0 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r0 = r5.putLong(r0, r3)
            r0.apply()
            int r3 = r11.LJIILIIL
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r3 != r0) goto L9b
            X.Par r0 = r11.LJIIL
            if (r0 == 0) goto L7d
            X.Paq r0 = r0.LIZIZ
            if (r0 != 0) goto L7e
        L7d:
            return
        L7e:
            java.util.Random r5 = new java.util.Random
            long r3 = java.lang.System.currentTimeMillis()
            r5.<init>(r3)
            int r0 = r0.LJIIJ
            if (r0 <= 0) goto L93
            int r0 = r5.nextInt(r0)
            long r3 = (long) r0
            r1 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
        L93:
            com.bytedance.common.utility.Logger.debug()
            X.Pb6 r0 = X.EnumC64748Pb6.TTTNC
            r11.LJIIIZ(r6, r1, r0)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64728Pam.LJI(X.PWw):void");
    }

    @Override // X.InterfaceC64615PXn
    public final synchronized void LIZ(Request request, Exception exc) {
        C64732Paq c64732Paq;
        if (request != null) {
            if (!this.LJIL) {
                return;
            }
            if (C2NU.LIZ.LIZIZ()) {
                C64626PXy url = request.url();
                String str = url.LIZ;
                String str2 = url.LIZLLL;
                String LJFF = url.LJFF();
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String lowerCase = stringWriter.toString().toLowerCase();
                if (!"http".equals(str) && !"https".equals(str)) {
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (!TextUtils.isEmpty(lowerCase) && lowerCase.contains("timeout") && lowerCase.contains("time out") && !lowerCase.contains("unreachable")) {
                    C64733Par c64733Par = this.LJIIL;
                    if (c64733Par != null && (c64732Paq = c64733Par.LIZIZ) != null && c64732Paq.LIZ) {
                        java.util.Map<String, Integer> map = c64732Paq.LIZJ;
                        if (map != null && ((HashMap) map).size() > 0 && ((HashMap) c64732Paq.LIZJ).containsKey(str2)) {
                            Logger.debug();
                            this.LJIILLIIL++;
                            this.LJIIZILJ.put(LJFF, 0);
                            this.LJIJ.put(str2, 0);
                            if (this.LJIILLIIL >= c64732Paq.LIZLLL && this.LJIIZILJ.size() >= c64732Paq.LJ && this.LJIJ.size() >= c64732Paq.LJFF) {
                                Logger.debug();
                                LJIIIZ(false, 0L, EnumC64748Pb6.TTERROR);
                                LJIIIIZZ();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0091, code lost:
    
        if (r7 >= 100) goto L59;
     */
    @Override // X.InterfaceC64615PXn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZIZ(okhttp3.Request r9, X.C64598PWw r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64728Pam.LIZIZ(okhttp3.Request, X.PWw):void");
    }

    public final void LIZLLL(EnumC64748Pb6 enumC64748Pb6, boolean z) {
        C64732Paq c64732Paq;
        C64733Par c64733Par = this.LJIIL;
        if (c64733Par == null || (c64732Paq = c64733Par.LIZIZ) == null) {
            return;
        }
        Logger.debug();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!z) {
            if ((c64732Paq.LJIIIZ * 1000) + this.LIZ > elapsedRealtime) {
                Logger.debug();
                return;
            }
        }
        this.LIZ = elapsedRealtime;
        if (enumC64748Pb6 == EnumC64748Pb6.TTTNC) {
            this.LIZIZ = System.currentTimeMillis();
        }
        C64734Pas LJIIIZ = C64734Pas.LJIIIZ(this.LJIIJJI);
        LJIIIZ.getClass();
        Logger.debug();
        if (!LJIIIZ.LJLJI.compareAndSet(false, true)) {
            Logger.debug();
        } else {
            new C64729Pan(LJIIIZ, enumC64748Pb6, false).LIZ();
        }
    }

    public final void LJIIIZ(boolean z, long j, EnumC64748Pb6 enumC64748Pb6) {
        if (this.LJJ.hasMessages(10000)) {
            return;
        }
        Message obtainMessage = this.LJJ.obtainMessage();
        obtainMessage.what = 10000;
        obtainMessage.arg1 = z ? 1 : 0;
        obtainMessage.arg2 = enumC64748Pb6.mValue;
        if (j > 0) {
            this.LJJ.sendMessageDelayed(obtainMessage, j);
        } else {
            this.LJJ.sendMessage(obtainMessage);
        }
    }

    public final boolean LJ(Context context, boolean z, EnumC64748Pb6 enumC64748Pb6, String str) {
        String str2;
        String LJIIJ;
        String LJIIJ2;
        String LJIIJ3;
        Logger.debug();
        ArrayList arrayList = new ArrayList();
        if (C64734Pas.LJIIIZ(context).LLFZ != null && ((CopyOnWriteArrayList) C64734Pas.LJIIIZ(context).LLFZ).size() != 0) {
            arrayList.addAll(C64734Pas.LJIIIZ(context).LLFZ);
            C64734Pas.LJIIIZ(context).getClass();
            for (String str3 : C64734Pas.LJIIIIZZ()) {
                if (!arrayList.contains(str3)) {
                    arrayList.add(str3);
                }
            }
        } else {
            C64734Pas.LJIIIZ(context).getClass();
            arrayList.addAll(Arrays.asList(C64734Pas.LJIIIIZZ()));
        }
        this.LIZLLL = enumC64748Pb6;
        this.LJIIIZ = System.currentTimeMillis();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EZQ ezq = new EZQ(C07780Sg.LIZIZ("https://", (String) it.next(), "/get_domains/v5/").toString());
            try {
                ezq.LIZJ("abi", Build.SUPPORTED_ABIS[0]);
                ezq.LIZ(enumC64748Pb6.mValue, "tnc_src");
                ezq.LIZJ("okhttp_version", "4.2.152.11-tiktok");
                if (C64704PaO.LJFF().LJIIJ) {
                    ezq.LIZJ("use_store_region_cookie", "1");
                }
                Object tTNetDepend = TTNetInit.getTTNetDepend();
                if (tTNetDepend != null && (tTNetDepend instanceof FXG)) {
                }
            } catch (Throwable unused) {
            }
            HashMap hashMap = new HashMap();
            C64704PaO LJFF = C64704PaO.LJFF();
            if (LJFF.LJIIJ && !LJFF.LJI && !TextUtils.isEmpty(LJFF.LJFF)) {
                hashMap.put("x-tt-app-init-region", LJFF.LJFF);
            }
            boolean z2 = !TextUtils.isEmpty(C64704PaO.LJFF().LIZ);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("x-tt-tnc-summary", str);
            }
            if (!z) {
                C64714PaY c64714PaY = new C64714PaY();
                c64714PaY.LIZ = ezq.LIZLLL();
                c64714PaY.LIZIZ = true;
                System.currentTimeMillis();
                try {
                    String LIZJ = C64711PaV.LIZJ(c64714PaY.LIZ, hashMap, null, c64714PaY);
                    System.currentTimeMillis();
                    this.LJIIIIZZ = c64714PaY.LJII;
                    this.LJII = c64714PaY.LJI;
                    if (LJFF().LJII(context, enumC64748Pb6, LIZJ, c64714PaY.LJFF, c64714PaY.LIZLLL, c64714PaY.LJ, z2)) {
                        return true;
                    }
                } catch (Throwable unused2) {
                    continue;
                }
            } else {
                ezq.LIZ(TTNetInit.getTTNetDepend().getAppId(), "aid");
                ezq.LIZJ("device_platform", "android");
                if (TTNetInit.getCronetProvider() != null) {
                    ezq.LIZJ("version_code", TTNetInit.getCronetProvider().getVersionCode());
                    ezq.LIZJ("channel", TTNetInit.getCronetProvider().getChannel());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        arrayList2.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                String LIZLLL = ezq.LIZLLL();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    Pair<String, String> LIZJ2 = EZX.LIZJ(LIZLLL, linkedHashMap);
                    String str4 = (String) LIZJ2.first;
                    String str5 = (String) LIZJ2.second;
                    INetworkApi iNetworkApi = (INetworkApi) C65083PgV.LJIIIIZZ(INetworkApi.class, str4);
                    if (iNetworkApi == null) {
                        continue;
                    } else {
                        InterfaceC37276Ek4<String> doGet = iNetworkApi.doGet(true, -1, str5, linkedHashMap, arrayList2, null);
                        try {
                            C64797Pbt<String> execute = doGet.execute();
                            List<EJ6> list = execute.LIZ.LIZLLL;
                            str2 = execute.LIZIZ;
                            LJIIJ = C65083PgV.LJIIJ("x-ss-etag", list);
                            LJIIJ2 = C65083PgV.LJIIJ("x-tt-tnc-abtest", list);
                            LJIIJ3 = C65083PgV.LJIIJ("x-tt-tnc-control", list);
                            this.LJII = C65083PgV.LJIIJ("x-tt-tnc-config", list);
                            this.LJIIIIZZ = C65083PgV.LJIIJ("x-ss-canary", list);
                        } catch (Throwable unused3) {
                            if (doGet != null) {
                            }
                        }
                        if (!LJFF().LJII(context, enumC64748Pb6, str2, LJIIJ3, LJIIJ, LJIIJ2, z2)) {
                            doGet.cancel();
                        } else {
                            doGet.cancel();
                            return true;
                        }
                    }
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return false;
    }

    public final boolean LJII(Context context, EnumC64748Pb6 enumC64748Pb6, String str, String str2, String str3, String str4, boolean z) {
        try {
            Logger.debug();
            if (!TextUtils.isEmpty(str3)) {
                C64734Pas.LJIIIZ(context).LLF = str3;
            }
            LJFF().LJIIL.LIZLLL = str4;
            l.LJ().LJIIJJI = str4;
            if (!TextUtils.isEmpty(str2) && str2.equals("1")) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(str);
            ClientKeyManager.LJFF().LIZ(str);
            boolean LJIIL = C64734Pas.LJIIIZ(context).LJIIL(jSONObject, enumC64748Pb6, System.currentTimeMillis(), z);
            if (LJIIL) {
                this.LJ = System.currentTimeMillis();
                if (!this.LJFF) {
                    this.LJFF = true;
                }
                this.LJI = true;
                if (enumC64748Pb6 == EnumC64748Pb6.TTTNC) {
                    this.LJIILL = this.LJIILJJIL;
                }
            }
            return LJIIL;
        } catch (Exception unused) {
            return false;
        }
    }
}
