package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219708jm implements InterfaceC208718Hb<C219708jm, C219618jd> {
    public final List<C220108kQ> LJLIL;
    public final User LJLILLLLZI;
    public final C8HZ<C219618jd> LJLJI;

    public C219708jm() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        User user = this.LJLILLLLZI;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        return this.LJLJI.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C219618jd> getListItemState() {
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
        LIZ.append("HubListVMState(tabTopicCountInfoList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", viewedUser=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C219618jd> getListState() {
        return this.LJLJI;
    }

    public C219708jm(int i) {
        this(C61878OQg.INSTANCE, null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C219708jm)) {
            return false;
        }
        C219708jm c219708jm = (C219708jm) obj;
        if (o.LJ(this.LJLIL, c219708jm.LJLIL) && o.LJ(this.LJLILLLLZI, c219708jm.LJLILLLLZI) && o.LJ(this.LJLJI, c219708jm.LJLJI)) {
            return true;
        }
        return false;
    }

    public C219708jm(List<C220108kQ> tabTopicCountInfoList, User user, C8HZ<C219618jd> listState) {
        o.LJIIIZ(tabTopicCountInfoList, "tabTopicCountInfoList");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = tabTopicCountInfoList;
        this.LJLILLLLZI = user;
        this.LJLJI = listState;
    }

    public static C219708jm LIZ(C219708jm c219708jm, List tabTopicCountInfoList, User user, C8HZ listState, int i) {
        if ((i & 1) != 0) {
            tabTopicCountInfoList = c219708jm.LJLIL;
        }
        if ((i & 2) != 0) {
            user = c219708jm.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            listState = c219708jm.LJLJI;
        }
        c219708jm.getClass();
        o.LJIIIZ(tabTopicCountInfoList, "tabTopicCountInfoList");
        o.LJIIIZ(listState, "listState");
        return new C219708jm(tabTopicCountInfoList, user, listState);
    }
}
