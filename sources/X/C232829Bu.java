package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9Bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232829Bu implements C33Q {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final C43I<Integer> LJLJI;

    public C232829Bu() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C232829Bu)) {
            return false;
        }
        C232829Bu c232829Bu = (C232829Bu) obj;
        return this.LJLIL == c232829Bu.LJLIL && o.LJ(this.LJLILLLLZI, c232829Bu.LJLILLLLZI) && o.LJ(this.LJLJI, c232829Bu.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, r0 * 31, 31);
        C43I<Integer> c43i = this.LJLJI;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileEditPronounsNavBarState(isUpdate=");
        LIZ.append(this.LJLIL);
        LIZ.append(", newPronouns=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", toastMessageId=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C232829Bu(int i) {
        this(false, "", null);
    }

    public C232829Bu(boolean z, String newPronouns, C43I<Integer> c43i) {
        o.LJIIIZ(newPronouns, "newPronouns");
        this.LJLIL = z;
        this.LJLILLLLZI = newPronouns;
        this.LJLJI = c43i;
    }

    public static C232829Bu LIZ(C232829Bu c232829Bu, boolean z, String newPronouns, C43I c43i, int i) {
        if ((i & 1) != 0) {
            z = c232829Bu.LJLIL;
        }
        if ((i & 2) != 0) {
            newPronouns = c232829Bu.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i = c232829Bu.LJLJI;
        }
        c232829Bu.getClass();
        o.LJIIIZ(newPronouns, "newPronouns");
        return new C232829Bu(z, newPronouns, c43i);
    }
}
