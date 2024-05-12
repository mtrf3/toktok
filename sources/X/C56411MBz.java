package X;

import com.ss.android.ugc.aweme.search.TrendingEventModel;
import kotlin.jvm.internal.o;

/* renamed from: X.MBz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56411MBz implements InterfaceC57784Mm4 {
    public final TrendingEventModel LJLIL;
    public final boolean LJLILLLLZI;
    public final MC3 LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56411MBz)) {
            return false;
        }
        C56411MBz c56411MBz = (C56411MBz) obj;
        return o.LJ(this.LJLIL, c56411MBz.LJLIL) && this.LJLILLLLZI == c56411MBz.LJLILLLLZI && o.LJ(this.LJLJI, c56411MBz.LJLJI);
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
        MC3 mc3 = this.LJLJI;
        return i2 + (mc3 == null ? 0 : mc3.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrendingSheetItem(model=");
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

    public C56411MBz(TrendingEventModel model, boolean z, C56409MBx c56409MBx) {
        o.LJIIIZ(model, "model");
        this.LJLIL = model;
        this.LJLILLLLZI = z;
        this.LJLJI = c56409MBx;
    }
}
