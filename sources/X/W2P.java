package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W2P extends W2O {
    public final InterfaceC88472Yns<Activity, C76800UCe> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W2P) && o.LJ(this.LIZ, ((W2P) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoginUser(loginUser=");
        return C249109q6.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public W2P(W3L w3l) {
        this.LIZ = w3l;
    }
}
