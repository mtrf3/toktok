package com.appsflyer.internal;

import X.C16880lQ;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ag {
    public static b valueOf = null;
    public static long values = 500;

    /* loaded from: classes.dex */
    public interface b {
        void AFKeystoreWrapper(Activity activity);

        void valueOf(Context context);
    }

    /* renamed from: com.appsflyer.internal.ag$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 implements Application.ActivityLifecycleCallbacks {
        public final /* synthetic */ b AFInAppEventType;
        public boolean AFKeystoreWrapper;
        public /* synthetic */ Executor valueOf;
        public boolean values = true;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(final Activity activity) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.ag.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    com_appsflyer_internal_ag$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_appsflyer_internal_ag$1$1__run$___twin___() {
                    AnonymousClass1.this.values = true;
                    final Context LLLLL = C16880lQ.LLLLL(activity);
                    try {
                        new PthreadTimer("ternal/ag$1$1").schedule(new TimerTask() { // from class: com.appsflyer.internal.ag.1.1.2
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                com_appsflyer_internal_ag$1$1$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public final void com_appsflyer_internal_ag$1$1$2__run$___twin___() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                if (anonymousClass1.AFKeystoreWrapper && anonymousClass1.values) {
                                    anonymousClass1.AFKeystoreWrapper = false;
                                    try {
                                        anonymousClass1.AFInAppEventType.valueOf(LLLLL);
                                    } catch (Exception e) {
                                        AFLogger.valueOf("Listener threw exception! ", e);
                                    }
                                }
                            }

                            public static void com_appsflyer_internal_ag$1$1$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                                boolean LIZ;
                                try {
                                    anonymousClass2.com_appsflyer_internal_ag$1$1$2__run$___twin___();
                                } finally {
                                    if (LIZ) {
                                    }
                                }
                            }
                        }, ag.values);
                    } catch (Throwable th) {
                        AFLogger.valueOf("Background task failed with a throwable: ", th);
                    }
                }

                public static void com_appsflyer_internal_ag$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00061 runnableC00061) {
                    boolean LIZ;
                    try {
                        runnableC00061.com_appsflyer_internal_ag$1$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.ag.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    com_appsflyer_internal_ag$1$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_appsflyer_internal_ag$1$3__run$___twin___() {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    if (!anonymousClass1.AFKeystoreWrapper) {
                        try {
                            anonymousClass1.AFInAppEventType.AFKeystoreWrapper(activity);
                        } catch (Exception e) {
                            AFLogger.values("Listener thrown an exception: ", e);
                        }
                    }
                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                    anonymousClass12.values = false;
                    anonymousClass12.AFKeystoreWrapper = true;
                }

                public static void com_appsflyer_internal_ag$1$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_appsflyer_internal_ag$1$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }

        public AnonymousClass1(Executor executor, b bVar) {
            this.valueOf = executor;
            this.AFInAppEventType = bVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(final Activity activity, Bundle bundle) {
            this.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.ag.1.5
                @Override // java.lang.Runnable
                public final void run() {
                    com_appsflyer_internal_ag$1$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_appsflyer_internal_ag$1$5__run$___twin___() {
                    i.values();
                    Intent intent = activity.getIntent();
                    if (i.AFKeystoreWrapper(intent) != null && intent != i.AFInAppEventParameterName) {
                        i.AFInAppEventParameterName = intent;
                    }
                }

                public static void com_appsflyer_internal_ag$1$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    boolean LIZ;
                    try {
                        anonymousClass5.com_appsflyer_internal_ag$1$5__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public static void AFKeystoreWrapper(Context context, b bVar, Executor executor) {
        valueOf = bVar;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(executor, bVar);
        if (context instanceof Activity) {
            anonymousClass1.onActivityResumed((Activity) context);
        }
        ((Application) C16880lQ.LLLLL(context)).registerActivityLifecycleCallbacks(anonymousClass1);
    }
}
