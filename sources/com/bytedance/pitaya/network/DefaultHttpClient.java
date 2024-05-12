package com.bytedance.pitaya.network;

import X.AnonymousClass636;
import X.C03880Dg;
import X.C37692Eqm;
import X.C39427Fdf;
import X.C39519Ff9;
import X.C62848OlY;
import X.C65300Pk0;
import X.C93294aOY;
import X.EnumC93298aOc;
import X.ExecutorC93235aNb;
import X.InterfaceC93314aOs;
import X.PPC;
import X.PPD;
import X.PPY;
import X.PVC;
import X.PY7;
import X.PYT;
import X.PYU;
import X.RunnableC93295aOZ;
import X.X1D;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class DefaultHttpClient implements PTYHttpClient {
    public static final C93294aOY Companion = new C93294aOY();

    public static URLConnection com_bytedance_pitaya_network_DefaultHttpClient_java_net_URL_openConnection(URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-7080598501375022620"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient
    public void inject(String aid, PTYSettingsCallback pTYSettingsCallback) {
        o.LJIIJ(aid, "aid");
    }

    public static URLConnection INVOKEVIRTUAL_com_bytedance_pitaya_network_DefaultHttpClient_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return com_bytedance_pitaya_network_DefaultHttpClient_java_net_URL_openConnection(url);
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
            URLConnection com_bytedance_pitaya_network_DefaultHttpClient_java_net_URL_openConnection = com_bytedance_pitaya_network_DefaultHttpClient_java_net_URL_openConnection(url);
            if (com_bytedance_pitaya_network_DefaultHttpClient_java_net_URL_openConnection instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) com_bytedance_pitaya_network_DefaultHttpClient_java_net_URL_openConnection);
            } else {
                if (!(com_bytedance_pitaya_network_DefaultHttpClient_java_net_URL_openConnection instanceof HttpURLConnection)) {
                    return com_bytedance_pitaya_network_DefaultHttpClient_java_net_URL_openConnection;
                }
                pyu = new PYU((HttpURLConnection) com_bytedance_pitaya_network_DefaultHttpClient_java_net_URL_openConnection);
            }
            return pyu;
        }
        throw runtimeException;
    }

    private final HttpURLConnection getPostConnection(String str, String str2, EnumC93298aOc enumC93298aOc) {
        URLConnection INVOKEVIRTUAL_com_bytedance_pitaya_network_DefaultHttpClient_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection = INVOKEVIRTUAL_com_bytedance_pitaya_network_DefaultHttpClient_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(str));
        if (INVOKEVIRTUAL_com_bytedance_pitaya_network_DefaultHttpClient_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) INVOKEVIRTUAL_com_bytedance_pitaya_network_DefaultHttpClient_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection;
            if (enumC93298aOc == EnumC93298aOc.JSON) {
                httpURLConnection.setRequestProperty("Content-type", "application/json; charset=utf-8");
            } else if (enumC93298aOc == EnumC93298aOc.PB) {
                httpURLConnection.setRequestProperty("Content-type", "application/x-protobuf; charset=utf-8");
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                Charset charset = PVC.LIZ;
                if (str2 != null) {
                    byte[] bytes = str2.getBytes(charset);
                    o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    outputStream.flush();
                    AnonymousClass636.LJFF(outputStream, null);
                    return httpURLConnection;
                }
                throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
            } finally {
            }
        } else {
            throw new C37692Eqm("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient
    public void get(String url, InterfaceC93314aOs callback, EnumC93298aOc dataType) {
        o.LJIIJ(url, "url");
        o.LJIIJ(callback, "callback");
        o.LJIIJ(dataType, "dataType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("An operation is not implemented: ");
        LIZ.append("Not yet implemented");
        throw new C39427Fdf(X1D.LIZIZ(LIZ));
    }

    public final void makeHttpPost(String str, String str2, EnumC93298aOc enumC93298aOc, InterfaceC93314aOs interfaceC93314aOs) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = getPostConnection(str, str2, enumC93298aOc);
            try {
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 400) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        o.LJFF(inputStream, "connection.inputStream");
                        interfaceC93314aOs.LIZ(C62848OlY.LJFF(inputStream));
                    } else {
                        interfaceC93314aOs.onFailure(responseCode, httpURLConnection.getResponseMessage());
                    }
                } catch (Exception e) {
                    e = e;
                    PitayaLogger.LJ(e, null, 6);
                    interfaceC93314aOs.onFailure(-1, e.getLocalizedMessage());
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            throw th2;
        }
        httpURLConnection.disconnect();
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient
    public void post(String url, byte[] bArr, InterfaceC93314aOs callback, EnumC93298aOc dataType) {
        o.LJIIJ(url, "url");
        o.LJIIJ(callback, "callback");
        o.LJIIJ(dataType, "dataType");
        ExecutorC93235aNb.LJLJL.execute(new RunnableC93295aOZ(this, url, bArr, dataType, callback));
    }
}
