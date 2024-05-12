package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JWZ extends AbstractC49294JWg {
    public final int LIZ;
    public final Aweme LIZIZ;
    public final JWV LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWZ)) {
            return false;
        }
        JWZ jwz = (JWZ) obj;
        return this.LIZ == jwz.LIZ && o.LJ(this.LIZIZ, jwz.LIZIZ) && o.LJ(this.LIZJ, jwz.LIZJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ * 31)) * 31;
        JWV jwv = this.LIZJ;
        return hashCode + (jwv == null ? 0 : jwv.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Valid(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", aweme=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", locatorTask=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public JWZ(int i, Aweme aweme, JWV jwv) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZ = i;
        this.LIZIZ = aweme;
        this.LIZJ = jwv;
    }
}
