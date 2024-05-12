package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.3Dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80353Dj implements Comparable<C80353Dj> {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final UrlModel LJLJI;
    public final String LJLJJI;
    public final long LJLJJL;
    public final boolean LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80353Dj)) {
            return false;
        }
        C80353Dj c80353Dj = (C80353Dj) obj;
        return o.LJ(this.LJLIL, c80353Dj.LJLIL) && o.LJ(this.LJLILLLLZI, c80353Dj.LJLILLLLZI) && o.LJ(this.LJLJI, c80353Dj.LJLJI) && o.LJ(this.LJLJJI, c80353Dj.LJLJJI) && this.LJLJJL == c80353Dj.LJLJJL && this.LJLJJLL == c80353Dj.LJLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        UrlModel urlModel = this.LJLJI;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, (LJ + hashCode) * 31, 31), 31);
        boolean z = this.LJLJJLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMUserReaction(username=");
        LIZ.append(this.LJLIL);
        LIZ.append(", uid=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", avatar=");
        LIZ.append(this.LJLJI);
        LIZ.append(", reaction=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", timestamp=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isSelf=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C80353Dj c80353Dj) {
        C80353Dj other = c80353Dj;
        o.LJIIIZ(other, "other");
        if (this.LJLJJLL) {
            if (!other.LJLJJLL) {
                return -1;
            }
        } else if (other.LJLJJLL) {
            return 1;
        }
        return C66851QLn.LJFF(Long.valueOf(this.LJLJJL), Long.valueOf(other.LJLJJL));
    }

    public C80353Dj(String str, String uid, UrlModel urlModel, String reaction, long j, boolean z) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(reaction, "reaction");
        this.LJLIL = str;
        this.LJLILLLLZI = uid;
        this.LJLJI = urlModel;
        this.LJLJJI = reaction;
        this.LJLJJL = j;
        this.LJLJJLL = z;
    }
}
