package X;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* loaded from: classes7.dex */
public final class FXZ extends ETK {
    public PendingIntent getResolution() {
        return getStatus().zze;
    }

    public FXZ(Status status) {
        super(status);
    }

    public void startResolutionForResult(Activity activity, int i) {
        PendingIntent pendingIntent = getStatus().zze;
        if (pendingIntent != null) {
            QH7.LJIIIIZZ(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }
}
