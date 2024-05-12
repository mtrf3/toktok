package com.ss.android.ugc.aweme.share;

import X.ActivityC61947OSx;
import X.C16880lQ;
import X.C45835Hyp;
import X.C58096Mr6;
import X.C79004UzY;
import X.I22;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.zhiliaoapp.musically.openauthorize.AwemeAuthorizedActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OpenPlatformServiceImpl implements IOpenPlatformService {
    public static IOpenPlatformService LJ() {
        Object LIZ = C58096Mr6.LIZ(IOpenPlatformService.class, false);
        if (LIZ != null) {
            return (IOpenPlatformService) LIZ;
        }
        return new OpenPlatformServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final Intent LIZ(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, AwemeAuthorizedActivity.class);
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final boolean LIZIZ(Intent intent) {
        return !TextUtils.isEmpty(C16880lQ.LLJJIJIIJIL(intent, "_aweme_open_sdk_params_client_key"));
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LIZLLL(Intent intent, C45835Hyp c45835Hyp) {
        I22 i22 = new I22(c45835Hyp);
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            ArrayList<String> stringArrayList = LLJJIJI.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
            ArrayList<String> stringArrayList2 = LLJJIJI.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
            if (!C79004UzY.LJJIFFI(stringArrayList)) {
                i22.LIZIZ(stringArrayList);
            } else if (!C79004UzY.LJJIFFI(stringArrayList2)) {
                i22.LIZJ(stringArrayList2);
            } else {
                i22.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService
    public final void LIZJ(ActivityC61947OSx activity, ArrayList arrayList, String str, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        Intent intent = new Intent(activity, (Class<?>) AwemeAuthorizeLoginActivity.class);
        intent.putStringArrayListExtra("authorize_hide_platforms", arrayList);
        intent.putExtra("auth_from_app", str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C16880lQ.LJFF(activity, 2001, intent);
    }
}
