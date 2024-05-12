package com.ss.android.ugc.aweme.question;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C221108m2;
import X.C34X;
import X.C5H3;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C78939UyV;
import X.C78996UzQ;
import X.GGP;
import X.GHC;
import X.InterfaceC27853AwT;
import X.InterfaceC45040Hm0;
import X.MIM;
import X.MIN;
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
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
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
public final class QuestionDetailActivity extends ActivityC86117Xqz implements C34X, InterfaceC27853AwT, InterfaceC45040Hm0 {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 157));
    public String LJLJI = "";
    public final ArrayList<GHC> LJLJJI = new ArrayList<>();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "qa_detail";
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

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.question.QuestionDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final QuestionDetailParam LLFII() {
        return (QuestionDetailParam) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            String id = LLFII().getId();
            o.LJI(id);
            j = CastLongProtector.parseLong(id);
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
            jSONObject.put("question_id", this.LJLJI);
            jSONObject.put("page_model", "detail");
        } catch (JSONException unused) {
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("qa_detail");
        analysis.setExt_value(j);
        analysis.setValue(j2);
        analysis.setExt_json(jSONObject);
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(…alue(aid).setExt_json(jo)");
        return analysis;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C78939UyV.LJJJJ(this);
        C78996UzQ.LJJJ(this);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        QuestionDetailFragment questionDetailFragment;
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL("question_detail_fragment_tag");
        String str = null;
        if ((LJJJIL instanceof QuestionDetailFragment) && (questionDetailFragment = (QuestionDetailFragment) LJJJIL) != null) {
            MIM mim = questionDetailFragment.LLIIIILZ;
            QuestionDetailParam Al = questionDetailFragment.Al();
            if (Al != null) {
                str = Al.getEnterFrom();
            }
            MIN.LIZ(mim, "click_back", str);
        }
        super.onBackPressed();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.question.QuestionDetailActivity", "onCreate", true);
        activityConfiguration(GGP.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bol);
        findViewById(R.id.bs8).setFitsSystemWindows(false);
        if (TextUtils.isEmpty(LLFII().getId())) {
            finish();
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            QuestionDetailParam param = LLFII();
            o.LJIIIZ(param, "param");
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            Fragment LJJJIL = supportFragmentManager.LJJJIL("question_detail_fragment_tag");
            if (LJJJIL == null) {
                LJJJIL = new QuestionDetailFragment();
                RouteArgExtension.INSTANCE.withNavArg(LJJJIL, param);
            }
            LJJJIL.setUserVisibleHint(true);
            c1b3.LJIIJ(LJJJIL, "question_detail_fragment_tag", R.id.bs8);
            c1b3.LJIILJJIL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.question.QuestionDetailActivity", "onCreate", false);
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
        if (i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
