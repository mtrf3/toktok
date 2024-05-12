package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* renamed from: X.Qd4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67418Qd4 implements LD7 {
    public final Context LIZ;
    public final InterfaceC67397Qcj LIZIZ;
    public final AbstractC67420Qd6 LIZJ;

    @Override // X.LD7
    public final void LIZ(AbstractC67354Qc2 abstractC67354Qc2, int i) {
        try {
            LIZIZ(abstractC67354Qc2, i, false);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public C67418Qd4(Context context, InterfaceC67397Qcj interfaceC67397Qcj, AbstractC67420Qd6 abstractC67420Qd6) {
        this.LIZ = context;
        this.LIZIZ = interfaceC67397Qcj;
        this.LIZJ = abstractC67420Qd6;
    }

    @Override // X.LD7
    public final void LIZIZ(AbstractC67354Qc2 abstractC67354Qc2, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.LIZ, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) C16880lQ.LLILL(this.LIZ, "jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.LIZ.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC67354Qc2.LIZIZ().getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(C67356Qc4.LIZ(abstractC67354Qc2.LIZLLL()));
        adler32.update(allocate.array());
        if (abstractC67354Qc2.LIZJ() != null) {
            adler32.update(abstractC67354Qc2.LIZJ());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        C46617IRh.LIZ("JobInfoScheduler");
                        return;
                    }
                }
            }
        }
        long LLLLJ = this.LIZIZ.LLLLJ(abstractC67354Qc2);
        AbstractC67420Qd6 abstractC67420Qd6 = this.LIZJ;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        EnumC67357Qc5 LIZLLL = abstractC67354Qc2.LIZLLL();
        builder.setMinimumLatency(abstractC67420Qd6.LIZIZ(LIZLLL, LLLLJ, i));
        java.util.Set<EnumC67424QdA> LIZIZ = abstractC67420Qd6.LIZJ().get(LIZLLL).LIZIZ();
        if (LIZIZ.contains(EnumC67424QdA.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (LIZIZ.contains(EnumC67424QdA.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (LIZIZ.contains(EnumC67424QdA.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", abstractC67354Qc2.LIZIZ());
        persistableBundle.putInt("priority", C67356Qc4.LIZ(abstractC67354Qc2.LIZLLL()));
        if (abstractC67354Qc2.LIZJ() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC67354Qc2.LIZJ(), 0));
        }
        builder.setExtras(persistableBundle);
        this.LIZJ.LIZIZ(abstractC67354Qc2.LIZLLL(), LLLLJ, i);
        C46617IRh.LIZ("JobInfoScheduler");
        jobScheduler.schedule(builder.build());
    }
}
