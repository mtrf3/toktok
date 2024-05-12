package com.ss.android.ugc.aweme.setting.page.security;

import X.C188727au;
import X.C221108m2;
import X.C253609xM;
import X.C62822Ol8;
import X.FMX;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecurityPermissionsCell extends RightTextCell<C253609xM> {
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 808));

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell, android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        this.LJLJJI.getValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("previous_page", "security and login");
        c188727au.LJIIIZ("settings_security", "settings_security");
        FMX.LJIIL("enter_manage_apps_permissions", c188727au.LIZ);
        SmartRouter.buildRoute(this.LJLIL, "//authmanagement").open();
    }
}
