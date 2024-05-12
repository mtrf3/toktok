package X;

import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.profile.viewer.api.ProfileViewerInfo;
import defpackage.s0;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.7Zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187917Zb implements InterfaceC57784Mm4 {
    public final ProfileViewerInfo LJLIL;
    public final List<String> LJLILLLLZI;
    public final Boolean LJLJI;
    public final ActivityStatus LJLJJI;
    public final Integer LJLJJL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return Objects.hash(this.LJLIL.user.getUid(), this.LJLJI, this.LJLJJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileViewerItem(viewer=");
        LIZ.append(this.LJLIL);
        LIZ.append(", unwatchedList=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isOnline=");
        LIZ.append(this.LJLJI);
        LIZ.append(", activityStatus=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", followStatus=");
        return s0.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        java.util.Set set;
        if (!(interfaceC57784Mm4 instanceof C187917Zb)) {
            return false;
        }
        C187917Zb c187917Zb = (C187917Zb) interfaceC57784Mm4;
        if (!o.LJ(this.LJLIL.user.getUid(), c187917Zb.LJLIL.user.getUid()) || !o.LJ(this.LJLJJL, c187917Zb.LJLJJL)) {
            return false;
        }
        List<String> list = this.LJLILLLLZI;
        java.util.Set set2 = null;
        if (list != null) {
            set = ORZ.LLJJ(list);
        } else {
            set = null;
        }
        List<String> list2 = c187917Zb.LJLILLLLZI;
        if (list2 != null) {
            set2 = ORZ.LLJJ(list2);
        }
        if (!o.LJ(set, set2) || !o.LJ(this.LJLJI, c187917Zb.LJLJI) || !o.LJ(this.LJLJJI, c187917Zb.LJLJJI)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C187917Zb)) {
            return false;
        }
        return o.LJ(this.LJLIL.user.getUid(), ((C187917Zb) interfaceC57784Mm4).LJLIL.user.getUid());
    }

    public final boolean equals(Object obj) {
        java.util.Set set;
        if (!(obj instanceof C187917Zb)) {
            return false;
        }
        C187917Zb c187917Zb = (C187917Zb) obj;
        if (!o.LJ(this.LJLIL.user.getUid(), c187917Zb.LJLIL.user.getUid()) || !o.LJ(this.LJLJJL, c187917Zb.LJLJJL)) {
            return false;
        }
        List<String> list = this.LJLILLLLZI;
        java.util.Set set2 = null;
        if (list != null) {
            set = ORZ.LLJJ(list);
        } else {
            set = null;
        }
        List<String> list2 = c187917Zb.LJLILLLLZI;
        if (list2 != null) {
            set2 = ORZ.LLJJ(list2);
        }
        if (!o.LJ(set, set2) || !o.LJ(this.LJLJI, c187917Zb.LJLJI) || !o.LJ(this.LJLJJI, c187917Zb.LJLJJI)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C187917Zb(ProfileViewerInfo profileViewerInfo, List list, Integer num, int i) {
        this(profileViewerInfo, (i & 2) != 0 ? null : list, null, null, (i & 16) != 0 ? null : num);
    }

    public C187917Zb(ProfileViewerInfo profileViewerInfo, List<String> list, Boolean bool, ActivityStatus activityStatus, Integer num) {
        this.LJLIL = profileViewerInfo;
        this.LJLILLLLZI = list;
        this.LJLJI = bool;
        this.LJLJJI = activityStatus;
        this.LJLJJL = num;
    }

    public static C187917Zb LIZ(C187917Zb c187917Zb, List list, Boolean bool, ActivityStatus activityStatus, Integer num, int i) {
        ProfileViewerInfo viewer;
        Integer num2 = num;
        ActivityStatus activityStatus2 = activityStatus;
        List list2 = list;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            viewer = c187917Zb.LJLIL;
        } else {
            viewer = null;
        }
        if ((i & 2) != 0) {
            list2 = c187917Zb.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            bool2 = c187917Zb.LJLJI;
        }
        if ((i & 8) != 0) {
            activityStatus2 = c187917Zb.LJLJJI;
        }
        if ((i & 16) != 0) {
            num2 = c187917Zb.LJLJJL;
        }
        c187917Zb.getClass();
        o.LJIIIZ(viewer, "viewer");
        return new C187917Zb(viewer, list2, bool2, activityStatus2, num2);
    }
}
