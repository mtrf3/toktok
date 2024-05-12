package androidx.work.impl.utils;

import X.C09030Xb;
import X.C0CW;
import X.C0VW;
import X.C10580bG;
import X.C16880lQ;
import X.C1OU;
import X.C20500rG;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    public static final long LJLJJI;
    public final Context LJLIL;
    public final C1OU LJLILLLLZI;
    public int LJLJI = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            C0VW.LIZIZ("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if ("ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                    C0VW.LIZ().getClass();
                    ForceStopRunnable.LIZLLL(context);
                    return;
                }
                return;
            }
            C38523F9z.LIZ();
            if (!"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            C0VW.LIZ().getClass();
            ForceStopRunnable.LIZLLL(context);
        }
    }

    static {
        C0VW.LIZIZ("ForceStopRunnable");
        LJLJJI = TimeUnit.DAYS.toMillis(3650L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.LIZIZ():void");
    }

    public final boolean LIZJ() {
        C0CW c0cw = this.LJLILLLLZI.LIZIZ;
        c0cw.getClass();
        if (TextUtils.isEmpty(null)) {
            C0VW.LIZ().getClass();
            return true;
        }
        boolean LIZ = C20500rG.LIZ(this.LJLIL, c0cw);
        C0VW LIZ2 = C0VW.LIZ();
        C16880lQ.LLLZ("Is default app process = %s", new Object[]{Boolean.valueOf(LIZ)});
        LIZ2.getClass();
        return LIZ;
    }

    public final void LIZ() {
        try {
            if (!LIZJ()) {
                return;
            }
            while (true) {
                C09030Xb.LIZ(this.LJLIL);
                C0VW.LIZ().getClass();
                try {
                    LIZIZ();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.LJLJI + 1;
                    this.LJLJI = i;
                    if (i < 3) {
                        C0VW LIZ = C0VW.LIZ();
                        C16880lQ.LLLZ("Retrying after %s", new Object[]{Long.valueOf(i * 300)});
                        LIZ.getClass();
                        try {
                            Thread.sleep(this.LJLJI * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        C0VW.LIZ().getClass();
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        this.LJLILLLLZI.LIZIZ.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            this.LJLILLLLZI.LJI();
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

    public static void LIZLLL(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) C16880lQ.LLILL(context, "alarm");
        if (C10580bG.LIZ()) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + LJLJJI;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    public ForceStopRunnable(Context context, C1OU c1ou) {
        this.LJLIL = C16880lQ.LLLLL(context);
        this.LJLILLLLZI = c1ou;
    }
}
