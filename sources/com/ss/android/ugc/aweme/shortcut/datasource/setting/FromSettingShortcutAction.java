package com.ss.android.ugc.aweme.shortcut.datasource.setting;

import X.C188727au;
import X.FMX;
import X.InterfaceC40521FvJ;
import X.N2B;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FromSettingShortcutAction implements InterfaceC40521FvJ {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        if (context != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            String string = bundle.getString("SHORTCUT_ID");
            if (string == null) {
                string = "";
            }
            onShortcutAction(context, string, str, bundle);
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC40521FvJ
    public final Object onShortcutAction(Context context, String str, String str2, Bundle bundle) {
        o.LJIIIZ(context, "context");
        if (o.LJ(str, N2B.WITHDRAWAL.getShortcutId()) || o.LJ(str, N2B.WILL_GET_MOST.getShortcutId())) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "feed_popup");
            FMX.LJIIL("enter_activity_page", c188727au.LIZ);
            return null;
        }
        return null;
    }
}
