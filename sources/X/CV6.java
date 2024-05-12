package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LiveRequestLayoutOptSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CV6 {
    public final User LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final boolean LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZJ = JBR.LIZJ(this.LJ, C79062V1e.LJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31);
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudienceInProfileListItem(user=");
        LIZ.append(this.LIZ);
        LIZ.append(", score=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", rank=");
        LIZ.append(this.LIZJ);
        LIZ.append(", gapDescription=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", userRestrictionLevel=");
        LIZ.append(this.LJ);
        LIZ.append(", isAnchor=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (LiveRequestLayoutOptSetting.INSTANCE.isOnlineAudienceEnabled() && !this.LJFF) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CV6) {
                CV6 cv6 = (CV6) obj;
                User user = cv6.LIZ;
                long j = cv6.LIZIZ;
                long j2 = cv6.LIZJ;
                String str = cv6.LIZLLL;
                long j3 = cv6.LJ;
                if ((o.LJ(user, this.LIZ) || user.getId() == this.LIZ.getId()) && this.LIZIZ == j && this.LIZJ == j2 && o.LJ(this.LIZLLL, str) && this.LJ == j3) {
                    return true;
                }
            }
            return false;
        }
        return super.equals(obj);
    }

    public CV6(User user, long j, long j2, String gapDescription, long j3, boolean z) {
        o.LJIIIZ(gapDescription, "gapDescription");
        this.LIZ = user;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = gapDescription;
        this.LJ = j3;
        this.LJFF = z;
    }
}
