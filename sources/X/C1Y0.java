package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.1Y0, reason: invalid class name */
/* loaded from: classes.dex */
public class C1Y0 implements C14Q<List<C19370pR>, List<C08520Vc>> {
    @Override // X.C14Q
    public final List<C08520Vc> apply(List<C19370pR> list) {
        List<C19370pR> list2 = list;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator<C19370pR> it = list2.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            final C0CY c0cy = C0CY.LIZIZ;
            final UUID fromString = UUID.fromString(null);
            arrayList.add(new Object(fromString, c0cy) { // from class: X.0Vc
                public final UUID LIZ;
                public final C0CY LJ;
                public final EnumC08510Vb LIZIZ = null;
                public final C0CY LIZJ = null;
                public final java.util.Set<String> LIZLLL = new HashSet((Collection) null);
                public final int LJFF = 0;

                public final int hashCode() {
                    return ((this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.LJFF;
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("WorkInfo{mId='");
                    LIZ.append(this.LIZ);
                    LIZ.append('\'');
                    LIZ.append(", mState=");
                    LIZ.append(this.LIZIZ);
                    LIZ.append(", mOutputData=");
                    LIZ.append(this.LIZJ);
                    LIZ.append(", mTags=");
                    LIZ.append(this.LIZLLL);
                    LIZ.append(", mProgress=");
                    LIZ.append(this.LJ);
                    LIZ.append('}');
                    return X1D.LIZIZ(LIZ);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || C08520Vc.class != obj.getClass()) {
                        return false;
                    }
                    C08520Vc c08520Vc = (C08520Vc) obj;
                    if (this.LJFF != c08520Vc.LJFF || !this.LIZ.equals(c08520Vc.LIZ) || this.LIZIZ != c08520Vc.LIZIZ || !this.LIZJ.equals(c08520Vc.LIZJ) || !this.LIZLLL.equals(c08520Vc.LIZLLL)) {
                        return false;
                    }
                    return this.LJ.equals(c08520Vc.LJ);
                }

                {
                    this.LIZ = fromString;
                    this.LJ = c0cy;
                }
            });
        }
        return arrayList;
    }
}
