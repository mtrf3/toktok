package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8t3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225458t3 implements C33Q {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final C43I<Integer> LJLJI;

    public C225458t3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C225458t3)) {
            return false;
        }
        C225458t3 c225458t3 = (C225458t3) obj;
        return this.LJLIL == c225458t3.LJLIL && o.LJ(this.LJLILLLLZI, c225458t3.LJLILLLLZI) && o.LJ(this.LJLJI, c225458t3.LJLJI);
    }

    public final int hashCode() {
        int i = this.LJLIL * 31;
        String str = this.LJLILLLLZI;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        C43I<Integer> c43i = this.LJLJI;
        return hashCode + (c43i != null ? c43i.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedAvatarDefaultState(followViewVisibility=");
        LIZ.append(this.LJLIL);
        LIZ.append(", profileWidgetBadgeUrl=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", updateContainerViewVisibility=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C225458t3(int i) {
        this(0, null, null);
    }

    public C225458t3(int i, String str, C43I<Integer> c43i) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = c43i;
    }

    public static C225458t3 LIZ(C225458t3 c225458t3, int i, String str, C43I c43i, int i2) {
        if ((i2 & 1) != 0) {
            i = c225458t3.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str = c225458t3.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            c43i = c225458t3.LJLJI;
        }
        c225458t3.getClass();
        return new C225458t3(i, str, c43i);
    }
}
