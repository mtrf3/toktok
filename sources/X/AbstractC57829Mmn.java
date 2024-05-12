package X;

import X.InterfaceC57927MoN;
import kotlin.jvm.internal.o;

/* renamed from: X.Mmn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC57829Mmn<T extends InterfaceC57927MoN> implements InterfaceC57784Mm4 {
    public abstract T LIZ();

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public int hashCode() {
        return LIZ().hashCode();
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        AbstractC57829Mmn abstractC57829Mmn;
        InterfaceC57927MoN interfaceC57927MoN = null;
        if ((interfaceC57784Mm4 instanceof AbstractC57829Mmn) && (abstractC57829Mmn = (AbstractC57829Mmn) interfaceC57784Mm4) != null) {
            interfaceC57927MoN = abstractC57829Mmn.LIZ();
        }
        return o.LJ(interfaceC57927MoN, LIZ());
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 other) {
        AbstractC57829Mmn abstractC57829Mmn;
        InterfaceC57927MoN LIZ;
        o.LJIIIZ(other, "other");
        String str = null;
        if ((other instanceof AbstractC57829Mmn) && (abstractC57829Mmn = (AbstractC57829Mmn) other) != null && (LIZ = abstractC57829Mmn.LIZ()) != null) {
            str = LIZ.getElementId();
        }
        return o.LJ(str, LIZ().getElementId());
    }

    public boolean equals(Object obj) {
        return o.LJ(LIZ(), obj);
    }
}
