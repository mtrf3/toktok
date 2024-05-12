package com.ss.android.ugc.aweme.account.agegate.activity;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C253219wj;
import X.C253249wm;
import X.C253319wt;
import X.C35936E8m;
import X.C5H3;
import X.C62822Ol8;
import X.C65803Ps7;
import X.FMX;
import X.R41;
import X.SY4;
import Y.ACListenerS24S0100000_4;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.profile.model.AgeGateInfo;
import com.ss.android.ugc.aweme.profile.model.AgeGateOption;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* loaded from: classes5.dex */
public final class AccountDeletedActivity extends ActivityC86117Xqz {
    public boolean LJLJJI;
    public List<AgeGateOption> LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.optionalArg(this, C253319wt.LJLIL, "enter_from", String.class);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 35));
    public final User LJLJI = R41.LIZJ();
    public final List<C253249wm> LJLJJL = new ArrayList();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        PopupManager.LIZJ(a.LIZIZ().LIZJ());
        PopupManager.LIZJ(a.LIZIZ().LJIILJJIL());
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
        boolean z;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.lv);
        List<AgeGateOption> list = null;
        if (this.LJLJI.getAgeGateInfo() != null) {
            AgeGateInfo ageGateInfo = this.LJLJI.getAgeGateInfo();
            if (ageGateInfo != null) {
                list = ageGateInfo.getOptionList();
            }
            this.LJLJJLL = list;
            ((TextView) _$_findCachedViewById(R.id.bst)).setText(this.LJLJI.getAgeGateInfo().getContent());
            ((TextView) _$_findCachedViewById(R.id.c6o)).setText(this.LJLJI.getAgeGateInfo().getTitle());
        } else {
            ((TextView) _$_findCachedViewById(R.id.bst)).setText((CharSequence) null);
            ((TextView) _$_findCachedViewById(R.id.c6o)).setText((CharSequence) null);
        }
        List<AgeGateOption> list2 = this.LJLJJLL;
        if (list2 != null) {
            for (AgeGateOption ageGateOption : list2) {
                String str = ageGateOption.url;
                if (str != null && s.LJJJLZIJ(str, "download-your-data", false)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "age_gate_ban");
                    FMX.LJIIL("show_data_download", c188727au.LIZ);
                }
                if (o.LJ(ageGateOption.type, "appeal") || o.LJ(ageGateOption.type, "appeal_internal")) {
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("enter_from", "age_gate_ban");
                    FMX.LJIIL("show_age_appeal", c188727au2.LIZ);
                }
                C253249wm c253249wm = new C253249wm(ageGateOption.content);
                c253249wm.LIZJ = new AqS93S0300000_4(c253249wm, this, ageGateOption, 199);
                ((ArrayList) this.LJLJJL).add(c253249wm);
            }
        }
        C253219wj c253219wj = new C253219wj(this);
        List<C253249wm> datas = this.LJLJJL;
        o.LJIIIZ(datas, "datas");
        ((ArrayList) c253219wj.LJLILLLLZI).clear();
        ((ArrayList) c253219wj.LJLILLLLZI).addAll(datas);
        c253219wj.notifyDataSetChanged();
        ((RecyclerView) _$_findCachedViewById(R.id.n3)).setAdapter(c253219wj);
        ((RecyclerView) _$_findCachedViewById(R.id.n3)).setLayoutManager(new LinearLayoutManager());
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.b28), new ACListenerS24S0100000_4(this, 307));
        ((SY4) _$_findCachedViewById(R.id.b2a)).setEnabled(false);
        String str2 = (String) this.LJLIL.getValue();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str2);
        FMX.LJIIL("age_gate_account_delete_show", c35936E8m.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onCreate", false);
    }
}
