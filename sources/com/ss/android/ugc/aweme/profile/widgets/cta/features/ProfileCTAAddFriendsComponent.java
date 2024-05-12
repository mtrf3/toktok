package com.ss.android.ugc.aweme.profile.widgets.cta.features;

import X.C1799074g;
import X.C17J;
import X.C184077Kh;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234999Kd;
import X.C235379Lp;
import X.C235399Lr;
import X.C235409Ls;
import X.C235429Lu;
import X.C235469Ly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76732zl;
import X.C76800UCe;
import X.C77266UUc;
import X.C78926UyI;
import X.C8VC;
import X.C8W0;
import X.C9HL;
import X.C9IF;
import X.C9IL;
import X.C9KV;
import X.EnumC234329Ho;
import X.InterfaceC1798974f;
import X.InterfaceC235069Kk;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.TBT;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.ProfileMafRedPointsVM;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileCTAAddFriendsComponent extends ProfileCTASingleComponent {
    public final C214378bB LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ProfileCTAAddFriendsComponent() {
        InterfaceC65784Pro LJIILJJIL;
        C235409Ls c235409Ls = C235409Ls.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileMafRedPointsVM.class);
        C235379Lp c235379Lp = C235379Lp.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 728);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJI = new C214378bB(LIZ, c235409Ls, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c235379Lp, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final void componentClick() {
        User user;
        int i;
        String str;
        String str2;
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
        } else {
            user = null;
        }
        if (((ProfileMafRedPointsVM) this.LJLJJI.getValue()).LJLILLLLZI && user != null) {
            i = C235469Ly.LIZIZ(user.mafRedCount);
        } else {
            i = 0;
        }
        FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, "personal_homepage", null, null, i, !C77266UUc.LIZIZ.LJJIZ(), 27, null);
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//friends/ffp");
        buildRoute.withNavArg(findFriendsPageArg);
        buildRoute.open();
        C235399Lr c235399Lr = new C235399Lr("click_add_friends");
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        c235399Lr.LJ("enter_from", "personal_homepage", c1799074g);
        c235399Lr.LJ("event_type", "normal_way", c1799074g);
        if (A3() == C9HL.ICON) {
            str = "icon";
        } else {
            str = "add_friends";
        }
        c235399Lr.LJIILL("button_type", str);
        if (((ProfileMafRedPointsVM) this.LJLJJI.getValue()).LJLILLLLZI) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c235399Lr.LJIILL("has_notice", str2);
        if (((ProfileMafRedPointsVM) this.LJLJJI.getValue()).LJLILLLLZI) {
            c235399Lr.LJIILL("notice_cnt", String.valueOf(i));
        }
        c235399Lr.LJIILIIL();
        C17J.LJJJ(this, true, "find_friends");
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final Integer componentIcon() {
        return Integer.valueOf(R.raw.icon_person_plus);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final String componentText() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            return LIZLLL.getString(R.string.pet);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (C77266UUc.LIZIZ.LJJIZ()) {
            return;
        }
        ProfileCTASingleComponent.H3(this, null, 1, null);
        C76732zl c76732zl = new C76732zl();
        AssemViewModel.selectSubscribe$default((AssemViewModel) this.LJLJJI.getValue(), C235429Lu.LJLIL, null, null, null, new AqS167S0100000_1(new AqS135S0200000_4(this, c76732zl, 90), (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) LiveCoverMinSizeSetting.DEFAULT), 14, null);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9JX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(c76732zl, 681));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9JW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PL) obj).LIZJ;
            }
        }, new AqS170S0100000_4(this, 682));
        C9IL c9il = C9IL.CTA;
        String lowerCase = "HAS_ADD_FRIENDS".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, true);
        updateAccessibilityClassName(Button.class.getName());
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final EnumC234329Ho v3() {
        return EnumC234329Ho.ICON;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final C9IF x3() {
        return C9IF.ADD_FRIENDS;
    }
}
