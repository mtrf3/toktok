package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ko, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31261Ko extends AbstractC07650Rt {
    public final View LIZ;
    public final C279917z LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31261Ko)) {
            return false;
        }
        C31261Ko c31261Ko = (C31261Ko) obj;
        return o.LJ(this.LIZ, c31261Ko.LIZ) && o.LJ(this.LIZIZ, c31261Ko.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StartAddAnimation(iconView=");
        LIZ.append(this.LIZ);
        LIZ.append(", songInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C31261Ko(View view, C279917z c279917z) {
        this.LIZ = view;
        this.LIZIZ = c279917z;
    }
}
