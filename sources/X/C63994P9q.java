package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.linecorp.linesdk.LineApiError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.P9q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63994P9q {
    public static final byte[] LJ = new byte[0];
    public final F31 LIZ;
    public final FY6 LIZIZ = new FY6();
    public final int LIZJ = 90000;
    public final int LIZLLL = 90000;

    public static URLConnection LJ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-9118021972266104469"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public C63994P9q(Context context) {
        this.LIZ = new F31(context);
    }

    public static HttpURLConnection LIZ(android.net.Uri uri) {
        Object LJ2;
        Object LJ3;
        RuntimeException runtimeException;
        Object obj;
        java.net.URL url = new java.net.URL(uri.toString());
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            LJ2 = LJ(url);
        } else {
            PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
            PPD ppd = LJFF.LJFF;
            if (ppd == PPD.INTERCEPT && (obj = LJFF.LIZIZ) != null) {
                LJ2 = (URLConnection) obj;
                if (LJ2 instanceof HttpsURLConnection) {
                    LJ3 = new PYT((HttpsURLConnection) LJ2);
                } else if (LJ2 instanceof HttpURLConnection) {
                    LJ3 = new PYU((HttpURLConnection) LJ2);
                }
                LJ2 = LJ3;
            } else if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
                LJ3 = LJ(url);
                if (LJ3 instanceof HttpsURLConnection) {
                    LJ2 = new PYT((HttpsURLConnection) LJ3);
                } else {
                    if (LJ3 instanceof HttpURLConnection) {
                        LJ2 = new PYU((HttpURLConnection) LJ3);
                    }
                    LJ2 = LJ3;
                }
            } else {
                throw runtimeException;
            }
        }
        if (LJ2 instanceof HttpsURLConnection) {
            if (Build.VERSION.SDK_INT >= 24) {
                return (HttpURLConnection) LJ2;
            }
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) LJ2;
            httpsURLConnection.setSSLSocketFactory(new C63995P9r(httpsURLConnection.getSSLSocketFactory()));
            return httpsURLConnection;
        }
        throw new IllegalArgumentException("The scheme of the server url must be https." + uri);
    }

    public static void LIZLLL(HttpURLConnection httpURLConnection, java.util.Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public static PPB LIZJ(HttpURLConnection httpURLConnection, AbstractC38521fE abstractC38521fE, FY6 fy6) {
        InputStream errorStream;
        if (httpURLConnection.getResponseCode() < 400) {
            errorStream = httpURLConnection.getInputStream();
        } else {
            errorStream = httpURLConnection.getErrorStream();
        }
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Encoding");
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((String) ListProtector.get(list, i)).equalsIgnoreCase("gzip")) {
                    errorStream = new GZIPInputStream(errorStream);
                    break;
                }
                i++;
            }
        }
        int responseCode = httpURLConnection.getResponseCode();
        try {
            if (responseCode != 200) {
                return new PPB(EnumC65312PkC.SERVER_ERROR, null, new LineApiError(responseCode, fy6.LIZ(errorStream)));
            }
            Object LIZLLL = abstractC38521fE.LIZLLL(errorStream);
            if (LIZLLL == null) {
                return PPB.LIZLLL;
            }
            return new PPB(EnumC65312PkC.SUCCESS, LIZLLL, LineApiError.DEFAULT);
        } catch (IOException e) {
            EnumC65312PkC enumC65312PkC = EnumC65312PkC.INTERNAL_ERROR;
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            return new PPB(enumC65312PkC, null, new LineApiError(responseCode, stringWriter.toString()));
        }
    }

    public final PPB LIZIZ(android.net.Uri uri, java.util.Map map, java.util.Map map2, AbstractC38521fE abstractC38521fE) {
        byte[] bytes;
        HttpURLConnection httpURLConnection;
        Throwable th;
        HashMap hashMap = (HashMap) map2;
        if (hashMap.isEmpty()) {
            bytes = LJ;
        } else {
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry entry : hashMap.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            try {
                bytes = builder.build().getEncodedQuery().getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            int length = bytes.length;
            httpURLConnection = LIZ(uri);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestProperty("User-Agent", this.LIZ.LIZ());
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(length));
            httpURLConnection.setConnectTimeout(this.LIZJ);
            httpURLConnection.setReadTimeout(this.LIZLLL);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
        } catch (IOException e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            throw th2;
        }
        try {
            LIZLLL(httpURLConnection, map);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            PPB LIZJ = LIZJ(httpURLConnection, abstractC38521fE, this.LIZIZ);
            httpURLConnection.disconnect();
            return LIZJ;
        } catch (IOException e3) {
            e = e3;
            try {
                PPB ppb = new PPB(EnumC65312PkC.NETWORK_ERROR, null, new LineApiError(e));
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return ppb;
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection == null) {
                    throw th;
                }
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
