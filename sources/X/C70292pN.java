package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.2pN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70292pN implements InterfaceC70262pK {
    public final Context LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70292pN)) {
            return false;
        }
        C70292pN c70292pN = (C70292pN) obj;
        return o.LJ(this.LIZ, c70292pN.LIZ) && o.LJ(this.LIZIZ, c70292pN.LIZIZ);
    }

    public final int hashCode() {
        Context context = this.LIZ;
        return this.LIZIZ.hashCode() + ((context == null ? 0 : context.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CanIntercept(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", onFail=");
        return C06540Nm.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C70292pN(Context context, InterfaceC65784Pro<C76800UCe> onFail) {
        o.LJIIIZ(onFail, "onFail");
        this.LIZ = context;
        this.LIZIZ = onFail;
    }
}
