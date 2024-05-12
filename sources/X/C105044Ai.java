package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105044Ai implements C33Q {
    public final C43I<C105074Al> LJLIL;
    public final String LJLILLLLZI;
    public final C43I<String> LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C105044Ai)) {
            return false;
        }
        C105044Ai c105044Ai = (C105044Ai) obj;
        return o.LJ(this.LJLIL, c105044Ai.LJLIL) && o.LJ(this.LJLILLLLZI, c105044Ai.LJLILLLLZI) && o.LJ(this.LJLJI, c105044Ai.LJLJI) && this.LJLJJI == c105044Ai.LJLJJI && this.LJLJJL == c105044Ai.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZIZ = C40328FsC.LIZIZ(this.LJLJI, (hashCode2 + hashCode) * 31, 31);
        boolean z = this.LJLJJI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZIZ + i2) * 31;
        if (!this.LJLJJL) {
            i = 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChatRoomInputVMState(displayPanelEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", currentText=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", onMentionDeleted=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isKeyboardShowing=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isPanelShowing=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public C105044Ai(C43I<C105074Al> c43i, String str, C43I<String> c43i2, boolean z, boolean z2) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = str;
        this.LJLJI = c43i2;
        this.LJLJJI = z;
        this.LJLJJL = z2;
    }

    public static C105044Ai LIZ(C105044Ai c105044Ai, C43I c43i, String str, C43I c43i2, boolean z, boolean z2, int i) {
        boolean z3 = z2;
        boolean z4 = z;
        C43I onMentionDeleted = c43i2;
        C43I displayPanelEvent = c43i;
        String str2 = str;
        if ((i & 1) != 0) {
            displayPanelEvent = c105044Ai.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c105044Ai.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            onMentionDeleted = c105044Ai.LJLJI;
        }
        if ((i & 8) != 0) {
            z4 = c105044Ai.LJLJJI;
        }
        if ((i & 16) != 0) {
            z3 = c105044Ai.LJLJJL;
        }
        c105044Ai.getClass();
        o.LJIIIZ(displayPanelEvent, "displayPanelEvent");
        o.LJIIIZ(onMentionDeleted, "onMentionDeleted");
        return new C105044Ai(displayPanelEvent, str2, onMentionDeleted, z4, z3);
    }
}
