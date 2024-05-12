package com.bytedance.bdlocation.utils.background;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.utils.CollectionUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class ActivityLifecycleUtil implements GenericLifecycleObserver {
    public static List<ActivityNotification> sNotifications = new ArrayList();

    /* loaded from: classes9.dex */
    public interface ActivityNotification {
        void onAppBackgroundNotify(boolean z);
    }

    public static void init() {
        new Handler(C16880lQ.LLJJJJ()).post(new Runnable() { // from class: com.bytedance.bdlocation.utils.background.ActivityLifecycleUtil.1
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_bdlocation_utils_background_ActivityLifecycleUtil$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_bdlocation_utils_background_ActivityLifecycleUtil$1__run$___twin___() {
                ProcessLifecycleOwner.get().getLifecycle().addObserver(new ActivityLifecycleUtil());
            }

            public static void com_bytedance_bdlocation_utils_background_ActivityLifecycleUtil$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_bytedance_bdlocation_utils_background_ActivityLifecycleUtil$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public ActivityLifecycleUtil() {
    }

    public static void notifySwitch(boolean z) {
        synchronized (ActivityLifecycleUtil.class) {
            if (!CollectionUtil.isEmpty(sNotifications)) {
                Iterator<ActivityNotification> it = sNotifications.iterator();
                while (it.hasNext()) {
                    it.next().onAppBackgroundNotify(z);
                }
            }
        }
    }

    public static void register(ActivityNotification activityNotification) {
        synchronized (ActivityLifecycleUtil.class) {
            sNotifications.add(activityNotification);
        }
    }

    public static void unregister(ActivityNotification activityNotification) {
        synchronized (ActivityNotification.class) {
            sNotifications.remove(activityNotification);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStateChanged: event =");
        LIZ.append(event);
        Logger.d("onStateChanged", X1D.LIZIZ(LIZ));
        if (event == Lifecycle.Event.ON_START) {
            Logger.i("LifecycleObserver onAppForeground");
            notifySwitch(false);
        } else {
            if (event != Lifecycle.Event.ON_STOP) {
                return;
            }
            Logger.i("LifecycleObserver onAppBackground");
            notifySwitch(true);
        }
    }
}
