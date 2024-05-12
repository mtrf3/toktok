package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;

/* loaded from: classes5.dex */
public final class AGX implements CompoundButton.OnCheckedChangeListener {
    public static final AGX LJLIL = new AGX();

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        int i;
        Aweme aweme = AdSettingsActivity.LJLL;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null) {
            return;
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        commerceVideoAuthInfo.setDarkPostStatus(i);
    }
}
