package X;

import Y.ACallableS5S1000000_6;
import android.text.TextUtils;
import com.ss.android.common.util.NetworkUtils;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes7.dex */
public final class FX8 {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static final List<String> LIZJ = C47261Igj.LJII("sessionid", "sid_tt", "sid_guard", "uid_tt");

    public static final boolean LJFF() {
        if (TextUtils.equals(EF7.LJIILIIL, "lark_inhouse") || TextUtils.equals(EF7.LJIILIIL, "local_test")) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(String str) {
        if (TextUtils.isEmpty(str) || !LIZIZ) {
            return;
        }
        C10K.LIZIZ(new ACallableS5S1000000_6(str, 0), C38995FSd.LIZIZ(), null);
    }

    public static String LIZLLL(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (true) {
            if (-1 >= length) {
                break;
            }
            if (str.charAt(length) == '.') {
                if (z) {
                    if (length > 0) {
                        i = length;
                    }
                } else {
                    z = true;
                }
            }
            length--;
        }
        String substring = str.substring(i);
        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String LJ(String str) {
        String str2 = "";
        if (str != null) {
            try {
                java.net.URI create = java.net.URI.create(str);
                if (create == null) {
                    return "";
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(create.getHost());
                LIZ2.append(create.getPath());
                str2 = X1D.LIZIZ(LIZ2);
                return str2;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return str2;
    }

    public static final void LIZJ(java.net.URI uri, java.util.Map<String, ? extends List<String>> map) {
        List<String> list;
        try {
            if (!LIZIZ || uri == null) {
                return;
            }
            try {
                list = C64734Pas.LJIIIZ(EF7.LIZIZ()).LIZLLL(NetworkUtils.getShareCookieHost());
                if (list != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        String host = uri.getHost();
                        o.LJIIIIZZ(host, "uri.host");
                        if (!copyOnWriteArrayList.contains(LIZLLL(host))) {
                            return;
                        }
                        String str = "";
                        HashMap hashMap = (HashMap) map;
                        if (!hashMap.isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            Iterator it = hashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                sb.append((Map.Entry) it.next());
                                sb.append(";");
                            }
                            str = sb.toString();
                            o.LJIIIIZZ(str, "stringBuilder.toString()");
                        }
                        LIZ(uri, list, str);
                        return;
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                list = null;
            }
            LJFF();
            LJI(LJ(uri.toString()), null, list);
        } catch (Exception unused) {
        }
    }

    public static void LIZ(java.net.URI uri, List list, String str) {
        if (uri == null || str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (LJFF()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("lostCookie ");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(uri.getHost());
                LIZ3.append(uri.getPath());
                LIZ2.append(X1D.LIZIZ(LIZ3));
                X1D.LIZIZ(LIZ2);
                LJFF();
            }
            LJI(LJ(uri.toString()), str, list);
            return;
        }
        Iterator<String> it = LIZJ.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (s.LJJJLZIJ(str, it.next(), false)) {
                i++;
            }
        }
        if (i >= LIZJ.size()) {
            return;
        }
        if (LJFF()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("lessCookie ");
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(uri.getHost());
            LIZ5.append(uri.getPath());
            LIZ4.append(X1D.LIZIZ(LIZ5));
            X1D.LIZIZ(LIZ4);
            LJFF();
        }
        LJI(LJ(uri.toString()), str, list);
    }

    public static void LJI(String str, String str2, List list) {
        if (LIZ) {
            return;
        }
        LIZ = true;
        String str3 = "";
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                str3 = i0.LJFF(str3, (String) it.next());
                arrayList.add(C76800UCe.LIZ);
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("host", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("error_desc", str2);
            }
            jSONObject.put("uri", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C09900aA.LJ("cookie_error", jSONObject);
    }
}
