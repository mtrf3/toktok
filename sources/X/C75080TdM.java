package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* renamed from: X.TdM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75080TdM {
    public final int LIZ;
    public final User LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75080TdM)) {
            return false;
        }
        C75080TdM c75080TdM = (C75080TdM) obj;
        return this.LIZ == c75080TdM.LIZ && o.LJ(this.LIZIZ, c75080TdM.LIZIZ) && this.LIZJ == c75080TdM.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        User user = this.LIZIZ;
        int hashCode = (i + (user == null ? 0 : user.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorMuteGuestBean(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", user=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isOpCamera=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C75080TdM(int i, User user, boolean z) {
        this.LIZ = i;
        this.LIZIZ = user;
        this.LIZJ = z;
    }
}
