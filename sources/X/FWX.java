package X;

import Y.ARunnableS8S0000100_6;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.homepage.business.HomeToastTask;
import com.ss.android.ugc.aweme.legoImpl.task.AntispamApiUploadTask;
import com.ss.android.ugc.aweme.legoImpl.task.MobLaunchEventTask;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FWX implements LUN {
    public static final FWX LIZ = new FWX();

    @Override // X.LUN
    public final void LIZJ() {
        long currentTimeMillis = System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ;
        if (((Boolean) C88087Yhf.LIZIZ.getValue()).booleanValue()) {
            C38995FSd.LIZJ().execute(new ARunnableS8S0000100_6(currentTimeMillis, 6));
        } else {
            LIZLLL(currentTimeMillis);
        }
    }

    public static void LIZLLL(long j) {
        boolean z;
        int LIZ2 = C38752FIu.LIZ();
        int LIZJ = (int) EF7.LIZJ();
        if (LIZ2 != LIZJ) {
            z = true;
        } else {
            z = false;
        }
        if (FWS.LIZ().LIZ) {
            EI0 LIZJ2 = C40328FsC.LIZJ(C36093EEn.LIZ);
            LIZJ2.LIZIZ(new MobLaunchEventTask(z, j), true);
            LIZJ2.LIZJ();
        }
        if (LIZ2 == 0) {
            SharedPreferences.Editor edit = F9J.LIZIZ(EF7.LIZIZ(), 0, "app_setting").edit();
            edit.putInt("last_version_code", LIZJ);
            WX6.LIZ(edit);
        }
        FWS.LIZ().LIZ = false;
        EI0 LIZJ3 = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ3.LIZIZ(new AntispamApiUploadTask(), true);
        LIZJ3.LIZJ();
    }

    @Override // X.LUN
    public final void LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        new HomeToastTask().run(activity);
    }

    @Override // X.LUN
    public final void LIZIZ(Bundle bundle, ActivityC45651qj activity) {
        Bundle bundle2;
        o.LJIIIZ(activity, "activity");
        try {
            if (Build.VERSION.SDK_INT == 28 && bundle != null && (bundle2 = bundle.getBundle("android:viewHierarchyState")) != null && TextUtils.equals(bundle2.getClassLoader().getClass().getName(), "java.lang.BootClassLoader")) {
                bundle2.setClassLoader(activity.getClassLoader());
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
