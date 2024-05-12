package X;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.o;

/* renamed from: X.89P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89P implements InterfaceC57784Mm4 {
    public final SpannableStringBuilder LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C89P) && o.LJ(this.LJLIL, ((C89P) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationServicesFooterItem(subtitle=");
        LIZ.append((Object) this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C89P(SpannableStringBuilder spannableStringBuilder) {
        this.LJLIL = spannableStringBuilder;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
