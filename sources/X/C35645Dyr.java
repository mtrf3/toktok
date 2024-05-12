package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Dyr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35645Dyr implements C33Q {
    public final C35646Dys LJLIL;
    public final C35475Dw7 LJLILLLLZI;

    public C35645Dyr() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35645Dyr)) {
            return false;
        }
        C35645Dyr c35645Dyr = (C35645Dyr) obj;
        return o.LJ(this.LJLIL, c35645Dyr.LJLIL) && o.LJ(this.LJLILLLLZI, c35645Dyr.LJLILLLLZI);
    }

    public final int hashCode() {
        C35646Dys c35646Dys = this.LJLIL;
        int hashCode = (c35646Dys == null ? 0 : c35646Dys.hashCode()) * 31;
        C35475Dw7 c35475Dw7 = this.LJLILLLLZI;
        return hashCode + (c35475Dw7 != null ? c35475Dw7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallSkylightState(showFollowSkyLight=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showExploreSkyLight=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C35645Dyr(C35646Dys c35646Dys, C35475Dw7 c35475Dw7) {
        this.LJLIL = c35646Dys;
        this.LJLILLLLZI = c35475Dw7;
    }
}
