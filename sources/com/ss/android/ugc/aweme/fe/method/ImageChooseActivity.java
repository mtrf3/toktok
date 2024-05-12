package com.ss.android.ugc.aweme.fe.method;

import X.ActivityC86117Xqz;
import X.C03880Dg;
import X.C10K;
import X.C16880lQ;
import X.C188727au;
import X.C49634Jdu;
import X.C65300Pk0;
import X.C65803Ps7;
import X.DialogC25756A8y;
import X.FMX;
import X.KL2;
import X.OXB;
import X.OXE;
import Y.ACListenerS30S0100000_10;
import Y.ACallableS113S0100000_10;
import Y.AgS127S0100000_10;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;

/* loaded from: classes11.dex */
public final class ImageChooseActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLLLL = 0;
    public boolean LJLIL;
    public DialogC25756A8y LJLILLLLZI;
    public RecyclerView LJLJI;
    public TextView LJLJJI;
    public TextView LJLJJL;
    public OXB LJLJJLL;
    public List<OXE> LJLJL;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public int LJLJLJ = 1;
    public long LJLJLLL = Long.MAX_VALUE;
    public final int LJLL = 4;
    public String LJLLI = "";
    public final AqS192S0100000_10 LJLLILLLL = new AqS192S0100000_10(this, 13);
    public final AqS176S0100000_10 LJLLJ = new AqS176S0100000_10(this, 49);

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLLI);
        FMX.LJIIL("cancel_image_choose", c188727au.LIZ);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ajf);
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(this);
        dialogC25756A8y.LIZIZ(R.string.h30);
        this.LJLILLLLZI = dialogC25756A8y;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.j_5);
        this.LJLJI = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapGridLayoutManager(this.LJLL));
        }
        RecyclerView recyclerView2 = this.LJLJI;
        if (recyclerView2 != null) {
            recyclerView2.LJII(new C49634Jdu(this.LJLL, (int) KL2.LIZJ(this, 1.0f)), -1);
        }
        this.LJLJJL = (TextView) findViewById(R.id.mc8);
        this.LJLJJI = (TextView) findViewById(R.id.mm5);
        TextView textView = (TextView) findViewById(R.id.m1c);
        if (textView != null) {
            C16880lQ.LJIJI(textView, new ACListenerS30S0100000_10(this, 44));
        }
        TextView textView2 = this.LJLJJI;
        if (textView2 != null) {
            C16880lQ.LJIJI(textView2, new ACListenerS30S0100000_10(this, 45));
        }
        if (getIntent().hasExtra("shouldWithCamera")) {
            getIntent().getBooleanExtra("shouldWithCamera", true);
        }
        if (getIntent().hasExtra("maxSelectNum")) {
            this.LJLJLJ = getIntent().getIntExtra("maxSelectNum", 9);
        }
        if (getIntent().hasExtra("maxFileSize")) {
            this.LJLJLLL = getIntent().getLongExtra("maxFileSize", Long.MAX_VALUE);
        }
        if (getIntent().hasExtra("needBase64Response")) {
            this.LJLIL = getIntent().getBooleanExtra("needBase64Response", false);
        }
        if (getIntent() != null && getIntent().hasExtra("enter_from")) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            this.LJLLI = LLJJIJIIJIL;
        }
        this.LJLJJLL = new OXB(this, this.LJLL, this.LJLJLJ, this.LJLJLLL, this.LJLIL);
        DialogC25756A8y dialogC25756A8y2 = this.LJLILLLLZI;
        if (dialogC25756A8y2 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y2, new Object[0], "void", new C65300Pk0(false, "()V", "4935157500032162108")).LIZ) {
            dialogC25756A8y2.show();
        }
        C10K.LIZJ(new ACallableS113S0100000_10(this, 2)).LJ(new AgS127S0100000_10(this, 6), C10K.LJIIIIZZ, null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onCreate", false);
    }
}
