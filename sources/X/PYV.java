package X;

import android.os.Build;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.network.NetworkComponent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PYV extends HttpsURLConnection {
    public int LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public final PZQ LIZLLL;
    public C65902Pti LJ;
    public volatile InputStream LJFF;
    public C65896Ptc LJI;
    public long LJII;
    public final HashMap<String, String> LJIIIIZZ;
    public final HttpsURLConnection LJIIIZ;

    @Override // java.net.URLConnection
    public final void connect() {
        if (!this.LIZJ) {
            this.LIZJ = true;
            C65299Pjz.LIZIZ(this);
        }
        if (this.LIZ == -1) {
            this.LJIIIZ.connect();
        }
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.LJIIIZ.disconnect();
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.LJIIIZ.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        String cipherSuite = this.LJIIIZ.getCipherSuite();
        o.LJIIIIZZ(cipherSuite, "mConnection.cipherSuite");
        return cipherSuite;
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.LJIIIZ.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.LJIIIZ.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.LJIIIZ.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.LJIIIZ.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        if (!this.LIZJ) {
            this.LIZJ = true;
            C65299Pjz.LIZIZ(this);
        }
        if (this.LIZ != -1) {
            String str = this.LIZIZ;
            o.LJI(str);
            byte[] bytes = str.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteArrayInputStream(bytes);
        }
        return this.LJIIIZ.getErrorStream();
    }

    @Override // java.net.URLConnection
    public final java.util.Map<String, List<String>> getHeaderFields() {
        if (!this.LIZJ) {
            this.LIZJ = true;
            C65299Pjz.LIZIZ(this);
        }
        if (this.LIZ != -1) {
            return new HashMap();
        }
        java.util.Map<String, List<String>> headerFields = this.LJIIIZ.getHeaderFields();
        o.LJIIIIZZ(headerFields, "mConnection.headerFields");
        return headerFields;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        HostnameVerifier hostnameVerifier = this.LJIIIZ.getHostnameVerifier();
        o.LJIIIIZZ(hostnameVerifier, "mConnection.hostnameVerifier");
        return hostnameVerifier;
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.LJIIIZ.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        InputStream inputStream;
        NetworkConfig networkConfig;
        boolean z = true;
        if (!this.LIZJ) {
            this.LIZJ = true;
            C65299Pjz.LIZIZ(this);
        }
        if (this.LIZ != -1) {
            String str = this.LIZIZ;
            o.LJI(str);
            byte[] bytes = str.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteArrayInputStream(bytes);
        }
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings == null || (networkConfig = settings.networkConfig) == null || !networkConfig.parseBody) {
            z = false;
        }
        if (!z) {
            C65299Pjz.LIZ(this, null, this.LJ);
            return this.LJIIIZ.getInputStream();
        }
        if (this.LJFF == null) {
            synchronized (this) {
                if (this.LJFF == null) {
                    InputStream inputStream2 = this.LJIIIZ.getInputStream();
                    if (inputStream2 == null) {
                        C65299Pjz.LIZ(this, null, this.LJ);
                        return null;
                    }
                    if (PZR.LIZ(getHeaderField("Content-Type"))) {
                        inputStream = new C61655OHr(inputStream2, new PYY(this));
                    } else {
                        C65299Pjz.LIZ(this, null, this.LJ);
                        inputStream = this.LJIIIZ.getInputStream();
                    }
                    this.LJFF = inputStream;
                }
            }
        }
        return this.LJFF;
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.LJIIIZ.getInstanceFollowRedirects();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        Certificate[] localCertificates = this.LJIIIZ.getLocalCertificates();
        o.LJIIIIZZ(localCertificates, "mConnection.localCertificates");
        return localCertificates;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        Principal localPrincipal = this.LJIIIZ.getLocalPrincipal();
        o.LJIIIIZZ(localPrincipal, "mConnection.localPrincipal");
        return localPrincipal;
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        if (!this.LIZJ) {
            this.LIZJ = true;
            C65299Pjz.LIZIZ(this);
        }
        if (this.LIZ != -1) {
            return new ByteArrayOutputStream();
        }
        return this.LJIIIZ.getOutputStream();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        Principal peerPrincipal = this.LJIIIZ.getPeerPrincipal();
        o.LJIIIIZZ(peerPrincipal, "mConnection.peerPrincipal");
        return peerPrincipal;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        Permission permission = this.LJIIIZ.getPermission();
        o.LJIIIIZZ(permission, "mConnection.permission");
        return permission;
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.LJIIIZ.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        String requestMethod = this.LJIIIZ.getRequestMethod();
        o.LJIIIIZZ(requestMethod, "mConnection.requestMethod");
        return requestMethod;
    }

    @Override // java.net.URLConnection
    public final java.util.Map<String, List<String>> getRequestProperties() {
        return this.LJIIIZ.getRequestProperties();
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        if (!this.LIZJ) {
            this.LIZJ = true;
            C65299Pjz.LIZIZ(this);
        }
        int i = this.LIZ;
        if (i != -1) {
            return i;
        }
        return this.LJIIIZ.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        if (!this.LIZJ) {
            this.LIZJ = true;
            C65299Pjz.LIZIZ(this);
        }
        if (this.LIZ != -1) {
            String str = this.LIZIZ;
            o.LJI(str);
            return str;
        }
        String responseMessage = this.LJIIIZ.getResponseMessage();
        o.LJIIIIZZ(responseMessage, "mConnection.responseMessage");
        return responseMessage;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.LJIIIZ.getSSLSocketFactory();
        o.LJIIIIZZ(sSLSocketFactory, "mConnection.sslSocketFactory");
        return sSLSocketFactory;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        Certificate[] serverCertificates = this.LJIIIZ.getServerCertificates();
        o.LJIIIIZZ(serverCertificates, "mConnection.serverCertificates");
        return serverCertificates;
    }

    @Override // java.net.URLConnection
    public final java.net.URL getURL() {
        java.net.URL url = this.LJIIIZ.getURL();
        o.LJIIIIZZ(url, "mConnection.url");
        return url;
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.LJIIIZ.getUseCaches();
    }

    @Override // java.net.URLConnection
    public final String toString() {
        String uRLConnection = this.LJIIIZ.toString();
        o.LJIIIIZZ(uRLConnection, "mConnection.toString()");
        return uRLConnection;
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.LJIIIZ.usingProxy();
    }

    public PYV(HttpsURLConnection httpsURLConnection) {
        super(httpsURLConnection.getURL());
        this.LJIIIZ = httpsURLConnection;
        this.LIZ = -1;
        this.LIZLLL = new PZQ(httpsURLConnection);
        this.LJIIIIZZ = new HashMap<>();
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String name) {
        o.LJIIIZ(name, "name");
        if (!this.LIZJ) {
            this.LIZJ = true;
            C65299Pjz.LIZIZ(this);
        }
        if (this.LIZ != -1) {
            return "";
        }
        if (this.LJIIIIZZ.containsKey(name)) {
            return this.LJIIIIZZ.get(name);
        }
        String headerValue = this.LJIIIZ.getHeaderField(name);
        HashMap<String, String> hashMap = this.LJIIIIZZ;
        o.LJIIIIZZ(headerValue, "headerValue");
        hashMap.put(name, headerValue);
        return headerValue;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        String headerFieldKey = this.LJIIIZ.getHeaderFieldKey(i);
        o.LJIIIIZZ(headerFieldKey, "mConnection.getHeaderFieldKey(n)");
        return headerFieldKey;
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String key) {
        o.LJIIIZ(key, "key");
        return this.LJIIIZ.getRequestProperty(key);
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.LJIIIZ.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.LJIIIZ.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.LJIIIZ.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.LJIIIZ.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.LJIIIZ.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.LJIIIZ.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.LJIIIZ.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier v) {
        o.LJIIIZ(v, "v");
        this.LJIIIZ.setHostnameVerifier(v);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.LJIIIZ.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.LJIIIZ.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.LJIIIZ.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String method) {
        o.LJIIIZ(method, "method");
        this.LJIIIZ.setRequestMethod(method);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sf) {
        o.LJIIIZ(sf, "sf");
        this.LJIIIZ.setSSLSocketFactory(sf);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.LJIIIZ.setUseCaches(z);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        String headerField = this.LJIIIZ.getHeaderField(i);
        o.LJIIIIZZ(headerField, "mConnection.getHeaderField(n)");
        return headerField;
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.LJIIIZ.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        this.LJIIIZ.addRequestProperty(key, value);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String name, int i) {
        o.LJIIIZ(name, "name");
        if (this.LIZ != -1) {
            return i;
        }
        return this.LJIIIZ.getHeaderFieldInt(name, i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String name, long j) {
        o.LJIIIZ(name, "name");
        if (this.LIZ != -1) {
            return j;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return this.LJIIIZ.getHeaderFieldLong(name, j);
        }
        return j;
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        this.LJIIIZ.setRequestProperty(key, value);
    }
}
