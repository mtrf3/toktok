package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.jvm.internal.o;

/* renamed from: X.F9r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38515F9r {
    public final RequestParams LIZ;
    public final String LIZIZ;
    public final Forest LIZJ;
    public C61284O3k LIZLLL;
    public volatile EnumC38514F9q LJ;

    public final C61295O3v LIZ() {
        if (this.LJ != EnumC38514F9q.PENDING) {
            return null;
        }
        this.LJ = EnumC38514F9q.FETCHING;
        return this.LIZJ.fetchSync$forest_release(this);
    }

    public C38515F9r(RequestParams requestParams, String url, Forest forest, C61284O3k c61284O3k, EnumC38514F9q status) {
        o.LJIIJ(requestParams, "requestParams");
        o.LJIIJ(url, "url");
        o.LJIIJ(forest, "forest");
        o.LJIIJ(status, "status");
        this.LIZ = requestParams;
        this.LIZIZ = url;
        this.LIZJ = forest;
        this.LIZLLL = c61284O3k;
        this.LJ = status;
    }
}
