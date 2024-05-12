package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.77b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1806377b {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1806377b)) {
            return false;
        }
        C1806377b c1806377b = (C1806377b) obj;
        return o.LJ(this.LIZ, c1806377b.LIZ) && o.LJ(this.LIZIZ, c1806377b.LIZIZ) && o.LJ(this.LIZJ, c1806377b.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Aweme aweme = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31);
    }

    public C1806377b() {
        this("", null, "");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoViewerParams(aid=");
        LIZ.append(this.LIZ);
        LIZ.append(", aweme=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C1806377b(String aid, Aweme aweme, String enterFrom) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = aid;
        this.LIZIZ = aweme;
        this.LIZJ = enterFrom;
    }
}
