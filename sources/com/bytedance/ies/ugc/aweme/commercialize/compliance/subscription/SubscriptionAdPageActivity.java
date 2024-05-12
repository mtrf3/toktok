package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.ActivityC86117Xqz;
import X.C252709vu;
import X.C41297GIr;
import X.C65803Ps7;
import X.C76800UCe;
import X.SY4;
import X.UTU;
import Y.IDdS378S0100000_6;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class SubscriptionAdPageActivity extends ActivityC86117Xqz {
    public C252709vu LJLILLLLZI;
    public SubscriptionStatusInfo LJLJI;
    public SubscriptionInfo LJLJJI;
    public SubscriptionVM LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;
    public TuxTextView LJLLJ;
    public SY4 LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final String LJLIL = "SubscriptionAdPageActivity";

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
        SubscriptionVM subscriptionVM = this.LJLJJL;
        if (subscriptionVM == null || UTU.LIZIZ(UTU.LIZ)) {
            return;
        }
        try {
            subscriptionVM.LJLIL.getSubscriptionStatus().enqueue(new IDdS378S0100000_6(subscriptionVM, 11));
        } catch (Exception unused) {
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    /* JADX WARN: Code restructure failed: missing block: B:87:0x021e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L80;
     */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionAdPageActivity.onCreate(android.os.Bundle):void");
    }

    public static void LLFII(TuxTextView tuxTextView, String str, String str2, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (str == null) {
                str = str2;
            }
            tuxTextView.setText(C41297GIr.LJ(intValue, str, "{%s}"));
            tuxTextView.setVisibility(0);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        tuxTextView.setVisibility(8);
    }
}
