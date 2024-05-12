package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.9L8, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9L8 {
    public static /* synthetic */ boolean LIZ(IBAProfilePageService iBAProfilePageService, Context context, int i, String str, Aweme aweme, String str2, int i2) {
        Aweme aweme2 = aweme;
        String str3 = str2;
        if ((i2 & 8) != 0) {
            aweme2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        return iBAProfilePageService.LJI(i, context, aweme2, str, str3, null);
    }
}
