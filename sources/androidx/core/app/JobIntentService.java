package androidx.core.app;

import X.C06J;
import X.C06K;
import X.C06L;
import X.C1AL;
import X.C1AN;
import X.C1AP;
import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.core.app.JobIntentService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {
    public final ArrayList<C1AN> mCompatQueue;
    public C06L mCompatWorkEnqueuer;
    public C1AL mCurProcessor;
    public boolean mDestroyed;
    public boolean mInterruptIfStopped;
    public C06J mJobImpl;
    public boolean mStopped;
    public static final Object sLock = new Object();
    public static final HashMap<ComponentName, C06L> sClassWorkEnqueuer = new HashMap<>();

    public void androidx_core_app_JobIntentService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        androidx_core_app_JobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    public C06K dequeueWork() {
        C06J c06j = this.mJobImpl;
        if (c06j != null) {
            return ((C1AP) c06j).LIZ();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() > 0) {
                return this.mCompatQueue.remove(0);
            }
            return null;
        }
    }

    public boolean doStopCurrentWork() {
        C1AL c1al = this.mCurProcessor;
        if (c1al != null) {
            c1al.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void processorFinished() {
        ArrayList<C1AN> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList<C1AN> arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.LIZJ();
                }
            }
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new C1AP(this);
            this.mCompatWorkEnqueuer = null;
        } else {
            this.mJobImpl = null;
            this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<C1AN> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.LIZJ();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1AL] */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new PthreadAsyncTask<Void, Void, Void>() { // from class: X.1AL
                @Override // android.os.AsyncTask
                public final Object doInBackground(Object[] objArr) {
                    while (true) {
                        C06K dequeueWork = JobIntentService.this.dequeueWork();
                        if (dequeueWork != null) {
                            JobIntentService.this.onHandleWork(dequeueWork.getIntent());
                            dequeueWork.LIZ();
                        } else {
                            return null;
                        }
                    }
                }

                @Override // android.os.AsyncTask
                public final void onCancelled(Object obj) {
                    JobIntentService.this.processorFinished();
                }

                @Override // android.os.AsyncTask
                public final void onPostExecute(Object obj) {
                    JobIntentService.this.processorFinished();
                }
            };
            C06L c06l = this.mCompatWorkEnqueuer;
            if (c06l != null && z) {
                c06l.LIZLLL();
            }
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Object obj = this.mJobImpl;
        if (obj != null) {
            return ((JobServiceEngine) obj).getBinder();
        }
        return null;
    }

    public static void androidx_core_app_JobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(JobIntentService jobIntentService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        jobIntentService.androidx_core_app_JobIntentService__attachBaseContext$___twin___(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, final int i2) {
        if (this.mCompatQueue != null) {
            this.mCompatWorkEnqueuer.LJ();
            synchronized (this.mCompatQueue) {
                ArrayList<C1AN> arrayList = this.mCompatQueue;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new C06K(intent, i2) { // from class: X.1AN
                    public final Intent LIZ;
                    public final int LIZIZ;

                    @Override // X.C06K
                    public final void LIZ() {
                        JobIntentService.this.stopSelf(this.LIZIZ);
                    }

                    @Override // X.C06K
                    public final Intent getIntent() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = intent;
                        this.LIZIZ = i2;
                    }
                });
                ensureProcessorRunningLocked(true);
            }
            return 3;
        }
        return 2;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                C06L workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.LIZIZ(i);
                workEnqueuer.LIZ(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static C06L getWorkEnqueuer(final Context context, final ComponentName componentName, boolean z, final int i) {
        HashMap<ComponentName, C06L> hashMap = sClassWorkEnqueuer;
        C06L c06l = hashMap.get(componentName);
        if (c06l == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (z) {
                    c06l = new C06L(context, componentName, i) { // from class: X.1AQ
                        public final JobInfo LIZLLL;
                        public final JobScheduler LJ;

                        @Override // X.C06L
                        public final void LIZ(Intent intent) {
                            this.LJ.enqueue(this.LIZLLL, new JobWorkItem(intent));
                        }

                        {
                            super(componentName);
                            LIZIZ(i);
                            this.LIZLLL = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
                            this.LJ = (JobScheduler) C16880lQ.LLILL(C16880lQ.LLLLL(context), "jobscheduler");
                        }
                    };
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                c06l = new C06L(context, componentName) { // from class: X.1AM
                    public final Context LIZLLL;
                    public final PowerManager.WakeLock LJ;
                    public final PowerManager.WakeLock LJFF;
                    public boolean LJI;
                    public boolean LJII;

                    @Override // X.C06L
                    public final void LIZJ() {
                        synchronized (this) {
                            if (this.LJII) {
                                if (this.LJI) {
                                    this.LJ.acquire(60000L);
                                }
                                this.LJII = false;
                                this.LJFF.release();
                            }
                        }
                    }

                    @Override // X.C06L
                    public final void LIZLLL() {
                        synchronized (this) {
                            if (!this.LJII) {
                                this.LJII = true;
                                this.LJFF.acquire(600000L);
                                this.LJ.release();
                            }
                        }
                    }

                    @Override // X.C06L
                    public final void LJ() {
                        synchronized (this) {
                            this.LJI = false;
                        }
                    }

                    @Override // X.C06L
                    public final void LIZ(Intent intent) {
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(this.LIZ);
                        if (C16880lQ.LLLL(this.LIZLLL, intent2) != null) {
                            synchronized (this) {
                                if (!this.LJI) {
                                    this.LJI = true;
                                    if (!this.LJII) {
                                        this.LJ.acquire(60000L);
                                    }
                                }
                            }
                        }
                    }

                    {
                        super(componentName);
                        this.LIZLLL = C16880lQ.LLLLL(context);
                        PowerManager powerManager = (PowerManager) C16880lQ.LLILL(context, "power");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(componentName.getClassName());
                        LIZ.append(":launch");
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, X1D.LIZIZ(LIZ));
                        this.LJ = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(componentName.getClassName());
                        LIZ2.append(":run");
                        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, X1D.LIZIZ(LIZ2));
                        this.LJFF = newWakeLock2;
                        newWakeLock2.setReferenceCounted(false);
                    }
                };
            }
            hashMap.put(componentName, c06l);
        }
        return c06l;
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }
}
