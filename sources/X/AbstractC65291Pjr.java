package X;

import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterSession;

/* renamed from: X.Pjr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65291Pjr {
    public final int LIZ = UserLevelGeckoUpdateSetting.DEFAULT;
    public final TwitterAuthConfig LIZIZ;
    public final AbstractC65259PjL<TwitterSession> LIZJ;

    public abstract boolean LIZ(Activity activity);

    public AbstractC65291Pjr(TwitterAuthConfig twitterAuthConfig, C65261PjN c65261PjN) {
        this.LIZIZ = twitterAuthConfig;
        this.LIZJ = c65261PjN;
    }
}
