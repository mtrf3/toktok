package com.ss.android.ugc.aweme.live;

import X.B83;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C28546BIg;
import X.C41191GEp;
import X.C65803Ps7;
import X.C73943T0h;
import X.C73983T1v;
import X.InterfaceC36571c5;
import X.InterfaceC73984T1w;
import X.InterfaceC86394XvS;
import X.O6U;
import Y.AfS57S0100000_5;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LiveContainerActivity extends O6U {
    public final User LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public final C73983T1v LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

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

    @Override // X.O6U, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public LiveContainerActivity() {
        User LJ = B83.LIZ().LIZIZ().LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        this.LJLIL = LJ;
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        this.LJLJJI = "";
        this.LJLJJL = new C73983T1v(this);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC73984T1w interfaceC73984T1w;
        List<Fragment> LJJJJLI = getSupportFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "supportFragmentManager.fragments");
        for (InterfaceC36571c5 interfaceC36571c5 : LJJJJLI) {
            if ((interfaceC36571c5 instanceof InterfaceC73984T1w) && (interfaceC73984T1w = (InterfaceC73984T1w) interfaceC36571c5) != null && interfaceC73984T1w.onBackPressed()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        getSupportFragmentManager().LJLJJLL(this.LJLJJL);
        super.onDestroy();
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.O6U, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment O3;
        boolean z;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onCreate", true);
        activityConfiguration(C41191GEp.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bou);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "fragment_type");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        this.LJLILLLLZI = LLJJIJIIJIL;
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        this.LJLJI = LLJJIJIIJIL2;
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "origin_uri");
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "";
        }
        this.LJLJJI = LLJJIJIIJIL3;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        String str2 = this.LJLILLLLZI;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -919958188:
                    if (str2.equals("spotlight")) {
                        O3 = Live.getService().c2();
                        Bundle arguments = O3.getArguments();
                        if (arguments != null) {
                            arguments.putString("enter_from", this.LJLJI);
                        }
                        Bundle arguments2 = O3.getArguments();
                        if (arguments2 != null) {
                            arguments2.putString("origin_uri", this.LJLJJI);
                        }
                        Bundle arguments3 = O3.getArguments();
                        if (arguments3 != null) {
                            arguments3.putBoolean("open_spotlight", true);
                        }
                        Bundle arguments4 = O3.getArguments();
                        if (arguments4 != null) {
                            arguments4.putInt("containerId", R.id.j4h);
                            break;
                        }
                    }
                    break;
                case -159879082:
                    if (str2.equals("sub_only_video_list")) {
                        long longExtra = getIntent().getLongExtra("anchor_id", this.LJLIL.getId());
                        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "sec_anchor_id");
                        if (LLJJIJIIJIL4 == null) {
                            LLJJIJIIJIL4 = this.LJLIL.getSecUid();
                        }
                        if (longExtra == this.LJLIL.getId()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        InterfaceC86394XvS service = Live.getService();
                        String str3 = this.LJLJI;
                        if (str3 != null) {
                            str = str3;
                        }
                        O3 = service.T5(longExtra, LLJJIJIIJIL4, str, z);
                        break;
                    }
                    break;
                case 514841930:
                    if (str2.equals("subscribe")) {
                        O3 = Live.getService().pa(this.LJLJI);
                        Bundle arguments5 = O3.getArguments();
                        if (arguments5 != null) {
                            arguments5.putString("origin_uri", this.LJLJJI);
                        }
                        Bundle arguments6 = O3.getArguments();
                        if (arguments6 != null) {
                            arguments6.putInt("open_sub_only_setting", getIntent().getIntExtra("open_sub_only_setting", 0));
                        }
                        Bundle arguments7 = O3.getArguments();
                        if (arguments7 != null) {
                            arguments7.putInt("containerId", R.id.j4h);
                            break;
                        }
                    }
                    break;
                case 956433626:
                    if (str2.equals("subscribe_info_list")) {
                        O3 = Live.getService().O3(this);
                        break;
                    }
                    break;
            }
            LIZ.LJIIIIZZ(R.id.j4h, 1, O3, null);
            LIZ.LJI();
            getSupportFragmentManager().LJJLIL(this.LJLJJL, true);
            C73943T0h.LIZ().LIZJ(this, C28546BIg.class).LIZIZ(new AfS57S0100000_5(this, 169));
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onCreate", false);
            return;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onCreate", false);
    }
}
