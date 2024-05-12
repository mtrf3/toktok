package X;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: X.06N, reason: invalid class name */
/* loaded from: classes.dex */
public class C06N {
    public static void LIZ(Activity activity) {
        activity.finishAffinity();
    }

    public static void LIZIZ(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void LIZJ(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
