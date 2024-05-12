package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.QpF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68173QpF implements Serializable, InterfaceC62818Ol4 {
    public final Object LJLIL;

    public C68173QpF(Object obj) {
        this.LJLIL = obj;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LJLIL});
    }

    @Override // X.InterfaceC62818Ol4
    public final Object zza() {
        return this.LJLIL;
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.LJLIL + ")";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C68173QpF)) {
            return false;
        }
        Object obj2 = this.LJLIL;
        Object obj3 = ((C68173QpF) obj).LJLIL;
        if (obj2 != obj3 && !obj2.equals(obj3)) {
            return false;
        }
        return true;
    }
}
