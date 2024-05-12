package X;

import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C181667Ba implements InterfaceC57784Mm4 {
    public final User LJLIL;
    public final AnonymousClass795 LJLILLLLZI;
    public boolean LJLJI;
    public final ActivityStatus LJLJJI;
    public final List<String> LJLJJL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return Objects.hash(this.LJLIL.getUid(), this.LJLJJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LikeItem(user=");
        LIZ.append(this.LJLIL);
        LIZ.append(", params=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", shouldHint=");
        LIZ.append(this.LJLJI);
        LIZ.append(", activityStatus=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", unwatchedList=");
        return C1NE.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        java.util.Set set;
        if (!areItemTheSame(interfaceC57784Mm4)) {
            return false;
        }
        C181667Ba c181667Ba = (C181667Ba) interfaceC57784Mm4;
        User user = c181667Ba.LJLIL;
        if (!o.LJ(this.LJLIL.getUid(), user.getUid()) || this.LJLIL.getFollowStatus() != user.getFollowStatus() || this.LJLIL.getFollowerStatus() != user.getFollowerStatus() || !Objects.equals(this.LJLIL.getMatchedFriendStruct(), user.getMatchedFriendStruct())) {
            return false;
        }
        List<String> list = this.LJLJJL;
        java.util.Set set2 = null;
        if (list != null) {
            set = ORZ.LLJJ(list);
        } else {
            set = null;
        }
        List<String> list2 = c181667Ba.LJLJJL;
        if (list2 != null) {
            set2 = ORZ.LLJJ(list2);
        }
        if (!o.LJ(set, set2)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C181667Ba)) {
            return false;
        }
        return o.LJ(this.LJLIL.getUid(), ((C181667Ba) interfaceC57784Mm4).LJLIL.getUid());
    }

    public final boolean equals(Object obj) {
        java.util.Set set;
        if (!(obj instanceof C181667Ba)) {
            return false;
        }
        C181667Ba c181667Ba = (C181667Ba) obj;
        if (!o.LJ(this.LJLIL.getUid(), c181667Ba.LJLIL.getUid()) || !o.LJ(this.LJLJJI, c181667Ba.LJLJJI)) {
            return false;
        }
        List<String> list = this.LJLJJL;
        java.util.Set set2 = null;
        if (list != null) {
            set = ORZ.LLJJ(list);
        } else {
            set = null;
        }
        List<String> list2 = c181667Ba.LJLJJL;
        if (list2 != null) {
            set2 = ORZ.LLJJ(list2);
        }
        if (!o.LJ(set, set2)) {
            return false;
        }
        return true;
    }

    public static C181667Ba LIZ(C181667Ba c181667Ba, ActivityStatus activityStatus, List list, int i) {
        User user;
        boolean z;
        List list2 = list;
        ActivityStatus activityStatus2 = activityStatus;
        AnonymousClass795 params = null;
        if ((i & 1) != 0) {
            user = c181667Ba.LJLIL;
        } else {
            user = null;
        }
        if ((i & 2) != 0) {
            params = c181667Ba.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z = c181667Ba.LJLJI;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            activityStatus2 = c181667Ba.LJLJJI;
        }
        if ((i & 16) != 0) {
            list2 = c181667Ba.LJLJJL;
        }
        c181667Ba.getClass();
        o.LJIIIZ(user, "user");
        o.LJIIIZ(params, "params");
        return new C181667Ba(user, params, z, activityStatus2, (List<String>) list2);
    }

    public C181667Ba(User user, AnonymousClass795 params, boolean z, ActivityStatus activityStatus, List<String> list) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(params, "params");
        this.LJLIL = user;
        this.LJLILLLLZI = params;
        this.LJLJI = z;
        this.LJLJJI = activityStatus;
        this.LJLJJL = list;
    }

    public /* synthetic */ C181667Ba(User user, AnonymousClass795 anonymousClass795, boolean z, List list, int i) {
        this(user, anonymousClass795, z, (ActivityStatus) null, (List<String>) ((i & 16) != 0 ? null : list));
    }
}
