package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine;

import X.C17J;
import X.C2068389v;
import X.C234529Ii;
import X.C9H4;
import X.C9H6;
import X.C9HI;
import X.C9IL;
import X.EnumC235349Lm;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MineNavBarQrCodeAssem extends ProfileNavIconActionAssem<EnumC235349Lm> {
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (C9H6.LIZIZ()) {
            requestDisplayAction();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final C9HI getActionType() {
        return EnumC235349Lm.QRCODE;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final void initNavAction(C234529Ii c234529Ii) {
        int i;
        C234529Ii navAction = c234529Ii;
        o.LJIIIZ(navAction, "navAction");
        if (!C9H6.LIZIZ()) {
            return;
        }
        C9IL c9il = C9IL.NAV;
        String lowerCase = "HAS_QR_CODE_ENTRANCE".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, true);
        C2068389v c2068389v = new C2068389v();
        if (C9H6.LIZ() == 1) {
            i = R.raw.icon_n_sharelink;
        } else {
            i = R.raw.icon_now_qr;
        }
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        navAction.LIZ(c2068389v);
        navAction.LIZIZ(new AqS154S0100000_4(this, 1061));
        C9H4.LIZIZ("show", null);
    }
}
