package com.android.billingclient.api;

import X.C16880lQ;
import X.C36864EdQ;
import X.C38891fp;
import X.C65803Ps7;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver LJLIL;
    public ResultReceiver LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

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

    public final Intent LIZ() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        intent.setPackage(applicationContext.getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        if (!isFinishing() || !this.LJLJI) {
            return;
        }
        Intent LIZ = LIZ();
        LIZ.putExtra("RESPONSE_CODE", 1);
        LIZ.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
        sendBroadcast(LIZ);
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
        PendingIntent pendingIntent;
        int i;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        if (bundle == null) {
            C36864EdQ.LJFF("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.LJLJJI = true;
                    i = 110;
                }
                i = 100;
            } else {
                if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.LJLIL = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.LJLILLLLZI = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i = 101;
                } else {
                    pendingIntent = null;
                }
                i = 100;
            }
            try {
                this.LJLJI = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver = this.LJLIL;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.LJLILLLLZI;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent LIZ = LIZ();
                        if (this.LJLJJI) {
                            LIZ.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        LIZ.putExtra("RESPONSE_CODE", 6);
                        LIZ.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(LIZ);
                    }
                }
                this.LJLJI = false;
                finish();
                return;
            }
        }
        C36864EdQ.LJFF("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.LJLJI = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("result_receiver")) {
            this.LJLIL = (ResultReceiver) bundle.getParcelable("result_receiver");
        } else if (bundle.containsKey("in_app_message_result_receiver")) {
            this.LJLILLLLZI = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        }
        this.LJLJJI = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.LJLIL;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.LJLILLLLZI;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.LJLJI);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.LJLJJI);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Intent LIZ;
        Bundle LLJJIJI;
        int i3;
        super.onActivityResult(i, i2, intent);
        Bundle bundle = null;
        if (i == 100 || i == 110) {
            int i4 = C36864EdQ.LIZLLL(intent, "ProxyBillingActivity").LIZ;
            if (i2 == -1 && i4 == 0) {
                i4 = 0;
            }
            ResultReceiver resultReceiver = this.LJLIL;
            if (resultReceiver != null) {
                if (intent != null) {
                    bundle = C16880lQ.LLJJIJI(intent);
                }
                resultReceiver.send(i4, bundle);
            } else {
                if (intent != null) {
                    if (C16880lQ.LLJJIJI(intent) != null) {
                        String string = C16880lQ.LLJJIJI(intent).getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                        if (string != null) {
                            LIZ = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                            Context applicationContext = getApplicationContext();
                            if (C38891fp.LJLJI && applicationContext == null) {
                                applicationContext = C38891fp.LJLILLLLZI;
                            }
                            LIZ.setPackage(applicationContext.getPackageName());
                            LIZ.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                        } else {
                            LIZ = LIZ();
                            LIZ.putExtras(C16880lQ.LLJJIJI(intent));
                        }
                    } else {
                        LIZ = LIZ();
                        LIZ.putExtra("RESPONSE_CODE", 6);
                        LIZ.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    }
                } else {
                    LIZ = LIZ();
                }
                if (i == 110) {
                    LIZ.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(LIZ);
            }
        } else if (i == 101) {
            if (intent == null || (LLJJIJI = C16880lQ.LLJJIJI(intent)) == null) {
                i3 = 0;
            } else {
                i3 = LLJJIJI.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
            }
            ResultReceiver resultReceiver2 = this.LJLILLLLZI;
            if (resultReceiver2 != null) {
                if (intent != null) {
                    bundle = C16880lQ.LLJJIJI(intent);
                }
                resultReceiver2.send(i3, bundle);
            }
        }
        this.LJLJI = false;
        finish();
    }
}
