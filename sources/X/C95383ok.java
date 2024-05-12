package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95383ok {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final C95833pT LIZLLL;
    public final boolean LJ;
    public final List<C81243Gu> LJFF;
    public final C95693pF LJI;

    public C95383ok() {
        this(false, false, null, false, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C95383ok)) {
            return false;
        }
        C95383ok c95383ok = (C95383ok) obj;
        return this.LIZ == c95383ok.LIZ && this.LIZIZ == c95383ok.LIZIZ && this.LIZJ == c95383ok.LIZJ && o.LJ(this.LIZLLL, c95383ok.LIZLLL) && this.LJ == c95383ok.LJ && o.LJ(this.LJFF, c95383ok.LJFF) && o.LJ(this.LJI, c95383ok.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupChatDetailModel(groupMemberShowCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", muted=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", pined=");
        LIZ.append(this.LIZJ);
        LIZ.append(", groupNameInfo=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", requireApprovalToJoin=");
        LIZ.append(this.LJ);
        LIZ.append(", members=");
        LIZ.append(this.LJFF);
        LIZ.append(", requestInfo=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = this.LIZ * 31;
        boolean z = this.LIZIZ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        boolean z2 = this.LIZJ;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int hashCode2 = (this.LIZLLL.hashCode() + ((i4 + i5) * 31)) * 31;
        if (!this.LJ) {
            i2 = 0;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJFF, (hashCode2 + i2) * 31, 31);
        C95693pF c95693pF = this.LJI;
        if (c95693pF == null) {
            hashCode = 0;
        } else {
            hashCode = c95693pF.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public C95383ok(boolean z, boolean z2, C95833pT groupNameInfo, boolean z3, int i) {
        int i2;
        C61878OQg members;
        if ((i & 1) != 0) {
            i2 = 12;
        } else {
            i2 = 0;
        }
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        groupNameInfo = (i & 8) != 0 ? new C95833pT(15, null, false) : groupNameInfo;
        z3 = (i & 16) != 0 ? true : z3;
        if ((i & 32) != 0) {
            members = C61878OQg.INSTANCE;
        } else {
            members = null;
        }
        o.LJIIIZ(groupNameInfo, "groupNameInfo");
        o.LJIIIZ(members, "members");
        this.LIZ = i2;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = groupNameInfo;
        this.LJ = z3;
        this.LJFF = members;
        this.LJI = null;
    }
}
