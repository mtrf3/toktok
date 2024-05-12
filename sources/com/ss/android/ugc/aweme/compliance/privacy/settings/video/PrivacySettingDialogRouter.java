package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C2IP;
import X.C2U8;
import X.C45804HyK;
import X.C54838Lfe;
import X.C65300Pk0;
import X.C73969T1h;
import X.C77119UOl;
import X.C78966Uyw;
import X.DialogC25756A8y;
import X.T16;
import Y.AfS51S0300000_12;
import Y.AfS64S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.privacy.data.PrivacyVideoRestrictionApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS4S0600000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PrivacySettingDialogRouter implements IRouteAction {
    public static void com_ss_android_ugc_aweme_compliance_privacy_settings_video_PrivacySettingDialogRouter_com_bytedance_tux_status_loading_TuxLoadingDialogHUD_show(DialogC25756A8y dialogC25756A8y) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "3694796874963958149")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    public final void sendLoopCurrentStoryEvent(Aweme aweme, boolean z) {
        if (C54838Lfe.LJJI(aweme)) {
            C2U8.LIZ(new C2IP(z, true));
        }
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        Activity activity;
        ActivityC45651qj activityC45651qj;
        Aweme aweme = C78966Uyw.LJLJJI;
        if (aweme == null) {
            return null;
        }
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null) {
            sendLoopCurrentStoryEvent(aweme, true);
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(activityC45651qj);
            dialogC25756A8y.LIZIZ(R.string.h30);
            com_ss_android_ugc_aweme_compliance_privacy_settings_video_PrivacySettingDialogRouter_com_bytedance_tux_status_loading_TuxLoadingDialogHUD_show(dialogC25756A8y);
            AqS4S0600000_12 aqS4S0600000_12 = new AqS4S0600000_12(dialogC25756A8y, bundle, context, activityC45651qj, this, aweme, 1);
            AqS72S0400000_12 aqS72S0400000_12 = new AqS72S0400000_12(dialogC25756A8y, activityC45651qj, this, aweme, 3);
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            C77119UOl.LJIJ(((PrivacyVideoRestrictionApi.API) PrivacyVideoRestrictionApi.LIZ.getValue()).fetchVideoRestriction(aid), "/tiktok/privacy/item/restriction/v1").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS51S0300000_12(aweme, aqS4S0600000_12, aqS72S0400000_12, 6), new AfS64S0100000_12(aqS72S0400000_12, 159));
        }
        return null;
    }
}
