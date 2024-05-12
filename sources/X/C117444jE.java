package X;

import Y.IDCListenerS205S0100000_4;
import android.widget.CompoundButton;
import kotlin.jvm.internal.o;

/* renamed from: X.4jE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117444jE implements InterfaceC57784Mm4 {
    public final boolean LJLIL;
    public final T5R LJLILLLLZI;
    public final C2068389v LJLJI;
    public final CompoundButton.OnCheckedChangeListener LJLJJI;
    public final boolean LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C117444jE)) {
            return false;
        }
        C117444jE c117444jE = (C117444jE) obj;
        return this.LJLIL == c117444jE.LJLIL && o.LJ(this.LJLILLLLZI, c117444jE.LJLILLLLZI) && o.LJ(this.LJLJI, c117444jE.LJLJI) && o.LJ(this.LJLJJI, c117444jE.LJLJJI) && this.LJLJJL == c117444jE.LJLJJL;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.LJLILLLLZI.hashCode() + (r0 * 31)) * 31;
        C2068389v c2068389v = this.LJLJI;
        int hashCode2 = (hashCode + (c2068389v == null ? 0 : c2068389v.hashCode())) * 31;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.LJLJJI;
        return ((hashCode2 + (onCheckedChangeListener != null ? onCheckedChangeListener.hashCode() : 0)) * 31) + (this.LJLJJL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchEllipsisSwitchItem(switchStatus=");
        LIZ.append(this.LJLIL);
        LIZ.append(", switchTitle=");
        LIZ.append((Object) this.LJLILLLLZI);
        LIZ.append(", switchIcon=");
        LIZ.append(this.LJLJI);
        LIZ.append(", listener=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isFirst=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C117444jE(boolean z, T5R t5r, C2068389v c2068389v, IDCListenerS205S0100000_4 iDCListenerS205S0100000_4, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = t5r;
        this.LJLJI = c2068389v;
        this.LJLJJI = iDCListenerS205S0100000_4;
        this.LJLJJL = z2;
    }
}
