package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200367tg implements C33Q {
    public final C200347te LJLIL;
    public final C43I<Boolean> LJLILLLLZI;

    public C200367tg() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C200367tg)) {
            return false;
        }
        C200367tg c200367tg = (C200367tg) obj;
        return o.LJ(this.LJLIL, c200367tg.LJLIL) && o.LJ(this.LJLILLLLZI, c200367tg.LJLILLLLZI);
    }

    public final int hashCode() {
        C200347te c200347te = this.LJLIL;
        int hashCode = (c200347te == null ? 0 : c200347te.hashCode()) * 31;
        C43I<Boolean> c43i = this.LJLILLLLZI;
        return hashCode + (c43i != null ? c43i.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PostModeDiggState(displayState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showClickAnimation=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C200367tg(C200347te c200347te, C43I<Boolean> c43i) {
        this.LJLIL = c200347te;
        this.LJLILLLLZI = c43i;
    }

    public static C200367tg LIZ(C200367tg c200367tg, C200347te c200347te) {
        C43I<Boolean> c43i = c200367tg.LJLILLLLZI;
        c200367tg.getClass();
        return new C200367tg(c200347te, c43i);
    }
}
