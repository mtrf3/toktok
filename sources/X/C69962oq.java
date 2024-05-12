package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.2oq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69962oq extends AbstractC69952op {
    public final Aweme LIZIZ;

    public C69962oq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C69962oq) && o.LJ(this.LIZIZ, ((C69962oq) obj).LIZIZ);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZIZ;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Success(aweme=");
        return C770830u.LIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C69962oq(Aweme aweme) {
        super(0);
        this.LIZIZ = aweme;
    }
}
