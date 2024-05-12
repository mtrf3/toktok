package X;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes9.dex */
public interface JBS {
    void onActivityResult_Activity(int i, int i2, Intent intent);

    void onBackPressed_Activity();

    void onBeforeActivityCreated(Activity activity);

    void onNewIntent(Intent intent);
}
