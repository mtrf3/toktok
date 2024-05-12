package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine;

import X.AV1;
import X.C17J;
import X.C184077Kh;
import X.C2068389v;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234529Ii;
import X.C234999Kd;
import X.C235329Lk;
import X.C235339Ll;
import X.C235439Lv;
import X.C47261Igj;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76732zl;
import X.C77266UUc;
import X.C78926UyI;
import X.C8VC;
import X.C8W0;
import X.C9HI;
import X.C9IL;
import X.EnumC235349Lm;
import X.InterfaceC235069Kk;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.ProfileMafRedPointsVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MineNavBarFindFriendsAssem extends ProfileNavIconActionAssem<EnumC235349Lm> {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem
    public final List<EnumC235349Lm> configHiddenByOthersActionList() {
        return C47261Igj.LJJIJ(EnumC235349Lm.SuggestBA);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (isFromMain() && !AV1.LJIIJJI() && C77266UUc.LIZIZ.LJJIZ()) {
            requestDisplayAction();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem
    public final List<EnumC235349Lm> configHideActionList() {
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final C9HI getActionType() {
        return EnumC235349Lm.FindFriends;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final void initNavAction(C234529Ii c234529Ii) {
        InterfaceC65784Pro LJIILJJIL;
        C234529Ii navAction = c234529Ii;
        o.LJIIIZ(navAction, "navAction");
        if (!C77266UUc.LIZIZ.LJJIZ()) {
            return;
        }
        C235339Ll c235339Ll = C235339Ll.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileMafRedPointsVM.class);
        C235329Lk c235329Lk = C235329Lk.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 1059);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        C214378bB c214378bB = new C214378bB(LIZ, c235339Ll, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c235329Lk, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd == null || c234999Kd.LIZ == null) {
            return;
        }
        C76732zl c76732zl = new C76732zl();
        C9IL c9il = C9IL.NAV;
        String lowerCase = "HAS_FIND_FRIENDS".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, isVisible());
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_person_plus;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        navAction.LIZ(c2068389v);
        navAction.LIZIZ(new AqS93S0300000_4(c76732zl, (C76732zl) this, (MineNavBarFindFriendsAssem) c214378bB, (C214378bB<C235439Lv, ProfileMafRedPointsVM>) 164));
    }
}
