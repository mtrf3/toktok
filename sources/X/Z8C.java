package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* loaded from: classes17.dex */
public interface Z8C {
    void LIZ(Activity activity);

    void LIZIZ(Activity activity);

    void LIZJ(Activity activity);

    void LIZLLL(Activity activity);

    void LJ(Activity activity);

    void LJFF(Activity activity);

    void LJI(Activity activity, int i, String[] strArr, int[] iArr);

    Context attachPreBaseContext(Context context);

    void finish();

    void onActivityPostDestroyed(Activity activity);

    void onActivityPostPaused(Activity activity);

    void onActivityPostResumed(Activity activity);

    void onActivityPostSaveInstanceState(Activity activity, Bundle bundle);

    void onActivityPostStarted(Activity activity);

    void onActivityPostStopped(Activity activity);

    void onActivityPreDestroyed(Activity activity);

    void onActivityPrePaused(Activity activity);

    void onActivityPreResumed(Activity activity);

    void onActivityPreSaveInstanceState(Activity activity, Bundle bundle);

    void onActivityPreStarted(Activity activity);

    void onActivityPreStopped(Activity activity);

    void onActivityResult(int i, int i2, Intent intent);

    void onConfigurationChanged(Activity activity, Configuration configuration);

    void onRestoreInstanceState(Bundle bundle);
}
