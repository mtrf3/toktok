package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mms, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57834Mms extends AbstractC57829Mmn<C57900Mnw> {
    public final C57900Mnw LJLIL;
    public final C57846Mn4 LJLILLLLZI;
    public final C57900Mnw LJLJI;

    @Override // X.AbstractC57829Mmn
    public final int hashCode() {
        return this.LJLJI.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthItem(authCard: ");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC57829Mmn
    public final /* bridge */ /* synthetic */ C57900Mnw LIZ() {
        return this.LJLIL;
    }

    @Override // X.AbstractC57829Mmn
    public final boolean equals(Object obj) {
        if (!(obj instanceof C57834Mms)) {
            return false;
        }
        return areItemTheSame((InterfaceC57784Mm4) obj);
    }

    public C57834Mms(C57900Mnw c57900Mnw, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        this.LJLIL = c57900Mnw;
        this.LJLILLLLZI = uiConfig;
        this.LJLJI = c57900Mnw;
    }
}
