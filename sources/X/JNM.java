package X;

import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JNM implements InterfaceC80653En {
    public final JQA LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JNM) && o.LJ(this.LJLIL, ((JNM) obj).LJLIL);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchItemMobParamSource(itemMobParam=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public JNM(JQA jqa) {
        this.LJLIL = jqa;
        o.LJIIIIZZ(UUID.randomUUID().toString(), "randomUUID().toString()");
    }
}
