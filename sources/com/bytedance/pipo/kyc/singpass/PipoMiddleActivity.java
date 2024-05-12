package com.bytedance.pipo.kyc.singpass;

import X.ActivityC45651qj;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C1AT;
import X.C65803Ps7;
import X.C66533Q9h;
import X.C66543Q9r;
import X.C66544Q9s;
import X.C66545Q9t;
import X.C78598Ut0;
import X.C78613UtF;
import X.QA8;
import X.QA9;
import X.QAE;
import X.QAR;
import X.XKX;
import android.R;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

/* loaded from: classes12.dex */
public final class PipoMiddleActivity extends ActivityC45651qj {
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
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

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        QA8.LIZ = null;
        QA8.LIZIZ = null;
        QA8.LJ = null;
        QA8.LJI = null;
        QA8.LJFF = null;
        QA8.LIZJ = null;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
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

    public final void LLFII(QAE qae) {
        QAR qar = QA8.LIZ;
        if (qar != null) {
            qar.LIZ(null, qae);
        }
        finish();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        if (bundle == null) {
            C66533Q9h c66533Q9h = new C66533Q9h(getApplication());
            C66544Q9s c66544Q9s = QA8.LIZIZ;
            if (c66544Q9s != null) {
                AnonymousClass005 anonymousClass005 = QA8.LIZJ;
                try {
                    AnonymousClass004 LIZ = c66533Q9h.LIZJ.LIZ(c66544Q9s.LIZJ());
                    LIZ.LIZJ = new C1AT(ActivityOptions.makeCustomAnimation(getApplication(), R.anim.slide_in_left, R.anim.fade_out)).LIZLLL();
                    LIZ.LIZ.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", new C1AT(ActivityOptions.makeCustomAnimation(getApplication(), R.anim.fade_in, R.anim.slide_out_right)).LIZLLL());
                    AnonymousClass005 LIZ2 = LIZ.LIZ();
                    if (anonymousClass005 == null) {
                        anonymousClass005 = LIZ2;
                    }
                    intent = c66533Q9h.LIZ(c66544Q9s, anonymousClass005);
                } catch (ActivityNotFoundException unused) {
                    LLFII(new QAE("fail to get auth code", 104, "No suitable web browser found!", 4));
                }
                C78598Ut0.LJIJJ(intent, this);
                startActivityForResult(intent, 1101);
            }
            intent = null;
            C78598Ut0.LJIJJ(intent, this);
            startActivityForResult(intent, 1101);
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (intent != null) {
                C66545Q9t LIZIZ = C66545Q9t.LIZIZ(intent);
                C66543Q9r fromIntent = C66543Q9r.fromIntent(intent);
                if (fromIntent != null) {
                    LLFII(new QAE(104, "fail to get auth code", Integer.valueOf(fromIntent.code), fromIntent.errorDescription));
                }
                if (LIZIZ == null || (str2 = LIZIZ.LIZLLL) == null || str2.length() == 0) {
                    LLFII(new QAE("auth code is empty", 105, (String) null, 12));
                }
                if (LIZIZ != null && (str = LIZIZ.LIZLLL) != null) {
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C78613UtF.LIZJ, null, new QA9(this, str, null), 2);
                    return;
                }
                return;
            }
            LLFII(new QAE("fail to get auth code", 104, "data is null", 4));
            return;
        }
        LLFII(new QAE("user cancel", 107, "user close singpass page", 4));
    }
}
