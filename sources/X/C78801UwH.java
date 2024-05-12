package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UwH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78801UwH {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<Integer> LIZLLL;
    public final List<C78789Uw5> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78801UwH)) {
            return false;
        }
        C78801UwH c78801UwH = (C78801UwH) obj;
        return o.LJ(this.LIZ, c78801UwH.LIZ) && o.LJ(this.LIZIZ, c78801UwH.LIZIZ) && o.LJ(this.LIZJ, c78801UwH.LIZJ) && o.LJ(this.LIZLLL, c78801UwH.LIZLLL) && o.LJ(this.LJ, c78801UwH.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.LJ.hashCode() + AnonymousClass391.LIZIZ(this.LIZLLL, (LJ + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnnotationList(optionName=");
        LIZ.append(this.LIZ);
        LIZ.append(", translation=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", default=");
        LIZ.append(this.LIZJ);
        LIZ.append(", selectionList=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", iconList=");
        return C1NE.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C78801UwH(String str, String str2, String str3, List<Integer> list, List<C78789Uw5> iconList) {
        o.LJIIIZ(iconList, "iconList");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
        this.LJ = iconList;
    }
}
