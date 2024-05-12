package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XD6 {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final XD7 LIZJ;
    public final java.util.Map<String, String> LIZLLL;
    public final java.util.Map<String, Object> LJ;
    public final String LJFF;
    public final boolean LJI;
    public final java.util.Map<String, Object> LJII;

    public XD6() {
        throw null;
    }

    public XD6(String url, List list, XD7 method, java.util.Map map, String contentType, int i) {
        boolean z;
        list = (i & 2) != 0 ? null : list;
        method = (i & 4) != 0 ? XD7.GET : method;
        map = (i & 16) != 0 ? null : map;
        contentType = (i & 32) != 0 ? "application/x-www-form-urlencoded" : contentType;
        if ((i & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        o.LJIIJ(url, "url");
        o.LJIIJ(method, "method");
        o.LJIIJ(contentType, "contentType");
        this.LIZ = url;
        this.LIZIZ = list;
        this.LIZJ = method;
        this.LIZLLL = null;
        this.LJ = map;
        this.LJFF = contentType;
        this.LJI = z;
        this.LJII = null;
    }
}
