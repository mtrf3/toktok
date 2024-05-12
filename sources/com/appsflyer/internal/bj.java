package com.appsflyer.internal;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.PPC;
import X.PPD;
import X.PPY;
import X.PY7;
import X.PYT;
import X.PYU;
import com.appsflyer.AFLogger;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public final class bj {
    public final int AFInAppEventType;

    public static URLConnection com_appsflyer_internal_bj_java_net_URL_openConnection(URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-2188558172191876245"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public bj(int i) {
        this.AFInAppEventType = i;
    }

    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_bj_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return com_appsflyer_internal_bj_java_net_URL_openConnection(url);
        }
        PPC<URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
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
            URLConnection com_appsflyer_internal_bj_java_net_URL_openConnection = com_appsflyer_internal_bj_java_net_URL_openConnection(url);
            if (com_appsflyer_internal_bj_java_net_URL_openConnection instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) com_appsflyer_internal_bj_java_net_URL_openConnection);
            } else {
                if (!(com_appsflyer_internal_bj_java_net_URL_openConnection instanceof HttpURLConnection)) {
                    return com_appsflyer_internal_bj_java_net_URL_openConnection;
                }
                pyu = new PYU((HttpURLConnection) com_appsflyer_internal_bj_java_net_URL_openConnection);
            }
            return pyu;
        }
        throw runtimeException;
    }

    public final bm<String> valueOf(v vVar) {
        try {
            AFLogger.AFInAppEventType("HTTP: url: " + vVar.AFKeystoreWrapper);
            byte[] bArr = vVar.AFInAppEventType;
            if (bArr != null) {
                AFLogger.AFInAppEventType("HTTP: data: ".concat(new String(bArr)));
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) INVOKEVIRTUAL_com_appsflyer_internal_bj_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(vVar.AFKeystoreWrapper));
            try {
                httpURLConnection.setRequestMethod(vVar.valueOf);
                httpURLConnection.setConnectTimeout(this.AFInAppEventType);
                httpURLConnection.setReadTimeout(this.AFInAppEventType);
                httpURLConnection.addRequestProperty("Content-Type", "application/json");
                for (Map.Entry<String, String> entry : vVar.values.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                byte[] bArr2 = vVar.AFInAppEventType;
                boolean z = true;
                if (bArr2 != null) {
                    httpURLConnection.setDoOutput(true);
                    StringBuilder sb = new StringBuilder();
                    sb.append(bArr2.length);
                    httpURLConnection.setRequestProperty("Content-Length", sb.toString());
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArr2);
                            bufferedOutputStream.close();
                        } catch (Throwable th) {
                            bufferedOutputStream.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode / 100 != 2) {
                    z = false;
                }
                String valueOf = valueOf(httpURLConnection, z);
                AFLogger.AFInAppEventType("HTTP: response code: " + responseCode + " " + httpURLConnection.getResponseMessage());
                AFLogger.AFInAppEventType("HTTP: response body: ".concat(String.valueOf(valueOf)));
                bm<String> bmVar = new bm<>(valueOf, httpURLConnection.getResponseCode(), z);
                httpURLConnection.disconnect();
                return bmVar;
            } catch (Throwable th3) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    throw th3;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public static String valueOf(HttpURLConnection httpURLConnection, boolean z) {
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                if (z) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                if (errorStream == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader2);
                    boolean z2 = true;
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                if (!z2) {
                                    sb.append('\n');
                                }
                                sb.append(readLine);
                                z2 = false;
                            } else {
                                String sb2 = sb.toString();
                                inputStreamReader2.close();
                                bufferedReader.close();
                                return sb2;
                            }
                        } catch (IOException e) {
                            e = e;
                            AFLogger.valueOf("Could not read connection response from: " + httpURLConnection.getURL().toString(), e);
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            AFLogger.valueOf("Could not read connection response from: " + httpURLConnection.getURL().toString(), e);
                            throw new br("Could not read connection response: " + e.getMessage(), e);
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader = inputStreamReader2;
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }
}
