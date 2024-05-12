package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AWV {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWV)) {
            return false;
        }
        AWV awv = (AWV) obj;
        return o.LJ(this.LIZ, awv.LIZ) && o.LJ(this.LIZIZ, awv.LIZIZ) && o.LJ(this.LIZJ, awv.LIZJ) && o.LJ(this.LIZLLL, awv.LIZLLL) && o.LJ(this.LJ, awv.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileAigcNavMetadata(avatarPath=");
        LIZ.append(this.LIZ);
        LIZ.append(", imageUri=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imageUrl=");
        LIZ.append(this.LIZJ);
        LIZ.append(", unCroppedAvatarPath=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", pathMode=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public AWV(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
