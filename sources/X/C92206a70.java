package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* renamed from: X.a70, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92206a70 extends AbstractC66805QJt {
    public static final HostnameVerifier LIZIZ = new C91881a1l();

    public static URLConnection LJIIIIZZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "9152237138399325359"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static URLConnection LJI(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LJIIIIZZ(url);
        }
        PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
        PPD ppd = LJFF.LJFF;
        if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
            URLConnection uRLConnection2 = uRLConnection;
            if (uRLConnection2 instanceof HttpsURLConnection) {
                pyu2 = new PYT((HttpsURLConnection) uRLConnection2);
            } else {
                if (!(uRLConnection2 instanceof HttpURLConnection)) {
                    return uRLConnection2;
                }
                pyu2 = new PYU((HttpURLConnection) uRLConnection2);
            }
            return pyu2;
        }
        if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
            URLConnection LJIIIIZZ = LJIIIIZZ(url);
            if (LJIIIIZZ instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LJIIIIZZ);
            } else {
                if (!(LJIIIIZZ instanceof HttpURLConnection)) {
                    return LJIIIIZZ;
                }
                pyu = new PYU((HttpURLConnection) LJIIIIZZ);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public static void LJII(String str, java.util.Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        new StringBuilder(str);
        str.indexOf(63);
        C48189Ivh.LIZJ(arrayList);
    }

    @Override // X.AbstractC66805QJt
    public final String LIZIZ(String str, java.util.Map<String, String> map, QKY qky) {
        try {
            if (!TextUtils.isDigitsOnly(str)) {
                return LJIIIZ(str, null, map, "GET", false, qky);
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof C64802Pby) {
                throw new C36616EYq(th.getStatusCode(), th.getMessage());
            }
            throw new C36616EYq(0, th.getMessage());
        }
    }

    @Override // X.AbstractC66805QJt
    public final String LIZLLL(String str, List<Pair<String, String>> list, java.util.Map<String, String> map, QKY qky) {
        try {
            StringBuilder sb = new StringBuilder("");
            int i = 0;
            while (true) {
                if (i < ((ArrayList) list).size()) {
                    Pair pair = (Pair) ListProtector.get(list, i);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append((String) pair.first);
                    LIZ.append("=");
                    LIZ.append(URLEncoder.encode((String) pair.second, "UTF-8"));
                    sb.append(X1D.LIZIZ(LIZ));
                    if (i < r7.size() - 1) {
                        sb.append("&");
                    }
                    i++;
                } else {
                    byte[] bytes = sb.toString().getBytes("UTF-8");
                    HashMap hashMap = new HashMap();
                    qky.getClass();
                    return LJ(str, bytes, hashMap, qky);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            throw new C36616EYq(0, e.getMessage());
        }
    }

    @Override // X.AbstractC66805QJt
    public final String LJ(String str, byte[] bArr, java.util.Map<String, String> map, QKY qky) {
        try {
            return LJIIIZ(str, bArr, map, "POST", true, qky);
        } catch (Throwable th) {
            if (th instanceof C64802Pby) {
                throw new C36616EYq(th.getStatusCode(), th.getMessage());
            }
            throw new C36616EYq(0, th.getMessage());
        }
    }

    public static String LJIIIZ(String str, byte[] bArr, java.util.Map<String, String> map, String str2, boolean z, QKY qky) {
        HttpURLConnection httpURLConnection;
        String str3;
        String str4;
        Pair pair;
        String str5;
        int i;
        Object obj;
        if (map == null) {
            map = new HashMap<>();
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
            LJII(str, new HashMap());
            java.net.URL url = new java.net.URL(str);
            if (str.startsWith("https")) {
                TrustManager[] trustManagerArr = {new C91882a1m()};
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, trustManagerArr, new SecureRandom());
                    HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) LJI(url);
                httpsURLConnection.setHostnameVerifier(LIZIZ);
                httpURLConnection = httpsURLConnection;
            } else {
                httpURLConnection = (HttpURLConnection) LJI(url);
            }
            try {
                httpURLConnection.setRequestMethod(str2);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                if (!map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!entry.getKey().isEmpty() && !entry.getValue().isEmpty()) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (z) {
                    httpURLConnection.setDoOutput(true);
                } else {
                    httpURLConnection.setDoOutput(false);
                }
                if (bArr != null && bArr.length > 0) {
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    HashMap hashMap = new HashMap();
                    if (qky != null && qky.LIZ) {
                        java.util.Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        if (headerFields != null) {
                            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                                if (entry2.getValue() != null) {
                                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                                }
                            }
                        }
                        qky.LIZIZ = hashMap;
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    boolean equals = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"));
                    String headerField = httpURLConnection.getHeaderField("Content-Type");
                    boolean LJFF = C64718Pac.LJFF(headerField);
                    if (headerField != null) {
                        try {
                            C61696OJg c61696OJg = new C61696OJg(headerField);
                            str3 = c61696OJg.getBaseType();
                            try {
                                str4 = c61696OJg.getParameter("charset");
                            } catch (Throwable unused) {
                                str4 = null;
                            }
                        } catch (Throwable unused2) {
                            str3 = null;
                            str4 = null;
                        }
                        pair = new Pair(str3, str4);
                    } else {
                        pair = null;
                    }
                    if (pair != null && (obj = pair.second) != null && Charset.isSupported((String) obj)) {
                        str5 = (String) pair.second;
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = "UTF-8";
                    }
                    int[] iArr = {0};
                    byte[] LIZLLL = C64718Pac.LIZLLL(equals, new HashMap(), inputStream, iArr, new C92205a6z(httpURLConnection));
                    if (LIZLLL != null && (i = iArr[0]) > 0 && i <= LIZLLL.length) {
                        if (LJFF) {
                            C64718Pac.LIZ(i, LIZLLL);
                        }
                        String str6 = new String(LIZLLL, 0, iArr[0], str5);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused3) {
                        }
                        return str6;
                    }
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                throw new C64802Pby(responseCode, httpURLConnection.getResponseMessage());
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused5) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
