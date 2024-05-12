package X;

import defpackage.a1;
import java.util.Collections;
import java.util.LinkedHashMap;
import okhttp3.Request;

/* renamed from: X.PXq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64618PXq {
    public C64626PXy LIZ;
    public String LIZIZ;
    public C64605PXd LIZJ;
    public PVP LIZLLL;
    public java.util.Map<Class<?>, Object> LJ;

    public final Request LIZIZ() {
        if (this.LIZ != null) {
            return new Request(this);
        }
        throw new IllegalStateException("url == null");
    }

    public C64618PXq() {
        this.LJ = Collections.emptyMap();
        this.LIZIZ = "GET";
        this.LIZJ = new C64605PXd();
    }

    public C64618PXq(Request request) {
        java.util.Map<Class<?>, Object> linkedHashMap;
        this.LJ = Collections.emptyMap();
        this.LIZ = request.url;
        this.LIZIZ = request.method;
        this.LIZLLL = request.body;
        if (request.tags.isEmpty()) {
            linkedHashMap = Collections.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>(request.tags);
        }
        this.LJ = linkedHashMap;
        this.LIZJ = request.headers.LJI();
    }

    public final C64618PXq LIZJ(C64619PXr c64619PXr) {
        String c64619PXr2 = c64619PXr.toString();
        if (c64619PXr2.isEmpty()) {
            this.LIZJ.LIZLLL("Cache-Control");
            return this;
        }
        this.LIZJ.LJ("Cache-Control", c64619PXr2);
        return this;
    }

    public final void LJFF(String str) {
        this.LIZJ.LIZLLL(str);
    }

    public final void LJII(String str) {
        String str2 = str;
        if (str2 != null) {
            if (str2.regionMatches(true, 0, "ws:", 0, 3)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("http:");
                LIZ.append(str2.substring(3));
                str2 = X1D.LIZIZ(LIZ);
            } else if (str2.regionMatches(true, 0, "wss:", 0, 4)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("https:");
                LIZ2.append(str2.substring(4));
                str2 = X1D.LIZIZ(LIZ2);
            }
            LJIIIIZZ(C64626PXy.LJIIIZ(str2));
            return;
        }
        throw new NullPointerException("url == null");
    }

    public final void LJIIIIZZ(C64626PXy c64626PXy) {
        if (c64626PXy != null) {
            this.LIZ = c64626PXy;
            return;
        }
        throw new NullPointerException("url == null");
    }

    public final void LIZ(String str, String str2) {
        this.LIZJ.LIZ(str, str2);
    }

    public final void LIZLLL(String str, String str2) {
        this.LIZJ.LJ(str, str2);
    }

    public final void LJ(String str, PVP pvp) {
        if (str != null) {
            if (str.length() != 0) {
                if (pvp != null) {
                    if (!C78934UyQ.LJJ(str)) {
                        throw new IllegalArgumentException(a1.LJ("method ", str, " must not have a request body."));
                    }
                } else if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    throw new IllegalArgumentException(a1.LJ("method ", str, " must have a request body."));
                }
                this.LIZIZ = str;
                this.LIZLLL = pvp;
                return;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }
        throw new NullPointerException("method == null");
    }

    public final void LJI(Class cls, Object obj) {
        if (cls != null) {
            if (obj == null) {
                this.LJ.remove(cls);
                return;
            }
            if (this.LJ.isEmpty()) {
                this.LJ = new LinkedHashMap();
            }
            this.LJ.put(cls, cls.cast(obj));
            return;
        }
        throw new NullPointerException("type == null");
    }
}
