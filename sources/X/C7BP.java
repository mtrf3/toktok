package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7BP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7BP {
    public final Aweme LIZ;
    public final String LIZIZ;

    public C7BP() {
        this(null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7BP)) {
            return false;
        }
        C7BP c7bp = (C7BP) obj;
        return o.LJ(this.LIZ, c7bp.LIZ) && o.LJ(this.LIZIZ, c7bp.LIZIZ);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        String str = this.LIZIZ;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedTaggedParam(aweme=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C7BP(Aweme aweme, String str) {
        this.LIZ = aweme;
        this.LIZIZ = str;
    }
}
