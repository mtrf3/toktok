package com.google.android.gms.common.api;

import X.C16880lQ;
import X.C65803Ps7;
import X.C67824Qjc;
import X.FP1;
import X.HandlerC67272Qai;
import X.QH7;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes12.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public int LJLIL;

    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

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

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.LJLIL = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        if (bundle != null) {
            this.LJLIL = bundle.getInt("resolution");
        }
        if (this.LJLIL != 1) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) C16880lQ.LLJJIII(LLJJIJI, "pending_intent");
            Integer num = (Integer) C16880lQ.LLJJIII(LLJJIJI, "error_code");
            if (pendingIntent == null) {
                if (num != null) {
                    QH7.LJIIIIZZ(num);
                    GoogleApiAvailability.getInstance().showErrorDialogFragment(this, num.intValue(), 2, this);
                    this.LJLIL = 1;
                    return;
                }
                finish();
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.LJLIL = 1;
            } catch (ActivityNotFoundException unused) {
                if (LLJJIJI.getBoolean("notify_manager", true)) {
                    C67824Qjc.LJI(this).LJII(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String pendingIntent2 = pendingIntent.toString();
                    String LIZLLL = FP1.LIZLLL(new StringBuilder(pendingIntent2.length() + 36), "Activity not found while launching ", pendingIntent2, ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        LIZLLL.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                this.LJLIL = 1;
                finish();
            } catch (IntentSender.SendIntentException unused2) {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.LJLIL);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.LJLIL = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C67824Qjc LJI = C67824Qjc.LJI(this);
                if (i2 != -1) {
                    if (i2 == 0) {
                        LJI.LJII(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    HandlerC67272Qai handlerC67272Qai = LJI.LJLLL;
                    handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(3));
                }
            }
        } else if (i == 2) {
            this.LJLIL = 0;
            setResult(i2, intent);
        }
        finish();
    }
}
