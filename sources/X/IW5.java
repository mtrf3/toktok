package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadResultListener;

/* loaded from: classes9.dex */
public class IW5 implements ISmartFeedPreloadResultListener {
    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadResultListener
    public final void onSmartFeedPreloadResult(String str, String str2, float f) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || f < 0.0f) {
            return;
        }
        C47242IgQ.LIZ().smartPreloadBusinessEvent(str2);
        if (IW6.LIZIZ == null) {
            return;
        }
        C47242IgQ.LIZ().smartPreloadPlayTaskBusinessEvent(str2);
    }
}
