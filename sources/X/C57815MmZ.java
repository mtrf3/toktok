package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MmZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57815MmZ {
    public final User LIZ;
    public final List<Aweme> LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57815MmZ)) {
            return false;
        }
        C57815MmZ c57815MmZ = (C57815MmZ) obj;
        return o.LJ(this.LIZ, c57815MmZ.LIZ) && o.LJ(this.LIZIZ, c57815MmZ.LIZIZ) && this.LIZJ == c57815MmZ.LIZJ && this.LIZLLL == c57815MmZ.LIZLLL && Float.compare(this.LJ, c57815MmZ.LJ) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJ) + ((((AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(user=");
        LIZ.append(this.LIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", size=");
        LIZ.append(this.LIZJ);
        LIZ.append(", spacing=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", coroner=");
        return C74221TAz.LIZLLL(LIZ, this.LJ, ')', LIZ);
    }

    public C57815MmZ(RecUser user, List list, int i, int i2, float f) {
        o.LJIIIZ(user, "user");
        this.LIZ = user;
        this.LIZIZ = list;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = f;
    }
}
