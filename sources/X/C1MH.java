package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1MH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1MH implements C0TC {
    public final List<C0TD> LIZ;

    @Override // X.C0TC
    public final C0R9 LIZ() {
        throw new UnsupportedOperationException("do not call");
    }

    @Override // X.C0TC
    public final C0RA LIZIZ(C0R9 c0r9) {
        final List<C0TD> list = this.LIZ;
        return new C0TC(list) { // from class: X.1MF
            public C0R9 LIZ;
            public int LIZIZ = 0;
            public final List<C0TD> LIZJ;

            @Override // X.C0TC
            public final C0R9 LIZ() {
                return this.LIZ;
            }

            {
                this.LIZJ = list;
            }

            @Override // X.C0TC
            public final C0RA LIZIZ(C0R9 c0r92) {
                if (c0r92 == null) {
                    return C0RA.LIZ(new IllegalArgumentException("null request"), null);
                }
                List<C0TD> list2 = this.LIZJ;
                if (list2 == null || list2.isEmpty()) {
                    return C0RA.LIZ(new IllegalArgumentException("no interceptor in the chain"), null);
                }
                if (this.LIZIZ >= this.LIZJ.size()) {
                    return C0RA.LIZ(new IllegalArgumentException("interceptors index out of bound"), c0r92);
                }
                C0TD c0td = (C0TD) ListProtector.get(this.LIZJ, this.LIZIZ);
                if (c0td == null) {
                    return C0RA.LIZ(new IllegalArgumentException("null interceptor"), c0r92);
                }
                this.LIZ = c0r92;
                this.LIZIZ++;
                return c0td.LIZ(this);
            }
        }.LIZIZ(c0r9);
    }

    public C1MH(final C30371Hd c30371Hd, C42031kt c42031kt) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1MG(c30371Hd) { // from class: X.1kv
            @Override // X.C1MG, X.C0TD
            public final C0RA LIZ(C0TC c0tc) {
                JSONObject jSONObject;
                long j;
                String str;
                java.util.Map<String, List<String>> map;
                List<String> list;
                C38531fF c38531fF;
                long uptimeMillis = SystemClock.uptimeMillis();
                C0RA LIZ = super.LIZ(c0tc);
                C41201jY LJJJI = C41201jY.LJJJI();
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                LJJJI.getClass();
                if (LIZ != null) {
                    int i = LIZ.LIZ;
                    try {
                        new JSONObject().put("cost", uptimeMillis2);
                    } catch (Throwable unused) {
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    C0R9 c0r9 = LIZ.LJ;
                    if (c0r9 != null && (c38531fF = c0r9.LJ) != null) {
                        if (c38531fF.LIZLLL) {
                            j = c38531fF.LIZJ;
                        } else {
                            j = c38531fF.LJ;
                        }
                        jSONObject = c38531fF.LJII;
                        str = c38531fF.LJI;
                    } else {
                        jSONObject = null;
                        j = -1;
                        str = null;
                    }
                    try {
                        jSONObject2.put("cid", j);
                        jSONObject2.putOpt("ad_extra_data", jSONObject);
                        jSONObject2.putOpt("log_extra", str);
                        C78847Ux1.LJJ(LIZ.LJFF, jSONObject2);
                        if (c0r9 != null) {
                            jSONObject2.put("method", c0r9.LIZJ);
                        }
                        int i2 = LIZ.LIZ;
                        if (i2 < 200 || i2 >= 300) {
                            if (c0r9 != null) {
                                jSONObject2.put("url", c0r9.LIZIZ);
                            }
                            if (i == 302 && (map = LIZ.LIZJ) != null && map.containsKey("Location") && (list = map.get("Location")) != null && !list.isEmpty()) {
                                jSONObject2.putOpt("url_302", ListProtector.get(list, 0));
                            }
                        }
                        if (c0r9 != null) {
                            jSONObject2.put("host", UriProtector.parse(c0r9.LIZIZ).getHost());
                        }
                    } catch (Throwable unused2) {
                    }
                    AbstractC38911fr.LJIJI();
                }
                return LIZ;
            }

            @Override // X.C1MG
            public final C0R9 LIZIZ(C0R9 c0r9) {
                String str;
                C38531fF c38531fF = c0r9.LJ;
                String str2 = c0r9.LIZIZ;
                try {
                    java.util.Map<String, String> LIZ = C13980gk.LIZ(str2, c38531fF.LIZLLL);
                    if (LIZ != null) {
                        String valueOf = String.valueOf(c38531fF.LJIIIIZZ);
                        if (LIZ.containsKey("__TS__")) {
                            LIZ.put("__TS__", valueOf);
                        }
                        if (LIZ.containsKey("{TS}")) {
                            LIZ.put("{TS}", valueOf);
                        }
                    }
                    for (String str3 : LIZ.keySet()) {
                        String str4 = LIZ.get(str3);
                        if (!TextUtils.isEmpty(str4)) {
                            str2 = str2.replace(str3, str4);
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
                AbstractC38911fr abstractC38911fr = C35191Zr.LIZIZ().LJII;
                C0R8 c0r8 = c0r9.LIZ;
                if (abstractC38911fr != null) {
                    str = abstractC38911fr.LJIJJLI();
                } else {
                    str = "";
                }
                String LJJIFFI = C78555UsJ.LJJIFFI(str);
                if (!TextUtils.isEmpty(LJJIFFI)) {
                    StringBuilder sb = new StringBuilder();
                    for (char c : LJJIFFI.toCharArray()) {
                        if (c >= ' ' && c != 127) {
                            sb.append(c);
                        }
                    }
                    LJJIFFI = sb.toString();
                }
                c0r8.getClass();
                if (!TextUtils.isEmpty("User-Agent") && !TextUtils.isEmpty(LJJIFFI)) {
                    if (c0r8.LIZJ == null) {
                        c0r8.LIZJ = new HashMap();
                    }
                    List singletonList = Collections.singletonList(LJJIFFI);
                    if (!TextUtils.isEmpty("User-Agent") && singletonList != null && !singletonList.isEmpty()) {
                        if (c0r8.LIZJ == null) {
                            c0r8.LIZJ = new HashMap();
                        }
                        ((HashMap) c0r8.LIZJ).put("User-Agent", singletonList);
                    }
                }
                c0r8.LIZ = str2;
                return new C0R9(c0r8);
            }

            @Override // X.C1MG
            public final C0RA LIZJ(C0RA c0ra) {
                C0R9 c0r9;
                if (c0ra != null && (c0r9 = c0ra.LJ) != null) {
                    C38531fF c38531fF = c0r9.LJ;
                    int i = c0ra.LIZ;
                    String str = c0r9.LIZIZ;
                    long j = c0ra.LIZLLL;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("http_msg", c0ra.LIZIZ);
                        Throwable th = c0ra.LJFF;
                        if (th != null) {
                            jSONObject.putOpt("http_err_class", C16880lQ.LJLLILLLL(th.getClass()));
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("track_url_list", str).put("track_status", i).put("local_time_ms", j).put("is_retry", c38531fF.LJIIIZ).putOpt("ad_extra_data", jSONObject);
                    } catch (JSONException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                    C04070Dz.LIZ("track_url", c38531fF, jSONObject2);
                }
                return c0ra;
            }
        });
        arrayList.add(new C1MG(c30371Hd) { // from class: X.1ku
            @Override // X.C1MG
            public final C0R9 LIZIZ(C0R9 c0r9) {
                String str = c0r9.LIZIZ;
                java.util.Map<String, String> map = c0r9.LJ.LJIIJJI;
                if (map == null) {
                    return c0r9;
                }
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (str.contains(entry.getKey())) {
                            String value = entry.getValue();
                            if (!TextUtils.isEmpty(value)) {
                                try {
                                    value = URLEncoder.encode(value, "UTF-8");
                                } catch (Throwable unused) {
                                }
                            }
                            if (!TextUtils.isEmpty(value)) {
                                str = str.replace(entry.getKey(), value);
                            }
                        }
                    }
                    C0R8 c0r8 = c0r9.LIZ;
                    c0r8.LIZ = str;
                    return new C0R9(c0r8);
                } catch (Throwable unused2) {
                    return c0r9;
                }
            }
        });
        this.LIZ = arrayList;
        arrayList.add(c42031kt);
    }
}
