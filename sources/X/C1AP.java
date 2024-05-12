package X;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import androidx.core.app.JobIntentService;

/* renamed from: X.1AP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AP extends JobServiceEngine implements C06J {
    public final JobIntentService LIZ;
    public final Object LIZIZ;
    public JobParameters LIZJ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1AO] */
    public final C1AO LIZ() {
        synchronized (this.LIZIZ) {
            JobParameters jobParameters = this.LIZJ;
            if (jobParameters == null) {
                return null;
            }
            JobWorkItem dequeueWork = jobParameters.dequeueWork();
            if (dequeueWork == null) {
                return null;
            }
            dequeueWork.getIntent().setExtrasClassLoader(this.LIZ.getClassLoader());
            return new C06K(dequeueWork) { // from class: X.1AO
                public final JobWorkItem LIZ;

                @Override // X.C06K
                public final void LIZ() {
                    synchronized (C1AP.this.LIZIZ) {
                        JobParameters jobParameters2 = C1AP.this.LIZJ;
                        if (jobParameters2 != null) {
                            jobParameters2.completeWork(this.LIZ);
                        }
                    }
                }

                @Override // X.C06K
                public final Intent getIntent() {
                    return this.LIZ.getIntent();
                }

                {
                    this.LIZ = dequeueWork;
                }
            };
        }
    }

    public C1AP(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.LIZIZ = new Object();
        this.LIZ = jobIntentService;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.LIZJ = jobParameters;
        this.LIZ.ensureProcessorRunningLocked(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean doStopCurrentWork = this.LIZ.doStopCurrentWork();
        synchronized (this.LIZIZ) {
            this.LIZJ = null;
        }
        return doStopCurrentWork;
    }
}
