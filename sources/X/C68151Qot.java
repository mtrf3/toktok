package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: X.Qot, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68151Qot extends AbstractC68187QpT {
    public final AlarmManager LIZLLL;
    public C68150Qos LJ;
    public Integer LJFF;

    @Override // X.AbstractC68187QpT
    public final void LJIIIIZZ() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.LIZLLL;
        if (alarmManager != null) {
            alarmManager.cancel(LJIIJJI());
        }
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) C16880lQ.LLILL(this.LIZ.LIZ, "jobscheduler")) != null) {
            jobScheduler.cancel(LJIIJ());
        }
    }

    public final int LJIIJ() {
        if (this.LJFF == null) {
            this.LJFF = Integer.valueOf("measurement".concat(String.valueOf(this.LIZ.LIZ.getPackageName())).hashCode());
        }
        return this.LJFF.intValue();
    }

    public final PendingIntent LJIIJJI() {
        Context context = this.LIZ.LIZ;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C68152Qou.LIZ);
    }

    public final AbstractC68102Qo6 LJIIL() {
        if (this.LJ == null) {
            this.LJ = new C68150Qos(this, this.LIZIZ.LJIIJJI);
        }
        return this.LJ;
    }

    public final void LJIIIZ() {
        JobScheduler jobScheduler;
        LJI();
        this.LIZ.LIZJ().LJIILIIL.LIZ("Unscheduling upload");
        AlarmManager alarmManager = this.LIZLLL;
        if (alarmManager != null) {
            alarmManager.cancel(LJIIJJI());
        }
        LJIIL().LIZ();
        if (Build.VERSION.SDK_INT >= 24 && (jobScheduler = (JobScheduler) C16880lQ.LLILL(this.LIZ.LIZ, "jobscheduler")) != null) {
            jobScheduler.cancel(LJIIJ());
        }
    }

    public C68151Qot(C68241QqL c68241QqL) {
        super(c68241QqL);
        this.LIZLLL = (AlarmManager) C16880lQ.LLILL(this.LIZ.LIZ, "alarm");
    }
}
