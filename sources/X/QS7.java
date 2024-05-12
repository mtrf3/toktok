package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;

/* loaded from: classes12.dex */
public final class QS7 implements Runnable {
    public final /* synthetic */ QS6 LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    public final void LIZ() {
        QS6 qs6 = this.LJLIL;
        String string = this.LJLILLLLZI.getString(R.string.pl9);
        if (qs6 == null) {
            qs6 = new QS6(string);
        } else if (TextUtils.isEmpty(qs6.LIZIZ) || TextUtils.isEmpty(qs6.LIZ)) {
            if (TextUtils.isEmpty(qs6.LIZIZ)) {
                qs6.LIZIZ = "push";
            }
            if (TextUtils.isEmpty(qs6.LIZ)) {
                qs6.LIZ = string;
            }
        }
        String str = qs6.LIZIZ;
        String str2 = qs6.LIZ;
        NotificationManager notificationManager = (NotificationManager) C16880lQ.LLILL(this.LJLILLLLZI, "notification");
        if (notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
            notificationChannel.setShowBadge(true);
            notificationChannel.enableVibration(true);
            notificationChannel.enableLights(true);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public QS7(QS6 qs6, Context context) {
        this.LJLIL = qs6;
        this.LJLILLLLZI = context;
    }
}
