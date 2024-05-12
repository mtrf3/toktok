package X;

import kotlin.jvm.internal.o;

/* renamed from: X.92R, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C92R implements C33Q {
    public final C43I<Boolean> LJLIL;

    public C92R() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C92R) && o.LJ(this.LJLIL, ((C92R) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<Boolean> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileEditPronounsSearchAndDisplayState(editTextContentChange=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C92R(C43I<Boolean> c43i) {
        this.LJLIL = c43i;
    }
}
