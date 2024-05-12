package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3pT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95833pT extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;

    public C95833pT() {
        this(15, null, false);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public /* synthetic */ C95833pT(int i, String str, boolean z) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, false, false);
    }

    public C95833pT(String groupName, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(groupName, "groupName");
        this.LJLIL = groupName;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
    }

    public static C95833pT L(C95833pT c95833pT, boolean z, boolean z2, int i) {
        String groupName;
        boolean z3;
        if ((i & 1) != 0) {
            groupName = c95833pT.LJLIL;
        } else {
            groupName = null;
        }
        if ((i & 2) != 0) {
            z3 = c95833pT.LJLILLLLZI;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z = c95833pT.LJLJI;
        }
        if ((i & 8) != 0) {
            z2 = c95833pT.LJLJJI;
        }
        c95833pT.getClass();
        o.LJIIIZ(groupName, "groupName");
        return new C95833pT(groupName, z3, z, z2);
    }
}
