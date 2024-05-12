package com.ss.android.ugc.aweme.account.login.ui;

import X.AYA;
import X.AbstractC65590Pog;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C41778GaU;
import X.C65803Ps7;
import X.C81213Vu5;
import X.C86804Y4y;
import X.C89143eg;
import X.C90193gN;
import X.GBC;
import X.GBE;
import X.GBL;
import X.InterfaceC62984Onk;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS42S0200000_7;
import Y.AObjectS10S0001000_5;
import Y.IDComparatorS340S0100000_7;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import o3.IDaS90S0000000_4;
import o3.h0;

/* loaded from: classes8.dex */
public class MusCountryListActivity extends ActivityC86117Xqz implements InterfaceC62984Onk {
    public static GBL LJLJLJ;
    public RecyclerView LJLIL;
    public C81213Vu5 LJLILLLLZI;
    public final ArrayList<C86804Y4y> LJLJI = new ArrayList<>();
    public final ArrayList<C86804Y4y> LJLJJI = new ArrayList<>();
    public EditText LJLJJL;
    public TextView LJLJJLL;
    public ImageView LJLJL;

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.a5);
        GBL gbl = LJLJLJ;
        if (gbl != null) {
            gbl.onExit();
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

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onCreate", true);
        activityConfiguration(new AObjectS10S0001000_5(2, 3));
        super.onCreate(bundle);
        C89143eg.LIZ(this);
        AbstractC65590Pog<C86804Y4y> abstractC65590Pog = C86804Y4y.LJLJL;
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("enable_country_code_local_alpha_sort", false)) {
                ArrayList arrayList = new ArrayList(abstractC65590Pog);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C86804Y4y c86804Y4y = (C86804Y4y) it.next();
                    String substring = getResources().getString(c86804Y4y.LJLIL).substring(0, 1);
                    o.LJIIIZ(substring, "<set-?>");
                    c86804Y4y.LJLILLLLZI = substring;
                }
                Collections.sort(arrayList, new IDComparatorS340S0100000_7(this, 3));
                abstractC65590Pog = arrayList;
            }
        } catch (Throwable unused) {
        }
        this.LJLJJI.addAll(abstractC65590Pog);
        this.LJLJI.addAll(abstractC65590Pog);
        setContentView(R.layout.lx);
        this.LJLJJL = (EditText) findViewById(R.id.jf4);
        TextView textView = (TextView) findViewById(R.id.jhd);
        this.LJLJJLL = textView;
        h0.LJIJI(textView, new IDaS90S0000000_4(4));
        this.LJLJL = (ImageView) findViewById(R.id.aej);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.j9t);
        this.LJLIL = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        GBC gbc = new GBC(this.LJLJI);
        this.LJLIL.setAdapter(gbc);
        gbc.LJLJJI = new GBE() { // from class: X.GBK
            @Override // X.GBE
            public final void LIZ(C86804Y4y c86804Y4y2) {
                MusCountryListActivity musCountryListActivity = MusCountryListActivity.this;
                musCountryListActivity.getClass();
                if (c86804Y4y2 != null) {
                    C69101RAb.LIZ(c86804Y4y2);
                    GBL gbl = MusCountryListActivity.LJLJLJ;
                    if (gbl != null) {
                        gbl.onChanged(c86804Y4y2.LJLJJI, c86804Y4y2.LJLJI);
                    }
                    musCountryListActivity.onBackPressed();
                }
            }
        };
        this.LJLILLLLZI = (C81213Vu5) findViewById(R.id.k0d);
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("enable_country_code_local_alpha_sort", false)) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<C86804Y4y> it2 = this.LJLJJI.iterator();
                String str = "";
                while (it2.hasNext()) {
                    String str2 = it2.next().LJLILLLLZI;
                    if (!str2.equals(str)) {
                        arrayList2.add(str2);
                        str = str2;
                    }
                }
                this.LJLILLLLZI.setIndexItems((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        } catch (Throwable unused2) {
        }
        this.LJLILLLLZI.setPosition(C90193gN.LIZ() ? 1 : 0);
        this.LJLILLLLZI.setOnSelectIndexItemListener(new C41778GaU(this));
        AYA.LIZ(this, this.LJLJJL);
        C16880lQ.LJIJI(this.LJLJJLL, new ACListenerS42S0200000_7(this, gbc, 58));
        C16880lQ.LJIILLIIL(this.LJLJL, new ACListenerS24S0101000_5(2, this, 6));
        getWindow().setSoftInputMode(48);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onCreate", false);
    }
}
