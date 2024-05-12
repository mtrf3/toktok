package X;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.HttpInstrumentation;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.o;
import okhttp3.Request;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PY4 implements PY9, PYA, PY8, InterfaceC58286MuA {
    public static final /* synthetic */ int LIZ = 0;

    public static URLConnection LIZJ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-1533661189619879087"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    @Override // X.PYA
    public final PPC<Request, C64598PWw> LIZIZ(PPC<Request, C64598PWw> ppc) {
        return ppc;
    }

    @Override // X.PY9
    public final PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> LIZLLL(PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJ(PPC<HttpURLConnection, Integer> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJI(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJII(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJIIIZ(PPC<HttpURLConnection, Integer> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIJJI(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIL(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    static {
        C16880lQ.LJLLJ(PY4.class);
        new Handler(C16880lQ.LLJJJJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIJ(C58728N3c c58728N3c) {
        java.util.Set<String> set;
        android.net.Uri parse;
        java.util.Set<String> queryParameterNames;
        HeaderParamConfig LIZ2 = C58727N3b.LIZ();
        if (LIZ2 != null) {
            set = LIZ2.denyKeys;
        } else {
            set = null;
        }
        if (TextUtils.isEmpty(c58728N3c.LIZJ) || (queryParameterNames = UriProtector.getQueryParameterNames((parse = UriProtector.parse(c58728N3c.LIZJ)))) == null || queryParameterNames.isEmpty()) {
            return;
        }
        java.util.Set<String> set2 = c58728N3c.LJIIIIZZ;
        o.LJIIIIZZ(queryParameterNames, "queryParameterNames");
        set2.addAll(queryParameterNames);
        if (set == null || set.isEmpty() || C58727N3b.LIZIZ(LIZ2, c58728N3c.LIZJ)) {
            return;
        }
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        ArrayList arrayList = new ArrayList();
        for (String str : queryParameterNames) {
            String it = str;
            o.LJIIIIZZ(it, "it");
            Locale ROOT = Locale.ROOT;
            o.LJIIIIZZ(ROOT, "ROOT");
            o.LJIIIIZZ(it.toLowerCase(ROOT), "this as java.lang.String).toLowerCase(locale)");
            if (!set.contains(r0)) {
                arrayList.add(str);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            clearQuery.appendQueryParameter(str2, UriProtector.getQueryParameter(parse, str2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str3 : queryParameterNames) {
            String it3 = str3;
            o.LJIIIIZZ(it3, "it");
            Locale ROOT2 = Locale.ROOT;
            o.LJIIIIZZ(ROOT2, "ROOT");
            String lowerCase = it3.toLowerCase(ROOT2);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (set.contains(lowerCase)) {
                arrayList2.add(str3);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Object it5 = it4.next();
                java.util.Set<String> set3 = c58728N3c.LJIIIZ;
                o.LJIIIIZZ(it5, "it");
                set3.add(it5);
            }
            c58728N3c.LIZ = true;
        }
        c58728N3c.LIZLLL = clearQuery.build().toString();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.retrofit2.client.Request, Q] */
    @Override // X.PY9
    public final PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> LIZ(PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> ppc) {
        String url;
        java.util.Set<String> set;
        String str;
        com.bytedance.retrofit2.client.Request request = ppc.LIZ;
        String str2 = null;
        if (request != null && (url = request.getUrl()) != null && ujb.o.LJJJLIIL(url, "http://", false)) {
            HeaderParamConfig LIZ2 = C58727N3b.LIZ();
            if (LIZ2 != null) {
                set = LIZ2.denyKeys;
            } else {
                set = null;
            }
            C58728N3c c58728N3c = new C58728N3c("2", url);
            LJIJ(c58728N3c);
            List<EJ6> headers = request.getHeaders();
            if (headers != null && !headers.isEmpty()) {
                java.util.Set<String> set2 = c58728N3c.LJ;
                o.LJIIIIZZ(headers, "headers");
                ArrayList arrayList = new ArrayList(C32I.LJJL(headers, 10));
                Iterator<EJ6> it = headers.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().LIZ);
                }
                set2.addAll(arrayList);
                if (!C58727N3b.LIZIZ(LIZ2, c58728N3c.LIZJ)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (EJ6 ej6 : headers) {
                        EJ6 ej62 = ej6;
                        if (set != null) {
                            String str3 = ej62.LIZ;
                            o.LJIIIIZZ(str3, "it.name");
                            Locale ROOT = Locale.ROOT;
                            o.LJIIIIZZ(ROOT, "ROOT");
                            String lowerCase = str3.toLowerCase(ROOT);
                            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            if (set.contains(lowerCase)) {
                            }
                        }
                        arrayList2.add(ej6);
                    }
                    java.util.Set<EJ6> LLILIL = ORZ.LLILIL(headers, arrayList2);
                    if (!LLILIL.isEmpty()) {
                        for (EJ6 ej63 : LLILIL) {
                            java.util.Set<String> set3 = c58728N3c.LJFF;
                            String str4 = ej63.LIZ;
                            o.LJIIIIZZ(str4, "it.name");
                            set3.add(str4);
                        }
                        c58728N3c.LIZ = true;
                    }
                    headers = arrayList2;
                }
                Iterator<EJ6> it2 = headers.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (o.LJ(it2.next().LIZ, "Cookie")) {
                        if (i >= 0) {
                            EJ6 ej64 = (EJ6) ListProtector.get(headers, i);
                            if (ej64 != null) {
                                str = ej64.LIZIZ;
                            } else {
                                str = null;
                            }
                            ListProtector.set(headers, i, new EJ6(((EJ6) ListProtector.get(headers, i)).LIZ, LJIIZILJ(str, c58728N3c)));
                        }
                    } else {
                        i++;
                    }
                }
                Iterator<EJ6> it3 = headers.iterator();
                int i2 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (o.LJ(it3.next().LIZ, "X-SS-Cookie")) {
                        if (i2 >= 0) {
                            EJ6 ej65 = (EJ6) ListProtector.get(headers, i2);
                            if (ej65 != null) {
                                str2 = ej65.LIZIZ;
                            }
                            ListProtector.set(headers, i2, new EJ6(((EJ6) ListProtector.get(headers, i2)).LIZ, LJIIZILJ(str2, c58728N3c)));
                        }
                    } else {
                        i2++;
                    }
                }
            }
            if (c58728N3c.LIZ) {
                C64908Pdg newBuilder = request.newBuilder();
                String str5 = c58728N3c.LIZLLL;
                if (str5 == null) {
                    str5 = c58728N3c.LIZJ;
                }
                newBuilder.LIZJ(str5);
                if (headers != null && !headers.isEmpty()) {
                    newBuilder.LIZJ = headers;
                }
                ppc.LIZ = newBuilder.LIZ();
            }
            C58727N3b.LIZJ(c58728N3c);
        }
        return ppc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.PY8
    public final PPC<java.net.URL, URLConnection> LJFF(PPC<java.net.URL, URLConnection> ppc) {
        String url;
        R r;
        Object openConnection;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        java.net.URL url2 = ppc.LIZ;
        if (url2 != null && (url = url2.toString()) != null && ujb.o.LJJJLIIL(url, "http://", false) && ppc.LIZ != null) {
            C58728N3c c58728N3c = new C58728N3c("3", url);
            LJIJ(c58728N3c);
            if (c58728N3c.LIZ) {
                java.net.URL url3 = new java.net.URL(c58728N3c.LIZLLL);
                if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
                    r = HttpInstrumentation.openConnection(LIZJ(url3));
                } else {
                    PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url3, null, null, null, null, PPD.CONTINUE));
                    PPD ppd = LJFF.LJFF;
                    if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
                        URLConnection uRLConnection2 = uRLConnection;
                        if (uRLConnection2 instanceof HttpsURLConnection) {
                            openConnection = new PYT((HttpsURLConnection) uRLConnection2);
                        } else {
                            boolean z = uRLConnection2 instanceof HttpURLConnection;
                            r = uRLConnection2;
                            if (z) {
                                openConnection = new PYU((HttpURLConnection) uRLConnection2);
                            }
                        }
                        r = openConnection;
                    } else if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
                        openConnection = HttpInstrumentation.openConnection(LIZJ(url3));
                        if (openConnection instanceof HttpsURLConnection) {
                            r = new PYT((HttpsURLConnection) openConnection);
                        } else {
                            if (openConnection instanceof HttpURLConnection) {
                                r = new PYU((HttpURLConnection) openConnection);
                            }
                            r = openConnection;
                        }
                    } else {
                        throw runtimeException;
                    }
                }
                ppc.LIZIZ = r;
                ppc.LIZ(PPD.INTERCEPT);
            }
            C58727N3b.LIZJ(c58728N3c);
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILIIL(PPC<HttpURLConnection, InputStream> ppc) {
        java.net.URL url;
        String url2;
        String str;
        java.util.Set<String> set;
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null && (url2 = url.toString()) != null && ujb.o.LJJJLIIL(url2, "http://", false)) {
            JSONObject jSONObject = ppc.LIZLLL;
            String str2 = "";
            if (jSONObject == null) {
                str = "";
            } else {
                String optString = jSONObject.optString("key", "");
                str = jSONObject.optString("value", "");
                str2 = optString;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                C58728N3c c58728N3c = new C58728N3c("3", url2);
                java.util.Set<String> set2 = c58728N3c.LJ;
                o.LJI(str2);
                set2.add(str2);
                HeaderParamConfig LIZ2 = C58727N3b.LIZ();
                if (!C58727N3b.LIZIZ(LIZ2, c58728N3c.LIZJ) && LIZ2 != null && (set = LIZ2.denyKeys) != null) {
                    Locale ROOT = Locale.ROOT;
                    o.LJIIIIZZ(ROOT, "ROOT");
                    String lowerCase = str2.toLowerCase(ROOT);
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (set.contains(lowerCase)) {
                        ppc.LIZ(PPD.DROP);
                        c58728N3c.LJFF.add(str2);
                        c58728N3c.LIZ = true;
                    }
                }
                if (!c58728N3c.LIZ && (o.LJ(str2, "Cookie") || o.LJ(str2, "X-SS-Cookie"))) {
                    String LJIIZILJ = LJIIZILJ(str, c58728N3c);
                    if (jSONObject != null) {
                        jSONObject.put(str2, LJIIZILJ);
                    }
                }
                C58727N3b.LIZJ(c58728N3c);
            }
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILL(PPC<HttpURLConnection, InputStream> ppc) {
        java.net.URL url;
        String url2;
        String str;
        java.util.Set<String> set;
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null && (url2 = url.toString()) != null && ujb.o.LJJJLIIL(url2, "http://", false)) {
            JSONObject jSONObject = ppc.LIZLLL;
            String str2 = "";
            if (jSONObject == null) {
                str = "";
            } else {
                String optString = jSONObject.optString("key", "");
                str = jSONObject.optString("value", "");
                str2 = optString;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                C58728N3c c58728N3c = new C58728N3c("3", url2);
                java.util.Set<String> set2 = c58728N3c.LJ;
                o.LJI(str2);
                set2.add(str2);
                HeaderParamConfig LIZ2 = C58727N3b.LIZ();
                if (!C58727N3b.LIZIZ(LIZ2, c58728N3c.LIZJ) && LIZ2 != null && (set = LIZ2.denyKeys) != null) {
                    Locale ROOT = Locale.ROOT;
                    o.LJIIIIZZ(ROOT, "ROOT");
                    String lowerCase = str2.toLowerCase(ROOT);
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (set.contains(lowerCase)) {
                        ppc.LIZ(PPD.DROP);
                        c58728N3c.LJFF.add(str2);
                        c58728N3c.LIZ = true;
                    }
                }
                if (!c58728N3c.LIZ && (o.LJ(str2, "Cookie") || o.LJ(str2, "X-SS-Cookie"))) {
                    String LJIIZILJ = LJIIZILJ(str, c58728N3c);
                    if (jSONObject != null) {
                        jSONObject.put(str2, LJIIZILJ);
                    }
                }
                C58727N3b.LIZJ(c58728N3c);
            }
        }
        return ppc;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Q, okhttp3.Request] */
    @Override // X.PYA
    public final PPC<Request, C64598PWw> LJIILLIIL(PPC<Request, C64598PWw> ppc) {
        C64626PXy url;
        String str;
        java.util.Set<String> set;
        java.util.Set<String> LJFF;
        Request request = ppc.LIZ;
        C64605PXd c64605PXd = null;
        if (request != null && (url = request.url()) != null && (str = url.LJIIIIZZ) != null && ujb.o.LJJJLIIL(str, "http://", false)) {
            HeaderParamConfig LIZ2 = C58727N3b.LIZ();
            if (LIZ2 != null) {
                set = LIZ2.denyKeys;
            } else {
                set = null;
            }
            C58728N3c c58728N3c = new C58728N3c("4", str);
            LJIJ(c58728N3c);
            C64606PXe headers = request.headers();
            if (headers != null) {
                java.util.Set<String> set2 = c58728N3c.LJ;
                java.util.Set<String> LJFF2 = headers.LJFF();
                o.LJIIIIZZ(LJFF2, "headers.names()");
                set2.addAll(LJFF2);
                c64605PXd = headers.LJI();
                if (!C58727N3b.LIZIZ(LIZ2, c58728N3c.LIZJ) && set != null && !set.isEmpty() && (LJFF = headers.LJFF()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : LJFF) {
                        String it = str2;
                        o.LJIIIIZZ(it, "it");
                        Locale ROOT = Locale.ROOT;
                        o.LJIIIIZZ(ROOT, "ROOT");
                        String lowerCase = it.toLowerCase(ROOT);
                        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (set.contains(lowerCase)) {
                            arrayList.add(str2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            String it3 = (String) it2.next();
                            java.util.Set<String> set3 = c58728N3c.LJFF;
                            o.LJIIIIZZ(it3, "it");
                            set3.add(it3);
                            c64605PXd.LIZLLL(it3);
                        }
                        c58728N3c.LIZ = true;
                    }
                }
                String LIZJ = c64605PXd.LIZJ("Cookie");
                if (LIZJ != null && !ujb.o.LJJJJJL(LIZJ)) {
                    c64605PXd.LJ("Cookie", LJIIZILJ(LIZJ, c58728N3c));
                }
                String LIZJ2 = c64605PXd.LIZJ("X-SS-Cookie");
                if (LIZJ2 != null && !ujb.o.LJJJJJL(LIZJ2)) {
                    c64605PXd.LJ("X-SS-Cookie", LJIIZILJ(LIZJ2, c58728N3c));
                }
            }
            if (c58728N3c.LIZ) {
                C64618PXq newBuilder = request.newBuilder();
                String str3 = c58728N3c.LIZLLL;
                if (str3 != null) {
                    str = str3;
                }
                newBuilder.LJII(str);
                if (c64605PXd != null) {
                    newBuilder.LIZJ = new C64606PXe(c64605PXd).LJI();
                }
                ppc.LIZ = newBuilder.LIZIZ();
            }
            C58727N3b.LIZJ(c58728N3c);
        }
        return ppc;
    }

    public static String LJIIZILJ(String str, C58728N3c c58728N3c) {
        java.util.Set<String> set;
        int i;
        boolean z;
        HeaderParamConfig LIZ2 = C58727N3b.LIZ();
        if (LIZ2 != null) {
            set = LIZ2.denyKeys;
        } else {
            set = null;
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            o.LJI(str);
            int i2 = 0;
            String[] strArr = (String[]) new OJD(";").split(str, 0).toArray(new String[0]);
            int length = strArr.length;
            int i3 = 0;
            while (i3 < length) {
                String str2 = strArr[i3];
                String[] strArr2 = (String[]) new OJD("=").split(str2, i2).toArray(new String[i2]);
                if (strArr2.length > 1) {
                    String str3 = strArr2[i2];
                    int length2 = str3.length() - 1;
                    int i4 = 0;
                    boolean z2 = false;
                    while (i4 <= length2) {
                        if (!z2) {
                            i = i4;
                        } else {
                            i = length2;
                        }
                        if (o.LJIIJJI(str3.charAt(i), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (!z) {
                                z2 = true;
                            } else {
                                i4++;
                            }
                        } else {
                            if (!z) {
                                break;
                            }
                            length2--;
                        }
                    }
                    String LIZJ = C132805Jc.LIZJ(length2, 1, str3, i4);
                    c58728N3c.LJI.add(LIZJ);
                    if (set != null) {
                        Locale ROOT = Locale.ROOT;
                        o.LJIIIIZZ(ROOT, "ROOT");
                        String lowerCase = LIZJ.toLowerCase(ROOT);
                        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (set.contains(lowerCase) && !C58727N3b.LIZIZ(LIZ2, c58728N3c.LIZJ)) {
                            c58728N3c.LJII.add(LIZJ);
                            c58728N3c.LIZ = true;
                        }
                    }
                    sb.append(str2);
                    sb.append(";");
                } else {
                    sb.append(str2);
                    sb.append(";");
                }
                i3++;
                i2 = 0;
            }
            if (!C58727N3b.LIZIZ(LIZ2, c58728N3c.LIZJ)) {
                return sb.toString();
            }
            return str;
        }
        return str;
    }
}
