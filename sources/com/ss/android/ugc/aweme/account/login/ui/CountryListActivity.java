package com.ss.android.ugc.aweme.account.login.ui;

import X.AYA;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C65803Ps7;
import X.C81213Vu5;
import X.C86804Y4y;
import X.C89143eg;
import X.C90193gN;
import X.G72;
import X.GBA;
import X.GBI;
import Y.ACListenerS29S0101000_12;
import Y.ACListenerS42S0200000_7;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class CountryListActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJLJ = 0;
    public RecyclerView LJLIL;
    public C81213Vu5 LJLILLLLZI;
    public final ArrayList<C86804Y4y> LJLJI = new ArrayList<>();
    public final ArrayList<C86804Y4y> LJLJJI = new ArrayList<>();
    public EditText LJLJJL;
    public TextView LJLJJLL;
    public ImageView LJLJL;

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.a5);
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.a3, 0);
        C89143eg.LIZ(this);
        ArrayList arrayList = new ArrayList(C86804Y4y.LJLJL);
        List asList = Arrays.asList("CN", "HK", "MO", "TW");
        C86804Y4y[] c86804Y4yArr = new C86804Y4y[asList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C86804Y4y c86804Y4y = (C86804Y4y) it.next();
            int indexOf = asList.indexOf(c86804Y4y.LJLJI);
            if (indexOf >= 0) {
                int i = c86804Y4y.LJLIL;
                String nameIndex = c86804Y4y.LJLILLLLZI;
                String alpha2 = c86804Y4y.LJLJI;
                String code = c86804Y4y.LJLJJI;
                String countryName = c86804Y4y.LJLJJL;
                o.LJIIIZ(nameIndex, "nameIndex");
                o.LJIIIZ(alpha2, "alpha2");
                o.LJIIIZ(code, "code");
                o.LJIIIZ(countryName, "countryName");
                C86804Y4y c86804Y4y2 = new C86804Y4y(i, nameIndex, alpha2, code, countryName);
                c86804Y4y2.LJLILLLLZI = "#";
                c86804Y4yArr[indexOf] = c86804Y4y2;
            }
        }
        arrayList.addAll(0, Arrays.asList(c86804Y4yArr));
        this.LJLJJI.addAll(arrayList);
        this.LJLJI.addAll(arrayList);
        setContentView(R.layout.lw);
        this.LJLJJL = (EditText) findViewById(R.id.jf4);
        this.LJLJJLL = (TextView) findViewById(R.id.jhd);
        this.LJLJL = (ImageView) findViewById(R.id.aej);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.j9t);
        this.LJLIL = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        GBA gba = new GBA(this.LJLJI);
        this.LJLIL.setAdapter(gba);
        gba.LJLJI = new G72(this);
        C81213Vu5 c81213Vu5 = (C81213Vu5) findViewById(R.id.k0d);
        this.LJLILLLLZI = c81213Vu5;
        c81213Vu5.setPosition(C90193gN.LIZ() ? 1 : 0);
        this.LJLILLLLZI.setOnSelectIndexItemListener(new GBI(this));
        AYA.LIZ(this, this.LJLJJL);
        C16880lQ.LJIJI(this.LJLJJLL, new ACListenerS42S0200000_7(this, gba, 56));
        C16880lQ.LJIILLIIL(this.LJLJL, new ACListenerS29S0101000_12(0, this, 4));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", false);
    }
}
