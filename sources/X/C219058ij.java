package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219058ij implements InterfaceC208718Hb<C219058ij, C218768iG> {
    public final C8HZ<C218768iG> LJLIL;
    public final List<UserInvitee> LJLILLLLZI;

    public C219058ij() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C218768iG> getListItemState() {
        return C208708Ha.LIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadLatestState() {
        return C208708Ha.LIZIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadMoreState() {
        return C208708Ha.LIZJ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getRefreshState() {
        return C208708Ha.LIZLLL(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserRecommendState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", insertUser=");
        return C1NE.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C218768iG> getListState() {
        return this.LJLIL;
    }

    public C219058ij(int i) {
        this(new C8HZ(null, null, 15), C61878OQg.INSTANCE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C219058ij)) {
            return false;
        }
        C219058ij c219058ij = (C219058ij) obj;
        if (o.LJ(this.LJLIL, c219058ij.LJLIL) && o.LJ(this.LJLILLLLZI, c219058ij.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C219058ij(C8HZ<C218768iG> listState, List<UserInvitee> insertUser) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(insertUser, "insertUser");
        this.LJLIL = listState;
        this.LJLILLLLZI = insertUser;
    }

    public static C219058ij LIZ(C219058ij c219058ij, C8HZ listState, List insertUser, int i) {
        if ((i & 1) != 0) {
            listState = c219058ij.LJLIL;
        }
        if ((i & 2) != 0) {
            insertUser = c219058ij.LJLILLLLZI;
        }
        c219058ij.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(insertUser, "insertUser");
        return new C219058ij(listState, insertUser);
    }
}
