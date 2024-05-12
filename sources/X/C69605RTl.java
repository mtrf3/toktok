package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.RTl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69605RTl {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69605RTl)) {
            return false;
        }
        C69605RTl c69605RTl = (C69605RTl) obj;
        return this.LIZ == c69605RTl.LIZ && o.LJ(this.LIZIZ, c69605RTl.LIZIZ) && o.LJ(this.LIZJ, c69605RTl.LIZJ) && o.LJ(this.LIZLLL, c69605RTl.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, r0 * 31, 31), 31);
        String str = this.LIZLLL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TranslationResult(translationSuccess=");
        LIZ.append(this.LIZ);
        LIZ.append(", questionId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", originalString=");
        LIZ.append(this.LIZJ);
        LIZ.append(", translatedString=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C69605RTl(boolean z, String questionId, String originalString, String str) {
        o.LJIIIZ(questionId, "questionId");
        o.LJIIIZ(originalString, "originalString");
        this.LIZ = z;
        this.LIZIZ = questionId;
        this.LIZJ = originalString;
        this.LIZLLL = str;
    }
}
