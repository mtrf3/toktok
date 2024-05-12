package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MAS extends MAZ {
    public int LIZ = 300;

    public abstract void LIZ(Intent intent, int i, Context context, int i2, java.util.Map<String, String> map);

    public abstract String LJ();

    public abstract void LJFF(Context context, AppWidgetManager appWidgetManager, int[] iArr, Intent intent);

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        o.LJIIIZ(context, "context");
        if (o.LJ(LJ(), "function_entry_medium")) {
            MAC.LJI("function_entry_medium");
        }
        MAY.LIZ(context, getClass().getName());
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        o.LJIIIZ(context, "context");
        if (o.LJ(LJ(), "function_entry_medium")) {
            MAC.LJ("function_entry_medium", C113554cx.LJJJLIIL());
        }
    }

    public final void LIZIZ(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (o.LJ(LJ(), "recom_word_with_default") || context == null) {
            return;
        }
        if (o.LJ(intent.getAction(), "com.ss.android.ugc.tiktok.app.widget.SEARCH_WIDGET_CHECK_STATE") || o.LJ(intent.getAction(), "android.appwidget.action.APPWIDGET_ENABLED")) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            o.LJIIIIZZ(appWidgetManager, "appWidgetManager");
            int[] LIZJ = MAX.LIZJ(context, appWidgetManager, LJ());
            if (LIZJ.length == 0) {
                return;
            }
            LJFF(context, appWidgetManager, LIZJ, intent);
        }
    }

    @Override // X.MAZ, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZIZ(context, intent);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        long j;
        int i;
        AlarmManager alarmManager;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appWidgetManager, "appWidgetManager");
        o.LJIIIZ(appWidgetIds, "appWidgetIds");
        if (!o.LJ(LJ(), "recom_word_with_default")) {
            MAR.LIZLLL(MAR.LIZ, context);
        }
        if (C84763XOl.LJIIJJI) {
            j = C34692DjU.LIZ;
        } else {
            j = C34693DjV.LIZ;
        }
        String name = getClass().getName();
        if (appWidgetIds.length == 0) {
            return;
        }
        MAY.LIZ(context, name);
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClassName(context, name);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        Bundle bundle = new Bundle();
        bundle.putIntArray("appWidgetIds", appWidgetIds);
        intent.putExtras(bundle);
        int hashCode = name.hashCode();
        if (Build.VERSION.SDK_INT >= 23) {
            i = 335544320;
        } else {
            i = 268435456;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, hashCode, intent, i);
        long LJIJI = C78842Uww.LJIJI(V0Q.Default, new UIW(1000, j)) + SystemClock.elapsedRealtime();
        Object LLILL = C16880lQ.LLILL(context, "alarm");
        if (!(LLILL instanceof AlarmManager) || (alarmManager = (AlarmManager) LLILL) == null) {
            return;
        }
        alarmManager.setRepeating(3, LJIJI, j, broadcast);
    }

    public final PendingIntent LIZJ(int i, Context context, int i2, java.util.Map<String, String> extraData) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(extraData, "extraData");
        Intent LIZ = MAE.LIZ(context, LJ());
        LIZ.setFlags(268435456);
        LIZ.addFlags(67108864);
        LIZ(LIZ, i, context, i2, extraData);
        LIZ.putExtra("widget_type", LJ());
        int LIZIZ = C56378MAs.LIZIZ();
        int i3 = this.LIZ + 1;
        this.LIZ = i3;
        PendingIntent activity = PendingIntent.getActivity(context, i3, LIZ, LIZIZ);
        o.LJIIIIZZ(activity, "getActivity(\n           …          flag,\n        )");
        return activity;
    }

    public static /* synthetic */ PendingIntent LIZLLL(MAS mas, int i, Context context, int i2, int i3) {
        C93833mF c93833mF;
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        if ((i3 & 8) != 0) {
            c93833mF = C113554cx.LJJJLIIL();
        } else {
            c93833mF = null;
        }
        return mas.LIZJ(i, context, i2, c93833mF);
    }
}
