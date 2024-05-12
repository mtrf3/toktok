package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QGU {
    public static final Pattern LIZLLL = PatternProtector.compile("[0-9]+s");
    public static final Charset LJ = Charset.forName("UTF-8");
    public final Context LIZ;
    public final C6Y7<QGY> LIZIZ;
    public final C66724QGq LIZJ = new C66724QGq();

    public static URLConnection LIZIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "4179072251647283244"));
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

    public static java.net.URL LIZJ(String str) {
        try {
            return new java.net.URL(C16880lQ.LLLZ("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new C66730QGw(e.getMessage(), EnumC66715QGh.UNAVAILABLE);
        }
    }

    public static void LIZLLL(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, LJ));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str = C16880lQ.LLLZ("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", new Object[]{Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb});
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        TextUtils.isEmpty(str);
    }

    public static long LJFF(String str) {
        QH7.LIZ("Invalid Expiration Timestamp.", LIZLLL.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return CastLongProtector.parseLong(str.substring(0, str.length() - 1));
    }

    public static C66710QGc LJI(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, LJ));
        QGV qgv = new QGV();
        qgv.LIZIZ = 0L;
        QGW qgw = new QGW();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                qgw.LIZ = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                qgw.LIZIZ = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                qgw.LIZJ = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        qgv.LIZ = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        qgv.LIZIZ = Long.valueOf(LJFF(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                qgw.LIZLLL = qgv.LIZ();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C66710QGc(qgw.LIZ, qgw.LIZIZ, qgw.LIZJ, qgw.LIZLLL, EnumC66712QGe.OK);
    }

    public static C66708QGa LJII(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, LJ));
        QGV qgv = new QGV();
        qgv.LIZIZ = 0L;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                qgv.LIZ = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                qgv.LIZIZ = Long.valueOf(LJFF(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        qgv.LIZJ = EnumC66714QGg.OK;
        return qgv.LIZ();
    }

    public static void LJIIIZ(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            LJIIJ(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public QGU(Context context, C6Y7<QGY> c6y7) {
        this.LIZ = context;
        this.LIZIZ = c6y7;
    }

    public static void LJIIJ(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093 A[Catch: NameNotFoundException -> 0x0087, TRY_ENTER, TryCatch #0 {NameNotFoundException -> 0x0087, blocks: (B:7:0x005a, B:9:0x006e, B:15:0x0078, B:19:0x00bb, B:24:0x0093, B:26:0x009d, B:28:0x00b6), top: B:6:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection LJ(java.net.URL r9, java.lang.String r10) {
        /*
            r8 = this;
            java.net.URLConnection r4 = LIZ(r9)     // Catch: java.io.IOException -> Lc8
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.io.IOException -> Lc8
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setConnectTimeout(r0)
            r3 = 0
            r4.setUseCaches(r3)
            r4.setReadTimeout(r0)
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/json"
            r4.addRequestProperty(r0, r1)
            java.lang.String r0 = "Accept"
            r4.addRequestProperty(r0, r1)
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r0 = "gzip"
            r4.addRequestProperty(r1, r0)
            java.lang.String r1 = "Cache-Control"
            java.lang.String r0 = "no-cache"
            r4.addRequestProperty(r1, r0)
            android.content.Context r0 = r8.LIZ
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "X-Android-Package"
            r4.addRequestProperty(r0, r1)
            X.6Y7<X.QGY> r0 = r8.LIZIZ
            java.lang.Object r0 = r0.get()
            X.QGY r0 = (X.QGY) r0
            if (r0 == 0) goto L59
            java.lang.String r1 = "x-firebase-client"
            X.Qgk r0 = r0.LIZIZ()     // Catch: java.lang.InterruptedException -> L52 java.util.concurrent.ExecutionException -> L59
            java.lang.Object r0 = X.C67637Qgb.LIZ(r0)     // Catch: java.lang.InterruptedException -> L52 java.util.concurrent.ExecutionException -> L59
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L52 java.util.concurrent.ExecutionException -> L59
            r4.addRequestProperty(r1, r0)     // Catch: java.lang.InterruptedException -> L52 java.util.concurrent.ExecutionException -> L59
            goto L59
        L52:
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            r0.interrupt()
        L59:
            r2 = 0
            android.content.Context r0 = r8.LIZ     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            java.lang.String r5 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            X.QXq r1 = X.QCX.LIZ(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            r0 = 64
            android.content.pm.PackageInfo r7 = r1.LIZIZ(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            android.content.pm.Signature[] r0 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            if (r0 == 0) goto L84
            int r1 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            r0 = 1
            if (r1 != r0) goto L84
            java.lang.String r6 = "SHA1"
            r5 = 0
        L75:
            r0 = 2
            if (r5 >= r0) goto L81
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r6)     // Catch: java.security.NoSuchAlgorithmException -> L7e android.content.pm.PackageManager.NameNotFoundException -> L87
            if (r1 != 0) goto L82
        L7e:
            int r5 = r5 + 1
            goto L75
        L81:
            r1 = r2
        L82:
            if (r1 != 0) goto Lbb
        L84:
            r7 = r2
        L85:
            if (r7 != 0) goto L93
        L87:
            java.lang.String r0 = "X-Android-Cert"
            r4.addRequestProperty(r0, r2)
            java.lang.String r0 = "x-goog-api-key"
            r4.addRequestProperty(r0, r10)
            return r4
        L93:
            int r6 = r7.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            int r0 = r6 + r6
            r5.<init>(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
        L9b:
            if (r3 >= r6) goto Lb6
            char[] r1 = X.V2B.LJLJJI     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            r0 = r7[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >>> 4
            char r0 = r1[r0]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            r5.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            r0 = r7[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            r0 = r0 & 15
            char r0 = r1[r0]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            r5.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            int r3 = r3 + 1
            goto L9b
        Lb6:
            java.lang.String r2 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            goto L87
        Lbb:
            android.content.pm.Signature[] r0 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            r0 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            byte[] r0 = r0.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            byte[] r7 = r1.digest(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87
            goto L85
        Lc8:
            X.QGw r2 = new X.QGw
            java.lang.String r1 = "Firebase Installations Service is unavailable. Please try again later."
            X.QGh r0 = X.EnumC66715QGh.UNAVAILABLE
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QGU.LJ(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    public static void LJIIIIZZ(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            LJIIJ(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }
}
