package com.ss.android.ugc.aweme.live;

import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C1X;
import X.C20910rv;
import X.C29066Baw;
import X.C29121Bbp;
import X.C4T;
import X.C61494OBm;
import X.C65803Ps7;
import X.C77434UaE;
import X.InterfaceC30043Bqh;
import X.InterfaceC86149XrV;
import X.InterfaceC88472Yns;
import X.O6U;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveOverdrawOptimizeSettings;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class LiveBgBroadcastActivity extends O6U {
    public InterfaceC86149XrV LJLIL;
    public InterfaceC30043Bqh LJLILLLLZI;
    public C61494OBm LJLJI = new C61494OBm(this);

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        InterfaceC86149XrV interfaceC86149XrV = this.LJLIL;
        if (interfaceC86149XrV != null) {
            interfaceC86149XrV.finish();
        }
        super.finish();
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC86149XrV interfaceC86149XrV = this.LJLIL;
        if (interfaceC86149XrV == null || !interfaceC86149XrV.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        Live.getService().setBroadcastActivity(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((InterfaceC88472Yns) dataChannelGlobal.mv0(C4T.class)).invoke(0);
        List list = (List) dataChannelGlobal.mv0(C29066Baw.class);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1X) it.next()).LIZ(0);
            }
        }
        this.LJLJI = null;
        C29121Bbp.LIZ();
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

    @Override // X.O6U, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", true);
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        C20910rv.LJIILLIIL(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((InterfaceC88472Yns) dataChannelGlobal.mv0(C4T.class)).invoke(2);
        List list = (List) dataChannelGlobal.mv0(C29066Baw.class);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1X) it.next()).LIZ(1);
            }
        }
        setContentView(R.layout.bot);
        if (getWindow() != null) {
            getWindow().addFlags(128);
            if (LiveOverdrawOptimizeSettings.INSTANCE.enable()) {
                getWindow().getDecorView().setBackgroundResource(0);
            }
        }
        new Bundle();
        if (getIntent() != null) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            int intExtra = getIntent().getIntExtra("broadcast_type", 0);
            if (intExtra == 2) {
                this.LJLIL = Live.getService().LJJIIJ(this.LJLJI, LLJJIJI);
            } else if (intExtra == 3) {
                this.LJLIL = Live.getService().c1(this.LJLJI, LLJJIJI);
            } else if (intExtra == 4) {
                this.LJLIL = Live.getService().LJLIIL(this.LJLJI, LLJJIJI);
            }
        }
        if (this.LJLIL != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LIZ.LJIIJ(this.LJLIL.getFragment(), null, R.id.dm7);
            LIZ.LJIILJJIL();
            Live.getService().setBroadcastActivity(this);
        } else {
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", false);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C77434UaE.LIZ(this, intent);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.clear();
    }
}
