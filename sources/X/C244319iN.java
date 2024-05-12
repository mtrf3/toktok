package X;

import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.9iN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244319iN {
    public final String LIZ;
    public final C9WB LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;
    public final Boolean LJFF;
    public final EnumC243849hc LJI;
    public final ProfileNgoStruct LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C244319iN)) {
            return false;
        }
        C244319iN c244319iN = (C244319iN) obj;
        return o.LJ(this.LIZ, c244319iN.LIZ) && this.LIZIZ == c244319iN.LIZIZ && o.LJ(this.LIZJ, c244319iN.LIZJ) && o.LJ(this.LIZLLL, c244319iN.LIZLLL) && o.LJ(this.LJ, c244319iN.LJ) && o.LJ(this.LJFF, c244319iN.LJFF) && this.LJI == c244319iN.LJI && o.LJ(this.LJII, c244319iN.LJII);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        String str = this.LIZJ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LJ;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJFF;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        EnumC243849hc enumC243849hc = this.LJI;
        int hashCode6 = (hashCode5 + (enumC243849hc == null ? 0 : enumC243849hc.hashCode())) * 31;
        ProfileNgoStruct profileNgoStruct = this.LJII;
        return hashCode6 + (profileNgoStruct != null ? profileNgoStruct.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaveProfileEventParams(enterMethod=");
        LIZ.append(this.LIZ);
        LIZ.append(", typeName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZJ);
        LIZ.append(", btnName=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", publishStatus=");
        LIZ.append(this.LJ);
        LIZ.append(", isFirstSave=");
        LIZ.append(this.LJFF);
        LIZ.append(", platformName=");
        LIZ.append(this.LJI);
        LIZ.append(", profileNgoStruct=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C244319iN(C244329iO c244329iO) {
        String enterMethod = c244329iO.LIZ;
        C9WB typeName = c244329iO.LIZIZ;
        String str = c244329iO.LIZJ;
        String str2 = c244329iO.LIZLLL;
        Boolean bool = c244329iO.LJ;
        Boolean bool2 = c244329iO.LJFF;
        EnumC243849hc enumC243849hc = c244329iO.LJI;
        ProfileNgoStruct profileNgoStruct = c244329iO.LJII;
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(typeName, "typeName");
        this.LIZ = enterMethod;
        this.LIZIZ = typeName;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = bool;
        this.LJFF = bool2;
        this.LJI = enumC243849hc;
        this.LJII = profileNgoStruct;
    }
}
