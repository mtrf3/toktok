package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.bytedance.ttnet.TTNetInit;
import ee1.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Par, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64733Par {
    public final Context LIZ;
    public final boolean LIZJ;
    public String LIZLLL = "";
    public C64732Paq LIZIZ = new C64732Paq();

    public static String LIZIZ() {
        if (TextUtils.isEmpty(C64728Pam.LJJIFFI)) {
            return null;
        }
        try {
            String string = JSONObjectProtectorUtils.getString(new JSONObject(C64728Pam.LJJIFFI), "data");
            Logger.debug();
            return string;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static C64732Paq LJ(JSONObject jSONObject) {
        boolean z;
        try {
            ((ConcurrentHashMap) l.LJ().LJIIIZ).clear();
            JSONObject optJSONObject = jSONObject.optJSONObject("tnc_config");
            C64732Paq c64732Paq = new C64732Paq();
            if (optJSONObject == null) {
                return c64732Paq;
            }
            boolean z2 = true;
            if (optJSONObject.has("local_enable")) {
                if (JSONObjectProtectorUtils.getInt(optJSONObject, "local_enable") == 0) {
                    z = false;
                } else {
                    z = true;
                }
                c64732Paq.LIZ = z;
            }
            if (optJSONObject.has("probe_enable")) {
                if (JSONObjectProtectorUtils.getInt(optJSONObject, "probe_enable") == 0) {
                    z2 = false;
                }
                c64732Paq.LIZIZ = z2;
            }
            if (optJSONObject.has("local_host_filter")) {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(optJSONObject, "local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                c64732Paq.LIZJ = hashMap;
            } else {
                c64732Paq.LIZJ = null;
            }
            if (optJSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(optJSONObject, "host_replace_map");
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = JSONObjectProtectorUtils.getString(jSONObject2, next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            ((ConcurrentHashMap) l.LJ().LJIIIZ).put(next, string2);
                        }
                    }
                }
            }
            c64732Paq.LIZLLL = optJSONObject.optInt("req_to_cnt", c64732Paq.LIZLLL);
            c64732Paq.LJ = optJSONObject.optInt("req_to_api_cnt", c64732Paq.LJ);
            c64732Paq.LJFF = optJSONObject.optInt("req_to_ip_cnt", c64732Paq.LJFF);
            c64732Paq.LJI = optJSONObject.optInt("req_err_cnt", c64732Paq.LJI);
            c64732Paq.LJII = optJSONObject.optInt("req_err_api_cnt", c64732Paq.LJII);
            c64732Paq.LJIIIIZZ = optJSONObject.optInt("req_err_ip_cnt", c64732Paq.LJIIIIZZ);
            c64732Paq.LJIIIZ = optJSONObject.optInt("update_interval", c64732Paq.LJIIIZ);
            c64732Paq.LJIIJ = optJSONObject.optInt("update_random_range", c64732Paq.LJIIJ);
            c64732Paq.LJIIJJI = optJSONObject.optString("http_code_black", c64732Paq.LJIIJJI);
            return c64732Paq;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void LIZJ(long j) {
        String c64732Paq;
        try {
            String LJIIZILJ = C77125UOr.LJIIZILJ(4, this.LIZ);
            if (TextUtils.isEmpty(LJIIZILJ)) {
                LJIIZILJ = LIZIZ();
                if (TextUtils.isEmpty(LJIIZILJ)) {
                    Logger.debug();
                    return;
                }
            }
            JSONObject jSONObject = new JSONObject(LJIIZILJ);
            C64732Paq LJ = LJ(jSONObject);
            l.LJ().LJI(EnumC64748Pb6.TTCACHE.mValue, j, C77125UOr.LJIIZILJ(5, this.LIZ), C77125UOr.LJIIZILJ(6, this.LIZ), jSONObject);
            LIZLLL(jSONObject);
            if (Logger.debug()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("loadLocalConfigForOtherProcess, config: ");
                if (LJ != null) {
                    c64732Paq = LJ.toString();
                } else {
                    c64732Paq = "null";
                }
                LIZ.append(c64732Paq);
                Logger.d("TNCConfigHandler", X1D.LIZIZ(LIZ));
            }
            if (LJ != null) {
                this.LIZIZ = LJ;
            }
        } catch (Throwable unused) {
            Logger.debug();
        }
    }

    public final void LIZLLL(JSONObject jSONObject) {
        boolean z;
        EnumC64749Pb7 enumC64749Pb7;
        boolean z2;
        boolean z3;
        int i = -1;
        if (!C64734Pas.LJIIIZ(this.LIZ).LJ()) {
            C64811Pc7 LJ = C64811Pc7.LJ();
            LJ.getClass();
            Logger.debug();
            if (LJ.LJLLLL != null && jSONObject != null) {
                int optInt = jSONObject.optInt("ttnet_http_dns_enabled", -1);
                if (optInt >= 0) {
                    AtomicBoolean atomicBoolean = LJ.LJLIL;
                    if (optInt == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    atomicBoolean.set(z3);
                }
                String optString = jSONObject.optString("ttnet_tt_http_dns_domain");
                if (!TextUtils.isEmpty(optString)) {
                    LJ.LJLJI = optString;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_tt_http_dns_preload_batch_host");
                if (optJSONArray != null) {
                    LJ.LJLJJLL.clear();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String optString2 = optJSONArray.optString(i2);
                        if (!TextUtils.isEmpty(optString2)) {
                            LJ.LJLJJLL.add(optString2);
                        }
                    }
                }
                int optInt2 = jSONObject.optInt("localdns_cache_ttl", -1);
                if (optInt2 >= 0) {
                    LJ.LJLJL.set(optInt2);
                }
                int optInt3 = jSONObject.optInt("httpdns_prefer_time_ms", -1);
                if (optInt3 >= 0) {
                    LJ.LJLJLJ.set(optInt3);
                }
                int optInt4 = jSONObject.optInt("httpdns_stale_cache_interval", -1);
                if (optInt4 >= 0) {
                    LJ.LJLJLLL.set(optInt4);
                }
                int optInt5 = jSONObject.optInt("enable_compare_localdns_httpdns", -1);
                if (optInt5 >= 0) {
                    LJ.LJLL.set(optInt5);
                }
                int optInt6 = jSONObject.optInt("ttnet_http_dns_prefer", -1);
                if (optInt6 >= 0) {
                    AtomicBoolean atomicBoolean2 = LJ.LJLILLLLZI;
                    if (optInt6 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    atomicBoolean2.set(z2);
                }
                int optInt7 = jSONObject.optInt("ttnet_http_dns_timeout", -1);
                if (optInt7 >= 0) {
                    LJ.LJLLI.set(optInt7);
                }
                int optInt8 = jSONObject.optInt("ttnet_local_dns_time_out", -1);
                if (optInt8 >= 0) {
                    LJ.LJLLILLLL.set(optInt8);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("ttnet_http_dns_addr");
                if (optJSONObject != null) {
                    ((ConcurrentHashMap) LJ.LJLJJL).clear();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString3 = optJSONObject.optString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString3)) {
                            String[] split = optString3.split(",");
                            if (next.equals(LJ.LJLJI)) {
                                LJ.LJLJJI.clear();
                                LJ.LJLJJI.addAll(Arrays.asList(split));
                            } else {
                                ((ConcurrentHashMap) LJ.LJLJJL).put(next, new CopyOnWriteArrayList(Arrays.asList(split)));
                            }
                        }
                    }
                }
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("runtime_req_ctl_config");
        if (optJSONObject2 != null) {
            ((CopyOnWriteArraySet) C38641FEn.LIZIZ).clear();
            ((CopyOnWriteArraySet) C38641FEn.LIZJ).clear();
            try {
                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("p0");
                JSONArray optJSONArray3 = optJSONObject2.optJSONArray("p2");
                if (optJSONArray2 != null) {
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        ((CopyOnWriteArraySet) C38641FEn.LIZIZ).add(optJSONArray2.get(i3).toString());
                    }
                }
                if (optJSONArray3 != null) {
                    for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                        ((CopyOnWriteArraySet) C38641FEn.LIZJ).add(optJSONArray3.get(i4).toString());
                    }
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            optJSONObject2.optInt("p0_countdown", 0);
            optJSONObject2.optInt("p1_random", 0);
            optJSONObject2.optInt("p1_maxCount", 10);
            Logger.debug();
        }
        AtomicBoolean atomicBoolean3 = C64758PbG.LIZIZ;
        if (jSONObject.optInt("request_tag_enabled") > 0) {
            z = true;
        } else {
            z = false;
        }
        atomicBoolean3.set(z);
        C64758PbG.LIZLLL.set(jSONObject.optInt("cold_start_seconds"));
        C64758PbG.LJ.set(jSONObject.optInt("hot_start_seconds"));
        C64758PbG.LJFF.set(jSONObject.optInt("warm_start_seconds"));
        Logger.debug();
        C64736Pau LIZJ = C64736Pau.LIZJ(TTNetInit.getTTNetDepend().getContext());
        LIZJ.getClass();
        Object tTNetDepend = TTNetInit.getTTNetDepend();
        if (!(tTNetDepend instanceof FXG) || ((FXG) tTNetDepend).LJIILJJIL()) {
            JSONArray optJSONArray4 = jSONObject.optJSONArray("tt_req_delay_config");
            if (optJSONArray4 == null) {
                ((ConcurrentHashMap) LIZJ.LIZ).clear();
            } else {
                int i5 = 0;
                while (i5 < optJSONArray4.length()) {
                    C64751Pb9 c64751Pb9 = new C64751Pb9();
                    JSONObject optJSONObject3 = optJSONArray4.optJSONObject(i5);
                    if (optJSONObject3 != null) {
                        int optInt9 = optJSONObject3.optInt("state", -2);
                        if (optInt9 == i) {
                            enumC64749Pb7 = EnumC64749Pb7.NormalStart;
                        } else if (optInt9 == 0) {
                            enumC64749Pb7 = EnumC64749Pb7.ColdStart;
                        } else if (optInt9 == 1) {
                            enumC64749Pb7 = EnumC64749Pb7.HotStart;
                        } else if (optInt9 == 2) {
                            enumC64749Pb7 = EnumC64749Pb7.WarmStart;
                        } else if (optInt9 == 3) {
                            enumC64749Pb7 = EnumC64749Pb7.WeakNet;
                        }
                        if (!optJSONObject3.isNull("bl_with_delay_ms")) {
                            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("bl_with_delay_ms");
                            Iterator<String> keys2 = optJSONObject4.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                ((ConcurrentHashMap) c64751Pb9.LIZ).put(next2, Integer.valueOf(optJSONObject4.optInt(next2)));
                            }
                            c64751Pb9.LIZJ = optJSONObject3.optInt("bl_disable_time_ms", 1000);
                        } else if (!optJSONObject3.isNull("wl")) {
                            JSONArray optJSONArray5 = optJSONObject3.optJSONArray("wl");
                            if (optJSONArray5 != null) {
                                for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                                    ((CopyOnWriteArraySet) c64751Pb9.LIZIZ).add(optJSONArray5.opt(i6));
                                }
                            }
                            c64751Pb9.LIZLLL = optJSONObject3.optInt("delay_time_ms", 100);
                            c64751Pb9.LJ = optJSONObject3.optInt("wl_disable_time_ms", 1000);
                        }
                        ((ConcurrentHashMap) LIZJ.LIZ).put(enumC64749Pb7, c64751Pb9);
                    }
                    i5++;
                    i = -1;
                }
            }
            LIZJ.LIZLLL(C64770PbS.LIZIZ);
        }
        EYO LIZJ2 = EYO.LIZJ();
        LIZJ2.getClass();
        LIZJ2.LIZ = jSONObject.optInt("qf_enter_background_time", 30000);
        TTRequestCompressManager.onServerConfigChanged(jSONObject);
    }

    public C64733Par(Context context, boolean z) {
        this.LIZ = context;
        this.LIZJ = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (android.text.TextUtils.isEmpty(r20.LIZLLL) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0126, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(org.json.JSONObject r21, X.EnumC64748Pb6 r22, java.lang.String r23, long r24) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64733Par.LIZ(org.json.JSONObject, X.Pb6, java.lang.String, long):boolean");
    }
}
