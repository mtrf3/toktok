package com.bytedance.pipo.checkout.sdk.internal;

import X.ActivityC93161aMP;
import X.C39647FhD;
import X.C65803Ps7;
import X.C91706Zyw;
import X.C91833a0z;
import X.C92083a51;
import X.C92105a5N;
import X.C92106a5O;
import X.C92145a61;
import X.EnumC91972a3E;
import X.EnumC92041a4L;
import X.EnumC92044a4O;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModelFactory;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutAction;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CheckoutActivity extends ActivityC93161aMP {
    public static final /* synthetic */ int LJLJLJ = 0;
    public C92145a61 LJLIL;
    public final BaseViewModelFactory LJLILLLLZI;
    public CheckoutViewModel LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    public final CheckoutViewModel LLFZ() {
        CheckoutViewModel checkoutViewModel = this.LJLJI;
        if (checkoutViewModel != null) {
            return checkoutViewModel;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public CheckoutActivity() {
        C91833a0z.LIZ.getClass();
        this.LJLILLLLZI = new BaseViewModelFactory(new C92083a51(C91833a0z.LJFF));
        this.LJLJJI = "pipo";
        this.LJLJJL = "imeHeight";
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        LLFZ().getEventSender().LIZIZ(EnumC92044a4O.CheckoutPageFinish.getEventName(), EnumC92041a4L.Back);
    }

    @Override // X.ActivityC93161aMP, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C92105a5N.LIZ = null;
        C92105a5N.LIZIZ = null;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        overridePendingTransition(R.anim.ca, R.anim.cb);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
        LLFZ().initNonceTimer();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        if (LLFZ().getPayResult().getValue() == null) {
            LLFZ().getEventSender().LIZIZ(EnumC92044a4O.CheckoutPageFinish.getEventName(), EnumC92041a4L.Kill);
        }
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

    public final void LLFII(Intent intent) {
        String scheme;
        Uri data;
        String uri;
        String str;
        Uri data2;
        String scheme2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("intent: ");
        LIZ.append(intent);
        LIZ.append(" - schema: ");
        if (intent == null) {
            scheme = null;
        } else {
            scheme = intent.getScheme();
        }
        LIZ.append((Object) scheme);
        LIZ.append(" data: ");
        if (intent == null || (data = intent.getData()) == null) {
            uri = null;
        } else {
            uri = data.toString();
        }
        LIZ.append((Object) uri);
        X1D.LIZIZ(LIZ);
        C92106a5O c92106a5O = C92105a5N.LIZIZ;
        if (c92106a5O == null) {
            str = null;
        } else {
            str = c92106a5O.LIZIZ;
        }
        if (intent == null) {
            data2 = null;
        } else {
            data2 = intent.getData();
        }
        if (str != null) {
            if (data2 == null) {
                scheme2 = null;
            } else {
                scheme2 = data2.getScheme();
            }
            if (!o.LJ(scheme2, str) || !o.LJ(data2.getHost(), "pipopay")) {
                return;
            }
            if (o.LJ(data2.getPath(), EnumC91972a3E.CheckoutPayResult.getPath())) {
                C92145a61 c92145a61 = this.LJLIL;
                if (c92145a61 != null) {
                    C91706Zyw.LJIIL(c92145a61, "pay_result", null, 6);
                    LLFZ().startPollingPaymentDetailAndSetResult(new IDqS418S0100000_31(this, 8));
                    return;
                } else {
                    o.LJIJI("navController");
                    throw null;
                }
            }
            if (!o.LJ(data2.getPath(), EnumC91972a3E.CheckoutBind.getPath())) {
                return;
            }
            C92145a61 c92145a612 = this.LJLIL;
            if (c92145a612 != null) {
                C91706Zyw.LJIILL(c92145a612, "checkout_home", false);
                LLFZ().dispatch(CheckoutAction.RetryCheckout.INSTANCE);
            } else {
                o.LJIJI("navController");
                throw null;
            }
        }
    }

    @Override // X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        o.LJIIIZ(context, "context");
        C39647FhD.LJ(context);
        super.attachBaseContext(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ca  */
    @Override // X.ActivityC93161aMP, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.checkout.sdk.internal.CheckoutActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LLFII(intent);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PrintStream printStream = System.out;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onactivity result ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(i2);
        LIZ.append(' ');
        LIZ.append(intent);
        printStream.println((Object) X1D.LIZIZ(LIZ));
    }
}
