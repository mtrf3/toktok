package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.4ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118524ky implements InterfaceC57784Mm4 {
    public final T5R LJLIL;
    public final C2068389v LJLILLLLZI;
    public final View.OnClickListener LJLJI;
    public final boolean LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C118524ky)) {
            return false;
        }
        C118524ky c118524ky = (C118524ky) obj;
        return o.LJ(this.LJLIL, c118524ky.LJLIL) && o.LJ(this.LJLILLLLZI, c118524ky.LJLILLLLZI) && o.LJ(this.LJLJI, c118524ky.LJLJI) && this.LJLJJI == c118524ky.LJLJJI;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        C2068389v c2068389v = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c2068389v == null ? 0 : c2068389v.hashCode())) * 31;
        View.OnClickListener onClickListener = this.LJLJI;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        boolean z = this.LJLJJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchEllipsisTextItem(textTitle=");
        LIZ.append((Object) this.LJLIL);
        LIZ.append(", textIcon=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", listener=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isFirst=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C118524ky(T5R t5r, C2068389v c2068389v, View.OnClickListener onClickListener, boolean z) {
        this.LJLIL = t5r;
        this.LJLILLLLZI = c2068389v;
        this.LJLJI = onClickListener;
        this.LJLJJI = z;
    }
}
