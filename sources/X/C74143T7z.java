package X;

import kotlin.jvm.internal.o;

/* renamed from: X.T7z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74143T7z {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ = null;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74143T7z)) {
            return false;
        }
        C74143T7z c74143T7z = (C74143T7z) obj;
        return this.LIZ == c74143T7z.LIZ && this.LIZIZ == c74143T7z.LIZIZ && o.LJ(this.LIZJ, c74143T7z.LIZJ) && this.LIZLLL == c74143T7z.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        String str = this.LIZJ;
        return ((i3 + (str == null ? 0 : str.hashCode())) * 31) + (this.LIZLLL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TranslationCellUiModel(isTranslated=");
        LIZ.append(this.LIZ);
        LIZ.append(", displayLoadingTranslationSpinner=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", originalLanguage=");
        LIZ.append(this.LIZJ);
        LIZ.append(", showTranslationButton=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C74143T7z(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZLLL = z3;
    }
}
