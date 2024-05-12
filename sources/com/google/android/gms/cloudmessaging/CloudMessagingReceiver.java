package com.google.android.gms.cloudmessaging;

import X.C0H1;
import X.C16880lQ;
import X.C38523F9z;
import X.C52491Kit;
import X.C67177QYb;
import X.C67637Qgb;
import X.C67646Qgk;
import X.QYT;
import X.ThreadFactoryC39014FSw;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes12.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {
    public final ExecutorService zza;

    public Executor getBroadcastExecutor() {
        return this.zza;
    }

    public abstract int onMessageReceive(Context context, CloudMessage cloudMessage);

    public void onNotificationDismissed(Context context, Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(this, context, intent);
    }

    public CloudMessagingReceiver() {
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC39014FSw("firebase-iid-executor"));
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zza = Executors.unconfigurableExecutorService(pThreadPoolExecutor);
    }

    private final int zzb(Context context, Intent intent) {
        C67646Qgk LIZJ;
        if (C16880lQ.LLJJIJI(intent) == null) {
            return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "google.message_id");
        if (TextUtils.isEmpty(LLJJIJIIJIL)) {
            LIZJ = C67637Qgb.LJ(null);
        } else {
            Bundle LIZ = C0H1.LIZ("google.message_id", LLJJIJIIJIL);
            QYT LIZ2 = QYT.LIZ(context);
            LIZ2.getClass();
            LIZJ = LIZ2.LIZJ(new C67177QYb(LIZ2.LIZIZ(), LIZ));
        }
        int onMessageReceive = onMessageReceive(context, new CloudMessage(intent));
        try {
            C67637Qgb.LIZIZ(LIZJ, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            new StringBuilder(String.valueOf(e).length() + 20);
        }
        return onMessageReceive;
    }

    private final int zzc(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            LLJJIJI.remove("pending_intent");
        } else {
            LLJJIJI = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            onNotificationDismissed(context, LLJJIJI);
            return -1;
        }
        return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    }

    public final void com_google_android_gms_cloudmessaging_CloudMessagingReceiver__onReceive$___twin___(final Context context, final Intent intent) {
        final BroadcastReceiver.PendingResult goAsync;
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        if (C52491Kit.LIZ && "com.google.firebase.iid.FirebaseInstanceIdReceiver".equals(getClass().getName())) {
            goAsync = null;
        } else {
            goAsync = goAsync();
        }
        getBroadcastExecutor().execute(new Runnable() { // from class: X.QYc
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    CloudMessagingReceiver cloudMessagingReceiver = CloudMessagingReceiver.this;
                    Intent intent2 = intent;
                    Context context2 = context;
                    boolean z = isOrderedBroadcast;
                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                    if (C52491Kit.LIZ && "com.google.firebase.iid.FirebaseInstanceIdReceiver".equals(cloudMessagingReceiver.getClass().getName())) {
                        try {
                            cloudMessagingReceiver.zza(intent2, context2, z, pendingResult);
                        } catch (Throwable unused) {
                        }
                    } else {
                        cloudMessagingReceiver.zza(intent2, context2, z, pendingResult);
                    }
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static void com_google_android_gms_cloudmessaging_CloudMessagingReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(CloudMessagingReceiver cloudMessagingReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            cloudMessagingReceiver.com_google_android_gms_cloudmessaging_CloudMessagingReceiver__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            cloudMessagingReceiver.com_google_android_gms_cloudmessaging_CloudMessagingReceiver__onReceive$___twin___(context, intent);
        }
    }

    public final /* synthetic */ void zza(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        int zzb;
        Intent intent2;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if ((parcelableExtra instanceof Intent) && (intent2 = (Intent) parcelableExtra) != null) {
                zzb = zzc(context, intent2);
            } else {
                zzb = zzb(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(zzb);
            }
        } finally {
            pendingResult.finish();
        }
    }
}
