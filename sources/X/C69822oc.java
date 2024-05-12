package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean;
import kotlin.jvm.internal.o;

/* renamed from: X.2oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69822oc {
    public final AwemeStatusBean LIZ;
    public final Aweme LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69822oc)) {
            return false;
        }
        C69822oc c69822oc = (C69822oc) obj;
        return o.LJ(this.LIZ, c69822oc.LIZ) && o.LJ(this.LIZIZ, c69822oc.LIZIZ) && this.LIZJ == c69822oc.LIZJ;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Aweme aweme = this.LIZIZ;
        return C16880lQ.LLJIJIL(this.LIZJ) + ((hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeCacheItem(bean=");
        LIZ.append(this.LIZ);
        LIZ.append(", aweme=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cacheTimestamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C69822oc(AwemeStatusBean awemeStatusBean, Aweme aweme) {
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZ = awemeStatusBean;
        this.LIZIZ = aweme;
        this.LIZJ = currentTimeMillis;
    }
}
