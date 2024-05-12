package com.byted.cast.common.network;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.PPC;
import X.PPD;
import X.PPY;
import X.PY7;
import X.PYT;
import X.PYU;
import com.byted.cast.common.api.IHttpNetWork;
import com.byted.cast.common.api.Response;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes29.dex */
public class DefaultHttpNetWork implements IHttpNetWork {
    public int timeOut = 10000;

    public static URLConnection com_byted_cast_common_network_DefaultHttpNetWork_java_net_URL_openConnection(URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "7835473866992664571"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static URLConnection INVOKEVIRTUAL_com_byted_cast_common_network_DefaultHttpNetWork_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return com_byted_cast_common_network_DefaultHttpNetWork_java_net_URL_openConnection(url);
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
            URLConnection com_byted_cast_common_network_DefaultHttpNetWork_java_net_URL_openConnection = com_byted_cast_common_network_DefaultHttpNetWork_java_net_URL_openConnection(url);
            if (com_byted_cast_common_network_DefaultHttpNetWork_java_net_URL_openConnection instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) com_byted_cast_common_network_DefaultHttpNetWork_java_net_URL_openConnection);
            } else {
                if (!(com_byted_cast_common_network_DefaultHttpNetWork_java_net_URL_openConnection instanceof HttpURLConnection)) {
                    return com_byted_cast_common_network_DefaultHttpNetWork_java_net_URL_openConnection;
                }
                pyu = new PYU((HttpURLConnection) com_byted_cast_common_network_DefaultHttpNetWork_java_net_URL_openConnection);
            }
            return pyu;
        }
        throw runtimeException;
    }

    private String is2String(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                return sb.toString().trim();
            }
        }
    }

    public void setTimeOut(int i) {
        this.timeOut = i;
    }

    @Override // com.byted.cast.common.api.IHttpNetWork
    public Response doGet(String str, Map<String, String> map) {
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) INVOKEVIRTUAL_com_byted_cast_common_network_DefaultHttpNetWork_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(str));
        httpURLConnection.setRequestMethod("GET");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnection.setConnectTimeout(this.timeOut);
        httpURLConnection.setReadTimeout(this.timeOut);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (responseCode == 200) {
            str2 = is2String(httpURLConnection.getInputStream());
        } else {
            str2 = null;
        }
        return new Response(null, str2, responseCode, responseMessage);
    }

    @Override // com.byted.cast.common.api.IHttpNetWork
    public Response doPost(String str, String str2, Map<String, String> map) {
        String str3;
        InputStream errorStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) INVOKEVIRTUAL_com_byted_cast_common_network_DefaultHttpNetWork_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(str));
        httpURLConnection.setRequestMethod("POST");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnection.setConnectTimeout(this.timeOut);
        httpURLConnection.setReadTimeout(this.timeOut);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.getOutputStream().write(str2.getBytes("UTF-8"));
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        try {
            if (responseCode < 400) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            str3 = is2String(errorStream);
        } catch (Exception e) {
            e.printStackTrace();
            str3 = null;
        }
        return new Response(null, str3, responseCode, responseMessage);
    }
}
