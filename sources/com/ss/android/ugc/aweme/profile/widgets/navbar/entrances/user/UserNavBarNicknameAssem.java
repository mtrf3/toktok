package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.user;

import X.C65352Pkq;
import X.C8VC;
import X.C9KF;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.TBT;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavTitleAssem;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserNavBarNicknameAssem extends ProfileNavTitleAssem {
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavTitleAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9LE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 733));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9LD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 734));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final void initNavAction(C9KF c9kf) {
        C9KF navAction = c9kf;
        o.LJIIIZ(navAction, "navAction");
        navAction.LIZJ = "";
    }
}
