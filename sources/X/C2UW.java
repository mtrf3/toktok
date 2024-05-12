package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2UW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2UW {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2UW)) {
            return false;
        }
        C2UW c2uw = (C2UW) obj;
        return this.LIZ == c2uw.LIZ && this.LIZIZ == c2uw.LIZIZ && o.LJ(this.LIZJ, c2uw.LIZJ) && o.LJ(this.LIZLLL, c2uw.LIZLLL) && o.LJ(this.LJ, c2uw.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.LIZIZ ? 1 : 0)) * 31;
        String str = this.LIZJ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LJ;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SuggestedReplyDiffState(isDoneSuggestedReplyAnimation=");
        LIZ.append(this.LIZ);
        LIZ.append(", isRepliedOrReacted=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", suggestedReply=");
        LIZ.append(this.LIZJ);
        LIZ.append(", suggestedReplyShowTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isSharedAwemeWatched=");
        return C78920UyC.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C2UW(boolean z, boolean z2, String str, String str2, Boolean bool) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = bool;
    }
}
