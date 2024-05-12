package com.ss.android.ugc.aweme.compliance.consent.countrylist;

import X.AYA;
import X.ActivityC86117Xqz;
import X.C03880Dg;
import X.C16880lQ;
import X.C198517qh;
import X.C253759xb;
import X.C35931E8h;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C73411SrX;
import X.C78432UqK;
import X.C81214Vu6;
import X.C81217Vu9;
import X.C90193gN;
import X.DialogC25756A8y;
import X.FMX;
import X.InterfaceC62984Onk;
import X.InterfaceC81219VuB;
import X.T16;
import Y.ACListenerS21S0101000_2;
import Y.AObjectS14S0001000_13;
import Y.AObserverS64S0101000_14;
import Y.AfS58S0100000_6;
import Y.IDObjectS185S0100000_14;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.service.RegionListAPI;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class MusCountryListActivity extends ActivityC86117Xqz implements InterfaceC62984Onk {
    public static InterfaceC81219VuB LJLL;
    public RecyclerView LJLIL;
    public C81214Vu6 LJLILLLLZI;
    public final ArrayList<RegionListAPI.Country> LJLJI = new ArrayList<>();
    public final ArrayList<RegionListAPI.Country> LJLJJI = new ArrayList<>();
    public EditText LJLJJL;
    public ImageView LJLJJLL;
    public RegionListViewModel LJLJL;
    public C253759xb LJLJLJ;
    public DialogC25756A8y LJLJLLL;

    public static void LLFII(DialogC25756A8y dialogC25756A8y) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "5201150405947512661")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    @Override // X.InterfaceC62984Onk
    public final boolean getCanCollectConsent() {
        return false;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.countrylist.MusCountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        InterfaceC81219VuB interfaceC81219VuB = LJLL;
        if (interfaceC81219VuB != null) {
            interfaceC81219VuB.onExit();
        }
        LLFII(this.LJLJLLL);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.countrylist.MusCountryListActivity", "onCreate", true);
        activityConfiguration(new AObjectS14S0001000_13(0, 3));
        super.onCreate(bundle);
        this.LJLJLLL = new DialogC25756A8y(this);
        this.LJLJL = (RegionListViewModel) ViewModelProviders.of(this).get(RegionListViewModel.class);
        LLFII(this.LJLJLLL);
        RegionListViewModel regionListViewModel = this.LJLJL;
        regionListViewModel.getClass();
        RegionListAPI.LIZ.getClass();
        regionListViewModel.LJLJI = (C73411SrX) C35931E8h.LIZIZ.getRegionList().LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new AfS58S0100000_6(regionListViewModel, 56), new AfS58S0100000_6(regionListViewModel, 57));
        this.LJLJL.LJLIL.observe(this, new AObserverS64S0101000_14(0, this, 11));
        this.LJLJL.LJLILLLLZI.observe(this, new AObserverS64S0101000_14(0, this, 12));
        setContentView(R.layout.ag6);
        this.LJLJJL = (EditText) findViewById(R.id.jf4);
        this.LJLJJLL = (ImageView) findViewById(R.id.aej);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.j9t);
        this.LJLIL = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C253759xb c253759xb = new C253759xb(this.LJLJI);
        this.LJLJLJ = c253759xb;
        this.LJLIL.setAdapter(c253759xb);
        this.LJLJLJ.LJLJJI = new C78432UqK(this);
        C81214Vu6 c81214Vu6 = (C81214Vu6) findViewById(R.id.k0d);
        this.LJLILLLLZI = c81214Vu6;
        c81214Vu6.setPosition(C90193gN.LIZ() ? 1 : 0);
        this.LJLILLLLZI.setTextColor(-7829368);
        this.LJLILLLLZI.setOnSelectIndexItemListener(new C81217Vu9(this));
        AYA.LIZ(this, this.LJLJJL);
        this.LJLJJL.addTextChangedListener(new IDObjectS185S0100000_14(this, 7));
        C16880lQ.LJIILLIIL(this.LJLJJLL, new ACListenerS21S0101000_2(1, this, 11));
        getWindow().setSoftInputMode(48);
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("enter_from", "signup_login_page");
        FMX.LJIILJJIL("region_selection_page_show", c198517qh.LJ());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.countrylist.MusCountryListActivity", "onCreate", false);
    }
}
