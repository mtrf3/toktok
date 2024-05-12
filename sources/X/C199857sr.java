package X;

import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.7sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199857sr {
    public final RelationStatus LIZ;
    public final C57301MeH LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199857sr)) {
            return false;
        }
        C199857sr c199857sr = (C199857sr) obj;
        return o.LJ(this.LIZ, c199857sr.LIZ) && o.LJ(this.LIZIZ, c199857sr.LIZIZ) && this.LIZJ == c199857sr.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        RelationStatus relationStatus = this.LIZ;
        int hashCode = (relationStatus == null ? 0 : relationStatus.hashCode()) * 31;
        C57301MeH c57301MeH = this.LIZIZ;
        int hashCode2 = (hashCode + (c57301MeH != null ? c57301MeH.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MotaFollowRes(relationStatus=");
        LIZ.append(this.LIZ);
        LIZ.append(", error=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isMerge=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C199857sr(RelationStatus relationStatus, C57301MeH c57301MeH, boolean z) {
        this.LIZ = relationStatus;
        this.LIZIZ = c57301MeH;
        this.LIZJ = z;
    }
}
