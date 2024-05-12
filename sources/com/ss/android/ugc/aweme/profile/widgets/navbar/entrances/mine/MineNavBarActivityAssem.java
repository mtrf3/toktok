package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine;

import X.AV1;
import X.C234529Ii;
import X.C236079Oh;
import X.C84763XOl;
import X.C9HI;
import X.EnumC235349Lm;
import X.InterfaceC236109Ok;
import android.app.Activity;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarActivityAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MineNavBarActivityAssem extends ProfileNavIconActionAssem<EnumC235349Lm> {
    public C234529Ii LJLIL = new C234529Ii();
    public C236079Oh LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public final void onCreate() {
        Activity LJIIIIZZ;
        C234529Ii c234529Ii;
        C236079Oh c236079Oh;
        super.onCreate();
        this.LJLILLLLZI = new C236079Oh();
        if (!isFromMain() || AV1.LJIIJJI() || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null || (c234529Ii = this.LJLIL) == null || (c236079Oh = this.LJLILLLLZI) == null) {
            return;
        }
        c236079Oh.LJJI(LJIIIIZZ, c234529Ii, new InterfaceC236109Ok() { // from class: X.9Hi
            @Override // X.InterfaceC236109Ok
            public final void LJ() {
            }

            @Override // X.InterfaceC236109Ok
            public final boolean LIZ() {
                return FMX.LIZJ("profile_activity_reward_button_show");
            }

            @Override // X.InterfaceC236109Ok
            public final void LIZIZ() {
                C17J.LJJJ(MineNavBarActivityAssem.this, true, "farm");
            }

            @Override // X.InterfaceC236109Ok
            public final void LIZJ() {
                MineNavBarActivityAssem.this.requestDisplayAction();
            }

            @Override // X.InterfaceC236109Ok
            public final void LIZLLL() {
                MineNavBarActivityAssem mineNavBarActivityAssem = MineNavBarActivityAssem.this;
                C9IL c9il = C9IL.NAV;
                String lowerCase = "HAS_FARM".toLowerCase();
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                C17J.LJIILLIIL(mineNavBarActivityAssem, true, c9il, lowerCase, MineNavBarActivityAssem.this.isVisible());
            }

            @Override // X.InterfaceC236109Ok
            public final void LJFF() {
                MineNavBarActivityAssem.this.hideAction();
            }
        });
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C236079Oh c236079Oh = this.LJLILLLLZI;
        if (c236079Oh != null) {
            c236079Oh.LJLJJL = null;
            c236079Oh.LJLJJLL = null;
            c236079Oh.LJLJL = null;
        }
        this.LJLILLLLZI = null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final C9HI getActionType() {
        return EnumC235349Lm.Activity;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final void initNavAction(C234529Ii c234529Ii) {
        C234529Ii navAction = c234529Ii;
        o.LJIIIZ(navAction, "navAction");
        this.LJLIL = navAction;
    }
}
