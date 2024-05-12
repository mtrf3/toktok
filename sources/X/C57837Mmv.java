package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mmv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57837Mmv extends AbstractC57829Mmn<AbstractC27771Av9> {
    public final AbstractC27771Av9 LJLIL;

    @Override // X.AbstractC57829Mmn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C57837Mmv) && o.LJ(this.LJLIL, ((C57837Mmv) obj).LJLIL);
    }

    @Override // X.AbstractC57829Mmn
    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InsertedItem(element=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC57829Mmn
    public final /* bridge */ /* synthetic */ AbstractC27771Av9 LIZ() {
        return this.LJLIL;
    }

    public C57837Mmv(AbstractC27771Av9 abstractC27771Av9) {
        this.LJLIL = abstractC27771Av9;
    }
}
