package X;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.identity.OAuthActivity;

/* renamed from: X.Pjs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65292Pjs extends AbstractC65291Pjr {
    @Override // X.AbstractC65291Pjr
    public final boolean LIZ(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) OAuthActivity.class);
        intent.putExtra("auth_config", this.LIZIZ);
        C16880lQ.LJFF(activity, this.LIZ, intent);
        return true;
    }

    public C65292Pjs(TwitterAuthConfig twitterAuthConfig, C65261PjN c65261PjN) {
        super(twitterAuthConfig, c65261PjN);
    }
}
