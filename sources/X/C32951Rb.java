package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32951Rb extends F9E implements InterfaceC13360fk {
    public final int LJLIL;

    @Override // X.InterfaceC13360fk
    public final int LLFF(int i) {
        return i;
    }

    @Override // X.InterfaceC13360fk
    public final int LLJJI(int i) {
        return i;
    }

    @Override // X.InterfaceC13360fk
    public final AbstractC13490fx LLJJIII(AbstractC13490fx abstractC13490fx) {
        return abstractC13490fx;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL)};
    }

    public C32951Rb(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC13360fk
    public final C13640gC LLZLLIL(C13640gC fontWeight) {
        o.LJIIIZ(fontWeight, "fontWeight");
        int i = this.LJLIL;
        if (i == 0 || i == Integer.MAX_VALUE) {
            return fontWeight;
        }
        return new C13640gC(C78842Uww.LJIIL(fontWeight.LJLIL + i, 1, 1000));
    }
}
