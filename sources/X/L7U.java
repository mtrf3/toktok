package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L7U {
    public final L99 LIZ;
    public final Integer LIZIZ;
    public final InterfaceC88472Yns<View, C76800UCe> LIZJ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendsEmptyButtonState(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", textRes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", onClick=");
        return C249109q6.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L7U) || this.LIZ != ((L7U) obj).LIZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L7U(L99 type, Integer num, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = num;
        this.LIZJ = interfaceC88472Yns;
    }
}
