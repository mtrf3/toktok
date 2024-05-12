package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;

/* renamed from: X.0bZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10770bZ {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0VW.LIZIZ("Alarms");
    }

    public static void LIZ(Context context, int i, String str) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) C16880lQ.LLILL(context, "alarm");
        Intent LIZ2 = C1D7.LIZ(context, str);
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 603979776;
        } else {
            i2 = 536870912;
        }
        PendingIntent service = PendingIntent.getService(context, i, LIZ2, i2);
        if (service != null && alarmManager != null) {
            C0VW LIZ3 = C0VW.LIZ();
            C16880lQ.LLLZ("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)});
            LIZ3.getClass();
            alarmManager.cancel(service);
        }
    }

    public static void LIZIZ(Context context, C1OU c1ou, String str, long j) {
        int LIZ2;
        WorkDatabase workDatabase = c1ou.LIZJ;
        C34731Xx c34731Xx = (C34731Xx) workDatabase.LJIJJ();
        C19300pK LIZ3 = c34731Xx.LIZ(str);
        if (LIZ3 != null) {
            LIZ(context, LIZ3.LIZIZ, str);
            LIZJ(LIZ3.LIZIZ, j, context, str);
            return;
        }
        C20470rD c20470rD = new C20470rD(workDatabase);
        synchronized (C20470rD.class) {
            LIZ2 = c20470rD.LIZ("next_alarm_manager_id");
        }
        c34731Xx.LIZIZ(new C19300pK(str, LIZ2));
        LIZJ(LIZ2, j, context, str);
    }

    public static void LIZJ(int i, long j, Context context, String str) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) C16880lQ.LLILL(context, "alarm");
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        } else {
            i2 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i, C1D7.LIZ(context, str), i2);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
