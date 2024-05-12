package X;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;

/* renamed from: X.Pkx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65359Pkx extends AbstractC65259PjL<OAuthResponse> {
    public final /* synthetic */ C65363Pl1 LIZ;

    public C65359Pkx(C65363Pl1 c65363Pl1) {
        this.LIZ = c65363Pl1;
    }

    @Override // X.AbstractC65259PjL
    public final void LIZ(C65053Pg1 c65053Pg1) {
        C65265PjR.LIZIZ().getClass();
        this.LIZ.LIZ(1, new C65288Pjo("Failed to get access token"));
    }

    @Override // X.AbstractC65259PjL
    public final void LIZIZ(H4F h4f) {
        Intent intent = new Intent();
        OAuthResponse oAuthResponse = (OAuthResponse) h4f.LIZ;
        intent.putExtra("screen_name", oAuthResponse.userName);
        intent.putExtra("user_id", oAuthResponse.userId);
        intent.putExtra("tk", oAuthResponse.authToken.token);
        intent.putExtra("ts", oAuthResponse.authToken.secret);
        Activity activity = (Activity) this.LIZ.LIZ;
        activity.setResult(-1, intent);
        activity.finish();
    }
}
