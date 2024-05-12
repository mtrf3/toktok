package X;

import android.os.Build;
import com.bytedance.common.utility.reflect.Reflect;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.security.Permission;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PYU extends HttpURLConnection {
    public final HttpURLConnection LIZ;
    public final boolean LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public final long LJ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "7470341041638232387"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [R, java.io.InputStream] */
    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        RuntimeException runtimeException;
        RuntimeException runtimeException2;
        InputStream inputStream;
        if (this.LIZJ != -1) {
            return new ByteArrayInputStream(this.LIZLLL.getBytes());
        }
        PPC<HttpURLConnection, InputStream> ppc = new PPC<>(this, null, null, null, null, PPD.CONTINUE);
        PY7 py7 = PY7.LIZLLL;
        PPC<HttpURLConnection, InputStream> LJI = py7.LJI(ppc);
        PPD ppd = LJI.LJFF;
        if (ppd == PPD.INTERCEPT && (inputStream = LJI.LIZIZ) != null) {
            return inputStream;
        }
        PPD ppd2 = PPD.EXCEPTION;
        if (ppd != ppd2 || (runtimeException2 = LJI.LJ) == null) {
            LJI.LIZIZ = this.LIZ.getErrorStream();
            PPC<HttpURLConnection, InputStream> LJIIL = py7.LJIIL(LJI);
            if (LJIIL.LJFF != ppd2 || (runtimeException = LJIIL.LJ) == null) {
                return LJIIL.LIZIZ;
            }
            throw runtimeException;
        }
        throw runtimeException2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [R, java.io.InputStream] */
    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        RuntimeException runtimeException;
        RuntimeException runtimeException2;
        InputStream inputStream;
        if (this.LIZJ != -1) {
            return new ByteArrayInputStream(this.LIZLLL.getBytes());
        }
        PPC<HttpURLConnection, InputStream> ppc = new PPC<>(this, null, null, null, null, PPD.CONTINUE);
        PY7 py7 = PY7.LIZLLL;
        PPC<HttpURLConnection, InputStream> LJIIJJI = py7.LJIIJJI(ppc);
        PPD ppd = LJIIJJI.LJFF;
        if (ppd == PPD.INTERCEPT && (inputStream = LJIIJJI.LIZIZ) != null) {
            return inputStream;
        }
        PPD ppd2 = PPD.EXCEPTION;
        if (ppd != ppd2 || (runtimeException2 = LJIIJJI.LJ) == null) {
            LJIIJJI.LIZIZ = this.LIZ.getInputStream();
            PPC<HttpURLConnection, InputStream> LJII = py7.LJII(LJIIJJI);
            if (LJII.LJFF != ppd2 || (runtimeException = LJII.LJ) == null) {
                return LJII.LIZIZ;
            }
            throw runtimeException;
        }
        throw runtimeException2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [R, java.lang.Integer] */
    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        RuntimeException runtimeException;
        RuntimeException runtimeException2;
        Integer num;
        int i = this.LIZJ;
        if (i != -1) {
            return i;
        }
        PPC<HttpURLConnection, Integer> ppc = new PPC<>(this, null, null, null, null, PPD.CONTINUE);
        PY7 py7 = PY7.LIZLLL;
        PPC<HttpURLConnection, Integer> LJ = py7.LJ(ppc);
        PPD ppd = LJ.LJFF;
        if (ppd == PPD.INTERCEPT && (num = LJ.LIZIZ) != null) {
            return num.intValue();
        }
        PPD ppd2 = PPD.EXCEPTION;
        if (ppd != ppd2 || (runtimeException2 = LJ.LJ) == null) {
            LJ.LIZIZ = Integer.valueOf(this.LIZ.getResponseCode());
            PPC<HttpURLConnection, Integer> LJIIIZ = py7.LJIIIZ(LJ);
            if (LJIIIZ.LJFF != ppd2 || (runtimeException = LJIIIZ.LJ) == null) {
                return LJIIIZ.LIZIZ.intValue();
            }
            throw runtimeException;
        }
        throw runtimeException2;
    }

    public final boolean LIZIZ() {
        try {
            Reflect field = Reflect.on(this.LIZ).field("httpEngine", new Class[0]);
            return ((Boolean) LIZ(field.get(), field.exactMethod("hasResponse", new Class[0], new Object[0]), new Object[0])).booleanValue();
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return true;
        } catch (NoSuchMethodException e2) {
            C16880lQ.LLLLIIL(e2);
            return true;
        } catch (InvocationTargetException e3) {
            C16880lQ.LLLLIIL(e3);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.LIZ.connect();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.LIZ.disconnect();
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.LIZ.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.LIZ.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.LIZ.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.LIZ.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.LIZ.getDoOutput();
    }

    @Override // java.net.URLConnection
    public final java.util.Map<String, List<String>> getHeaderFields() {
        if (this.LIZJ != -1) {
            return new HashMap();
        }
        return this.LIZ.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.LIZ.getIfModifiedSince();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.LIZ.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.LIZ.getOutputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.LIZ.getPermission();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.LIZ.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.LIZ.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final java.util.Map<String, List<String>> getRequestProperties() {
        return this.LIZ.getRequestProperties();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        if (this.LIZJ != -1) {
            return this.LIZLLL;
        }
        return this.LIZ.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public final java.net.URL getURL() {
        return this.LIZ.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.LIZ.getUseCaches();
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.LIZ.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.LIZ.usingProxy();
    }

    public PYU(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.LIZJ = -1;
        this.LJ = PY3.LIZ();
        this.LIZIZ = httpURLConnection.getClass().getName().contains("Cronet");
        this.LIZ = httpURLConnection;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        if (this.LIZJ != -1) {
            return "";
        }
        return this.LIZ.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        return this.LIZ.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.LIZ.getRequestProperty(str);
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.LIZ.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.LIZ.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.LIZ.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.LIZ.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.LIZ.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.LIZ.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.LIZ.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.LIZ.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.LIZ.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.LIZ.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.LIZ.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.LIZ.setUseCaches(z);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        return this.LIZ.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.LIZ.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        PPC<HttpURLConnection, InputStream> LJIILIIL;
        PPD ppd;
        RuntimeException runtimeException;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str);
            jSONObject.put("value", str2);
            LJIILIIL = PY7.LIZLLL.LJIILIIL(new PPC<>(this, null, null, jSONObject, null, PPD.CONTINUE));
            ppd = LJIILIIL.LJFF;
        } catch (JSONException unused) {
        }
        if (ppd == PPD.DROP) {
            return;
        }
        if (ppd != PPD.EXCEPTION || (runtimeException = LJIILIIL.LJ) == null) {
            JSONObject jSONObject2 = LJIILIIL.LIZLLL;
            if (jSONObject2 != null) {
                str = jSONObject2.optString("key", str);
                str2 = LJIILIIL.LIZLLL.optString("value", str2);
            }
            this.LIZ.addRequestProperty(str, str2);
            return;
        }
        throw runtimeException;
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        if (this.LIZJ != -1) {
            return i;
        }
        return this.LIZ.getHeaderFieldInt(str, i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        if (this.LIZJ != -1) {
            return j;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return this.LIZ.getHeaderFieldLong(str, j);
        }
        return j;
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        PPC<HttpURLConnection, InputStream> LJIILL;
        PPD ppd;
        RuntimeException runtimeException;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str);
            jSONObject.put("value", str2);
            LJIILL = PY7.LIZLLL.LJIILL(new PPC<>(this, null, null, jSONObject, null, PPD.CONTINUE));
            ppd = LJIILL.LJFF;
        } catch (JSONException unused) {
        }
        if (ppd == PPD.DROP) {
            return;
        }
        if (ppd != PPD.EXCEPTION || (runtimeException = LJIILL.LJ) == null) {
            JSONObject jSONObject2 = LJIILL.LIZLLL;
            if (jSONObject2 != null) {
                str = jSONObject2.optString("key", str);
                str2 = LJIILL.LIZLLL.optString("value", str2);
            }
            this.LIZ.setRequestProperty(str, str2);
            return;
        }
        throw runtimeException;
    }
}
