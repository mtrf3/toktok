package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MAY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str) {
        int i;
        AlarmManager alarmManager;
        o.LJIIIZ(context, "context");
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClassName(context, str);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        int hashCode = str.hashCode();
        if (Build.VERSION.SDK_INT >= 23) {
            i = 603979776;
        } else {
            i = 536870912;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, hashCode, intent, i);
        if (broadcast != null) {
            Object LLILL = C16880lQ.LLILL(context, "alarm");
            if ((LLILL instanceof AlarmManager) && (alarmManager = (AlarmManager) LLILL) != null) {
                alarmManager.cancel(broadcast);
            }
        }
    }
}
