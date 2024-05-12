package X;

import kotlin.jvm.internal.o;

/* renamed from: X.40B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40B implements C33Q {
    public final C43I<Boolean> LJLIL;
    public final boolean LJLILLLLZI;
    public final C63120Opw LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40B)) {
            return false;
        }
        C40B c40b = (C40B) obj;
        return o.LJ(this.LJLIL, c40b.LJLIL) && this.LJLILLLLZI == c40b.LJLILLLLZI && o.LJ(this.LJLJI, c40b.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        C63120Opw c63120Opw = this.LJLJI;
        return i2 + (c63120Opw == null ? 0 : c63120Opw.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupChatVMState(groupLeave=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isGroupChatValid=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", conversationInfo=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C40B(C43I<Boolean> c43i, boolean z, C63120Opw c63120Opw) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = z;
        this.LJLJI = c63120Opw;
    }

    public static C40B LIZ(C40B c40b, C43I groupLeave, boolean z, C63120Opw c63120Opw, int i) {
        if ((i & 1) != 0) {
            groupLeave = c40b.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c40b.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c63120Opw = c40b.LJLJI;
        }
        c40b.getClass();
        o.LJIIIZ(groupLeave, "groupLeave");
        return new C40B(groupLeave, z, c63120Opw);
    }
}
