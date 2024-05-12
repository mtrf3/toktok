package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198577qn implements InterfaceC198557ql {
    public final C43I<OSZ<Exception, Integer>> LIZ;

    public C198577qn() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C198577qn) && o.LJ(this.LIZ, ((C198577qn) obj).LIZ);
    }

    public final int hashCode() {
        C43I<OSZ<Exception, Integer>> c43i = this.LIZ;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MineProfileEditData(onUserUpdateFailed=");
        return C61845OOz.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C198577qn(C43I<? extends OSZ<? extends Exception, Integer>> c43i) {
        this.LIZ = c43i;
    }
}
