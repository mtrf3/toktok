package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes12.dex */
public final class QSH {
    public static final C85889XnJ LIZ = new C85889XnJ();

    public static String LIZIZ(int i, String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("generateChannelIdBySoundType channel id:");
        LIZ2.append(str);
        QSI.LIZIZ(X1D.LIZIZ(LIZ2));
        if (i == 0) {
            i = 2;
        }
        return YE1.LIZIZ(str, "_associated_", i);
    }

    public static void LIZ(Context context, NotificationManager notificationManager, C85889XnJ c85889XnJ) {
        if (Build.VERSION.SDK_INT < 26 || notificationManager == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : c85889XnJ.entrySet()) {
            String key = entry.getKey();
            String string = context.getString(entry.getValue().intValue());
            if (Build.VERSION.SDK_INT >= 26) {
                String LIZIZ = YE1.LIZIZ(key, "_associated_", 2);
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(LIZIZ);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel(LIZIZ, string, 4);
                    notificationChannel.enableLights(true);
                    notificationChannel.enableVibration(true);
                    notificationChannel.setLockscreenVisibility(1);
                    notificationChannel.setShowBadge(true);
                    notificationChannel.setLightColor(-16711936);
                    android.net.Uri LIZ2 = AnonymousClass921.LIZ(context);
                    if (LIZ2 != null) {
                        notificationChannel.setSound(LIZ2, null);
                    }
                }
                int i = 0;
                while (true) {
                    String str = key;
                    while (true) {
                        if (notificationManager.getNotificationChannel(str) != null) {
                            notificationManager.deleteNotificationChannel(str);
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("initNotificationChannel delete channel");
                        LIZ3.append(str);
                        QSI.LIZ(X1D.LIZIZ(LIZ3));
                        do {
                            i++;
                            if (i > 3) {
                                break;
                            }
                        } while (i == 2);
                        if (i != 0) {
                            str = YE1.LIZIZ(key, "_associated_", i);
                        }
                    }
                }
                arrayList.add(notificationChannel);
                break;
            }
        }
        try {
            notificationManager.createNotificationChannels(arrayList);
        } catch (Exception unused) {
        }
    }
}
