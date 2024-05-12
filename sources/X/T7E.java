package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T7E {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T7E)) {
            return false;
        }
        T7E t7e = (T7E) obj;
        return o.LJ(this.LIZ, t7e.LIZ) && this.LIZIZ == t7e.LIZIZ && o.LJ(this.LIZJ, t7e.LIZJ) && o.LJ(this.LIZLLL, t7e.LIZLLL) && this.LJ == t7e.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZJ, (hashCode2 + i2) * 31, 31);
        String str = this.LIZLLL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (LJ + hashCode) * 31;
        if (!this.LJ) {
            i = 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NavigateDialogUiModel(questionId=");
        LIZ.append(this.LIZ);
        LIZ.append(", isTranslated=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", questionLanguage=");
        LIZ.append(this.LIZJ);
        LIZ.append(", questionType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", showTranslationButton=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public T7E(String questionId, boolean z, boolean z2, String str) {
        o.LJIIIZ(questionId, "questionId");
        this.LIZ = questionId;
        this.LIZIZ = z;
        this.LIZJ = "TODO";
        this.LIZLLL = str;
        this.LJ = z2;
    }
}
