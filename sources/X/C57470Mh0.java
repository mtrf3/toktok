package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mh0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57470Mh0 implements InterfaceC198557ql {
    public final C57467Mgx LIZ;

    public C57470Mh0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C57470Mh0) && o.LJ(this.LIZ, ((C57470Mh0) obj).LIZ);
    }

    public final int hashCode() {
        C57467Mgx c57467Mgx = this.LIZ;
        if (c57467Mgx == null) {
            return 0;
        }
        return c57467Mgx.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowProfileData(extraBtnHelper=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C57470Mh0(C57467Mgx c57467Mgx) {
        this.LIZ = c57467Mgx;
    }
}
