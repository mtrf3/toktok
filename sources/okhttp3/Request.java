package okhttp3;

import X.C15890jp;
import X.C64605PXd;
import X.C64606PXe;
import X.C64618PXq;
import X.C64619PXr;
import X.C64626PXy;
import X.PVP;
import X.X1D;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Request {
    public final PVP body;
    public volatile C64619PXr cacheControl;
    public final C64606PXe headers;
    public final String method;
    public final Map<Class<?>, Object> tags;
    public final C64626PXy url;

    public C64619PXr cacheControl() {
        C64619PXr c64619PXr = this.cacheControl;
        if (c64619PXr != null) {
            return c64619PXr;
        }
        C64619PXr LIZ = C64619PXr.LIZ(this.headers);
        this.cacheControl = LIZ;
        return LIZ;
    }

    public boolean isHttps() {
        return this.url.LIZ.equals("https");
    }

    public C64618PXq newBuilder() {
        return new C64618PXq(this);
    }

    public Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request{method=");
        LIZ.append(this.method);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", tags=");
        return C15890jp.LIZ(LIZ, this.tags, '}', LIZ);
    }

    public PVP body() {
        return this.body;
    }

    public C64606PXe headers() {
        return this.headers;
    }

    public String method() {
        return this.method;
    }

    public C64626PXy url() {
        return this.url;
    }

    public Request(C64618PXq c64618PXq) {
        Map<Class<?>, Object> unmodifiableMap;
        this.url = c64618PXq.LIZ;
        this.method = c64618PXq.LIZIZ;
        C64605PXd c64605PXd = c64618PXq.LIZJ;
        c64605PXd.getClass();
        this.headers = new C64606PXe(c64605PXd);
        this.body = c64618PXq.LIZLLL;
        Map<Class<?>, Object> map = c64618PXq.LJ;
        if (map.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        this.tags = unmodifiableMap;
    }

    public String header(String str) {
        return this.headers.LIZLLL(str);
    }

    public List<String> headers(String str) {
        return this.headers.LJIIJJI(str);
    }

    public <T> T tag(Class<? extends T> cls) {
        return cls.cast(this.tags.get(cls));
    }
}
