package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8Dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207858Dt implements InterfaceC198557ql {
    public final C43I<C207868Du> LIZ;

    public C207858Dt() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C207858Dt) && o.LJ(this.LIZ, ((C207858Dt) obj).LIZ);
    }

    public final int hashCode() {
        C43I<C207868Du> c43i = this.LIZ;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarAndNicknameCommonData(activityResultEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C207858Dt(C43I<C207868Du> c43i) {
        this.LIZ = c43i;
    }
}
