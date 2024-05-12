package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T5H {
    public final EnumC62352cZ LIZ;
    public final EnumC46473ILt LIZIZ;
    public final EnumC46499IMt LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final ChallengeDetailParam LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T5H)) {
            return false;
        }
        T5H t5h = (T5H) obj;
        return this.LIZ == t5h.LIZ && this.LIZIZ == t5h.LIZIZ && this.LIZJ == t5h.LIZJ && this.LIZLLL == t5h.LIZLLL && o.LJ(this.LJ, t5h.LJ) && o.LJ(this.LJFF, t5h.LJFF) && o.LJ(this.LJI, t5h.LJI);
    }

    public final int hashCode() {
        int hashCode = (((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        return this.LJI.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HeaderParam(headerType=");
        LIZ.append(this.LIZ);
        LIZ.append(", attrsType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", buttonType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", missionUiResId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJ);
        LIZ.append(", processId=");
        LIZ.append(this.LJFF);
        LIZ.append(", detailParam=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public T5H(EnumC62352cZ headerType, EnumC46473ILt attrsType, EnumC46499IMt buttonType, int i, String str, String str2, ChallengeDetailParam challengeDetailParam) {
        o.LJIIIZ(headerType, "headerType");
        o.LJIIIZ(attrsType, "attrsType");
        o.LJIIIZ(buttonType, "buttonType");
        this.LIZ = headerType;
        this.LIZIZ = attrsType;
        this.LIZJ = buttonType;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = challengeDetailParam;
    }
}
