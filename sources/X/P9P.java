package X;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class P9P implements InterfaceC36618EYs {
    public static URLConnection LIZJ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-821361649603267565"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static String LIZLLL(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                return sb.toString();
            }
        }
    }

    public static HttpURLConnection LJ(String str, JSONObject jSONObject) {
        Object LIZJ;
        Object LIZJ2;
        RuntimeException runtimeException;
        Object obj;
        java.net.URL url = new java.net.URL(str);
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            LIZJ = LIZJ(url);
        } else {
            PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
            PPD ppd = LJFF.LJFF;
            if (ppd == PPD.INTERCEPT && (obj = LJFF.LIZIZ) != null) {
                LIZJ = (URLConnection) obj;
                if (LIZJ instanceof HttpsURLConnection) {
                    LIZJ2 = new PYT((HttpsURLConnection) LIZJ);
                } else if (LIZJ instanceof HttpURLConnection) {
                    LIZJ2 = new PYU((HttpURLConnection) LIZJ);
                }
                LIZJ = LIZJ2;
            } else if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
                LIZJ2 = LIZJ(url);
                if (LIZJ2 instanceof HttpsURLConnection) {
                    LIZJ = new PYT((HttpsURLConnection) LIZJ2);
                } else {
                    if (LIZJ2 instanceof HttpURLConnection) {
                        LIZJ = new PYU((HttpURLConnection) LIZJ2);
                    }
                    LIZJ = LIZJ2;
                }
            } else {
                throw runtimeException;
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) LIZJ;
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setRequestProperty("Charset", "utf-8");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        String optString = jSONObject.optString("target");
        jSONObject.put("target", "temp_sec_url_tag");
        outputStream.write(jSONObject.toString().replace("temp_sec_url_tag", optString).getBytes("utf-8"));
        outputStream.flush();
        outputStream.close();
        return httpURLConnection;
    }

    public static void LJFF(InputStream inputStream, HttpURLConnection httpURLConnection) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // X.InterfaceC36618EYs
    public final String LIZ(String str, JSONObject jSONObject) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnection = LJ(str, jSONObject);
                try {
                    if (httpURLConnection.getResponseCode() == 200) {
                        inputStream = httpURLConnection.getInputStream();
                    } else {
                        inputStream = httpURLConnection.getErrorStream();
                    }
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                String LIZLLL = LIZLLL(inputStream);
                LJFF(inputStream, httpURLConnection);
                return LIZLLL;
            } catch (Exception e2) {
                e = e2;
                String message = e.getMessage();
                LJFF(inputStream, httpURLConnection);
                return message;
            } catch (Throwable th2) {
                th = th2;
                LJFF(inputStream, httpURLConnection);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    @Override // X.InterfaceC36618EYs
    public final void LIZIZ(String str, JSONObject jSONObject, C36619EYt c36619EYt) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        InputStream errorStream;
        InputStream inputStream2 = null;
        inputStream2 = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = LJ(str, jSONObject);
            try {
                if (httpURLConnection.getResponseCode() == 200) {
                    errorStream = httpURLConnection.getInputStream();
                    c36619EYt.LIZ(LIZLLL(errorStream));
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                    String LIZLLL = LIZLLL(errorStream);
                    c36619EYt.LIZ.getClass();
                    AbstractC37055EgV.LIZJ(LIZLLL);
                }
                LJFF(errorStream, httpURLConnection);
            } catch (Exception e) {
                e = e;
                inputStream = null;
                httpURLConnection2 = httpURLConnection;
                try {
                    String message = e.getMessage();
                    c36619EYt.LIZ.getClass();
                    AbstractC37055EgV.LIZJ(message);
                    LJFF(inputStream, httpURLConnection2);
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    inputStream2 = inputStream;
                    LJFF(inputStream2, httpURLConnection);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                LJFF(inputStream2, httpURLConnection);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }
}
