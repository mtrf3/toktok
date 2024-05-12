package com.ss.android.ugc.aweme.challenge.ui;

import X.ATO;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C201037ul;
import X.C221108m2;
import X.C34X;
import X.C41268GHo;
import X.C54502LaE;
import X.C5H3;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C78939UyV;
import X.C78996UzQ;
import X.GHC;
import X.HT5;
import X.InterfaceC18010nF;
import X.InterfaceC27853AwT;
import X.InterfaceC40934G4s;
import X.InterfaceC45040Hm0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ChallengeDetailActivity extends ActivityC86117Xqz implements C34X, InterfaceC27853AwT, InterfaceC45040Hm0, InterfaceC18010nF, InterfaceC40934G4s {
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 65));
    public String LJLJI = "";
    public final ArrayList<GHC> LJLJJI = new ArrayList<>();
    public boolean LJLJJL = true;

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
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

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b3953";
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "challenge";
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

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public final ChallengeDetailParam LLFII() {
        return (ChallengeDetailParam) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            String cid = LLFII().getCid();
            o.LJI(cid);
            j = CastLongProtector.parseLong(cid);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            j = 0;
        }
        try {
            String awemeId = LLFII().getAwemeId();
            o.LJI(awemeId);
            j2 = CastLongProtector.parseLong(awemeId);
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("process_id", LLFII().getProcessId());
            jSONObject.put("challenge_id", this.LJLJI);
            jSONObject.put("page_model", "detail");
        } catch (JSONException unused) {
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("challenge");
        analysis.setExt_value(j);
        analysis.setValue(j2);
        analysis.setExt_json(jSONObject);
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(…         .setExt_json(jo)");
        return analysis;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C78939UyV.LJJJJ(this);
        C78996UzQ.LJJJ(this);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", true);
        super.onResume();
        if (!this.LJLJJL) {
            C201037ul.LIZ(1, this, true);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", false);
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", true);
        C54502LaE.LIZ("challenge_detail");
        this.LJLJJL = getIntent().getBooleanExtra("enter_anim_enable", true);
        activityConfiguration(C41268GHo.LJLIL);
        if (ATO.LIZ()) {
            getWindow().setDecorFitsSystemWindows(false);
        }
        super.onCreate(bundle);
        setContentView(R.layout.bol);
        findViewById(R.id.bs8).setFitsSystemWindows(false);
        if (TextUtils.isEmpty(LLFII().getCid())) {
            finish();
        } else {
            LLFII().setShootEnterFrom(C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_enter_from"));
            LLFII().setBundled(Integer.valueOf(getIntent().getIntExtra("is_bundled", 0)));
            if (o.LJ(LLFII().getEnterFrom(), "collection_tag")) {
                HT5.LIZ = true;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            ChallengeDetailParam param = LLFII();
            o.LJIIIZ(param, "param");
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            Fragment LJJJIL = supportFragmentManager.LJJJIL("challenge_detail_fragment_tag");
            if (LJJJIL == null) {
                LJJJIL = new ChallengeDetailFragment();
                RouteArgExtension.INSTANCE.withNavArg(LJJJIL, param);
            }
            LJJJIL.setUserVisibleHint(true);
            c1b3.LJIIJ(LJJJIL, "challenge_detail_fragment_tag", R.id.bs8);
            c1b3.LJIILJJIL();
            if (LJJJIL instanceof ChallengeDetailFragment) {
                ((ChallengeDetailFragment) LJJJIL).LLIIII = new AqS157S0100000_7(this, 67);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", false);
    }

    @Override // X.C34X
    public final void registerActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        if (!this.LJLJJI.contains(listener)) {
            this.LJLJJI.add(listener);
        }
    }

    @Override // X.C34X
    public final void unRegisterActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        ArrayList<GHC> arrayList = this.LJLJJI;
        if (arrayList != null) {
            arrayList.remove(listener);
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        Iterator<GHC> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            if (it.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
