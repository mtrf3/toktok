package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.Xr6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86124Xr6 {
    void attachBaseContext(Context context, Activity activity);

    Context attachPreBaseContext(Context context);

    void finish();

    void onActivityCreated(ActivityC86117Xqz activityC86117Xqz, Bundle bundle);

    void onActivityDestroyed(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPaused(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPostCreated(ActivityC86117Xqz activityC86117Xqz, Bundle bundle);

    void onActivityPostDestroyed(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPostPaused(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPostResumed(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPostSaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle);

    void onActivityPostStarted(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPostStopped(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPreCreated(ActivityC86117Xqz activityC86117Xqz, Bundle bundle);

    void onActivityPreDestroyed(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPrePaused(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPreResumed(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPreSaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle);

    void onActivityPreStarted(ActivityC86117Xqz activityC86117Xqz);

    void onActivityPreStopped(ActivityC86117Xqz activityC86117Xqz);

    void onActivityReenter(int i, Intent intent);

    void onActivityResult(int i, int i2, Intent intent);

    void onActivityResumed(ActivityC86117Xqz activityC86117Xqz);

    void onActivitySaveInstanceState(ActivityC86117Xqz activityC86117Xqz, Bundle bundle);

    void onActivityStarted(ActivityC86117Xqz activityC86117Xqz);

    void onActivityStopped(ActivityC86117Xqz activityC86117Xqz);

    void onConfigurationChanged(ActivityC86117Xqz activityC86117Xqz, Configuration configuration);

    boolean onKeyDown(int i, KeyEvent keyEvent);

    void onPreRestoreInstanceState(Bundle bundle);

    void onRestoreInstanceState(Bundle bundle);

    void onSupportContentChanged(ActivityC86117Xqz activityC86117Xqz);

    void onWindowFocusChanged(ActivityC86117Xqz activityC86117Xqz, boolean z);

    void setContentView(Activity activity, int i);

    void setContentView(Activity activity, View view);
}
