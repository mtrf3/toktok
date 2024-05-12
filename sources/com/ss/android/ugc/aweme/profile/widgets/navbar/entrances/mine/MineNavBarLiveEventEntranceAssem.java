package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine;

import X.AV1;
import X.C17J;
import X.C2068389v;
import X.C221108m2;
import X.C234529Ii;
import X.C235789Ne;
import X.C26335AVf;
import X.C26354AVy;
import X.C47261Igj;
import X.C62822Ol8;
import X.C9HI;
import X.C9IL;
import X.EnumC235829Ni;
import X.HG3;
import X.RBX;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MineNavBarLiveEventEntranceAssem extends ProfileNavIconActionAssem<EnumC235829Ni> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C235789Ne.LJLIL);

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem
    public final List<EnumC235829Ni> configHiddenByOthersActionList() {
        return C47261Igj.LJJIJ(EnumC235829Ni.ProfileViewer);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem
    public final List<EnumC235829Ni> configHideActionList() {
        return C47261Igj.LJJIJ(EnumC235829Ni.ProfileViewer);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (!AV1.LJIIJJI() && ((RBX) HG3.LJIILL()).isLogin() && isFromMain()) {
            C26354AVy.LIZ.getClass();
            if (!C26354AVy.LIZ()) {
                requestDisplayAction();
                C26335AVf.LJFF("show");
                C9IL c9il = C9IL.NAV;
                String lowerCase = "HAS_NAV_LIVE".toLowerCase();
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                C17J.LJIILLIIL(this, true, c9il, lowerCase, isVisible());
            }
        }
        hideAction();
        C9IL c9il2 = C9IL.NAV;
        String lowerCase2 = "HAS_NAV_LIVE".toLowerCase();
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il2, lowerCase2, isVisible());
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final C9HI getActionType() {
        return EnumC235829Ni.LiveEvent;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final void initNavAction(C234529Ii c234529Ii) {
        C234529Ii navAction = c234529Ii;
        o.LJIIIZ(navAction, "navAction");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_calendar_star;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        navAction.LIZ(c2068389v);
        navAction.LIZIZ(new AqS154S0100000_4(this, 1060));
    }
}
