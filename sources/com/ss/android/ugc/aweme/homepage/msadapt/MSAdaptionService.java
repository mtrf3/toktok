package com.ss.android.ugc.aweme.homepage.msadapt;

import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C116694i1;
import X.C55493LqD;
import X.C58096Mr6;
import X.C77101UNt;
import X.InterfaceC36571c5;
import X.InterfaceC54054LJi;
import X.LNH;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.ss.android.ugc.aweme.requesttask.idle.ReportActivityStatusTask;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSAdaptionService implements IMSAdaptionService {
    public WeakReference<Fragment> LIZ;
    public Aweme LIZIZ;

    public static IMSAdaptionService LJIIL() {
        Object LIZ = C58096Mr6.LIZ(IMSAdaptionService.class, false);
        if (LIZ != null) {
            return (IMSAdaptionService) LIZ;
        }
        if (C58096Mr6.b1 == null) {
            synchronized (IMSAdaptionService.class) {
                if (C58096Mr6.b1 == null) {
                    C58096Mr6.b1 = new MSAdaptionService();
                }
            }
        }
        return C58096Mr6.b1;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final Fragment LJII() {
        WeakReference<Fragment> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final Aweme LJIIJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void LIZ(Fragment fragment) {
        if (fragment != null) {
            this.LIZ = new WeakReference<>(fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final boolean LIZIZ(Context context) {
        boolean z;
        if (context == null) {
            return false;
        }
        boolean LJI = LJI(context);
        if (context.getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!LJI || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final InterfaceC54054LJi LIZJ(Activity activity) {
        ActivityC45651qj activityC45651qj;
        if (activity == null) {
            return null;
        }
        if (activity instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) activity;
        } else {
            activityC45651qj = null;
        }
        InterfaceC36571c5 mv0 = C116694i1.LIZ(activityC45651qj).mv0();
        if (!(mv0 instanceof InterfaceC54054LJi)) {
            return null;
        }
        return (InterfaceC54054LJi) mv0;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final boolean LIZLLL(Context context) {
        if (context == null) {
            return false;
        }
        return C77101UNt.LJ(context);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void LJ(ActivityC86117Xqz activityC86117Xqz) {
        if (LIZIZ(activityC86117Xqz)) {
            SmartRouter.buildRoute(activityC86117Xqz, "//duo").open();
            activityC86117Xqz.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void LJFF(ActivityC86117Xqz activityC86117Xqz) {
        if (!activityC86117Xqz.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            return;
        }
        LJ(activityC86117Xqz);
        int LIZ = C77101UNt.LIZ(activityC86117Xqz);
        if (LJI(activityC86117Xqz)) {
            if (LIZ == 3 || LIZ == 1) {
                LoginUtilsServiceImpl.LIZ().restartApp(new Bundle());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final boolean LJI(Context context) {
        if (context == null || !LIZLLL(context)) {
            return false;
        }
        return C77101UNt.LJFF(context);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final ReportActivityStatusTask LJIIIIZZ(Bundle bundle) {
        return new ReportActivityStatusTask(bundle);
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void LJIIIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZIZ = aweme;
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService
    public final void LJIIJJI(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        if (LIZLLL(activity)) {
            LNH.LIZ(activity, activity, new C55493LqD(this));
            activity.setRequestedOrientation(-1);
        }
    }
}
