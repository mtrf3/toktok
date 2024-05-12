package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService;

/* loaded from: classes5.dex */
public final class APH {
    public static /* synthetic */ void LIZ(IProfileAIGCService iProfileAIGCService, Context context, APM apm, APN apn, APK apk, ST9 st9, int i) {
        APK apk2 = apk;
        ST9 st92 = st9;
        if ((i & 8) != 0) {
            apk2 = null;
        }
        if ((i & 16) != 0) {
            st92 = null;
        }
        iProfileAIGCService.LIZJ(context, apm, apn, apk2, st92, null);
    }
}
