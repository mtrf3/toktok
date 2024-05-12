package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.33I, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33I extends F9E implements InterfaceC57784Mm4 {
    public final List<InterfaceC57784Mm4> LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33I(List<? extends InterfaceC57784Mm4> list) {
        this.LJLIL = list;
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
