package com.bytedance.ies.powerpermissions;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C29S;
import X.C41729GZh;
import X.C65803Ps7;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import ujb.o;

/* loaded from: classes8.dex */
public final class FakeActivity extends C29S {
    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    public FakeActivity() {
        new LinkedHashMap();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
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
        String key;
        C65803Ps7.LIZ(this, bundle);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI == null || (key = LLJJIJI.getString("power_permission_request_key", null)) == null || o.LJJJJJL(key)) {
            finish();
            return;
        }
        kotlin.jvm.internal.o.LJIIIZ(key, "key");
        InterfaceC88472Yns<ActivityC45651qj, C76800UCe> remove = C41729GZh.LIZ.remove(key);
        if (remove == null) {
            finish();
        } else {
            remove.invoke(this);
        }
    }
}
