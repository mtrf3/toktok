package X;

import android.content.Intent;
import android.view.View;
import com.apple.android.sdk.authentication.StartAuthenticationActivity;

/* renamed from: X.aUr, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93685aUr implements View.OnClickListener {
    public final /* synthetic */ StartAuthenticationActivity LJLIL;

    public ViewOnClickListenerC93685aUr(StartAuthenticationActivity startAuthenticationActivity) {
        this.LJLIL = startAuthenticationActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        StartAuthenticationActivity startAuthenticationActivity = this.LJLIL;
        startAuthenticationActivity.getClass();
        Intent intent = new Intent();
        intent.putExtra("music_user_token_error", EnumC93680aUm.USER_CANCELLED.getErrorCode());
        startAuthenticationActivity.setResult(0, intent);
        this.LJLIL.finish();
    }
}
