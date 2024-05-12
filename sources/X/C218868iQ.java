package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8iQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218868iQ implements C33Q {
    public final List<UserInvitee> LJLIL;
    public final C43I<C76800UCe> LJLILLLLZI;
    public final C43I<CharSequence> LJLJI;

    public C218868iQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C218868iQ)) {
            return false;
        }
        C218868iQ c218868iQ = (C218868iQ) obj;
        return o.LJ(this.LJLIL, c218868iQ.LJLIL) && o.LJ(this.LJLILLLLZI, c218868iQ.LJLILLLLZI) && o.LJ(this.LJLJI, c218868iQ.LJLJI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        C43I<C76800UCe> c43i = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<CharSequence> c43i2 = this.LJLJI;
        return hashCode2 + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursInviteState(selectedUsers=");
        LIZ.append(this.LJLIL);
        LIZ.append(", onSelectDoneEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", onKeywordChange=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C218868iQ(int i) {
        this(C61878OQg.INSTANCE, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C218868iQ(List<UserInvitee> selectedUsers, C43I<C76800UCe> c43i, C43I<? extends CharSequence> c43i2) {
        o.LJIIIZ(selectedUsers, "selectedUsers");
        this.LJLIL = selectedUsers;
        this.LJLILLLLZI = c43i;
        this.LJLJI = c43i2;
    }

    public static C218868iQ LIZ(C218868iQ c218868iQ, List selectedUsers, C43I c43i, int i) {
        C43I<C76800UCe> c43i2;
        if ((i & 1) != 0) {
            selectedUsers = c218868iQ.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i2 = c218868iQ.LJLILLLLZI;
        } else {
            c43i2 = null;
        }
        if ((i & 4) != 0) {
            c43i = c218868iQ.LJLJI;
        }
        c218868iQ.getClass();
        o.LJIIIZ(selectedUsers, "selectedUsers");
        return new C218868iQ(selectedUsers, c43i2, c43i);
    }
}
