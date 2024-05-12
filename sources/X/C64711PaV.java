package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ttnet.TTNetInit;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.PaV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64711PaV {
    public static URLConnection LIZIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-4966784425905100101"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static URLConnection LIZ(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LIZIZ(url);
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
            URLConnection LIZIZ = LIZIZ(url);
            if (LIZIZ instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LIZIZ);
            } else {
                if (!(LIZIZ instanceof HttpURLConnection)) {
                    return LIZIZ;
                }
                pyu = new PYU((HttpURLConnection) LIZIZ);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public static String LIZJ(String str, java.util.Map<String, String> map, java.util.Map<String, List<String>> map2, C64714PaY c64714PaY) {
        boolean z;
        String str2;
        String str3;
        String str4;
        Pair pair;
        String str5;
        int i;
        Object obj;
        java.util.Map<String, List<String>> headerFields;
        String str6;
        HttpURLConnection httpURLConnection = null;
        if (C38354F3m.LJ(str)) {
            return null;
        }
        TTNetInit.getTTNetDepend().getContext();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            return null;
        }
        try {
            if (c64714PaY.LIZJ) {
                InterfaceC64715PaZ interfaceC64715PaZ = C64735Pat.LJI;
                if (interfaceC64715PaZ != null) {
                    str6 = interfaceC64715PaZ.LIZLLL(str);
                } else {
                    str6 = str;
                }
                if (!TextUtils.isEmpty(str6)) {
                    if (str6.equals(str)) {
                        StringBuilder sb = new StringBuilder(str6);
                        if (str6.indexOf(63) < 0) {
                            sb.append("?");
                        } else {
                            sb.append("&");
                        }
                        sb.append("aid=");
                        sb.append(TTNetInit.getTTNetDepend().getAppId());
                        sb.append("&device_platform=android");
                        if (TTNetInit.getCronetProvider() != null) {
                            sb.append("&version_code=");
                            sb.append(TTNetInit.getCronetProvider().getVersionCode());
                            sb.append("&channel=");
                            sb.append(TTNetInit.getCronetProvider().getChannel());
                            sb.append("device_id");
                            sb.append(TTNetInit.getCronetProvider().getDeviceId());
                        }
                        str = sb.toString();
                    } else {
                        str = str6;
                    }
                }
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) LIZ(new java.net.URL(str));
            try {
                httpURLConnection2.setRequestMethod("GET");
                httpURLConnection2.setConnectTimeout(15000);
                httpURLConnection2.setReadTimeout(15000);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (c64714PaY.LIZIZ) {
                    str2 = " HttpsURLConnection";
                } else {
                    str2 = " HttpURLConnection";
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ttnet");
                LIZ.append(str2);
                httpURLConnection2.setRequestProperty("User-Agent", X1D.LIZIZ(LIZ));
                HashMap hashMap = (HashMap) map;
                if (hashMap.size() > 0) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (map2 != null && httpURLConnection2.getHeaderFields() != null && (headerFields = httpURLConnection2.getHeaderFields()) != null) {
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        String key = entry2.getKey();
                        if (!TextUtils.isEmpty(key)) {
                            ((HashMap) map2).put(key.toLowerCase(), entry2.getValue());
                        }
                    }
                }
                if (!c64714PaY.LIZIZ) {
                    httpURLConnection2.getHeaderField("X-SS-SIGN");
                }
                c64714PaY.LIZLLL = httpURLConnection2.getHeaderField("x-ss-etag");
                c64714PaY.LJ = httpURLConnection2.getHeaderField("x-tt-tnc-abtest");
                c64714PaY.LJFF = httpURLConnection2.getHeaderField("x-tt-tnc-control");
                c64714PaY.LJI = httpURLConnection2.getHeaderField("x-tt-tnc-config");
                c64714PaY.LJII = httpURLConnection2.getHeaderField("x-ss-canary");
                httpURLConnection2.getHeaderField("x-tt-tnc-query-region");
                httpURLConnection2.getHeaderField("x-tt-logid");
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    boolean equals = "gzip".equals(httpURLConnection2.getHeaderField("Content-Encoding"));
                    String headerField = httpURLConnection2.getHeaderField("Content-Type");
                    boolean LJFF = C64718Pac.LJFF(headerField);
                    if (headerField == null) {
                        pair = null;
                    } else {
                        try {
                            C61696OJg c61696OJg = new C61696OJg(headerField);
                            str3 = c61696OJg.getBaseType();
                            try {
                                str4 = c61696OJg.getParameter("charset");
                            } catch (Throwable unused2) {
                                str4 = null;
                            }
                        } catch (Throwable unused3) {
                            str3 = null;
                            str4 = null;
                        }
                        pair = new Pair(str3, str4);
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
                    byte[] LIZLLL = C64718Pac.LIZLLL(equals, httpURLConnection2.getHeaderFields(), inputStream, iArr, new C64713PaX(httpURLConnection2));
                    if (LIZLLL != null && (i = iArr[0]) > 0 && i <= LIZLLL.length) {
                        if (LJFF) {
                            C64718Pac.LIZ(i, LIZLLL);
                        }
                        String str7 = new String(LIZLLL, 0, iArr[0], str5);
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused4) {
                        }
                        return str7;
                    }
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused5) {
                    }
                    return null;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("err status = ");
                LIZ2.append(responseCode);
                throw new IOException(X1D.LIZIZ(LIZ2));
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused6) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
