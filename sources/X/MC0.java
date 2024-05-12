package X;

import com.ss.android.ugc.aweme.search.TrendingEventModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MC0 implements InterfaceC57784Mm4 {
    public final TrendingEventModel LJLIL;
    public final boolean LJLILLLLZI;
    public final MC4 LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MC0)) {
            return false;
        }
        MC0 mc0 = (MC0) obj;
        return o.LJ(this.LJLIL, mc0.LJLIL) && this.LJLILLLLZI == mc0.LJLILLLLZI && o.LJ(this.LJLJI, mc0.LJLJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        MC4 mc4 = this.LJLJI;
        return i2 + (mc4 == null ? 0 : mc4.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrendingSheetRichItem(model=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isSelected=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", listener=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public MC0(TrendingEventModel model, boolean z, C56410MBy c56410MBy) {
        o.LJIIIZ(model, "model");
        this.LJLIL = model;
        this.LJLILLLLZI = z;
        this.LJLJI = c56410MBy;
    }
}
