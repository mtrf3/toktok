package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.9zY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254969zY implements C33Q {
    public final GroupInfo LJLIL;
    public final AbstractC72932td<InviteCardDetailInnerResponse> LJLILLLLZI;
    public final AbstractC72932td<AcceptInviteCardResponse> LJLJI;
    public final boolean LJLJJI;

    public C254969zY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C254969zY)) {
            return false;
        }
        C254969zY c254969zY = (C254969zY) obj;
        return o.LJ(this.LJLIL, c254969zY.LJLIL) && o.LJ(this.LJLILLLLZI, c254969zY.LJLILLLLZI) && o.LJ(this.LJLJI, c254969zY.LJLJI) && this.LJLJJI == c254969zY.LJLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        GroupInfo groupInfo = this.LJLIL;
        if (groupInfo == null) {
            hashCode = 0;
        } else {
            hashCode = groupInfo.hashCode();
        }
        int LIZ = C03090Af.LIZ(this.LJLJI, C03090Af.LIZ(this.LJLILLLLZI, hashCode * 31, 31), 31);
        boolean z = this.LJLJJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupInviteState(group=");
        LIZ.append(this.LJLIL);
        LIZ.append(", details=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", join=");
        LIZ.append(this.LJLJI);
        LIZ.append(", close=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C254969zY(int r4) {
        /*
            r3 = this;
            X.33X r2 = X.C33X.LIZ
            r1 = 0
            r0 = 0
            r3.<init>(r0, r2, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254969zY.<init>(int):void");
    }

    public C254969zY(GroupInfo groupInfo, AbstractC72932td<InviteCardDetailInnerResponse> details, AbstractC72932td<AcceptInviteCardResponse> join, boolean z) {
        o.LJIIIZ(details, "details");
        o.LJIIIZ(join, "join");
        this.LJLIL = groupInfo;
        this.LJLILLLLZI = details;
        this.LJLJI = join;
        this.LJLJJI = z;
    }

    public static C254969zY LIZ(C254969zY c254969zY, GroupInfo groupInfo, AbstractC72932td details, AbstractC72932td join, boolean z, int i) {
        if ((i & 1) != 0) {
            groupInfo = c254969zY.LJLIL;
        }
        if ((i & 2) != 0) {
            details = c254969zY.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            join = c254969zY.LJLJI;
        }
        if ((i & 8) != 0) {
            z = c254969zY.LJLJJI;
        }
        c254969zY.getClass();
        o.LJIIIZ(details, "details");
        o.LJIIIZ(join, "join");
        return new C254969zY(groupInfo, details, join, z);
    }
}
