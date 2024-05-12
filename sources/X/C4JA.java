package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.4JA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4JA {
    public final IMUser LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4JA)) {
            return false;
        }
        C4JA c4ja = (C4JA) obj;
        return o.LJ(this.LIZ, c4ja.LIZ) && this.LIZIZ == c4ja.LIZIZ;
    }

    public final int hashCode() {
        IMUser iMUser = this.LIZ;
        return ((iMUser == null ? 0 : iMUser.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupGreetingItem(user=");
        LIZ.append(this.LIZ);
        LIZ.append(", count=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C4JA(int i, IMUser iMUser) {
        this.LIZ = iMUser;
        this.LIZIZ = i;
    }
}
