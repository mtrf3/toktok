package X;

import com.ss.android.ugc.aweme.model.library.LibraryDetailParam;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T5J {
    public final EnumC62272cR LIZ;
    public final EnumC46471ILr LIZIZ;
    public final EnumC62252cP LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final LibraryDetailParam LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T5J)) {
            return false;
        }
        T5J t5j = (T5J) obj;
        return this.LIZ == t5j.LIZ && this.LIZIZ == t5j.LIZIZ && this.LIZJ == t5j.LIZJ && o.LJ(this.LIZLLL, t5j.LIZLLL) && o.LJ(this.LJ, t5j.LJ) && o.LJ(this.LJFF, t5j.LJFF);
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
        LIZ.append("LibraryHeaderParam(headerType=");
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

    public T5J(String str, String str2, LibraryDetailParam detailParam) {
        EnumC62272cR headerType = EnumC62272cR.TYPE_NORMAL;
        EnumC46471ILr attrsType = EnumC46471ILr.TYPE_LINK;
        EnumC62252cP buttonType = EnumC62252cP.TYPE_NORMAL;
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
