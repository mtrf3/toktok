package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.TlE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75568TlE {
    public final Long LIZ;
    public final Long LIZIZ;
    public final Context LIZJ;
    public final EnumC32196CkK LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75568TlE)) {
            return false;
        }
        C75568TlE c75568TlE = (C75568TlE) obj;
        return o.LJ(this.LIZ, c75568TlE.LIZ) && o.LJ(this.LIZIZ, c75568TlE.LIZIZ) && o.LJ(this.LIZJ, c75568TlE.LIZJ) && this.LIZLLL == c75568TlE.LIZLLL;
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LIZIZ;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Context context = this.LIZJ;
        return this.LIZLLL.hashCode() + ((hashCode2 + (context != null ? context.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GameLinkMicFeedPackageData(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", roomOwnerUserId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", context=");
        LIZ.append(this.LIZJ);
        LIZ.append(", pageType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C75568TlE(Long l, Long l2, Context context, EnumC32196CkK pageType) {
        o.LJIIIZ(pageType, "pageType");
        this.LIZ = l;
        this.LIZIZ = l2;
        this.LIZJ = context;
        this.LIZLLL = pageType;
    }
}
