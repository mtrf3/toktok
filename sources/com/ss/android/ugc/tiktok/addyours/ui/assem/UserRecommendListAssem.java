package com.ss.android.ugc.tiktok.addyours.ui.assem;

import X.C208708Ha;
import X.C214298b3;
import X.C218888iS;
import X.C219058ij;
import X.C219068ik;
import X.C219078il;
import X.C221108m2;
import X.C221118m3;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72912tb;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UserRecommendListAssem extends InvitableListAssem<UserRecommendListViewModel> {
    public final C214298b3 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C214298b3 LJLJJL;
    public final String LJLJJLL;
    public final C5H3 LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean H3() {
        return false;
    }

    public UserRecommendListAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursInviteFriendsViewModel.class);
        C9BE c9be = C9BE.LIZ;
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1444), C219068ik.INSTANCE, null);
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C218888iS.class, "InviteHierarchyData"), checkSupervisorPrepared());
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1442));
        C65776Prg LIZ2 = C65352Pkq.LIZ(UserRecommendListViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ2, c9be, new AqS153S0100000_3(LIZ2, 1445), C219078il.INSTANCE, null);
        this.LJLJJLL = "addyours_invite_rcmd";
        this.LJLJL = C221118m3.LIZ(new AqS153S0100000_3(this, 1441));
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final C73306Spq E3() {
        return (C73306Spq) this.LJLJL.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final C73305Spp I3() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(R.id.ion));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView != null && (view = containerView.findViewById(R.id.ion)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.ion), view);
            } else {
                view = null;
            }
        }
        return (C73305Spp) view;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: N3, reason: merged with bridge method [inline-methods] */
    public final UserRecommendListViewModel A3() {
        return (UserRecommendListViewModel) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean K3() {
        C219058ij c219058ij = (C219058ij) A3().getState();
        c219058ij.getClass();
        List LIZ = C208708Ha.LIZ(c219058ij);
        if (LIZ == null || LIZ.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final boolean L3() {
        C219058ij c219058ij = (C219058ij) A3().getState();
        c219058ij.getClass();
        return C208708Ha.LIZLLL(c219058ij) instanceof C72912tb;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem
    public final String F3() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.tiktok.addyours.ui.assem.InvitableListAssem, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object obj;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.8iX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((C218868iQ) obj2).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 137), 6);
        List<UserInvitee> list = ((C218888iS) this.LJLJI.getValue()).LJLIL;
        if (list != null) {
            UserRecommendListViewModel A3 = A3();
            A3.getClass();
            A3.withState(new AqS134S0200000_3(A3, list, 14));
            AddYoursInviteFriendsViewModel addYoursInviteFriendsViewModel = (AddYoursInviteFriendsViewModel) this.LJLILLLLZI.getValue();
            addYoursInviteFriendsViewModel.withState(new AqS134S0200000_3(addYoursInviteFriendsViewModel, (AddYoursInviteFriendsViewModel) list, (List<UserInvitee>) 12));
        }
        UserRecommendListViewModel A32 = A3();
        Map<String, Object> map = ((C218888iS) this.LJLJI.getValue()).LJLJI;
        Long l = null;
        if (map != null) {
            obj = map.get("topic_id");
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            l = (Long) obj;
        }
        A32.LJLIL = l;
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.8ih
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                C219058ij c219058ij = (C219058ij) obj2;
                c219058ij.getClass();
                return C208708Ha.LIZLLL(c219058ij);
            }
        }, null, new AqS169S0100000_3(this, 609), new AqS153S0100000_3(this, 1443), new AqS169S0100000_3(this, 610), 2, null);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.8ii
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                C219058ij c219058ij = (C219058ij) obj2;
                c219058ij.getClass();
                return C208708Ha.LIZ(c219058ij);
            }
        }, null, new AqS185S0100000_3(this, 138), 6);
    }
}
