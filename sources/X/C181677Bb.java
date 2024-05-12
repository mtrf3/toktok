package X;

import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.7Bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C181677Bb implements InterfaceC57784Mm4 {
    public final User LJLIL;
    public final C1806377b LJLILLLLZI;
    public final ActivityStatus LJLJI;
    public final List<String> LJLJJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return Objects.hash(this.LJLIL.getUid(), this.LJLJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoViewerItem(user=");
        LIZ.append(this.LJLIL);
        LIZ.append(", params=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", activityStatus=");
        LIZ.append(this.LJLJI);
        LIZ.append(", unwatchedList=");
        return C1NE.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        java.util.Set set;
        if (!areItemTheSame(interfaceC57784Mm4)) {
            return false;
        }
        C181677Bb c181677Bb = (C181677Bb) interfaceC57784Mm4;
        User user = c181677Bb.LJLIL;
        if (!o.LJ(this.LJLIL.getUid(), user.getUid()) || this.LJLIL.getFollowStatus() != user.getFollowStatus() || this.LJLIL.getFollowerStatus() != user.getFollowerStatus() || !Objects.equals(this.LJLIL.getMatchedFriendStruct(), user.getMatchedFriendStruct())) {
            return false;
        }
        List<String> list = this.LJLJJI;
        java.util.Set set2 = null;
        if (list != null) {
            set = ORZ.LLJJ(list);
        } else {
            set = null;
        }
        List<String> list2 = c181677Bb.LJLJJI;
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
        if (!(interfaceC57784Mm4 instanceof C181677Bb)) {
            return false;
        }
        return o.LJ(this.LJLIL.getUid(), ((C181677Bb) interfaceC57784Mm4).LJLIL.getUid());
    }

    public final boolean equals(Object obj) {
        java.util.Set set;
        if (!(obj instanceof C181677Bb)) {
            return false;
        }
        C181677Bb c181677Bb = (C181677Bb) obj;
        if (!o.LJ(this.LJLIL.getUid(), c181677Bb.LJLIL.getUid()) || !o.LJ(this.LJLJI, c181677Bb.LJLJI)) {
            return false;
        }
        List<String> list = this.LJLJJI;
        java.util.Set set2 = null;
        if (list != null) {
            set = ORZ.LLJJ(list);
        } else {
            set = null;
        }
        List<String> list2 = c181677Bb.LJLJJI;
        if (list2 != null) {
            set2 = ORZ.LLJJ(list2);
        }
        if (!o.LJ(set, set2)) {
            return false;
        }
        return true;
    }

    public C181677Bb(User user, C1806377b c1806377b, ActivityStatus activityStatus, List<String> list) {
        o.LJIIIZ(user, "user");
        this.LJLIL = user;
        this.LJLILLLLZI = c1806377b;
        this.LJLJI = activityStatus;
        this.LJLJJI = list;
    }

    public static C181677Bb LIZ(C181677Bb c181677Bb, ActivityStatus activityStatus, List list, int i) {
        User user;
        C1806377b params = null;
        if ((i & 1) != 0) {
            user = c181677Bb.LJLIL;
        } else {
            user = null;
        }
        if ((i & 2) != 0) {
            params = c181677Bb.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            activityStatus = c181677Bb.LJLJI;
        }
        if ((i & 8) != 0) {
            list = c181677Bb.LJLJJI;
        }
        c181677Bb.getClass();
        o.LJIIIZ(user, "user");
        o.LJIIIZ(params, "params");
        return new C181677Bb(user, params, activityStatus, (List<String>) list);
    }

    public /* synthetic */ C181677Bb(User user, C1806377b c1806377b, List list, int i) {
        this(user, c1806377b, (ActivityStatus) null, (List<String>) ((i & 8) != 0 ? null : list));
    }
}
