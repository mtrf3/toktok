package X;

import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8jc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219608jc {
    public final String LIZ;
    public final User LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C219608jc() {
        this(null, "", "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C219608jc)) {
            return false;
        }
        C219608jc c219608jc = (C219608jc) obj;
        return o.LJ(this.LIZ, c219608jc.LIZ) && o.LJ(this.LIZIZ, c219608jc.LIZIZ) && o.LJ(this.LIZJ, c219608jc.LIZJ) && o.LJ(this.LIZLLL, c219608jc.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        User user = this.LIZIZ;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        return this.LIZLLL.hashCode() + C79062V1e.LJ(this.LIZJ, (hashCode2 + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HubMobParam(viewedUid=");
        LIZ.append(this.LIZ);
        LIZ.append(", viewedUser=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C219608jc(User user, String str, String str2, String str3) {
        HH1.LIZ(str, "viewedUid", str2, "enterFrom", str3, "enterMethod");
        this.LIZ = str;
        this.LIZIZ = user;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
