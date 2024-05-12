package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101703yw implements C33Q {
    public final IMUser LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C101703yw) && o.LJ(this.LJLIL, ((C101703yw) obj).LJLIL);
    }

    public final int hashCode() {
        IMUser iMUser = this.LJLIL;
        if (iMUser == null) {
            return 0;
        }
        return iMUser.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChatCommonVmState(userProfile=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C101703yw(IMUser iMUser) {
        this.LJLIL = iMUser;
    }
}
