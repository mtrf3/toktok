package X;

import kotlin.jvm.internal.o;

/* renamed from: X.860, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass860 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        String str = this.LIZ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.LIZIZ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        boolean z2 = this.LIZJ;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        if (!this.LIZLLL) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DescriptionData(descriptionTranslation=");
        LIZ.append(this.LIZ);
        LIZ.append(", translated=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", animate=");
        LIZ.append(this.LIZJ);
        LIZ.append(", autoTranslate=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass860)) {
            return false;
        }
        AnonymousClass860 anonymousClass860 = (AnonymousClass860) obj;
        if (o.LJ(this.LIZ, anonymousClass860.LIZ) && this.LIZIZ == anonymousClass860.LIZIZ && this.LIZJ == anonymousClass860.LIZJ && this.LIZLLL == anonymousClass860.LIZLLL) {
            return true;
        }
        return false;
    }

    public AnonymousClass860(String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}
