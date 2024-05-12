package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity;

import X.AbstractActivityC239069Zu;
import X.C16880lQ;
import X.C235119Kp;
import X.C238759Yp;
import X.C238909Ze;
import X.C252709vu;
import X.C26045AKb;
import X.C61878OQg;
import X.C65803Ps7;
import X.C78840Uwu;
import X.C9Z3;
import X.C9Z5;
import X.SY4;
import X.XKX;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BaAutoReplyListActivity extends AbstractActivityC239069Zu implements View.OnClickListener {
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C238759Yp LJLJI = new C238759Yp();
    public List<C9Z3> LJLJJI = C61878OQg.INSTANCE;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onResume", true);
        super.onResume();
        XKX.LIZLLL(this, null, null, new C9Z5(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onResume", false);
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.LJLJJI.size() >= 4) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.i23);
            c26045AKb.LJIIJ();
        } else {
            SmartRoute buildRoute = SmartRouter.buildRoute(this, "//setting/ba/auto_reply");
            buildRoute.withParam("mid", 0);
            buildRoute.withParam("enterFrom", "business_message_setting_page");
            buildRoute.open();
        }
    }

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.cjr);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.hm5);
        o.LJIIIIZZ(string, "getString(R.string.keyword_auto_reply)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS154S0100000_4(this, 67));
        c252709vu.setNavActions(c235119Kp);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isd);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) _$_findCachedViewById(R.id.isd)).setAdapter(this.LJLJI);
        this.LJLJI.LJLIL = this;
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.b1v);
        C16880lQ.LJJIZ(sy4, this);
        sy4.setVisibility(8);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        C238909Ze.LJI(LLJJIJIIJIL, 2, null, 12);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onCreate", false);
    }
}
