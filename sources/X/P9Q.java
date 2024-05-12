package X;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public class P9Q implements InterfaceC63991P9n {
    public static URLConnection LIZJ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "651354602386770135"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static URLConnection LIZIZ(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LIZJ(url);
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
            URLConnection LIZJ = LIZJ(url);
            if (LIZJ instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LIZJ);
            } else {
                if (!(LIZJ instanceof HttpURLConnection)) {
                    return LIZJ;
                }
                pyu = new PYU((HttpURLConnection) LIZJ);
            }
            return pyu;
        }
        throw runtimeException;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x005d: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777309), block:B:50:0x005d */
    @Override // X.InterfaceC63991P9n
    public final String executeGet(String str) {
        InputStream inputStream;
        InputStream inputStream2;
        HttpURLConnection LIZLLL = LIZLLL("GET", str);
        InputStream inputStream3 = null;
        try {
            if (LIZLLL == null) {
                return null;
            }
            try {
            } catch (Exception e) {
                e = e;
                inputStream2 = null;
            } catch (Throwable th) {
                th = th;
                LIZLLL.disconnect();
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                }
                throw th;
            }
            if (LIZLLL.getResponseCode() == 200) {
                inputStream2 = LIZLLL.getInputStream();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    String sb2 = sb.toString();
                    LIZLLL.disconnect();
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e3) {
                            C16880lQ.LLLLIIL(e3);
                        }
                    }
                    return sb2;
                } catch (Exception e4) {
                    e = e4;
                    C16880lQ.LLLLIIL(e);
                    LIZLLL.disconnect();
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e5) {
                            C16880lQ.LLLLIIL(e5);
                        }
                    }
                    return null;
                }
            }
            LIZLLL.disconnect();
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream3 = inputStream;
        }
    }

    public static HttpURLConnection LIZLLL(String str, String str2) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) LIZIZ(new java.net.URL(str2));
            try {
                httpURLConnection.setRequestMethod(str);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setDoInput(true);
            } catch (Exception e) {
                e = e;
                C16880lQ.LLLLIIL(e);
                return httpURLConnection;
            }
        } catch (Exception e2) {
            e = e2;
            httpURLConnection = null;
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC63991P9n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r8, byte[] r9) {
        /*
            r7 = this;
            java.lang.String r0 = "POST"
            java.net.HttpURLConnection r6 = LIZLLL(r0, r8)
            r5 = 0
            if (r6 != 0) goto La
            return r5
        La:
            java.io.OutputStream r4 = r6.getOutputStream()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L6b
            r4.write(r9)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            int r1 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L52
            java.io.InputStream r3 = r6.getInputStream()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L68
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L68
            r0.<init>(r3)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L68
            r2.<init>(r0)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L68
            r1.<init>()     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L68
        L2c:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L68
            if (r0 == 0) goto L36
            r1.append(r0)     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L68
            goto L2c
        L36:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L50 java.lang.Throwable -> L68
            r4.close()     // Catch: java.io.IOException -> L3e
            goto L42
        L3e:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L42:
            if (r3 == 0) goto L4c
            r3.close()     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L4c:
            r6.disconnect()
            return r1
        L50:
            r0 = move-exception
            goto L64
        L52:
            r4.close()     // Catch: java.io.IOException -> L56
            goto L99
        L56:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L99
        L5b:
            r1 = move-exception
            r3 = r5
            goto L69
        L5e:
            r0 = move-exception
            r3 = r5
            goto L64
        L61:
            r0 = move-exception
            r3 = r5
            r4 = r5
        L64:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L68
            goto L85
        L68:
            r1 = move-exception
        L69:
            r5 = r4
            goto L6d
        L6b:
            r1 = move-exception
            r3 = r5
        L6d:
            if (r5 == 0) goto L77
            r5.close()     // Catch: java.io.IOException -> L73
            goto L77
        L73:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L77:
            if (r3 == 0) goto L81
            r3.close()     // Catch: java.io.IOException -> L7d
            goto L81
        L7d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L81:
            r6.disconnect()
            throw r1
        L85:
            if (r4 == 0) goto L8f
            r4.close()     // Catch: java.io.IOException -> L8b
            goto L8f
        L8b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L8f:
            if (r3 == 0) goto L99
            r3.close()     // Catch: java.io.IOException -> L95
            goto L99
        L95:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L99:
            r6.disconnect()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9Q.LIZ(java.lang.String, byte[]):java.lang.String");
    }
}
