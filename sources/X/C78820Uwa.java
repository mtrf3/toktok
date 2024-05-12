package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Uwa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78820Uwa {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final C78789Uw5 LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78820Uwa)) {
            return false;
        }
        C78820Uwa c78820Uwa = (C78820Uwa) obj;
        return o.LJ(this.LIZ, c78820Uwa.LIZ) && this.LIZIZ == c78820Uwa.LIZIZ && o.LJ(this.LIZJ, c78820Uwa.LIZJ) && this.LIZLLL == c78820Uwa.LIZLLL && o.LJ(this.LJ, c78820Uwa.LJ) && this.LJFF == c78820Uwa.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.LIZJ, ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31, 31) + this.LIZLLL) * 31;
        C78789Uw5 c78789Uw5 = this.LJ;
        if (c78789Uw5 == null) {
            hashCode = 0;
        } else {
            hashCode = c78789Uw5.hashCode();
        }
        int i = (LJ + hashCode) * 31;
        boolean z = this.LJFF;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnnotationSelectionData(optionName=");
        LIZ.append(this.LIZ);
        LIZ.append(", parentIndex=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", parentCategoryName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", childIndex=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", childItem=");
        LIZ.append(this.LJ);
        LIZ.append(", hasPreviousSelection=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public /* synthetic */ C78820Uwa(String str, int i, String str2, int i2, C78789Uw5 c78789Uw5) {
        this(str, i, str2, i2, c78789Uw5, false);
    }

    public C78820Uwa(String optionName, int i, String parentCategoryName, int i2, C78789Uw5 c78789Uw5, boolean z) {
        o.LJIIIZ(optionName, "optionName");
        o.LJIIIZ(parentCategoryName, "parentCategoryName");
        this.LIZ = optionName;
        this.LIZIZ = i;
        this.LIZJ = parentCategoryName;
        this.LIZLLL = i2;
        this.LJ = c78789Uw5;
        this.LJFF = z;
    }
}
