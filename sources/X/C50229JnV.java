package X;

import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.JnV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50229JnV implements C33Q {
    public ResearchFilterStruct LJLIL;

    public C50229JnV() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50229JnV) && o.LJ(this.LJLIL, ((C50229JnV) obj).LJLIL);
    }

    public final int hashCode() {
        ResearchFilterStruct researchFilterStruct = this.LJLIL;
        if (researchFilterStruct == null) {
            return 0;
        }
        return researchFilterStruct.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResearchFilterState(selectedItem=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C50229JnV(ResearchFilterStruct researchFilterStruct) {
        this.LJLIL = researchFilterStruct;
    }
}
