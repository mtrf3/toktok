package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JMI {
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZ;
    public final InterfaceC87283bg LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JMI)) {
            return false;
        }
        JMI jmi = (JMI) obj;
        return o.LJ(this.LIZ, jmi.LIZ) && o.LJ(this.LIZIZ, jmi.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC87283bg interfaceC87283bg = this.LIZIZ;
        return hashCode + (interfaceC87283bg == null ? 0 : interfaceC87283bg.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AssemMeta(assem=");
        LIZ.append(this.LIZ);
        LIZ.append(", config=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public JMI(InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> assem, InterfaceC87283bg interfaceC87283bg) {
        o.LJIIIZ(assem, "assem");
        this.LIZ = assem;
        this.LIZIZ = interfaceC87283bg;
    }
}
