package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.user;

import X.C2068389v;
import X.C234529Ii;
import X.C86V;
import X.C9HI;
import X.EnumC235349Lm;
import android.os.Build;
import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserNavBarBackAssem extends ProfileNavIconActionAssem<EnumC235349Lm> {
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavIconActionAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public final void onCreate() {
        View actionView;
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26 && (actionView = getActionView()) != null) {
            actionView.setDefaultFocusHighlightEnabled(false);
        }
        requestDisplayAction();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final C9HI getActionType() {
        return EnumC235349Lm.Back;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final void initNavAction(C234529Ii c234529Ii) {
        C234529Ii navAction = c234529Ii;
        o.LJIIIZ(navAction, "navAction");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_left_ltr;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        navAction.LIZ(c2068389v);
        navAction.LIZIZ(new AqS154S0100000_4(this, 1072));
        String string = C86V.LJ().getString(R.string.aub);
        o.LJIIIIZZ(string, "getResources().getString…lityLabels_settings_back)");
        navAction.LJII = string;
    }
}
