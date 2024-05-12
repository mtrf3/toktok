package X;

import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T5I {
    public final EnumC62282cS LIZ;
    public final EnumC46472ILs LIZIZ;
    public final EnumC62262cQ LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final QuestionDetailParam LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T5I)) {
            return false;
        }
        T5I t5i = (T5I) obj;
        return this.LIZ == t5i.LIZ && this.LIZIZ == t5i.LIZIZ && this.LIZJ == t5i.LIZJ && o.LJ(this.LIZLLL, t5i.LIZLLL) && o.LJ(this.LJ, t5i.LJ) && o.LJ(this.LJFF, t5i.LJFF);
    }

    public final int hashCode() {
        int hashCode = (this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31;
        String str = this.LIZLLL;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return this.LJFF.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HeaderParam(headerType=");
        LIZ.append(this.LIZ);
        LIZ.append(", attrsType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", buttonType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", processId=");
        LIZ.append(this.LJ);
        LIZ.append(", detailParam=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public T5I(String str, String str2, QuestionDetailParam detailParam) {
        EnumC62282cS headerType = EnumC62282cS.TYPE_NORMAL;
        EnumC46472ILs attrsType = EnumC46472ILs.TYPE_LINK;
        EnumC62262cQ buttonType = EnumC62262cQ.TYPE_NORMAL;
        o.LJIIIZ(headerType, "headerType");
        o.LJIIIZ(attrsType, "attrsType");
        o.LJIIIZ(buttonType, "buttonType");
        o.LJIIIZ(detailParam, "detailParam");
        this.LIZ = headerType;
        this.LIZIZ = attrsType;
        this.LIZJ = buttonType;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = detailParam;
    }
}
