package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class FNY extends ActivityC45651qj implements InterfaceC18040nI {
    public FNY() {
        new LinkedHashMap();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        FAJ.LJFF("cold_boot_application_to_stubmain", false);
        FAJ.LIZ("cold_boot_stubmain_oncreate_duration", false);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            intent.setFlags(268435456);
        } else {
            intent = new Intent();
        }
        intent.putExtra("redirect_from_main", true);
        intent.setClassName(this, NewUserJourneyActivity.class.getName());
        C78598Ut0.LJIJJ(intent, this);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
        if (C38686FGg.LJ && ((Boolean) C38862FNa.LIZ.getValue()).booleanValue() && (!C36152EGu.LIZIZ(FNZ.LJLIL)) && MainLooperOptService.LLFFF) {
            MainLooperOptService.LJIIJ(FAB.WATCH_EXECUTE_TRANSACTION);
        }
        FAJ.LJFF("cold_boot_stubmain_oncreate_duration", false);
        FAJ.LIZ("cold_boot_stubmain_to_new_user_jrouney", false);
    }
}
