package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mp4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57970Mp4 {
    public final boolean LIZ;
    public final C57967Mp1 LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final List<RecUser> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C57970Mp4() {
        this(null, false, 0 == true ? 1 : 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57970Mp4)) {
            return false;
        }
        C57970Mp4 c57970Mp4 = (C57970Mp4) obj;
        return this.LIZ == c57970Mp4.LIZ && o.LJ(this.LIZIZ, c57970Mp4.LIZIZ) && this.LIZJ == c57970Mp4.LIZJ && this.LIZLLL == c57970Mp4.LIZLLL && o.LJ(this.LJ, c57970Mp4.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        C57967Mp1 c57967Mp1 = this.LIZIZ;
        int hashCode = (((((i + (c57967Mp1 == null ? 0 : c57967Mp1.hashCode())) * 31) + (this.LIZJ ? 1 : 0)) * 31) + this.LIZLLL) * 31;
        List<RecUser> list = this.LJ;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MafSourceState(isLoading=");
        LIZ.append(this.LIZ);
        LIZ.append(", params=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hasMore=");
        LIZ.append(this.LIZJ);
        LIZ.append(", data=");
        List<RecUser> list = this.LJ;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        return s0.LIZJ(LIZ, num, ')', LIZ);
    }

    public /* synthetic */ C57970Mp4(C57967Mp1 c57967Mp1, boolean z, List list, int i) {
        this(false, (i & 2) != 0 ? null : c57967Mp1, (i & 4) != 0 ? true : z, 0, (i & 16) == 0 ? list : null);
    }

    public C57970Mp4(boolean z, C57967Mp1 c57967Mp1, boolean z2, int i, List<RecUser> list) {
        this.LIZ = z;
        this.LIZIZ = c57967Mp1;
        this.LIZJ = z2;
        this.LIZLLL = i;
        this.LJ = list;
    }

    public static C57970Mp4 LIZ(C57970Mp4 c57970Mp4, boolean z, C57967Mp1 c57967Mp1, List list, int i) {
        boolean z2;
        int i2;
        List list2 = list;
        boolean z3 = z;
        C57967Mp1 c57967Mp12 = c57967Mp1;
        if ((i & 1) != 0) {
            z3 = c57970Mp4.LIZ;
        }
        if ((i & 2) != 0) {
            c57967Mp12 = c57970Mp4.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c57970Mp4.LIZJ;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            i2 = c57970Mp4.LIZLLL;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            list2 = c57970Mp4.LJ;
        }
        c57970Mp4.getClass();
        return new C57970Mp4(z3, c57967Mp12, z2, i2, list2);
    }
}
