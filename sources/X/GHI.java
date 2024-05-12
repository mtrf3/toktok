package X;

import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.TimeUnlockFragment;

/* loaded from: classes8.dex */
public abstract class GHI extends ActivityC86117Xqz {
    public TimeUnlockFragment LJLIL;

    public abstract int LLFII();

    public abstract void init();

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentFocus() != null) {
            ((InputMethodManager) C16880lQ.LLILIL(this, "input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        try {
            getSupportFragmentManager().LJJLIIIJJI();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LLFII());
        init();
    }
}
