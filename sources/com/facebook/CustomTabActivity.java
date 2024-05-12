package com.facebook;

import X.C10760bY;
import X.C16880lQ;
import X.C65803Ps7;
import X.C78598Ut0;
import Y.IDBReceiverS6S0100000_6;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CustomTabActivity extends Activity {
    public static final String LJLILLLLZI = o.LJIILLIIL(".action_customTabRedirect", C16880lQ.LJLLJ(CustomTabActivity.class));
    public static final String LJLJI = o.LJIILLIIL(".action_destroy", C16880lQ.LJLLJ(CustomTabActivity.class));
    public IDBReceiverS6S0100000_6 LJLIL;

    @Override // android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6 = this.LJLIL;
        if (iDBReceiverS6S0100000_6 != null) {
            C10760bY.LIZ(this).LIZLLL(iDBReceiverS6S0100000_6);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
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

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(LJLILLLLZI);
        intent.putExtra(CustomTabMainActivity.LJLJJLL, getIntent().getDataString());
        intent.addFlags(603979776);
        C78598Ut0.LJIJJ(intent, this);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(LJLILLLLZI);
            intent2.putExtra(CustomTabMainActivity.LJLJJLL, getIntent().getDataString());
            C10760bY.LIZ(this).LIZJ(intent2);
            IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6 = new IDBReceiverS6S0100000_6(this, 3);
            C10760bY.LIZ(this).LIZIZ(iDBReceiverS6S0100000_6, new IntentFilter(LJLJI));
            this.LJLIL = iDBReceiverS6S0100000_6;
        }
    }
}
