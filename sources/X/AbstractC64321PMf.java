package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.bytedance.push.PushBody;
import com.bytedance.push.notification.PushActivity;

/* renamed from: X.PMf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64321PMf {
    public abstract Notification LIZ(Context context, PushBody pushBody, Bitmap bitmap);

    public static Notification LIZIZ(Notification.Builder builder, Context context, String str, String str2) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeResource(context.getResources(), C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).applicationInfo.icon);
        } catch (Exception unused) {
            bitmap = null;
        }
        Notification.Builder contentText = builder.setContentTitle(str).setContentText(str2);
        contentText.setStyle(new Notification.BigTextStyle().bigText(str2));
        if (bitmap != null && !bitmap.isRecycled()) {
            contentText = contentText.setLargeIcon(bitmap);
        }
        return contentText.build();
    }

    public static Notification LIZJ(Notification.Builder builder, Context context, PushBody pushBody, Bitmap bitmap) {
        Bitmap bitmap2 = null;
        if (context == null || pushBody == null) {
            return null;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            pushBody.imageType = 0;
        }
        int i = pushBody.imageType;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return LIZIZ(builder, context, pushBody.title, pushBody.text);
                }
                String str = pushBody.title;
                builder.setContentTitle(str).setContentText(pushBody.text).setLargeIcon(bitmap);
                return builder.build();
            }
            String str2 = pushBody.title;
            String str3 = pushBody.text;
            try {
                bitmap2 = BitmapFactory.decodeResource(context.getResources(), C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).applicationInfo.icon);
            } catch (Exception unused) {
            }
            Notification.Builder contentText = builder.setContentTitle(str2).setContentText(str3);
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle().bigPicture(bitmap).setSummaryText(str3).setBigContentTitle(str2);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bigContentTitle = bigContentTitle.bigLargeIcon(bitmap2);
            }
            contentText.setStyle(bigContentTitle).setLargeIcon(bitmap);
            return contentText.build();
        }
        return LIZIZ(builder, context, pushBody.title, pushBody.text);
    }

    public final void LIZLLL(Context context, int i, PushBody pushBody, Bitmap bitmap) {
        int i2;
        try {
            NotificationManager notificationManager = (NotificationManager) C16880lQ.LLILL(context, "notification");
            Intent intent = new Intent(C16880lQ.LLLLL(context), (Class<?>) PushActivity.class);
            intent.putExtra("push_body", pushBody.LIZ());
            intent.putExtra("from_notification", true);
            intent.putExtra("message_from", i);
            intent.addFlags(268435456);
            if (pushBody.mIsPassThough) {
                Notification LIZ = LIZ(context, pushBody, bitmap);
                if (LIZ == null) {
                    return;
                }
                int i3 = (int) (pushBody.id % 2147483647L);
                if (Build.VERSION.SDK_INT >= 23) {
                    i2 = 67108864;
                } else {
                    i2 = 134217728;
                }
                LIZ.contentIntent = PendingIntent.getActivity(context, i3, intent, i2);
                notificationManager.notify("app_notify", i3, LIZ);
                HG3 hg3 = QRM.LJIIIIZZ.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("show notification finish. ");
                LIZ2.append(pushBody);
                X1D.LIZIZ(LIZ2);
                hg3.getClass();
            } else {
                C16880lQ.LIZJ(context, intent);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
