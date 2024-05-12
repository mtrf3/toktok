package com.ss.android.ugc.aweme.setting;

import X.C03880Dg;
import X.C25575A1z;
import X.C65300Pk0;
import X.C73969T1h;
import X.C78685UuP;
import X.DialogC254019y1;
import X.QZZ;
import X.T16;
import X.X1D;
import Y.AfS0S0000100_4;
import Y.AfS53S0200000_4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.setting.services.DoBStatusApi;
import java.net.URI;

/* loaded from: classes5.dex */
public final class SettingManageMyAccountRouter implements IRouteAction {
    public static final int $stable = 0;

    public static void com_ss_android_ugc_aweme_setting_SettingManageMyAccountRouter_com_bytedance_ies_dmt_ui_dialog_DmtStatusViewDialog_show(DialogC254019y1 dialogC254019y1) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/ies/dmt/ui/dialog/DmtStatusViewDialog", "show", dialogC254019y1, new Object[0], "void", new C65300Pk0(false, "()V", "-8024728306623227237")).LIZ) {
            return;
        }
        dialogC254019y1.show();
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String str2;
        DialogC254019y1 dialogC254019y1;
        if (context == null) {
            return Boolean.TRUE;
        }
        String query = new URI(str).getQuery();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("//account/setting/self");
        if (C78685UuP.LJJJZ(query)) {
            str2 = QZZ.LIZIZ('?', query);
        } else {
            str2 = "";
        }
        LIZ.append(str2);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ));
        if (context instanceof Activity) {
            dialogC254019y1 = new DialogC254019y1((Activity) context);
            com_ss_android_ugc_aweme_setting_SettingManageMyAccountRouter_com_bytedance_ies_dmt_ui_dialog_DmtStatusViewDialog_show(dialogC254019y1);
        } else {
            dialogC254019y1 = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        DoBStatusApi.LIZ.getClass();
        C25575A1z.LIZIZ.getDoBStatus().LJJL(T16.LIZ()).LJIJJLI(new AfS0S0000100_4(currentTimeMillis, 0)).LJIJJ(new AfS0S0000100_4(currentTimeMillis, 1)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0200000_4(buildRoute, dialogC254019y1, 12), new AfS53S0200000_4(buildRoute, dialogC254019y1, 13));
        return Boolean.TRUE;
    }
}
