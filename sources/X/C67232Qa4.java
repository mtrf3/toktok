package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.trill.abtest.impl.NotificationBroadcastReceiver;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Qa4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67232Qa4 extends AbstractC38780FJw<Boolean> {
    @Override // X.AbstractC38780FJw
    public final Boolean LIZIZ() {
        return Boolean.FALSE;
    }

    @Override // X.AbstractC38780FJw
    public final boolean LIZ(Boolean bool) {
        int i;
        Bitmap bitmap;
        Boolean bool2 = bool;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            NotificationManager notificationManager = (NotificationManager) C16880lQ.LLILL(EF7.LIZIZ(), "notification");
            if (notificationManager.getNotificationChannel("AttractUserWithoutLoginHome") != null) {
                notificationManager.deleteNotificationChannel("AttractUserWithoutLoginHome");
            }
        }
        if (((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        C54293LSn c54293LSn = C235779Nd.LIZ;
        if (c54293LSn.LJJIFFI == null) {
            c54293LSn.LJJIFFI = new C36821Ecj<>("attract_user_without_notification", Boolean.FALSE);
        }
        if (c54293LSn.LJJIFFI.LIZ().booleanValue() || !bool2.booleanValue()) {
            return false;
        }
        NotificationManager notificationManager2 = (NotificationManager) C16880lQ.LLILL(EF7.LIZIZ(), "notification");
        Intent intent = new Intent(EF7.LIZIZ(), (Class<?>) NotificationBroadcastReceiver.class);
        intent.setAction("notification_clicked");
        intent.putExtra("type", 1);
        if (i2 >= 23) {
            i = 1140850688;
        } else {
            i = 1073741824;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(EF7.LIZIZ(), 0, intent, i);
        if (i2 >= 26) {
            String string = EF7.LIZIZ().getString(R.string.r14);
            if (notificationManager2 != null && notificationManager2.getNotificationChannel("other_channel") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("other_channel", string, 4);
                notificationChannel.enableLights(true);
                notificationChannel.enableVibration(true);
                notificationChannel.setLockscreenVisibility(1);
                notificationChannel.setShowBadge(true);
                notificationChannel.setLightColor(-16711936);
                notificationManager2.createNotificationChannel(notificationChannel);
            }
        }
        C022406y c022406y = new C022406y(EF7.LIZIZ(), "other_channel");
        c022406y.LJJIIJ.icon = R.drawable.status_icon_l;
        Drawable drawable = EF7.LIZIZ().getResources().getDrawable(R.drawable.c84);
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            bitmap = null;
        }
        c022406y.LJIIIIZZ(bitmap);
        c022406y.LJFF(EF7.LIZIZ().getString(R.string.brl));
        c022406y.LJ(EF7.LIZIZ().getString(R.string.buu));
        c022406y.LJI = broadcast;
        if (notificationManager2 != null) {
            notificationManager2.notify(1, c022406y.LIZIZ());
        }
        if (c54293LSn.LJJIFFI == null) {
            c54293LSn.LJJIFFI = new C36821Ecj<>("attract_user_without_notification", Boolean.FALSE);
        }
        c54293LSn.LJJIFFI.LIZLLL(Boolean.TRUE);
        MobClick obtain = MobClick.obtain();
        obtain.setLabelName("show");
        obtain.setEventName("recall_push");
        FMX.onEvent(obtain);
        return true;
    }
}
