package com.bytedance.scene.ui;

import X.C16880lQ;
import X.C29S;
import X.C44272HZc;
import X.C45319HqV;
import X.C45321HqX;
import X.C65803Ps7;
import X.HJO;
import X.HXO;
import X.PIA;
import X.WM7;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes8.dex */
public class SceneContainerActivity extends C29S {
    public static final List<SceneContainerActivity> LJLILLLLZI;
    public HXO LJLIL;

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

    static {
        new HashSet();
        LJLILLLLZI = new ArrayList();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!this.LJLIL.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        ((ArrayList) LJLILLLLZI).remove(this);
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
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

    public static PIA<? extends Class<? extends WM7>, Bundle> LLFII(Intent intent) {
        try {
            return new PIA<>(Class.forName(C16880lQ.LLJJIJIIJIL(intent, "class_name")), C16880lQ.LJJLIIIIJ(intent, "arguments"));
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("theme", -1);
        if (intExtra != -1) {
            setTheme(intExtra);
        }
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024);
        ((ArrayList) LJLILLLLZI).add(this);
        Messenger messenger = (Messenger) getIntent().getParcelableExtra("SingeProcessMessengerHandler");
        if (messenger != null) {
            new C45321HqX(messenger);
            this.LJLIL = C44272HZc.LIZIZ(this, R.id.content, new HJO((Bundle) null, C45319HqV.class), null, false, "LifeCycleFragment", true);
        } else {
            PIA<? extends Class<? extends WM7>, Bundle> LLFII = LLFII(getIntent());
            this.LJLIL = C44272HZc.LIZIZ(this, R.id.content, new HJO(LLFII.LIZIZ, (Class) LLFII.LIZ), null, false, "LifeCycleFragment", true);
        }
    }
}
