package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.98Q, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C98Q implements C33Q {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final AbstractC72932td<Integer> LJLJJL;
    public final C43I<Integer> LJLJJLL;
    public final C43I<User> LJLJL;
    public final User LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;

    public C98Q() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C98Q)) {
            return false;
        }
        C98Q c98q = (C98Q) obj;
        return this.LJLIL == c98q.LJLIL && this.LJLILLLLZI == c98q.LJLILLLLZI && this.LJLJI == c98q.LJLJI && this.LJLJJI == c98q.LJLJJI && o.LJ(this.LJLJJL, c98q.LJLJJL) && o.LJ(this.LJLJJLL, c98q.LJLJJLL) && o.LJ(this.LJLJL, c98q.LJLJL) && o.LJ(this.LJLJLJ, c98q.LJLJLJ) && this.LJLJLLL == c98q.LJLJLLL && this.LJLL == c98q.LJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z = this.LJLIL;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = ((((r0 * 31) + this.LJLILLLLZI) * 31) + this.LJLJI) * 31;
        ?? r02 = this.LJLJJI;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int LIZ = C03090Af.LIZ(this.LJLJJL, (i2 + i3) * 31, 31);
        C43I<Integer> c43i = this.LJLJJLL;
        int i4 = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i5 = (LIZ + hashCode) * 31;
        C43I<User> c43i2 = this.LJLJL;
        if (c43i2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i2.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        User user = this.LJLJLJ;
        if (user != null) {
            i4 = user.hashCode();
        }
        int i7 = (i6 + i4) * 31;
        ?? r03 = this.LJLJLLL;
        int i8 = r03;
        if (r03 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        if (!this.LJLL) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserProfileUserCardVMState(isExpanded=");
        LIZ.append(this.LJLIL);
        LIZ.append(", loadReason=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", openIconStatus=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isAssemVisible=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", userCardState=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", errorEvent=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", triggerRefresh=");
        LIZ.append(this.LJLJL);
        LIZ.append(", hostUser=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", isSimpleUser=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", isPublishEmpty=");
        return C48339Iy7.LIZJ(LIZ, this.LJLL, ')', LIZ);
    }

    public /* synthetic */ C98Q(int i) {
        this(false, -1, 0, false, C33X.LIZ, null, null, null, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C98Q(boolean z, int i, int i2, boolean z2, AbstractC72932td<Integer> userCardState, C43I<Integer> c43i, C43I<? extends User> c43i2, User user, boolean z3, boolean z4) {
        o.LJIIIZ(userCardState, "userCardState");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = z2;
        this.LJLJJL = userCardState;
        this.LJLJJLL = c43i;
        this.LJLJL = c43i2;
        this.LJLJLJ = user;
        this.LJLJLLL = z3;
        this.LJLL = z4;
    }

    public static C98Q LIZ(C98Q c98q, boolean z, int i, int i2, boolean z2, AbstractC72932td abstractC72932td, C43I c43i, C43I c43i2, User user, boolean z3, boolean z4, int i3) {
        boolean z5 = z4;
        boolean z6 = z3;
        User user2 = user;
        C43I c43i3 = c43i2;
        int i4 = i;
        boolean z7 = z;
        int i5 = i2;
        boolean z8 = z2;
        AbstractC72932td userCardState = abstractC72932td;
        C43I c43i4 = c43i;
        if ((i3 & 1) != 0) {
            z7 = c98q.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i4 = c98q.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            i5 = c98q.LJLJI;
        }
        if ((i3 & 8) != 0) {
            z8 = c98q.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            userCardState = c98q.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            c43i4 = c98q.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            c43i3 = c98q.LJLJL;
        }
        if ((i3 & 128) != 0) {
            user2 = c98q.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            z6 = c98q.LJLJLLL;
        }
        if ((i3 & 512) != 0) {
            z5 = c98q.LJLL;
        }
        c98q.getClass();
        o.LJIIIZ(userCardState, "userCardState");
        return new C98Q(z7, i4, i5, z8, userCardState, c43i4, c43i3, user2, z6, z5);
    }
}
