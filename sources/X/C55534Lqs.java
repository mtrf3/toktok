package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lqs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55534Lqs implements InterfaceC87283bg {
    public final InterfaceC55798Lv8 LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C55534Lqs) && o.LJ(this.LJLIL, ((C55534Lqs) obj).LJLIL);
    }

    public final int hashCode() {
        InterfaceC55798Lv8 interfaceC55798Lv8 = this.LJLIL;
        if (interfaceC55798Lv8 == null) {
            return 0;
        }
        return interfaceC55798Lv8.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RacunFragmentHierarchyData(callback=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C55534Lqs(C55792Lv2 c55792Lv2) {
        this.LJLIL = c55792Lv2;
    }
}
