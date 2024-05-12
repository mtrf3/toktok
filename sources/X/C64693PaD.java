package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import defpackage.b1;
import defpackage.i0;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PaD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64693PaD implements InterfaceC64790Pbm, ICronetClient.ICronetBootFailureChecker {
    public static Context LIZJ;
    public static ICronetClient LIZLLL;
    public static InterfaceC64699PaJ LJII;
    public static InterfaceC64700PaK LJIIIIZZ;
    public static InterfaceC64702PaM LJIIIZ;
    public static final String LIZ = C16880lQ.LJLLJ(C64693PaD.class);
    public static final String LIZIZ = "";
    public static volatile C64693PaD LJ = null;
    public static volatile boolean LJFF = false;
    public static volatile int LJI = 0;

    public static void LIZJ() {
        if (LIZLLL != null) {
        } else {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
    }

    public static void LJJII() {
        if (LIZLLL == null) {
            String str = LIZIZ;
            if (C38354F3m.LJ(str)) {
                str = "org.chromium.CronetClient";
            }
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof ICronetClient) {
                    LIZLLL = (ICronetClient) newInstance;
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetBootFailureChecker
    public final boolean isCronetBootFailureExpected() {
        InterfaceC64699PaJ interfaceC64699PaJ = LJII;
        if (interfaceC64699PaJ == null) {
            return false;
        }
        return interfaceC64699PaJ.isCronetBootFailureExpected();
    }

    public C64693PaD(Context context) {
        LIZJ = C16880lQ.LLLLL(context);
    }

    public static JSONObject LJFF(HttpURLConnection httpURLConnection) {
        JSONObject jSONObject = new JSONObject();
        if (httpURLConnection == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsCronetHttpClient");
            ICronetClient iCronetClient = LIZLLL;
            if (iCronetClient != null) {
                jSONObject.put("hcv", iCronetClient.getCronetVersion());
            }
            jSONObject.put("ua", httpURLConnection.getRequestProperty("User-Agent"));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public static String LJIIIIZZ(HttpURLConnection httpURLConnection) {
        List<String> value;
        if (httpURLConnection == null) {
            return "";
        }
        try {
            java.util.Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null && !headerFields.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        if (!C38354F3m.LJ(key) && (value = entry.getValue()) != null && !value.isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            for (String str : value) {
                                if (!C38354F3m.LJ(str)) {
                                    if (i == 0) {
                                        sb.append(str);
                                    } else {
                                        sb.append("; ");
                                        sb.append(str);
                                    }
                                    i++;
                                }
                            }
                            jSONObject.put(key, sb.toString());
                        }
                    }
                }
                return jSONObject.toString();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String LJIIIZ(String str) {
        String str2 = "";
        try {
            if (C38354F3m.LJ(str)) {
                return "";
            }
            str2 = new C61696OJg(str).getBaseType();
            return str2;
        } catch (C61697OJh e) {
            C16880lQ.LLLLIIL(e);
            return str2;
        }
    }

    public static C64693PaD LJIILIIL(Context context) {
        if (LJ == null) {
            synchronized (C64693PaD.class) {
                if (LJ == null) {
                    LJ = new C64693PaD(context);
                    LJJII();
                }
            }
        }
        return LJ;
    }

    public static boolean LJIILJJIL(C64668PZo c64668PZo) {
        T t;
        if (c64668PZo == null || (t = c64668PZo.LIZIZ) == 0 || !t.LJIIIZ) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL(boolean z) {
        ICronetClient iCronetClient = LIZLLL;
        if (iCronetClient != null) {
            return ((Boolean) Reflect.on(iCronetClient).call("notifySwitchToMultiNetwork", new Class[]{Boolean.TYPE}, Boolean.valueOf(z)).get()).booleanValue();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void LJIJ(String str) {
        ICronetClient iCronetClient = LIZLLL;
        if (iCronetClient != null) {
            Reflect.on(iCronetClient).call("preconnectUrl", new Class[]{String.class}, str).get();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static C37819Esp LJJIIJ(String str) {
        ICronetClient iCronetClient = LIZLLL;
        if (iCronetClient != null) {
            String[] strArr = (String[]) Reflect.on(iCronetClient).call("ttUrlDispatch", new Class[]{String.class}, str).get();
            if (strArr.length == 3 && !TextUtils.isEmpty(strArr[0])) {
                try {
                    new java.net.URL(strArr[0]).toURI();
                    return new C37819Esp(strArr[0], strArr[1], strArr[2]);
                } catch (Exception e) {
                    throw e;
                }
            }
            throw new UnknownFormatConversionException("ttUrlDispatch returns wrong format");
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // X.InterfaceC64777PbZ
    public final InterfaceC64803Pbz LIZ(Request request) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Request LIZJ2 = C38092ExE.LIZLLL().LIZJ(request);
        if (request.getMetrics() != null) {
            request.getMetrics().LJJIZ = SystemClock.uptimeMillis() - uptimeMillis;
        }
        if (LIZJ2 != null) {
            request = LIZJ2;
        }
        if (C64694PaE.LIZJ().LIZ > 0 && !request.getUrl().contains("no_retry=1")) {
            C64694PaE LIZJ3 = C64694PaE.LIZJ();
            Iterator it = ((CopyOnWriteArrayList) LIZJ3.LIZIZ).iterator();
            while (it.hasNext()) {
                C64696PaG c64696PaG = (C64696PaG) it.next();
                if (c64696PaG.LJIIJJI) {
                    if (SystemClock.uptimeMillis() - c64696PaG.LJIIJ > c64696PaG.LJI * 1000) {
                        c64696PaG.LJIIJJI = false;
                    }
                    Logger.debug();
                }
            }
            Iterator it2 = ((CopyOnWriteArrayList) LIZJ3.LIZIZ).iterator();
            loop1: while (it2.hasNext()) {
                C64696PaG c64696PaG2 = (C64696PaG) it2.next();
                if (c64696PaG2.LJI <= 0 || !c64696PaG2.LJIIJJI) {
                    if (!TextUtils.isEmpty(request.getUrl())) {
                        Iterator<String> it3 = c64696PaG2.LIZ.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (EZX.LIZIZ(request.getHost(), it3.next())) {
                                    String path = request.getPath();
                                    if (TextUtils.isEmpty(path)) {
                                        continue;
                                    } else {
                                        List<String> list = c64696PaG2.LIZJ;
                                        if (list != null && !((ArrayList) list).isEmpty()) {
                                            Iterator it4 = ((ArrayList) c64696PaG2.LIZJ).iterator();
                                            while (it4.hasNext()) {
                                                if (path.equals(it4.next())) {
                                                    break loop1;
                                                }
                                            }
                                        }
                                        List<String> list2 = c64696PaG2.LIZLLL;
                                        if (list2 != null && !((ArrayList) list2).isEmpty()) {
                                            Iterator it5 = ((ArrayList) c64696PaG2.LIZLLL).iterator();
                                            while (it5.hasNext()) {
                                                if (path.startsWith((String) it5.next())) {
                                                    break loop1;
                                                }
                                            }
                                        }
                                        List<Pattern> list3 = c64696PaG2.LJ;
                                        if (list3 != null && !((ArrayList) list3).isEmpty()) {
                                            Iterator it6 = ((ArrayList) c64696PaG2.LJ).iterator();
                                            while (it6.hasNext()) {
                                                Pattern pattern = (Pattern) it6.next();
                                                if (pattern != null && pattern.matcher(path).matches()) {
                                                    List<String> list4 = c64696PaG2.LIZIZ;
                                                    if (list4 != null && list4.size() >= 2) {
                                                        return new C64692PaC(request, c64696PaG2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                Logger.debug();
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return new C64688Pa8(request, LIZLLL);
    }

    public static void LIZIZ(HttpURLConnection httpURLConnection, java.util.Map<String, String> map) {
        if (httpURLConnection == null || map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                httpURLConnection.setRequestProperty(key, value);
            }
        }
    }

    public static void LIZLLL(String str, String str2) {
        if (!LJFF && LIZJ != null) {
            try {
                if (C2NU.LIZ.LIZIZ()) {
                }
            } catch (Exception unused) {
            }
            throw new C64698PaI(i0.LJFF("network not available for ", str2));
        }
        if (!LJFF || TextUtils.isEmpty(str) || !str.contains("net::ERR_INTERNET_DISCONNECTED")) {
            return;
        }
        C64698PaI c64698PaI = new C64698PaI(i0.LJFF("network not available for ", str2));
        c64698PaI.setShouldReport(true);
        throw c64698PaI;
    }

    public static List<EJ6> LJI(HttpURLConnection httpURLConnection, List<String> list) {
        if (httpURLConnection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                ArrayList arrayList2 = (ArrayList) list;
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (key.equalsIgnoreCase((String) it.next())) {
                            break;
                        }
                    }
                }
            }
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                C77800Ug8.LJFF(key, it2.next(), arrayList);
            }
        }
        return arrayList;
    }

    public static String LJIIJ(String str, HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            return httpURLConnection.getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    public static int LJIJJ(Request request, HttpURLConnection httpURLConnection) {
        Object extraInfo;
        if (request == null || httpURLConnection == null) {
            return -1;
        }
        TypedOutput body = request.getBody();
        if (body != null) {
            body.writeTo(httpURLConnection.getOutputStream());
        }
        if (C64735Pat.LJIILLIIL && ((extraInfo = request.getExtraInfo()) == null || !(extraInfo instanceof C64697PaH) || !((C64697PaH) extraInfo).LJIILLIIL)) {
            C64735Pat.LJIIIIZZ();
            Logger.debug();
        }
        return httpURLConnection.getResponseCode();
    }

    public static void LJJ(String str, String str2) {
        ICronetClient iCronetClient = LIZLLL;
        if (iCronetClient != null) {
            Reflect.on(iCronetClient).call("setBestHostWithRouteSelectionName", new Class[]{String.class, String.class}, str, str2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void LJIIJJI(HttpURLConnection httpURLConnection, C64668PZo c64668PZo, C64738Paw c64738Paw) {
        InterfaceC64702PaM interfaceC64702PaM;
        JSONObject jSONObject;
        if (c64668PZo == null) {
            return;
        }
        c64668PZo.LJJIJIIJIL = c64738Paw;
        try {
            if (LIZLLL != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LIZLLL.getRequestMetrics(httpURLConnection, linkedHashMap);
                if (!linkedHashMap.isEmpty()) {
                    c64668PZo.LIZ = (String) LJIIL(linkedHashMap.get("remote_ip"), String.class, "");
                    c64668PZo.LJIIIZ = ((Long) LJIIL(linkedHashMap.get("dns_time"), Long.class, -1L)).longValue();
                    c64668PZo.LJIIJ = ((Long) LJIIL(linkedHashMap.get("connect_time"), Long.class, -1L)).longValue();
                    c64668PZo.LJIIJJI = ((Long) LJIIL(linkedHashMap.get("ssl_time"), Long.class, -1L)).longValue();
                    c64668PZo.LJIIL = ((Long) LJIIL(linkedHashMap.get("send_time"), Long.class, -1L)).longValue();
                    ((Long) LJIIL(linkedHashMap.get("push_time"), Long.class, -1L)).longValue();
                    c64668PZo.LJIILIIL = ((Long) LJIIL(linkedHashMap.get("receive_time"), Long.class, -1L)).longValue();
                    c64668PZo.LJIILJJIL = ((Boolean) LJIIL(linkedHashMap.get("socket_reused"), Boolean.class, Boolean.FALSE)).booleanValue();
                    c64668PZo.LJIILL = ((Long) LJIIL(linkedHashMap.get("ttfb"), Long.class, -1L)).longValue();
                    c64668PZo.LJIILLIIL = ((Long) LJIIL(linkedHashMap.get("total_time"), Long.class, -1L)).longValue();
                    c64668PZo.LJIIZILJ = ((Long) LJIIL(linkedHashMap.get("send_byte_count"), Long.class, -1L)).longValue();
                    c64668PZo.LJIJ = ((Long) LJIIL(linkedHashMap.get("received_byte_count"), Long.class, -1L)).longValue();
                    c64668PZo.LJIL = (String) LJIIL(linkedHashMap.get("request_log"), String.class, "");
                    ((Long) LJIIL(linkedHashMap.get("retry_attempts"), Long.class, -1L)).longValue();
                    c64668PZo.LJJIFFI = (String) LJIIL(linkedHashMap.get("request_headers"), String.class, "");
                    c64668PZo.LJJII = (String) LJIIL(linkedHashMap.get("response_headers"), String.class, "");
                    ((Long) LJIIL(linkedHashMap.get("post_task_start"), Long.class, -1L)).longValue();
                    ((Long) LJIIL(linkedHashMap.get("request_start"), Long.class, -1L)).longValue();
                    ((Long) LJIIL(linkedHashMap.get("wait_ctx"), Long.class, -1L)).longValue();
                }
            }
            if (c64738Paw != null) {
                c64738Paw.LIZIZ = c64668PZo.LJIJJ;
                c64738Paw.LJIJJLI = SystemClock.uptimeMillis();
                c64738Paw.LJIIJJI = System.currentTimeMillis();
                c64738Paw.LJJJIL = "4.2.152.11-tiktok";
                ((HashMap) c64738Paw.LJJJI).put("sentByteCount", Long.valueOf(c64668PZo.LJIIZILJ));
                ((HashMap) c64738Paw.LJJJI).put("receivedByteCount", Long.valueOf(c64668PZo.LJIJ));
                JSONObject jSONObject2 = c64668PZo.LJJ;
                if (c64668PZo.LJJIII) {
                    jSONObject2.put("turing_callback", c64668PZo.LJJIIJ);
                }
                long j = c64668PZo.LJJIIZI;
                if (j >= 0) {
                    jSONObject2.put("turing_callback", j);
                }
                if (c64668PZo.LJJIIJZLJL) {
                    jSONObject2.put("turing_retry", "1");
                }
                String str = c64668PZo.LJJIIZ;
                if (str != null) {
                    jSONObject2.put("retry_by_header", str);
                }
                jSONObject2.put("retrofit", c64738Paw.LIZLLL());
                if (TextUtils.isEmpty(c64668PZo.LJIL) && (interfaceC64702PaM = LJIIIZ) != null && (jSONObject = ((C64734Pas) interfaceC64702PaM).LLFF) != null) {
                    try {
                        jSONObject2.put("ab_test", jSONObject);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T LJIIL(Object obj, Class<T> cls, T t) {
        if (obj != 0 && obj.getClass().equals(cls)) {
            return obj;
        }
        return t;
    }

    public static C64687Pa7 LJJIFFI(HttpURLConnection httpURLConnection, C64668PZo c64668PZo, int i) {
        C64687Pa7 c64687Pa7 = new C64687Pa7(false);
        java.util.Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || !headerFields.containsKey("bdturing-verify")) {
            return c64687Pa7;
        }
        String requestProperty = httpURLConnection.getRequestProperty("x-tt-bypass-bdturing");
        if (!TextUtils.isEmpty(requestProperty) && requestProperty.equalsIgnoreCase("1")) {
            return c64687Pa7;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(headerFields);
        long uptimeMillis = SystemClock.uptimeMillis();
        C64687Pa7 LJII2 = C64735Pat.LJII(i, treeMap);
        c64668PZo.LJJIIJ = SystemClock.uptimeMillis() - uptimeMillis;
        if (!treeMap.containsKey("bdturing-verify")) {
            c64668PZo.LJJIII = true;
        }
        return LJII2;
    }

    public static void LJJIII(String[] strArr, int i, int i2) {
        ICronetClient iCronetClient = LIZLLL;
        if (iCronetClient != null) {
            Reflect on = Reflect.on(iCronetClient);
            Class<?> cls = Integer.TYPE;
            on.call("tryStartNetDetect", new Class[]{String[].class, cls, cls}, strArr, Integer.valueOf(i), Integer.valueOf(i2)).get();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public final void LJJI(boolean z, boolean z2, boolean z3) {
        LJJII();
        ICronetClient iCronetClient = LIZLLL;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureChecker(this);
            LIZLLL.setCronetEngine(LIZJ, false, z, false, z2, C64735Pat.LJFF, new ExecutorC64806Pc2(), z3);
        }
    }

    public static HttpURLConnection LJ(String str, Request request, C64668PZo c64668PZo, long j) {
        boolean LIZJ2;
        boolean z;
        long j2;
        String str2;
        int i;
        boolean z2;
        String url = request.getUrl();
        boolean z3 = false;
        if (!TextUtils.isEmpty(url) && url.contains("aweme/v2/feed") && !C47821Ipl.LJIIIZ.getAndSet(true)) {
            C56662Kg.LIZ().LIZJ("feed_cookie_before_feed_duration", false);
        }
        try {
            InterfaceC64715PaZ interfaceC64715PaZ = C64735Pat.LJI;
            if (interfaceC64715PaZ != null) {
                interfaceC64715PaZ.LIZIZ();
            }
            if (!C64735Pat.LJIILLIIL) {
                Object extraInfo = request.getExtraInfo();
                if (extraInfo == null || !(extraInfo instanceof C64697PaH) || !((C64697PaH) extraInfo).LJIILLIIL) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    C64735Pat.LJIIIIZZ();
                    Logger.debug();
                }
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(url) && url.contains("aweme/v2/feed") && !C47821Ipl.LJIIJ.getAndSet(true)) {
            C56662Kg.LIZ().LJFF("feed_cookie_before_feed_duration", false);
        }
        LJJII();
        ICronetClient iCronetClient = LIZLLL;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureChecker(LJ);
            ICronetClient iCronetClient2 = LIZLLL;
            Context context = LIZJ;
            InterfaceC64700PaK interfaceC64700PaK = LJIIIIZZ;
            if (interfaceC64700PaK == null) {
                LIZJ2 = false;
            } else {
                LIZJ2 = interfaceC64700PaK.LIZJ();
            }
            HttpURLConnection openConnection = iCronetClient2.openConnection(context, str, LIZJ2, C64735Pat.LJFF, new ExecutorC64806Pc2());
            openConnection.setConnectTimeout(15000);
            openConnection.setReadTimeout(15000);
            int i2 = LJI;
            if (i2 >= 8192 && i2 <= 20971520) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    Reflect.on(openConnection).call("setInputStreamBufferSize", new Class[]{Integer.TYPE}, Integer.valueOf(LJI));
                } catch (Throwable unused2) {
                }
            }
            openConnection.setInstanceFollowRedirects(true);
            T t = c64668PZo.LIZIZ;
            if (t instanceof C64697PaH) {
                long j3 = t.LIZJ;
                if (j3 > 0) {
                    openConnection.setConnectTimeout((int) j3);
                }
                long j4 = t.LIZLLL;
                if (j4 > 0) {
                    openConnection.setReadTimeout((int) j4);
                }
                if (t.LJIIIIZZ > 0) {
                    try {
                        Reflect on = Reflect.on(openConnection);
                        Class<?> cls = Integer.TYPE;
                        on.call("setRequestTimeout", new Class[]{cls}, Integer.valueOf((int) t.LJIIIIZZ));
                        openConnection.setConnectTimeout(0);
                        openConnection.setReadTimeout(0);
                        if (t.LJFF > 0 || t.LJII > 0 || t.LJI > 0) {
                            Reflect.on(openConnection).call("setSocketConnectTimeout", new Class[]{cls}, Integer.valueOf((int) t.LJFF));
                            Reflect.on(openConnection).call("setSocketReadTimeout", new Class[]{cls}, Integer.valueOf((int) t.LJII));
                            Reflect.on(openConnection).call("setSocketWriteTimeout", new Class[]{cls}, Integer.valueOf((int) t.LJI));
                        }
                    } catch (Throwable unused3) {
                    }
                }
                int i3 = t.LJIIJJI;
                if (!t.LJIILJJIL || (i3 & 1) <= 0) {
                    i = 16;
                } else {
                    i = 0;
                }
                if (i > 0) {
                    try {
                        Reflect.on(openConnection).call("setRequestFlag", new Class[]{Integer.TYPE}, Integer.valueOf(i));
                    } catch (Throwable unused4) {
                    }
                }
                if (t.LJIIZILJ) {
                    i3 |= 2;
                }
                if (i3 > 0) {
                    try {
                        Reflect.on(openConnection).call("setRequestTypeFlags", new Class[]{Integer.TYPE}, Integer.valueOf(i3));
                    } catch (Throwable unused5) {
                    }
                }
                j2 = t.LJIIL;
                if (j2 <= 0 || j != 0) {
                    j2 = j;
                }
                if (!t.LJIILIIL) {
                    openConnection.setInstanceFollowRedirects(false);
                }
            } else {
                j2 = j;
            }
            try {
                Reflect.on(openConnection).call("setRequestPriority", new Class[]{Integer.TYPE}, Integer.valueOf(request.getRequestPriorityLevel()));
            } catch (Throwable unused6) {
            }
            if (j2 > 0) {
                try {
                    Reflect.on(openConnection).call("setThrottleNetSpeed", new Class[]{Integer.TYPE}, Long.valueOf(j2));
                } catch (Throwable unused7) {
                }
            }
            openConnection.setRequestMethod(request.getMethod());
            openConnection.setDoInput(true);
            boolean z4 = false;
            for (EJ6 ej6 : request.getHeaders()) {
                if (!C38354F3m.LJ(ej6.LIZ) && !C38354F3m.LJ(ej6.LIZIZ)) {
                    if ("User-Agent".equalsIgnoreCase(ej6.LIZ)) {
                        z4 = true;
                    }
                    openConnection.setRequestProperty(ej6.LIZ, ej6.LIZIZ);
                }
            }
            if (!z4) {
                String str3 = C64735Pat.LJFF;
                if (!C38354F3m.LJ(str3)) {
                    if (LIZLLL != null) {
                        StringBuilder LIZJ3 = b1.LIZJ(str3, " cronet/");
                        LIZJ3.append(LIZLLL.getCronetVersion());
                        str3 = X1D.LIZIZ(LIZJ3);
                    }
                    openConnection.setRequestProperty("User-Agent", str3);
                }
            }
            TypedOutput body = request.getBody();
            if (body != null) {
                openConnection.setDoOutput(true);
                openConnection.setRequestProperty("Content-Type", body.mimeType());
                String md5Stub = body.md5Stub();
                if (md5Stub != null) {
                    openConnection.setRequestProperty("X-SS-STUB", md5Stub);
                }
                if (body instanceof AbsTypedOutput) {
                    AbsTypedOutput absTypedOutput = (AbsTypedOutput) body;
                    if (!TextUtils.isEmpty(absTypedOutput.bodyCompressType())) {
                        str2 = absTypedOutput.bodyCompressType();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        long length = body.length();
                        String path = request.getPath();
                        EJ6 firstHeader = request.getFirstHeader("x-metasec-content-encoding");
                        if (firstHeader != null) {
                            z3 = "1".equals(firstHeader.LIZIZ);
                        }
                        str2 = absTypedOutput.compressRequestBody(path, z3);
                        if (request.getMetrics() != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("duration", System.currentTimeMillis() - currentTimeMillis);
                                jSONObject.put("beforeSize", length);
                                if (!TextUtils.isEmpty(str2)) {
                                    jSONObject.put("type", str2);
                                    jSONObject.put("afterSize", body.length());
                                }
                                request.getMetrics().LJJJLIIL = jSONObject;
                            } catch (JSONException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    }
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    openConnection.setRequestProperty("x-bd-content-encoding", str2);
                }
                long length2 = body.length();
                if (length2 != -1) {
                    openConnection.setFixedLengthStreamingMode((int) length2);
                    openConnection.setRequestProperty("Content-Length", String.valueOf(length2));
                } else {
                    openConnection.setChunkedStreamingMode(4096);
                }
            }
            c64668PZo.LJJ = LJFF(openConnection);
            return openConnection;
        }
        throw new IllegalArgumentException("CronetClient is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(java.lang.String r2, X.C64668PZo r3, java.lang.Exception r4, java.net.HttpURLConnection r5, X.C64738Paw r6) {
        /*
            if (r2 == 0) goto L4
            if (r3 != 0) goto L5
        L4:
            return
        L5:
            org.json.JSONObject r0 = r3.LJJ     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto Lf
            org.json.JSONObject r0 = LJFF(r5)     // Catch: java.lang.Throwable -> L2b
            r3.LJJ = r0     // Catch: java.lang.Throwable -> L2b
        Lf:
            org.json.JSONObject r2 = r3.LJJ     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "ex"
            java.lang.String r0 = r4.getMessage()     // Catch: java.lang.Throwable -> L2b
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = LJIIIIZZ(r5)     // Catch: java.lang.Throwable -> L2b
            boolean r0 = X.C38354F3m.LJ(r2)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L2b
            org.json.JSONObject r1 = r3.LJJ     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "response-headers"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L2b
        L2b:
            java.lang.String r0 = r3.LIZ
            boolean r0 = X.C38354F3m.LJ(r0)
            if (r0 == 0) goto L60
            java.lang.String r1 = r4.getMessage()     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto L3a
            goto L4d
        L3a:
            java.lang.String r0 = "\\|"
            java.lang.String[] r2 = r1.split(r0)     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L4d
            int r1 = r2.length     // Catch: java.lang.Throwable -> L4d
            r0 = 2
            if (r1 < r0) goto L4d
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> L4d
            r0 = 0
            r1 = r2[r0]     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L4d:
            java.lang.String r1 = ""
        L4f:
            boolean r0 = X.C38354F3m.LJ(r1)
            if (r0 != 0) goto L60
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> L60
            r3.LIZ = r1     // Catch: java.lang.Throwable -> L60
            T extends X.PaH r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L60
            r0.LIZ = r1     // Catch: java.lang.Throwable -> L60
        L60:
            java.lang.System.currentTimeMillis()
            long r0 = java.lang.System.currentTimeMillis()
            r3.LJII = r0
            LJIIJJI(r5, r3, r6)
            boolean r0 = r3.LJJI
            if (r0 == 0) goto L77
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.LJJIJ
            r0 = 1
            r1.set(r0)
        L77:
            if (r5 == 0) goto L4
            r5.disconnect()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64693PaD.LJIJI(java.lang.String, X.PZo, java.lang.Exception, java.net.HttpURLConnection, X.Paw):void");
    }

    public static void LJII(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        ICronetClient iCronetClient = LIZLLL;
        if (iCronetClient != null) {
            Reflect on = Reflect.on(iCronetClient);
            Class<?> cls = Boolean.TYPE;
            on.call("enableTTBizHttpDns", new Class[]{cls, String.class, String.class, String.class, cls, String.class}, Boolean.valueOf(z), str, str2, str3, Boolean.valueOf(z2), str4).get();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void LJIIZILJ(String str, String str2, String str3, String str4, String str5, String str6) {
        LIZJ();
        Reflect.on(LIZLLL).call("notifyTNCConfigUpdated", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str5, str6).get();
    }

    public static void LJIJJLI(boolean z, java.util.Map<String, List<String>> map, int i, InputStream inputStream, String str, String str2, C64738Paw c64738Paw) {
        if (inputStream == null) {
            return;
        }
        int[] iArr = new int[1];
        try {
            iArr[0] = 0;
            byte[] LIZJ2 = C64718Pac.LIZJ(z, map, i, inputStream, iArr, c64738Paw);
            C64718Pac.LJ(inputStream);
            int i2 = iArr[0];
            byte[] bArr = new byte[i2];
            if (LIZJ2 != null) {
                if (i2 > 0) {
                    System.arraycopy(LIZJ2, 0, bArr, 0, i2);
                } else {
                    return;
                }
            } else if (i2 <= 0) {
                return;
            }
            if (!C38354F3m.LJ(str) && Logger.debug()) {
                try {
                    C61696OJg c61696OJg = new C61696OJg(str);
                    if ("text".equalsIgnoreCase(c61696OJg.getPrimaryType()) || "application/json".equalsIgnoreCase(c61696OJg.getBaseType())) {
                        String parameter = c61696OJg.getParameter("charset");
                        if (C38354F3m.LJ(parameter)) {
                            parameter = "utf-8";
                        }
                        String str3 = LIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(" response body = ");
                        LIZ2.append(new String(bArr, parameter));
                        LIZ2.append(" for url = ");
                        if (str2 == null) {
                            str2 = "";
                        }
                        LIZ2.append(str2);
                        Logger.d(str3, X1D.LIZIZ(LIZ2));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            C64718Pac.LJ(inputStream);
            throw th;
        }
    }

    public static byte[] LJIL(String str, int i, HttpURLConnection httpURLConnection, C64668PZo c64668PZo, String str2, int i2, C64738Paw c64738Paw) {
        InputStream errorStream;
        InputStream errorStream2;
        if (httpURLConnection == null) {
            return new byte[0];
        }
        boolean equals = "gzip".equals(LJIIJ("Content-Encoding", httpURLConnection));
        ICronetClient iCronetClient = LIZLLL;
        if (iCronetClient != null && iCronetClient.isCronetHttpURLConnection(httpURLConnection)) {
            equals = false;
        }
        String LJIIJ = LJIIJ("Content-Type", httpURLConnection);
        if (i2 == 200 || LJIILJJIL(c64668PZo)) {
            c64668PZo.LJI = System.currentTimeMillis();
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e) {
                if (LJIILJJIL(c64668PZo)) {
                    errorStream = httpURLConnection.getErrorStream();
                } else {
                    throw e;
                }
            }
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] LIZJ2 = C64718Pac.LIZJ(equals, httpURLConnection.getHeaderFields(), i, errorStream, iArr, c64738Paw);
                C64718Pac.LJ(errorStream);
                int i3 = iArr[0];
                byte[] bArr = new byte[i3];
                if (LIZJ2 != null && i3 > 0) {
                    System.arraycopy(LIZJ2, 0, bArr, 0, i3);
                }
                if (C64718Pac.LJFF(LJIIJ)) {
                    C64718Pac.LIZ(i3, bArr);
                }
                System.currentTimeMillis();
                c64668PZo.LJII = System.currentTimeMillis();
                LJIIJJI(httpURLConnection, c64668PZo, c64738Paw);
                try {
                    C64704PaO.LJFF().LJIIIIZZ(httpURLConnection, bArr, new C73098SmU());
                } catch (Throwable unused) {
                }
                return bArr;
            } catch (Throwable th) {
                C64718Pac.LJ(errorStream);
                throw th;
            }
        }
        if (i2 == 304) {
            c64668PZo.LJI = System.currentTimeMillis();
            System.currentTimeMillis();
            c64668PZo.LJII = System.currentTimeMillis();
            LJIIJJI(httpURLConnection, c64668PZo, c64738Paw);
        }
        String responseMessage = httpURLConnection.getResponseMessage();
        try {
            try {
                errorStream2 = httpURLConnection.getInputStream();
            } catch (Exception unused2) {
                errorStream2 = httpURLConnection.getErrorStream();
            }
            LJIJJLI(equals, httpURLConnection.getHeaderFields(), i, errorStream2, LJIIJ, str, c64738Paw);
        } catch (Throwable th2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("reason = ");
            if (responseMessage == null) {
                responseMessage = "";
            }
            responseMessage = C61328O5c.LIZLLL(LIZ2, responseMessage, "  exception = ", th2, LIZ2);
        }
        httpURLConnection.disconnect();
        C64802Pby c64802Pby = new C64802Pby(i2, responseMessage);
        if (i2 == 304) {
            c64802Pby.setInfo(true, true, false, str, str2, c64668PZo);
            throw c64802Pby;
        }
        throw c64802Pby;
    }

    public static void LJIILL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        ICronetClient iCronetClient = LIZLLL;
        if (iCronetClient != null) {
            Reflect.on(iCronetClient).call("notifyStoreRegionUpdated", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str5, str6, str7, str8, str9, str10).get();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }
}
