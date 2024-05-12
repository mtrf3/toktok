package X;

import android.content.Intent;
import android.view.View;
import com.apple.android.sdk.authentication.SDKUriHandlerActivity;
import com.apple.android.sdk.authentication.StartAuthenticationActivity;
import java.util.HashMap;

/* renamed from: X.aUq, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93684aUq implements View.OnClickListener {
    public final /* synthetic */ StartAuthenticationActivity LJLIL;

    public ViewOnClickListenerC93684aUq(StartAuthenticationActivity startAuthenticationActivity) {
        this.LJLIL = startAuthenticationActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        StartAuthenticationActivity startAuthenticationActivity = this.LJLIL;
        String str = startAuthenticationActivity.LJLIL;
        String str2 = startAuthenticationActivity.LJLILLLLZI;
        HashMap hashMap = startAuthenticationActivity.LJLJI;
        Intent intent = new Intent(startAuthenticationActivity, (Class<?>) SDKUriHandlerActivity.class);
        intent.putExtra("developer_token", str);
        intent.putExtra("contextual_upsell_id", str2);
        intent.putExtra("custom_params", hashMap);
        C16880lQ.LJFF(startAuthenticationActivity, 2021, intent);
    }
}
