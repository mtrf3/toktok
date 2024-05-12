package X;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.helios.api.consumer.OperateHistory;
import com.bytedance.helios.api.consumer.OperatePairs;
import com.bytedance.helios.network.api.service.INetworkApiService;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS78S1100000_11;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class PZP implements INetworkApiService {
    public static final LruCache<String, java.util.Map<String, List<String>>> LIZ = new LruCache<>(100);
    public static final LruCache<String, java.util.Map<String, String>> LIZIZ = new LruCache<>(100);

    public static HttpURLConnection LIZJ(C65902Pti c65902Pti) {
        Object obj = c65902Pti.LJLIL.LJLIL.LJ;
        if (obj instanceof HttpURLConnection) {
            return (HttpURLConnection) obj;
        }
        return null;
    }

    public static PZQ LIZLLL(C65902Pti c65902Pti) {
        Object obj = c65902Pti.LJLIL.LJLIL.LJ;
        if (obj instanceof PYW) {
            return ((PYW) obj).LIZLLL;
        }
        if (obj instanceof PYV) {
            return ((PYV) obj).LIZLLL;
        }
        return null;
    }

    public static java.net.URL LJ(C65902Pti c65902Pti) {
        C65901Pth c65901Pth = c65902Pti.LJLIL;
        C65922Pu2 c65922Pu2 = c65901Pth.LJLIL;
        if (c65922Pu2.LIZ != 400000) {
            return null;
        }
        Object obj = c65901Pth.LJZI.LJLJJL;
        if (obj instanceof java.net.URL) {
            return (java.net.URL) obj;
        }
        Object obj2 = c65922Pu2.LJ;
        if (!(obj2 instanceof java.net.URL)) {
            return null;
        }
        return (java.net.URL) obj2;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final Object addInterceptor(Object obj) {
        String protocol;
        Object pyw;
        if (obj != null) {
            java.net.URL url = (java.net.URL) obj;
            URLConnection openConnection = url.openConnection();
            if (s.LJJJLZIJ(openConnection.getClass().getName(), "Cronet", false) || (protocol = url.getProtocol()) == null) {
                return openConnection;
            }
            int hashCode = protocol.hashCode();
            if (hashCode != 3213448) {
                if (hashCode != 99617003 || !protocol.equals("https")) {
                    return openConnection;
                }
                pyw = new PYV((HttpsURLConnection) openConnection);
            } else {
                if (!protocol.equals("http")) {
                    return openConnection;
                }
                pyw = new PYW((HttpURLConnection) openConnection);
            }
            return pyw;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void copyResponseBody(C65902Pti event) {
        Object[] objArr;
        Object obj;
        o.LJIIIZ(event, "event");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null) {
            String headerField = LIZJ.getHeaderField("Content-Type");
            if (headerField == null) {
                headerField = "";
            }
            PZU LIZIZ2 = PZR.LIZIZ(headerField);
            if (LIZIZ2 == null) {
                return;
            }
            String str = LIZIZ2.LIZIZ;
            String str2 = LIZIZ2.LIZJ;
            if (!o.LJ(str, "application") || !o.LJ(str2, "json") || (objArr = event.LJLIL.LJLIL.LJFF) == null || (obj = objArr[0]) == null) {
                return;
            }
            event.LJLLL = obj;
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getContentSubType(C65902Pti event) {
        HttpURLConnection LIZJ;
        String requestProperty;
        o.LJIIIZ(event, "event");
        try {
            LIZJ = LIZJ(event);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (LIZJ != null && (requestProperty = LIZJ.getRequestProperty("Content-Type")) != null) {
            PZU LIZIZ2 = PZR.LIZIZ(requestProperty);
            if (LIZIZ2 == null) {
                return null;
            }
            return LIZIZ2.LIZJ;
        }
        C3C5.m7constructorimpl(null);
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getContentType(C65902Pti event) {
        HttpURLConnection LIZJ;
        String requestProperty;
        o.LJIIIZ(event, "event");
        try {
            LIZJ = LIZJ(event);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (LIZJ != null && (requestProperty = LIZJ.getRequestProperty("Content-Type")) != null) {
            PZU LIZIZ2 = PZR.LIZIZ(requestProperty);
            if (LIZIZ2 == null) {
                return null;
            }
            return LIZIZ2.LIZIZ;
        }
        C3C5.m7constructorimpl(null);
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final java.util.Map<String, String> getCookies(C65902Pti event) {
        java.util.Map<String, List<String>> requestProperties;
        List<String> list;
        o.LJIIIZ(event, "event");
        try {
            HashMap hashMap = new HashMap();
            HttpURLConnection LIZJ = LIZJ(event);
            if (LIZJ != null && (requestProperties = LIZJ.getRequestProperties()) != null && (list = requestProperties.get("cookie")) != null) {
                for (String cookies : list) {
                    java.util.Map<String, String> map = LIZIZ.get(cookies);
                    if (map != null) {
                        hashMap.putAll(map);
                        C65926Pu6.LIZIZ("Helios:Network-Service", new AqS78S1100000_11(map, cookies, 7), 2, null, 8);
                    } else {
                        o.LJIIIIZZ(cookies, "cookies");
                        List LJLJJL = s.LJLJJL(cookies, new String[]{";"}, 0, 6);
                        HashMap hashMap2 = new HashMap();
                        Iterator it = LJLJJL.iterator();
                        while (it.hasNext()) {
                            Object[] array = s.LJLJJL((String) it.next(), new String[]{"="}, 0, 6).toArray(new String[0]);
                            if (array != null) {
                                String[] strArr = (String[]) array;
                                if (strArr.length > 1) {
                                    hashMap2.put(strArr[0], strArr[1]);
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                        LIZIZ.put(cookies, hashMap2);
                        hashMap.putAll(hashMap2);
                        C65926Pu6.LIZIZ("Helios:Network-Service", new AqS78S1100000_11(cookies, hashMap2, 8), 2, null, 8);
                    }
                }
            }
            return hashMap;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return C113554cx.LJJJLIIL();
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getDomain(C65902Pti event) {
        java.net.URL url;
        String host;
        o.LJIIIZ(event, "event");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null && (url = LIZJ.getURL()) != null && (host = url.getHost()) != null) {
            return host;
        }
        java.net.URL LJ = LJ(event);
        if (LJ != null) {
            return LJ.getHost();
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final java.util.Map<String, List<String>> getHeaders(C65902Pti event) {
        java.util.Map<String, List<String>> requestProperties;
        o.LJIIIZ(event, "event");
        try {
            HttpURLConnection LIZJ = LIZJ(event);
            if (LIZJ == null || (requestProperties = LIZJ.getRequestProperties()) == null) {
                return C113554cx.LJJJLIIL();
            }
            return requestProperties;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return C113554cx.LJJJLIIL();
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getMethod(C65902Pti event) {
        String requestMethod;
        o.LJIIIZ(event, "event");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null && (requestMethod = LIZJ.getRequestMethod()) != null) {
            return requestMethod;
        }
        return "";
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getPath(C65902Pti event) {
        java.net.URL url;
        String path;
        o.LJIIIZ(event, "event");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null && (url = LIZJ.getURL()) != null && (path = url.getPath()) != null) {
            return path;
        }
        java.net.URL LJ = LJ(event);
        if (LJ != null) {
            return LJ.getPath();
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final java.util.Map<String, List<String>> getQueries(C65902Pti event) {
        o.LJIIIZ(event, "event");
        HashMap hashMap = new HashMap();
        String url = getUrl(event);
        if (url != null) {
            java.util.Map<String, List<String>> map = LIZ.get(url);
            if (map != null) {
                C65926Pu6.LIZIZ("Helios:Network-Service", new AqS78S1100000_11(map, url, 10), 2, null, 8);
                return map;
            }
            List<UrlQuerySanitizer.ParameterValuePair> parameterList = new UrlQuerySanitizer(url).getParameterList();
            o.LJIIIIZZ(parameterList, "UrlQuerySanitizer(url).parameterList");
            for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : parameterList) {
                String str = parameterValuePair.mParameter;
                o.LJIIIIZZ(str, "it.mParameter");
                List list = (List) hashMap.get(parameterValuePair.mParameter);
                if (list == null) {
                    list = new ArrayList();
                }
                String str2 = parameterValuePair.mValue;
                o.LJIIIIZZ(str2, "it.mValue");
                list.add(str2);
                hashMap.put(str, list);
            }
            LIZ.put(url, hashMap);
            C65926Pu6.LIZIZ("Helios:Network-Service", new AqS78S1100000_11(url, hashMap, 9), 2, null, 8);
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getRequestBody(X.C65902Pti r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.net.HttpURLConnection r2 = LIZJ(r7)
            r5 = 0
            if (r2 == 0) goto L86
            java.lang.String r1 = r2.getRequestMethod()
            java.lang.String r0 = "GET"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L1e
            boolean r0 = r2.getDoOutput()
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
        L1f:
            if (r0 != 0) goto L5d
            return r5
        L22:
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r2.getRequestProperty(r0)
            X.PZU r0 = X.PZR.LIZIZ(r0)
            if (r0 == 0) goto L1e
            java.lang.String r2 = r0.LIZIZ
            java.lang.String r1 = r0.LIZJ
            java.lang.String r0 = "application"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L4b
            java.lang.String r0 = "json"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "x-www-form-urlencoded"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L5b
        L4b:
            java.lang.String r0 = "text"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "plain"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1e
        L5b:
            r0 = 1
            goto L1f
        L5d:
            X.PZQ r0 = LIZLLL(r7)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L68
            java.lang.String r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> L6d
            return r0
        L68:
            X.C3C5.m7constructorimpl(r5)     // Catch: java.lang.Throwable -> L6d
            r4 = r5
            goto L75
        L6d:
            r0 = move-exception
            X.3C4 r4 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r4)
        L75:
            java.lang.Throwable r3 = X.C3C5.m10exceptionOrNullimpl(r4)
            if (r3 == 0) goto L83
            X.PZV r2 = X.PZV.LJLIL
            r1 = 6
            java.lang.String r0 = "Helios:Network-Service"
            X.C65926Pu6.LIZ(r0, r2, r1, r3)
        L83:
            X.C3C5.m6boximpl(r4)
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PZP.getRequestBody(X.Pti):java.lang.String");
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getResContentSubType(C65902Pti event) {
        String headerField;
        PZU LIZIZ2;
        o.LJIIIZ(event, "event");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null && (headerField = LIZJ.getHeaderField("Content-Type")) != null && (LIZIZ2 = PZR.LIZIZ(headerField)) != null) {
            return LIZIZ2.LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getResContentType(C65902Pti event) {
        String headerField;
        PZU LIZIZ2;
        o.LJIIIZ(event, "event");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null && (headerField = LIZJ.getHeaderField("Content-Type")) != null && (LIZIZ2 = PZR.LIZIZ(headerField)) != null) {
            return LIZIZ2.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getResponseBody(C65902Pti event) {
        o.LJIIIZ(event, "event");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null) {
            String headerField = LIZJ.getHeaderField("Content-Type");
            if (headerField == null) {
                headerField = "";
            }
            Object obj = event.LJLLL;
            PZU LIZIZ2 = PZR.LIZIZ(headerField);
            boolean z = false;
            if (LIZIZ2 != null) {
                String str = LIZIZ2.LIZIZ;
                String str2 = LIZIZ2.LIZJ;
                if (o.LJ(str, "application") && o.LJ(str2, "json")) {
                    z = true;
                }
            }
            if (z && (obj instanceof byte[])) {
                Reader inputStreamReader = new InputStreamReader(new ByteArrayInputStream((byte[]) obj), PVC.LIZ);
                if (!(inputStreamReader instanceof BufferedReader)) {
                    inputStreamReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
                }
                try {
                    String LJIILJJIL = C77321UWf.LJIILJJIL(inputStreamReader);
                    AnonymousClass636.LJFF(inputStreamReader, null);
                    return LJIILJJIL;
                } finally {
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final java.util.Map<String, List<String>> getResponseHeaders(C65902Pti event) {
        java.util.Map<String, List<String>> headerFields;
        o.LJIIIZ(event, "event");
        try {
            HttpURLConnection LIZJ = LIZJ(event);
            if (LIZJ == null || (headerFields = LIZJ.getHeaderFields()) == null) {
                return C113554cx.LJJJLIIL();
            }
            return headerFields;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return C113554cx.LJJJLIIL();
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getScheme(C65902Pti event) {
        java.net.URL url;
        String protocol;
        o.LJIIIZ(event, "event");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null && (url = LIZJ.getURL()) != null && (protocol = url.getProtocol()) != null) {
            return protocol;
        }
        java.net.URL LJ = LJ(event);
        if (LJ != null) {
            return LJ.getProtocol();
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getUrl(C65902Pti event) {
        java.net.URL url;
        String url2;
        o.LJIIIZ(event, "event");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null && (url = LIZJ.getURL()) != null && (url2 = url.toString()) != null) {
            return url2;
        }
        java.net.URL LJ = LJ(event);
        if (LJ != null) {
            return LJ.toString();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void initNetworkStackEvent(C65896Ptc networkStackEvent) {
        o.LJIIIZ(networkStackEvent, "networkStackEvent");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        try {
            Object obj = networkStackEvent.LJLIL.LJLIL.LJ;
            if (obj instanceof java.net.URL) {
                ?? obj2 = obj.toString();
                c68322mC.element = obj2;
                android.net.Uri uri = UriProtector.parse(obj2);
                List<android.net.Uri> list = networkStackEvent.LJLILLLLZI;
                o.LJIIIIZZ(uri, "uri");
                list.add(uri);
                networkStackEvent.LJLJLJ = obj;
            }
        } catch (Throwable th) {
            C65926Pu6.LIZ("Helios:Network-Service", new AqS161S0100000_11(c68322mC, 96), 5, th);
        }
    }

    public static void LIZ(boolean z, List list) {
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Locale locale = Locale.ROOT;
                o.LJIIIIZZ(locale, "Locale.ROOT");
                if (str != null) {
                    String lowerCase = str.toLowerCase(locale);
                    o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    arrayList.add(lowerCase);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
    }

    public static void LIZIZ(boolean z, java.util.Map map) {
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj != null) {
                    Locale locale = Locale.ROOT;
                    o.LJIIIIZZ(locale, "Locale.ROOT");
                    if (str != null) {
                        String lowerCase = str.toLowerCase(locale);
                        o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        linkedHashMap.put(lowerCase, obj);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void addCookies(C65902Pti event, java.util.Map<String, String> cookies) {
        boolean z;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(cookies, "cookies");
        PZQ LIZLLL = LIZLLL(event);
        if (LIZLLL != null) {
            ArrayList arrayList = new ArrayList();
            LIZLLL.LIZLLL();
            PZS pzs = LIZLLL.LIZ;
            if (pzs != null) {
                String LIZIZ2 = pzs.LIZIZ("cookie");
                StringBuilder sb = new StringBuilder();
                if (LIZIZ2 == null || LIZIZ2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    sb.append(LIZIZ2);
                    if (!ujb.o.LJJJJ(LIZIZ2, ";", false)) {
                        sb.append(";");
                    }
                }
                for (Map.Entry<String, String> entry : cookies.entrySet()) {
                    sb.append((String) C1FJ.LIZJ(sb, entry.getKey(), "=", entry));
                    sb.append(";");
                    arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
                }
                pzs.LIZLLL("cookie", sb.toString());
                LJFF(event, pzs, "add", "cookie", arrayList);
            }
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void addHeaders(C65902Pti event, java.util.Map<String, String> headers) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(headers, "headers");
        PZQ LIZLLL = LIZLLL(event);
        if (LIZLLL != null) {
            LIZLLL.LIZLLL();
            PZS pzs = LIZLLL.LIZ;
            if (pzs != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    pzs.LIZ(entry.getKey(), entry.getValue());
                    arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
                }
                LJFF(event, pzs, "add", "header", arrayList);
            }
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void addQueries(C65902Pti event, java.util.Map<String, String> queries) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(queries, "queries");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null) {
            ArrayList arrayList = new ArrayList();
            Uri.Builder buildUpon = UriProtector.parse(LIZJ.getURL().toString()).buildUpon();
            for (Map.Entry<String, String> entry : queries.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "uriBuilder.build().toString()");
            LJI(event, uri, "add", arrayList, "query");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void replaceDomain(C65902Pti event, java.util.Map<String, ReplaceConfig> keys) {
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null) {
            android.net.Uri uri = UriProtector.parse(LIZJ.getURL().toString());
            o.LJIIIIZZ(uri, "uri");
            String host = uri.getHost();
            ReplaceConfig replaceConfig = keys.get(host);
            if (replaceConfig == null || (value = replaceConfig.getValue()) == null || ujb.o.LJJJJJL(value)) {
                return;
            }
            String uri2 = uri.buildUpon().authority(value).build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            LJI(event, uri2, "replace", C47261Igj.LJJIJ(new OperatePairs(host, null, value, null, 10, null)), "domain");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void replacePath(C65902Pti event, java.util.Map<String, ReplaceConfig> keys) {
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null) {
            android.net.Uri uri = UriProtector.parse(LIZJ.getURL().toString());
            o.LJIIIIZZ(uri, "uri");
            String path = uri.getPath();
            ReplaceConfig replaceConfig = keys.get(path);
            if (replaceConfig == null || (value = replaceConfig.getValue()) == null || ujb.o.LJJJJJL(value)) {
                return;
            }
            String uri2 = uri.buildUpon().path(value).build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            LJI(event, uri2, "replace", C47261Igj.LJJIJ(new OperatePairs(path, null, value, null, 10, null)), "path");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void replaceScheme(C65902Pti event, java.util.Map<String, ReplaceConfig> keys) {
        String url;
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        java.net.URL LJ = LJ(event);
        if (LJ != null && (url = LJ.toString()) != null) {
            android.net.Uri uri = UriProtector.parse(url);
            o.LJIIIIZZ(uri, "uri");
            String scheme = uri.getScheme();
            ReplaceConfig replaceConfig = keys.get(scheme);
            if (replaceConfig == null || (value = replaceConfig.getValue()) == null || ujb.o.LJJJJJL(value)) {
                return;
            }
            String uri2 = uri.buildUpon().scheme(value).build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            LJI(event, uri2, "replace", C47261Igj.LJJIJ(new OperatePairs(scheme, null, value, null, 10, null)), "scheme");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void dropRequest(C65902Pti event, int i, String message) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(message, "message");
        C65901Pth c65901Pth = event.LJLIL;
        Object obj = c65901Pth.LJLIL.LJ;
        if (obj instanceof PYW) {
            c65901Pth.LJZI.LJLJJI = true;
            PYW pyw = (PYW) obj;
            pyw.LIZ = i;
            pyw.LIZIZ = message;
            return;
        }
        if (!(obj instanceof PYV)) {
            return;
        }
        c65901Pth.LJZI.LJLJJI = true;
        PYV pyv = (PYV) obj;
        pyv.LIZ = i;
        pyv.LIZIZ = message;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void removeCookies(C65902Pti event, List<String> keys, boolean z) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        PZQ LIZLLL = LIZLLL(event);
        if (LIZLLL != null) {
            LIZLLL.LIZLLL();
            PZS pzs = LIZLLL.LIZ;
            if (pzs != null) {
                String LIZIZ2 = pzs.LIZIZ("cookie");
                pzs.LIZJ("cookie");
                LIZ(z, keys);
                ArrayList arrayList = new ArrayList();
                if (LIZIZ2 != null) {
                    List<String> LJLJJL = s.LJLJJL(LIZIZ2, new String[]{";"}, 0, 6);
                    StringBuilder sb = new StringBuilder();
                    for (String str : LJLJJL) {
                        Object[] array = s.LJLJJL(str, new String[]{"="}, 0, 6).toArray(new String[0]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            if (strArr.length < 2) {
                                sb.append(str);
                                sb.append(";");
                            } else {
                                String str2 = strArr[0];
                                if (z) {
                                    Locale locale = Locale.ROOT;
                                    o.LJIIIIZZ(locale, "Locale.ROOT");
                                    if (str2 != null) {
                                        str2 = str2.toLowerCase(locale);
                                        o.LJIIIIZZ(str2, "(this as java.lang.String).toLowerCase(locale)");
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }
                                }
                                if (keys.contains(str2)) {
                                    arrayList.add(new OperatePairs(strArr[0], strArr[1], null, null, 12, null));
                                } else {
                                    sb.append(str);
                                    sb.append(";");
                                }
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    pzs.LIZ("cookie", sb.toString());
                }
                LJFF(event, pzs, "remove", "cookie", arrayList);
            }
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void removeHeaders(C65902Pti event, List<String> keys, boolean z) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        PZQ LIZLLL = LIZLLL(event);
        if (LIZLLL != null) {
            ArrayList arrayList = new ArrayList();
            LIZLLL.LIZLLL();
            PZS pzs = LIZLLL.LIZ;
            if (pzs != null) {
                for (String str : keys) {
                    String LIZIZ2 = pzs.LIZIZ(str);
                    if (LIZIZ2 != null && LIZIZ2.length() != 0) {
                        arrayList.add(new OperatePairs(str, pzs.LIZIZ(str), null, null, 12, null));
                    }
                    pzs.LIZJ(str);
                }
                LJFF(event, pzs, "remove", "header", arrayList);
            }
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void removeQueries(C65902Pti event, List<String> keys, boolean z) {
        String str;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null) {
            ArrayList arrayList = new ArrayList();
            android.net.Uri uri = UriProtector.parse(LIZJ.getURL().toString());
            o.LJIIIIZZ(uri, "uri");
            java.util.Set<String> queryNameSet = UriProtector.getQueryParameterNames(uri);
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            LIZ(z, keys);
            o.LJIIIIZZ(queryNameSet, "queryNameSet");
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : queryNameSet) {
                String it = str2;
                o.LJIIIIZZ(it, "it");
                if (z) {
                    Locale locale = Locale.ROOT;
                    str = C141415gn.LIZIZ(locale, "Locale.ROOT", it, locale, "(this as java.lang.String).toLowerCase(locale)");
                } else {
                    str = it;
                }
                boolean contains = keys.contains(str);
                if (contains) {
                    arrayList.add(new OperatePairs(it, UriProtector.getQueryParameter(uri, it), null, null, 12, null));
                    if (!contains) {
                    }
                }
                arrayList2.add(str2);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                clearQuery.appendQueryParameter(str3, UriProtector.getQueryParameter(uri, str3));
            }
            String uri2 = clearQuery.build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            LJI(event, uri2, "remove", arrayList, "query");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void replaceCookies(C65902Pti event, java.util.Map<String, ReplaceConfig> keys, boolean z) {
        String LIZIZ2;
        boolean z2;
        String str;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        PZQ LIZLLL = LIZLLL(event);
        if (LIZLLL != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            LIZIZ(z, keys);
            LIZLLL.LIZLLL();
            PZS pzs = LIZLLL.LIZ;
            if (pzs != null && (LIZIZ2 = pzs.LIZIZ("cookie")) != null) {
                int i = 6;
                for (String str2 : s.LJLJJL(LIZIZ2, new String[]{";"}, 0, 6)) {
                    Object[] array = s.LJLJJL(str2, new String[]{"="}, 0, i).toArray(new String[0]);
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        if (strArr.length < 2) {
                            sb.append(str2);
                            sb.append(";");
                        } else {
                            String str3 = strArr[0];
                            if (z) {
                                Locale locale = Locale.ROOT;
                                o.LJIIIIZZ(locale, "Locale.ROOT");
                                if (str3 != null) {
                                    str3 = str3.toLowerCase(locale);
                                    o.LJIIIIZZ(str3, "(this as java.lang.String).toLowerCase(locale)");
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                            }
                            ReplaceConfig replaceConfig = keys.get(str3);
                            if (replaceConfig == null) {
                                sb.append(str2);
                                sb.append(";");
                            } else {
                                String str4 = null;
                                if (o.LJ(replaceConfig.getTarget(), "value")) {
                                    sb.append(strArr[0]);
                                    sb.append("=");
                                    sb.append(replaceConfig.getValue());
                                    sb.append(";");
                                    str = replaceConfig.getValue();
                                    z2 = !TextUtils.equals(strArr[1], str);
                                } else {
                                    sb.append(replaceConfig.getValue());
                                    sb.append("=");
                                    sb.append(strArr[1]);
                                    sb.append(";");
                                    String value = replaceConfig.getValue();
                                    if (!TextUtils.equals(strArr[0], value)) {
                                        z2 = true;
                                        str = null;
                                        str4 = value;
                                    }
                                }
                                if (z2) {
                                    arrayList.add(new OperatePairs(strArr[0], strArr[1], str4, str));
                                }
                            }
                            i = 6;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                pzs.LIZJ("cookie");
                pzs.LIZ("cookie", sb.toString());
                LJFF(event, pzs, "replace", "cookie", arrayList);
            }
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void replaceHeaders(C65902Pti event, java.util.Map<String, ReplaceConfig> keys, boolean z) {
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        PZQ LIZLLL = LIZLLL(event);
        if (LIZLLL != null) {
            ArrayList arrayList = new ArrayList();
            LIZLLL.LIZLLL();
            PZS pzs = LIZLLL.LIZ;
            if (pzs != null) {
                for (Map.Entry<String, ReplaceConfig> entry : keys.entrySet()) {
                    String LIZIZ2 = pzs.LIZIZ(entry.getKey());
                    if (LIZIZ2 != null && LIZIZ2.length() != 0) {
                        ReplaceConfig value2 = entry.getValue();
                        String str = null;
                        if (o.LJ(value2.getTarget(), "value")) {
                            pzs.LIZLLL(entry.getKey(), value2.getValue());
                            value = value2.getValue();
                            if (!TextUtils.equals(LIZIZ2, value)) {
                                arrayList.add(new OperatePairs(entry.getKey(), LIZIZ2, str, value));
                            }
                        } else {
                            pzs.LIZJ(entry.getKey());
                            pzs.LIZLLL(value2.getValue(), LIZIZ2);
                            String value3 = value2.getValue();
                            value = null;
                            str = value3;
                            if (true ^ TextUtils.equals(entry.getKey(), value3)) {
                                arrayList.add(new OperatePairs(entry.getKey(), LIZIZ2, str, value));
                            }
                        }
                    }
                }
                LJFF(event, pzs, "replace", "header", arrayList);
            }
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void replaceQueries(C65902Pti event, java.util.Map<String, ReplaceConfig> keys, boolean z) {
        String str;
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        HttpURLConnection LIZJ = LIZJ(event);
        if (LIZJ != null) {
            android.net.Uri uri = UriProtector.parse(LIZJ.getURL().toString());
            o.LJIIIIZZ(uri, "uri");
            java.util.Set<String> queryNameSet = UriProtector.getQueryParameterNames(uri);
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            LIZIZ(z, keys);
            ArrayList arrayList = new ArrayList();
            o.LJIIIIZZ(queryNameSet, "queryNameSet");
            for (String it : queryNameSet) {
                o.LJIIIIZZ(it, "it");
                if (z) {
                    Locale locale = Locale.ROOT;
                    str = C141415gn.LIZIZ(locale, "Locale.ROOT", it, locale, "(this as java.lang.String).toLowerCase(locale)");
                } else {
                    str = it;
                }
                ReplaceConfig replaceConfig = keys.get(str);
                if (replaceConfig == null) {
                    clearQuery.appendQueryParameter(it, UriProtector.getQueryParameter(uri, it));
                } else {
                    String queryParameter = UriProtector.getQueryParameter(uri, it);
                    String str2 = null;
                    if (o.LJ(replaceConfig.getTarget(), "value")) {
                        clearQuery.appendQueryParameter(it, replaceConfig.getValue());
                        value = replaceConfig.getValue();
                        if (!TextUtils.equals(queryParameter, value)) {
                            arrayList.add(new OperatePairs(it, UriProtector.getQueryParameter(uri, it), str2, value));
                        }
                    } else {
                        clearQuery.appendQueryParameter(replaceConfig.getValue(), queryParameter);
                        String value2 = replaceConfig.getValue();
                        value = null;
                        str2 = value2;
                        if (true ^ TextUtils.equals(it, value2)) {
                            arrayList.add(new OperatePairs(it, UriProtector.getQueryParameter(uri, it), str2, value));
                        }
                    }
                }
            }
            String uri2 = clearQuery.build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            LJI(event, uri2, "replace", arrayList, "query");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r3 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00da, code lost:
    
        if (r10 >= r9) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C65902Pti r12, X.PZS r13, java.lang.String r14, java.lang.String r15, java.util.List r16) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PZP.LJFF(X.Pti, X.PZS, java.lang.String, java.lang.String, java.util.List):void");
    }

    public static void LJI(C65902Pti c65902Pti, String str, String str2, List list, String str3) {
        Object LIZ2;
        if (list.isEmpty()) {
            return;
        }
        C65901Pth c65901Pth = c65902Pti.LJLIL;
        if (c65901Pth.LJLIL.LIZ != 400000) {
            PZQ LIZLLL = LIZLLL(c65902Pti);
            if (LIZLLL != null) {
                LIZLLL.LIZLLL();
                try {
                    Field field = PZQ.LJIIIZ;
                    if (field == null) {
                        PZQ.LJIIIZ = PZQ.LIZ(URLConnection.class, field, "url");
                    }
                    Field field2 = PZQ.LJIIIZ;
                    if (field2 != null) {
                        field2.set(LIZLLL.LJFF, new java.net.URL(str));
                    }
                    Field field3 = PZQ.LJIIIZ;
                    if (field3 != null) {
                        field3.set(LIZLLL.LIZJ, new java.net.URL(str));
                        LIZ2 = C76800UCe.LIZ;
                    } else {
                        LIZ2 = null;
                    }
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
                if (m10exceptionOrNullimpl != null) {
                    C65926Pu6.LIZ("Helios:Network-Service", C64655PZb.LJLIL, 6, m10exceptionOrNullimpl);
                }
            }
        } else {
            c65901Pth.LJZI.LJLJJL = new java.net.URL(str);
        }
        C65901Pth c65901Pth2 = c65902Pti.LJLIL;
        c65901Pth2.LJZI.LJLJI = true;
        c65901Pth2.LJLZ.add(new OperateHistory(str2, str3, list));
        c65902Pti.LJLJJI = str;
        switch (str3.hashCode()) {
            case -1326197564:
                if (!str3.equals("domain")) {
                    return;
                }
                c65902Pti.LJLJJLL = null;
                return;
            case -907987547:
                if (!str3.equals("scheme")) {
                    return;
                }
                c65902Pti.LJLJJL = null;
                return;
            case 3433509:
                if (!str3.equals("path")) {
                    return;
                }
                c65902Pti.LJLJL = null;
                return;
            case 107944136:
                if (!str3.equals("query")) {
                    return;
                }
                c65902Pti.LJLLLL = null;
                return;
            default:
                return;
        }
    }
}
