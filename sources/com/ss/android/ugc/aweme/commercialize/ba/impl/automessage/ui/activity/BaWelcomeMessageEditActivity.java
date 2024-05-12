package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity;

import X.AbstractActivityC239069Zu;
import X.C16880lQ;
import X.C19K;
import X.C235119Kp;
import X.C238909Ze;
import X.C252709vu;
import X.C26227ARb;
import X.C65803Ps7;
import X.C77413UZt;
import X.C78609UtB;
import X.C78840Uwu;
import X.C9ZN;
import X.C9ZQ;
import X.SY4;
import X.UC0;
import X.XKX;
import Y.ACListenerS24S0100000_4;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class BaWelcomeMessageEditActivity extends AbstractActivityC239069Zu implements TextWatcher {
    public KeyListener LJLJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public C9ZN LJLJJI = new C9ZN(0, 0L, "", null);
    public final IBaAutoMessageService LJLJJL = BaAutoMessageServiceImpl.LJIJ();

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLII() {
        int i;
        int length = ((TextView) _$_findCachedViewById(R.id.cq9)).length();
        TextView textView = (TextView) _$_findCachedViewById(R.id.mlk);
        if (length <= 250) {
            i = R.attr.gv;
        } else {
            i = R.attr.e7;
        }
        textView.setTextColor(C78609UtB.LJJJ(i, this));
        ((TextView) _$_findCachedViewById(R.id.mlk)).setText(String.valueOf(length));
        if (!o.LJ(s.LJZI(String.valueOf(((C19K) _$_findCachedViewById(R.id.cq9)).getText())).toString(), "") && 1 <= length && length < 251) {
            if (!o.LJ(this.LJLJJI.LIZJ, String.valueOf(((C19K) _$_findCachedViewById(R.id.cq9)).getText()))) {
                ((SY4) _$_findCachedViewById(R.id.b2e)).setEnabled(true);
                _$_findCachedViewById(R.id.b2e).setActivated(true);
                return;
            }
            int i2 = this.LJLJJI.LIZIZ;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 3 && i2 != 4) {
                        return;
                    }
                } else {
                    ((SY4) _$_findCachedViewById(R.id.b2e)).setEnabled(true);
                    _$_findCachedViewById(R.id.b2e).setActivated(true);
                    return;
                }
            }
            ((SY4) _$_findCachedViewById(R.id.b2e)).setEnabled(false);
            _$_findCachedViewById(R.id.b2e).setActivated(false);
            return;
        }
        ((SY4) _$_findCachedViewById(R.id.b2e)).setEnabled(false);
        _$_findCachedViewById(R.id.b2e).setActivated(false);
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

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLFZ(this);
    }

    public static final /* synthetic */ void LLFII(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
        super.onBackPressed();
    }

    public static void LLFZ(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
        if (o.LJ(String.valueOf(((C19K) baWelcomeMessageEditActivity._$_findCachedViewById(R.id.cq9)).getText()), baWelcomeMessageEditActivity.LJLJJI.LIZJ)) {
            baWelcomeMessageEditActivity.finish();
            C238909Ze.LIZJ("automsg_welcome_content");
            return;
        }
        C26227ARb LIZIZ = C77413UZt.LIZIZ(baWelcomeMessageEditActivity);
        LIZIZ.LJII = false;
        LIZIZ.LJ(R.string.ej7);
        LIZIZ.LIZ(R.string.ej8);
        UC0.LIZJ(LIZIZ, new AqS47S0110000_4(false, baWelcomeMessageEditActivity, 19));
        LIZIZ.LJI().LIZLLL();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null) {
            return;
        }
        LLII();
    }

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.cjt);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.tw8);
        o.LJIIIIZZ(string, "getString(R.string.welcome_message)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS154S0100000_4(this, 71));
        c252709vu.setNavActions(c235119Kp);
        KeyListener keyListener = ((TextView) _$_findCachedViewById(R.id.cq9)).getKeyListener();
        o.LJIIIIZZ(keyListener, "edit_welcome_message.keyListener");
        this.LJLJI = keyListener;
        ((TextView) _$_findCachedViewById(R.id.cq9)).addTextChangedListener(this);
        _$_findCachedViewById(R.id.b2e).setActivated(true);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.b2e), new ACListenerS24S0100000_4(this, 34));
        _$_findCachedViewById(R.id.b2e).isHorizontalScrollBarEnabled();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        C238909Ze.LJI(LLJJIJIIJIL, 1, Integer.valueOf(getIntent().getIntExtra("msg_status", 0)), 8);
        XKX.LIZLLL(this, null, null, new C9ZQ(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity", "onCreate", false);
    }
}
