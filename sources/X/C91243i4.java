package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3i4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91243i4 extends F9E implements InterfaceC57784Mm4 {
    public final int LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C91243i4) || this.LJLIL != ((C91243i4) interfaceC57784Mm4).LJLIL) {
            return false;
        }
        return true;
    }

    public C91243i4(int i, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
    }
}
