package com.ss.android.ugc.aweme.ug.amplify;

import X.C03880Dg;
import X.C65300Pk0;
import X.C88546Yp4;
import X.DialogC86015XpL;
import X.HG3;
import X.RBX;
import android.app.Activity;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AmplifyManager implements WeakHandler.IHandler {
    public static final int $stable;
    public static final AmplifyManager INSTANCE;
    public static WeakReference<Activity> activityRef;
    public static WeakHandler handler;

    public static void com_ss_android_ugc_aweme_ug_amplify_AmplifyManager_com_ss_android_ugc_aweme_ug_amplify_ui_AmplifyNotifyDialog_show(DialogC86015XpL dialogC86015XpL) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/ug/amplify/ui/AmplifyNotifyDialog", "show", dialogC86015XpL, new Object[0], "void", new C65300Pk0(false, "()V", "-8692448740048684214")).LIZ) {
            return;
        }
        dialogC86015XpL.show();
    }

    static {
        AmplifyManager amplifyManager = new AmplifyManager();
        INSTANCE = amplifyManager;
        handler = new WeakHandler(amplifyManager);
        $stable = 8;
    }

    public final WeakReference<Activity> getActivityRef() {
        WeakReference<Activity> weakReference = activityRef;
        if (weakReference != null) {
            return weakReference;
        }
        o.LJIJI("activityRef");
        throw null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message msg) {
        PopupSetting LIZJ;
        o.LJIIIZ(msg, "msg");
        Activity activity = getActivityRef().get();
        if (activity == null || activity.isFinishing() || msg.what != 3 || (LIZJ = C88546Yp4.LIZIZ.LIZJ("ugc_permission_v2")) == null) {
            return;
        }
        com_ss_android_ugc_aweme_ug_amplify_AmplifyManager_com_ss_android_ugc_aweme_ug_amplify_ui_AmplifyNotifyDialog_show(new DialogC86015XpL(activity, LIZJ));
    }

    public final void setActivityRef(WeakReference<Activity> weakReference) {
        o.LJIIIZ(weakReference, "<set-?>");
        activityRef = weakReference;
    }

    public final void checkAmplify(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
        if (activity.isFinishing()) {
            return;
        }
        setActivityRef(new WeakReference<>(activity));
        if (((RBX) HG3.LJIILL()).isLogin() && SpecActServiceImpl.LJJJIL().LJIILL()) {
            C88546Yp4.LIZIZ.LJ(handler, 3, i);
        }
    }
}
