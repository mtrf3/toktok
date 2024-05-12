package X;

import Y.ARunnableS8S0201000_5;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q3s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66388Q3s {
    public static URLConnection LIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "545306107942907932"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.HttpURLConnection LIZIZ(java.net.URL r9) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66388Q3s.LIZIZ(java.net.URL):java.net.HttpURLConnection");
    }

    public static List LIZJ(C66390Q3u c66390Q3u) {
        HttpURLConnection httpURLConnection;
        List LIZ;
        Q4J.LJ(c66390Q3u);
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = LJIIL(c66390Q3u);
            e = null;
        } catch (Exception e) {
            e = e;
            httpURLConnection = null;
        } catch (Throwable th) {
            th = th;
            C66373Q3d.LJIIJ(httpURLConnection2);
            throw th;
        }
        try {
            if (httpURLConnection != null) {
                LIZ = LIZLLL(c66390Q3u, httpURLConnection);
            } else {
                LIZ = C66380Q3k.LIZ(c66390Q3u.LJLJI, null, new Q4W(e));
                LJIIIZ(c66390Q3u, LIZ);
            }
            C66373Q3d.LJIIJ(httpURLConnection);
            return LIZ;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            C66373Q3d.LJIIJ(httpURLConnection2);
            throw th;
        }
    }

    public static boolean LJ(Object obj) {
        if ((obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof android.net.Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof GraphRequest.ParcelableResourceWithMimeType)) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(Object obj) {
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date)) {
            return true;
        }
        return false;
    }

    public static String LJII(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            o.LJIIIIZZ(format, "iso8601DateFormat.format(value)");
            return format;
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    public static HttpURLConnection LJIIL(C66390Q3u c66390Q3u) {
        java.net.URL url;
        Iterator<GraphRequest> it = c66390Q3u.iterator();
        while (it.hasNext()) {
            GraphRequest next = it.next();
            if (EnumC66377Q3h.GET == next.LJFF && C66373Q3d.LJIJJ(next.LIZJ.getString("fields"))) {
                EnumC66383Q3n behavior = EnumC66383Q3n.DEVELOPER_ERRORS;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("GET requests for /");
                String str = next.LIZIZ;
                if (str == null) {
                    str = "";
                }
                LIZ.append(str);
                LIZ.append(" should contain an explicit \"fields\" parameter.");
                String string = X1D.LIZIZ(LIZ);
                o.LJIIIZ(behavior, "behavior");
                o.LJIIIZ(string, "string");
                u.LJIIIIZZ(behavior);
            }
        }
        try {
            if (c66390Q3u.size() == 1) {
                url = new java.net.URL(((GraphRequest) ((ArrayList) c66390Q3u.LJLJI).get(0)).LJI());
            } else {
                String LLLZ = C16880lQ.LLLZ("https://graph.%s", Arrays.copyOf(new Object[]{u.LJFF()}, 1));
                o.LJIIIIZZ(LLLZ, "java.lang.String.format(format, *args)");
                url = new java.net.URL(LLLZ);
            }
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = LIZIZ(url);
                LJIIJJI(c66390Q3u, httpURLConnection);
                return httpURLConnection;
            } catch (IOException e) {
                C66373Q3d.LJIIJ(httpURLConnection);
                throw new Q4W("could not construct request body", e);
            } catch (JSONException e2) {
                C66373Q3d.LJIIJ(httpURLConnection);
                throw new Q4W("could not construct request body", e2);
            }
        } catch (MalformedURLException e3) {
            throw new Q4W("could not construct URL for request", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if ((r8 - r10.lastRefresh.getTime()) > 86400000) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZLLL(X.C66390Q3u r9, java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "requests"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r4 = "Response <Error>: %s"
            r3 = 0
            r6 = 1
            r8 = 0
            boolean r0 = m43.u.LJI()     // Catch: java.lang.Exception -> L34 X.Q4W -> L48 java.lang.Throwable -> Lef
            if (r0 == 0) goto L2c
            int r1 = r10.getResponseCode()     // Catch: java.lang.Exception -> L34 X.Q4W -> L48 java.lang.Throwable -> Lef
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L27
            java.io.InputStream r3 = r10.getErrorStream()     // Catch: java.lang.Exception -> L34 X.Q4W -> L48 java.lang.Throwable -> Lef
        L22:
            java.util.List r7 = X.C66380Q3k.LIZJ(r3, r10, r9)     // Catch: java.lang.Exception -> L34 X.Q4W -> L48 java.lang.Throwable -> Lef
            goto L56
        L27:
            java.io.InputStream r3 = r10.getInputStream()     // Catch: java.lang.Exception -> L34 X.Q4W -> L48 java.lang.Throwable -> Lef
            goto L22
        L2c:
            java.lang.String r1 = "GraphRequest can't be used when Facebook SDK isn't fully initialized"
            X.Q4W r0 = new X.Q4W     // Catch: java.lang.Exception -> L34 X.Q4W -> L48 java.lang.Throwable -> Lef
            r0.<init>(r1)     // Catch: java.lang.Exception -> L34 X.Q4W -> L48 java.lang.Throwable -> Lef
            throw r0     // Catch: java.lang.Exception -> L34 X.Q4W -> L48 java.lang.Throwable -> Lef
        L34:
            r2 = move-exception
            X.Q3n r1 = X.EnumC66383Q3n.REQUESTS     // Catch: java.lang.Throwable -> Lef
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lef
            r0[r8] = r2     // Catch: java.lang.Throwable -> Lef
            X.Q44.LIZ(r1, r4, r0)     // Catch: java.lang.Throwable -> Lef
            X.Q4W r0 = new X.Q4W     // Catch: java.lang.Throwable -> Lef
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lef
            java.util.List r7 = X.C66380Q3k.LIZ(r9, r10, r0)     // Catch: java.lang.Throwable -> Lef
            goto L56
        L48:
            r2 = move-exception
            X.Q3n r1 = X.EnumC66383Q3n.REQUESTS     // Catch: java.lang.Throwable -> Lef
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lef
            r0[r8] = r2     // Catch: java.lang.Throwable -> Lef
            X.Q44.LIZ(r1, r4, r0)     // Catch: java.lang.Throwable -> Lef
            java.util.List r7 = X.C66380Q3k.LIZ(r9, r10, r2)     // Catch: java.lang.Throwable -> Lef
        L56:
            X.C66373Q3d.LIZJ(r3)
            X.C66373Q3d.LJIIJ(r10)
            int r1 = r9.size()
            int r0 = r7.size()
            if (r1 != r0) goto Lcc
            LJIIIZ(r9, r7)
            X.Q45 r0 = X.C66393Q3x.LJFF
            X.Q3x r5 = r0.LIZ()
            com.facebook.AccessToken r10 = r5.LIZJ
            if (r10 != 0) goto L9d
        L73:
            r6 = 0
        L74:
            if (r6 != 0) goto L77
        L76:
            return r7
        L77:
            android.os.Looper r1 = X.C16880lQ.LLJJJJ()
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L89
            r5.LIZ()
            goto L76
        L89:
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            r2.<init>(r0)
            Y.ARunnableS47S0100000_11 r1 = new Y.ARunnableS47S0100000_11
            r0 = 121(0x79, float:1.7E-43)
            r1.<init>(r5, r0)
            r2.post(r1)
            goto L76
        L9d:
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r8 = r0.getTime()
            X.Q3p r0 = r10.source
            boolean r0 = r0.canExtendToken()
            if (r0 == 0) goto L73
            java.util.Date r0 = r5.LJ
            long r0 = r0.getTime()
            long r3 = r8 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L73
            java.util.Date r0 = r10.lastRefresh
            long r0 = r0.getTime()
            long r8 = r8 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L73
            goto L74
        Lcc:
            X.Q4W r5 = new X.Q4W
            java.util.Locale r4 = java.util.Locale.US
            r3 = 2
            java.lang.Object[] r2 = new java.lang.Object[r3]
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r8] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r6] = r0
            java.lang.String r1 = "Received %d responses while expecting %d"
            java.lang.String r0 = "java.lang.String.format(locale, format, *args)"
            java.lang.String r0 = X.C63144OqK.LIZIZ(r2, r3, r4, r1, r0)
            r5.<init>(r0)
            throw r5
        Lef:
            r0 = move-exception
            X.C66373Q3d.LIZJ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66388Q3s.LIZLLL(X.Q3u, java.net.HttpURLConnection):java.util.List");
    }

    public static void LJIIIZ(C66390Q3u requests, List list) {
        o.LJIIIZ(requests, "requests");
        int size = requests.size();
        ArrayList arrayList = new ArrayList();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                GraphRequest graphRequest = (GraphRequest) ((ArrayList) requests.LJLJI).get(i);
                if (graphRequest.LJ != null) {
                    arrayList.add(new Pair(graphRequest.LJ, list.get(i)));
                }
                if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (arrayList.size() > 0) {
            ARunnableS8S0201000_5 aRunnableS8S0201000_5 = new ARunnableS8S0201000_5(1, arrayList, requests, 1);
            Handler handler = requests.LJLIL;
            if (handler == null || Boolean.valueOf(handler.post(aRunnableS8S0201000_5)) == null) {
                aRunnableS8S0201000_5.run();
            }
        }
    }

    public static void LJIIJ(java.util.Map map, C66389Q3t c66389Q3t) {
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            if (LJ(((Q47) entry.getValue()).LIZIZ)) {
                c66389Q3t.LJFF((String) entry.getKey(), ((Q47) entry.getValue()).LIZIZ, ((Q47) entry.getValue()).LIZ);
            }
        }
    }

    public static void LJIIJJI(C66390Q3u c66390Q3u, HttpURLConnection httpURLConnection) {
        boolean z;
        EnumC66377Q3h enumC66377Q3h;
        Throwable th;
        C66395Q3z c66395Q3z = new C66395Q3z(EnumC66383Q3n.REQUESTS);
        int size = c66390Q3u.size();
        Iterator<GraphRequest> it = c66390Q3u.iterator();
        loop0: while (true) {
            if (it.hasNext()) {
                GraphRequest next = it.next();
                Iterator<String> it2 = next.LIZJ.keySet().iterator();
                while (it2.hasNext()) {
                    if (LJ(C16880lQ.LLJJIII(next.LIZJ, it2.next()))) {
                        z = false;
                        break loop0;
                    }
                }
            } else {
                z = true;
                break;
            }
        }
        if (size != 1 || (enumC66377Q3h = ((GraphRequest) ((ArrayList) c66390Q3u.LJLJI).get(0)).LJFF) == null) {
            enumC66377Q3h = EnumC66377Q3h.POST;
        }
        httpURLConnection.setRequestMethod(enumC66377Q3h.name());
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            String LLLZ = C16880lQ.LLLZ("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.LJII}, 1));
            o.LJIIIIZZ(LLLZ, "java.lang.String.format(format, *args)");
            httpURLConnection.setRequestProperty("Content-Type", LLLZ);
        }
        java.net.URL url = httpURLConnection.getURL();
        c66395Q3z.LIZJ();
        c66395Q3z.LIZ(c66390Q3u.LJLILLLLZI, "Id");
        o.LJIIIIZZ(url, "url");
        c66395Q3z.LIZ(url, "URL");
        String requestMethod = httpURLConnection.getRequestMethod();
        o.LJIIIIZZ(requestMethod, "connection.requestMethod");
        c66395Q3z.LIZ(requestMethod, "Method");
        String requestProperty = httpURLConnection.getRequestProperty("User-Agent");
        o.LJIIIIZZ(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
        c66395Q3z.LIZ(requestProperty, "User-Agent");
        String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
        o.LJIIIIZZ(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
        c66395Q3z.LIZ(requestProperty2, "Content-Type");
        httpURLConnection.setConnectTimeout(0);
        httpURLConnection.setReadTimeout(0);
        if (enumC66377Q3h == EnumC66377Q3h.POST) {
            httpURLConnection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                if (z) {
                    try {
                        bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream.close();
                        throw th;
                    }
                }
                try {
                    Iterator it3 = ((ArrayList) c66390Q3u.LJLJJI).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((BMW) it3.next()) instanceof Q4C) {
                                break;
                            }
                        } else {
                            Iterator<GraphRequest> it4 = c66390Q3u.iterator();
                            while (it4.hasNext()) {
                                if (it4.next().LJ instanceof Q48) {
                                }
                            }
                        }
                    }
                    Q41 q41 = new Q41(c66390Q3u.LJLIL);
                    LJIIIIZZ(c66390Q3u, null, size, q41, z);
                    bufferedOutputStream = new Q42(bufferedOutputStream, c66390Q3u, q41.LJLILLLLZI, q41.LJLJJL);
                    LJIIIIZZ(c66390Q3u, c66395Q3z, size, bufferedOutputStream, z);
                    bufferedOutputStream.close();
                    c66395Q3z.LIZIZ();
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    if (bufferedOutputStream == null) {
                        throw th;
                    }
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        c66395Q3z.LIZIZ();
    }

    public static GraphRequest LJI(AccessToken accessToken, String str, BMV bmv) {
        return new GraphRequest(accessToken, str, null, null, bmv, 32);
    }

    public static void LJIIIIZZ(C66390Q3u c66390Q3u, C66395Q3z c66395Q3z, int i, OutputStream outputStream, boolean z) {
        String LIZLLL;
        C66389Q3t c66389Q3t = new C66389Q3t(outputStream, c66395Q3z, z);
        if (i == 1) {
            GraphRequest graphRequest = (GraphRequest) ((ArrayList) c66390Q3u.LJLJI).get(0);
            HashMap hashMap = new HashMap();
            for (String key : graphRequest.LIZJ.keySet()) {
                Object LLJJIII = C16880lQ.LLJJIII(graphRequest.LIZJ, key);
                if (LJ(LLJJIII)) {
                    o.LJIIIIZZ(key, "key");
                    hashMap.put(key, new Q47(graphRequest, LLJJIII));
                }
            }
            if (c66395Q3z != null) {
                c66395Q3z.LIZJ();
            }
            Bundle bundle = graphRequest.LIZJ;
            for (String key2 : bundle.keySet()) {
                Object LLJJIII2 = C16880lQ.LLJJIII(bundle, key2);
                if (LJFF(LLJJIII2)) {
                    o.LJIIIIZZ(key2, "key");
                    c66389Q3t.LJFF(key2, LLJJIII2, graphRequest);
                }
            }
            if (c66395Q3z != null) {
                c66395Q3z.LIZJ();
            }
            LJIIJ(hashMap, c66389Q3t);
            return;
        }
        Iterator<GraphRequest> it = c66390Q3u.iterator();
        while (true) {
            if (it.hasNext()) {
                AccessToken accessToken = it.next().LIZ;
                if (accessToken != null) {
                    LIZLLL = accessToken.applicationId;
                    break;
                }
            } else {
                LIZLLL = u.LIZLLL();
                break;
            }
        }
        if (LIZLLL.length() == 0) {
            throw new Q4W("App ID was not specified at the request or Settings.");
        }
        c66389Q3t.LJII("batch_app_id", LIZLLL);
        HashMap hashMap2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator<GraphRequest> it2 = c66390Q3u.iterator();
        while (it2.hasNext()) {
            GraphRequest next = it2.next();
            next.getClass();
            JSONObject jSONObject = new JSONObject();
            String LLLZ = C16880lQ.LLLZ("https://graph.%s", Arrays.copyOf(new Object[]{u.LJFF()}, 1));
            o.LJIIIIZZ(LLLZ, "java.lang.String.format(format, *args)");
            String LJII = next.LJII(LLLZ);
            next.LIZ();
            android.net.Uri parse = android.net.Uri.parse(next.LIZIZ(LJII, true));
            int i2 = 2;
            String LLLZ2 = C16880lQ.LLLZ("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            o.LJIIIIZZ(LLLZ2, "java.lang.String.format(format, *args)");
            jSONObject.put("relative_url", LLLZ2);
            jSONObject.put("method", next.LJFF);
            AccessToken accessToken2 = next.LIZ;
            if (accessToken2 != null) {
                String accessToken3 = accessToken2.token;
                Q44 q44 = C66395Q3z.LIZLLL;
                synchronized (q44) {
                    o.LJIIIZ(accessToken3, "accessToken");
                    u.LJIIIIZZ(EnumC66383Q3n.INCLUDE_ACCESS_TOKENS);
                    q44.LIZIZ(accessToken3);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = next.LIZJ.keySet().iterator();
            while (it3.hasNext()) {
                Object LLJJIII3 = C16880lQ.LLJJIII(next.LIZJ, it3.next());
                if (LJ(LLJJIII3)) {
                    Locale locale = Locale.ROOT;
                    Object[] objArr = new Object[i2];
                    objArr[0] = "file";
                    objArr[1] = Integer.valueOf(hashMap2.size());
                    String LLLZI = C16880lQ.LLLZI(locale, "%s%d", Arrays.copyOf(objArr, i2));
                    o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
                    arrayList.add(LLLZI);
                    hashMap2.put(LLLZI, new Q47(next, LLJJIII3));
                    i2 = 2;
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject.put("attached_files", TextUtils.join(",", arrayList));
            }
            jSONArray.put(jSONObject);
        }
        Closeable closeable = c66389Q3t.LIZ;
        if (!(closeable instanceof Q4D)) {
            String jSONArray2 = jSONArray.toString();
            o.LJIIIIZZ(jSONArray2, "requestJsonArray.toString()");
            c66389Q3t.LJII("batch", jSONArray2);
        } else {
            Q4D q4d = (Q4D) closeable;
            c66389Q3t.LIZIZ("batch", null, null);
            c66389Q3t.LIZ("[", new Object[0]);
            Iterator<GraphRequest> it4 = c66390Q3u.iterator();
            int i3 = 0;
            while (it4.hasNext()) {
                int i4 = i3 + 1;
                GraphRequest next2 = it4.next();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                q4d.LIZ(next2);
                if (i3 > 0) {
                    c66389Q3t.LIZ(",%s", jSONObject2.toString());
                } else {
                    c66389Q3t.LIZ("%s", jSONObject2.toString());
                }
                i3 = i4;
            }
            c66389Q3t.LIZ("]", new Object[0]);
            C66395Q3z c66395Q3z2 = c66389Q3t.LIZIZ;
            if (c66395Q3z2 != null) {
                String LJIILLIIL = o.LJIILLIIL("batch", "    ");
                String jSONArray3 = jSONArray.toString();
                o.LJIIIIZZ(jSONArray3, "requestJsonArray.toString()");
                c66395Q3z2.LIZ(jSONArray3, LJIILLIIL);
            }
        }
        if (c66395Q3z != null) {
            c66395Q3z.LIZJ();
        }
        LJIIJ(hashMap2, c66389Q3t);
    }
}
