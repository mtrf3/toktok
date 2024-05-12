package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveDisplayInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.2To, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59082To implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final SaveDisplayInfo LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59082To)) {
            return false;
        }
        C59082To c59082To = (C59082To) obj;
        return o.LJ(this.LJLIL, c59082To.LJLIL) && o.LJ(this.LJLILLLLZI, c59082To.LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        SaveDisplayInfo saveDisplayInfo = this.LJLILLLLZI;
        return hashCode + (saveDisplayInfo == null ? 0 : saveDisplayInfo.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaveNewCardItem(content=");
        LIZ.append(this.LJLIL);
        LIZ.append(", richContent=");
        LIZ.append(this.LJLILLLLZI);
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

    public C59082To(String str, SaveDisplayInfo saveDisplayInfo) {
        this.LJLIL = str;
        this.LJLILLLLZI = saveDisplayInfo;
    }
}
