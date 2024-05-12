package com.ss.android.ugc.aweme.live;

import X.C0IT;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C1X;
import X.C29066Baw;
import X.C32831Qp;
import X.C4S;
import X.C4T;
import X.C61492OBk;
import X.C65803Ps7;
import X.C77434UaE;
import X.InterfaceC86149XrV;
import X.InterfaceC88472Yns;
import X.O6U;
import X.VCK;
import X.VCN;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class VoiceBroadcastActivity extends O6U {
    public InterfaceC86149XrV LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public C61492OBk LJLILLLLZI = new C61492OBk(this);

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.VoiceBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC86149XrV interfaceC86149XrV = this.LJLIL;
        if (interfaceC86149XrV != null && interfaceC86149XrV.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        this.LJLILLLLZI = null;
        Live.getService().setBroadcastActivity(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) dataChannelGlobal.mv0(C4T.class);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(0);
        }
        List list = (List) dataChannelGlobal.mv0(C29066Baw.class);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1X) it.next()).LIZ(0);
            }
        }
        ((ConcurrentHashMap) DataChannelGlobal.LJLJJI.LJLIL).remove(C4S.class);
        C0IT.LIZLLL(this);
        super.onDestroy();
        Live.getService().releaseVoiceChatLiveStream();
        VCN.LIZIZ(this, VCK.BROADCAST);
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

    public final void LLII(Bundle bundle) {
        C32831Qp c32831Qp = new C32831Qp();
        View findViewById = findViewById(R.id.ar3);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.bottom_root_layout)");
        c32831Qp.LIZ(this, (FrameLayout) findViewById);
        this.LJLIL = Live.getService().LJLJJI(this.LJLILLLLZI, bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        InterfaceC86149XrV interfaceC86149XrV = this.LJLIL;
        if (interfaceC86149XrV != null) {
            LIZ.LJIIJ(interfaceC86149XrV.getFragment(), null, R.id.dm7);
            LIZ.LJIILJJIL();
        }
        Live.getService().setBroadcastActivity(this);
        Live.getService().preloadVoiceChatLiveStream(this);
        C0IT.LIZJ(this);
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.VoiceBroadcastActivity", "onCreate", true);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) DataChannelGlobal.LJLJJI.mv0(C4T.class);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.boz);
        VCN.LIZ(this, VCK.BROADCAST);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        LLFZ();
        LLII(C16880lQ.LLJJIJI(getIntent()));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.VoiceBroadcastActivity", "onCreate", false);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            C77434UaE.LIZ(this, intent);
            if (o.LJ(C16880lQ.LLJJIJIIJIL(intent, "request_page"), "live_end_page")) {
                Live.getService().releaseLiveStream();
                LLII(C16880lQ.LLJJIJI(intent));
            }
        }
    }
}
