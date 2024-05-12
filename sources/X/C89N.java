package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.89N, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89N {
    public static boolean LIZ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (!C78996UzQ.LJJIIZI(aweme) || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || commerceVideoAuthInfo.getDarkPostStatus() != 1) {
            return false;
        }
        return true;
    }
}
